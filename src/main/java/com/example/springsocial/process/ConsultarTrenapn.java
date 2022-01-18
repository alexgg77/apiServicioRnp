package com.example.springsocial.process;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSONObject;
import com.example.springsocial.crud.ModelSetGetTransaction;
import com.example.springsocial.error.CustomException;
import com.example.springsocial.model.TcedulaModel;
import com.example.springsocial.model.TpadronModel;
import com.example.springsocial.model.Trenapn;
import com.example.springsocial.repository.TcedulaRepository;
import com.example.springsocial.repository.TpadronRepository;
import com.example.springsocial.repository.TrenapnRepository;
import com.example.springsocial.tools.RestResponse;
import com.example.springsocial.tools.SearchCriteriaTools;


@SuppressWarnings({"rawtypes","unchecked","unused"})
public class ConsultarTrenapn {
	
	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;
	private EntityTransaction transaction  = null;
	private EntityManager entityManager = null;
	@Autowired
	private TpadronRepository repository;
	@Autowired
	private TrenapnRepository repositoryrenap;
	@Autowired
	private TcedulaRepository repositorycedula;
	private SearchCriteriaTools searchCriteriaTools= new SearchCriteriaTools();
	private ModelSetGetTransaction modelTransaction =new ModelSetGetTransaction();
	private Logger logger = Logger.getLogger(ConsultarTrenapn.class.getName());
	private RestResponse response= new RestResponse();	
	private Trenapn modelTrenapn;
	private List< TcedulaModel> listaCedula;
	private List<TpadronModel> listaTpadron;
	private TpadronModel modelTpadron;
	private String cui;
	private JSONObject objetoRespuesta;
	private Integer control=0;
	private static final String messageEmpadronado="SI SE ENCUENTRA EMPADRONADO", messageNoEmpadronado="NO SE ENCUENTRA EMPADRONADO";
	
	public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {if(entityManagerFactory!=null) this.entityManagerFactory=entityManagerFactory;}
	public void setRepository(TrenapnRepository repositoryrenap,TpadronRepository repository,TcedulaRepository repositorycedula) {
		this.repositoryrenap = repositoryrenap;
		this.repository = repository;
		this.repositorycedula = repositorycedula;
	}
	public void setCui(String cui) {this.cui=cui;}
	
	private void startTransaction() {
		this.entityManager = this.entityManagerFactory.createEntityManager();
		this.transaction = this.entityManager.getTransaction();
		this.transaction.begin();
		this.modelTransaction.setEntityManager(entityManager);
	}
	
	private void confirmTransactionAndSetResult() {
		transaction.commit();
	}
	
	public RestResponse getResponse() {
		return response;
	}
	
	public JSONObject Respuesta() {
		return objetoRespuesta;
	}
	
	private void trenapn() throws CustomException {
		modelTrenapn = new Trenapn();
		modelTransaction.setType(Trenapn.class);
		searchCriteriaTools.clear();
		searchCriteriaTools.addIgualAnd("CUI", cui);
		modelTransaction.setSearchCriteriaTools(searchCriteriaTools);
		modelTransaction.getValue();
		this.modelTrenapn = (Trenapn) modelTransaction.getResult();
	}
	
	private void tcedula() throws CustomException {
		if(modelTrenapn!=null && modelTrenapn.getREGISTROCEDULA()!=null && modelTrenapn.getORDENCEDULA()!=null) {
			logger.log(Level.INFO,"REGISTRO CEDULA: "+modelTrenapn.getREGISTROCEDULA()+" ORDEN CEDULA: "+modelTrenapn.getORDENCEDULA());
			listaCedula = new ArrayList<TcedulaModel>();
			this.listaCedula = repositorycedula.consultaPorCedula(modelTrenapn.getORDENCEDULA(), Long.valueOf(modelTrenapn.getREGISTROCEDULA()));
		}
	}
	
	private void tpadron() {
		listaTpadron = new ArrayList<TpadronModel>();
		if(modelTrenapn!=null && listaCedula!=null) {
			for(int i=0;i<listaCedula.size();i++) {
				modelTpadron = new TpadronModel();
				modelTpadron = repository.consultaNroboleta( listaCedula.get(i).getNroboleta() );
				listaTpadron.add(modelTpadron);
			}
		}
	}
	
	private void ValidarDatosTrenap_Tpadron() {
		if(modelTrenapn!=null && listaTpadron!=null && listaCedula!=null) {
			for(int i=0;i<listaTpadron.size();i++) {
				
				logger.log(Level.INFO,"NOMBRE 1 TRENAPN: "+modelTrenapn.getNOM1CIUDADANO()+" NOMBRE 1 TPADRON: "+listaTpadron.get(i).getPrimerNombre());
				logger.log(Level.INFO,"NOMBRE 2 TRENAPN: "+modelTrenapn.getNOM2CIUDADANO()+" NOMBRE 1 TPADRON: "+listaTpadron.get(i).getSegundoNombre());
				logger.log(Level.INFO,"APELL 1 TRENAPN: "+modelTrenapn.getAPE1CIUDADANO()+" APELL 1 TPADRON: "+listaTpadron.get(i).getPrimerApellido());
				logger.log(Level.INFO,"APELL 2 TRENAPN: "+modelTrenapn.getAPE2CIUDADANO()+" APELL 2 TPADRON: "+listaTpadron.get(i).getSegundoApellido());
				logger.log(Level.INFO,"APELL 3 TRENAPN: "+modelTrenapn.getAPELLIDOCASADA()+" APELL 3 TPADRON: "+listaTpadron.get(i).getTercerApellido());
				logger.log(Level.INFO,"FECHA N. TRENAPN: "+modelTrenapn.getFECNACIMIENTO()+" FECHA N. TPADRON: "+listaTpadron.get(i).getFechaNacimiento());
				logger.log(Level.INFO,"/*---------------------------------------------------------------------------------------------------------------*/");
				
				if(
						listaTpadron.get(i).getPrimerNombre().equals(modelTrenapn.getNOM1CIUDADANO()) && 
						listaTpadron.get(i).getSegundoNombre().equals(modelTrenapn.getNOM2CIUDADANO()) && 
						listaTpadron.get(i).getPrimerApellido().equals(modelTrenapn.getAPE1CIUDADANO()) &&
						listaTpadron.get(i).getSegundoApellido().equals(modelTrenapn.getAPE2CIUDADANO()) &&
						listaTpadron.get(i).getTercerApellido().equals(modelTrenapn.getAPELLIDOCASADA()) &&
						listaTpadron.get(i).getFechaNacimiento().equals(modelTrenapn.getFECNACIMIENTO())
				) {
					control=1;
					objetoRespuesta.put("estaEmpadronado", true);
					objetoRespuesta.put("message", messageEmpadronado);
					logger.log(Level.INFO,"DENTRO DE IF");
				}
			}
		}
	}
	
	private void setRespuesta() {
		objetoRespuesta=new JSONObject();
		if(control==0) {
			objetoRespuesta.put("estaEmpadronado", false);
			objetoRespuesta.put("message", messageNoEmpadronado);
		}
	}
	
	public void VerificarTrenapn() throws CustomException {
		try {
			startTransaction();
			trenapn();
			tcedula();
			tpadron();
			ValidarDatosTrenap_Tpadron();
			setRespuesta();
			confirmTransactionAndSetResult();
		}catch(Exception e) {
			transaction.rollback();
			e.printStackTrace();
			response.setError(e.getMessage());
		}finally{
    		if (entityManager.isOpen())	entityManager.close();
    	}
	}
	
	
}
