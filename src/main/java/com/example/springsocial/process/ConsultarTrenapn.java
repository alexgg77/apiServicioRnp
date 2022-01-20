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
import com.example.springsocial.model.TcedulaVista;
import com.example.springsocial.model.Tpadron16Vista;
import com.example.springsocial.model.TpadronModel;
import com.example.springsocial.model.TpadronVista;
import com.example.springsocial.model.Trenapn;
import com.example.springsocial.model.TrenapnVista;
import com.example.springsocial.repository.TcedulaRepository;
import com.example.springsocial.repository.Tpadron16Repository;
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
	@Autowired
	private Tpadron16Repository repositorypadron16;
	
	private SearchCriteriaTools searchCriteriaTools= new SearchCriteriaTools();
	private ModelSetGetTransaction modelTransaction =new ModelSetGetTransaction();
	private Logger logger = Logger.getLogger(ConsultarTrenapn.class.getName());
	private RestResponse response= new RestResponse();	
	private Trenapn modelTrenapn;
	private TpadronVista respuestaTpadron=null;
	private Tpadron16Vista tpadron16;
	private TrenapnVista modelTrenapvista;
	private List< TcedulaVista> listaCedula;
	
	private List<Tpadron16Vista> listaTpadron;
	private Tpadron16Vista modelTpadron16;
	private String cui;
	private JSONObject objetoRespuesta;
	private Integer control;
	private static final String messageEmpadronado="VIGENTE", messageNoEmpadronado="NO SE ENCUENTRA EMPADRONADO";
	
	public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {if(entityManagerFactory!=null) this.entityManagerFactory=entityManagerFactory;}
	public void setRepository(TrenapnRepository repositoryrenap,TpadronRepository repository,TcedulaRepository repositorycedula,Tpadron16Repository repositorypadron16) {
		this.repositoryrenap = repositoryrenap;
		this.repository = repository;
		this.repositorycedula = repositorycedula;
		this.repositorypadron16 = repositorypadron16;
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
		modelTrenapvista = new TrenapnVista();
		modelTransaction.setType(TrenapnVista.class);
		searchCriteriaTools.clear();
		searchCriteriaTools.addIgualAnd("cui", cui);
		modelTransaction.setSearchCriteriaTools(searchCriteriaTools);
		modelTransaction.getValue();
		this.modelTrenapvista = (TrenapnVista) modelTransaction.getResult();
	}
	
	private void tcedula() throws CustomException {
		if(modelTrenapvista!=null && modelTrenapvista.getRegistrocedula()!=null && modelTrenapvista.getOrdencedula()!=null) {
			logger.log(Level.INFO,"REGISTRO CEDULA: "+modelTrenapvista.getRegistrocedula()+" ORDEN CEDULA: "+modelTrenapvista.getOrdencedula());
			listaCedula = new ArrayList<TcedulaVista>();
			this.listaCedula = repositorycedula.consultaPorCedula(modelTrenapvista.getOrdencedula(), Long.valueOf(modelTrenapvista.getRegistrocedula()));
		}
	}
	
	private void tpadron() {
		listaTpadron = new ArrayList<Tpadron16Vista>();
		if(modelTrenapvista!=null && listaCedula!=null) {
			for(int i=0;i<listaCedula.size();i++) {
				modelTpadron16 = new Tpadron16Vista();
				modelTpadron16 = repositorypadron16.consultaNroboleta(listaCedula.get(i).getNroboleta() );
				listaTpadron.add(modelTpadron16);
			}
		}
		logger.log(Level.INFO,"CONSULTA A TPADRON CON ESTATUS 16 ");
	}
	
	private void ValidarDatosTrenap_Tpadron() {
		control=0;
		if(modelTrenapvista!=null && listaTpadron!=null && listaCedula!=null) {
			for(int i=0;i<listaTpadron.size();i++) {
				
				if(listaTpadron.get(i)!=null) {
					logger.log(Level.INFO,"NOMBRE 1 TRENAPN: "+modelTrenapvista.getNom1ciudadano()+" NOMBRE 1 TPADRON: "+listaTpadron.get(i).getNom1()     );
					logger.log(Level.INFO,"NOMBRE 2 TRENAPN: "+modelTrenapvista.getNom2ciudadano()+" NOMBRE 1 TPADRON: "+listaTpadron.get(i).getNom2()    );
					logger.log(Level.INFO,"APELL 1 TRENAPN: "+modelTrenapvista.getApe1ciudadano()+" APELL 1 TPADRON: "+listaTpadron.get(i).getApe1()     );
					logger.log(Level.INFO,"APELL 2 TRENAPN: "+modelTrenapvista.getApe2ciudadano()+" APELL 2 TPADRON: "+listaTpadron.get(i).getApe2()    );
					logger.log(Level.INFO,"FECHA N. TRENAPN: "+modelTrenapvista.getFecnacimiento()+" FECHA N. TPADRON: "+listaTpadron.get(i).getFecnacimiento()  );
					logger.log(Level.INFO,"DEP NACIMIENTO TRENAPN: "+modelTrenapvista.getDepnacimiento()+" DEP NACIMIENTO TPADRON: "+listaTpadron.get(i).getDepnacimiento());
					logger.log(Level.INFO,"MUN NACIMIENTO TRENAPN: "+modelTrenapvista.getMunnacimiento()+" MUN NACIMIENTO TPADRON: "+listaTpadron.get(i).getMunnacimiento());
					logger.log(Level.INFO,"GENERO TRENAPN: "+modelTrenapvista.getGenero()+" GENERO TPADRON: "+listaTpadron.get(i).getGenero());
					logger.log(Level.INFO,"---------------------------------------------------------------------------------------------------------------");
					
					if(
							listaTpadron.get(i).getNom1().equals(modelTrenapvista.getNom1ciudadano()) && 
							listaTpadron.get(i).getNom2().equals(modelTrenapvista.getNom2ciudadano()) && 
							listaTpadron.get(i).getApe1().equals(modelTrenapvista.getApe1ciudadano()) && 
							listaTpadron.get(i).getApe2().equals(modelTrenapvista.getApe2ciudadano()) && 
							listaTpadron.get(i).getFecnacimiento().equals(modelTrenapvista.getFecnacimiento()) && 
							listaTpadron.get(i).getDepnacimiento().equals(modelTrenapvista.getDepnacimiento()) && 
							listaTpadron.get(i).getMunnacimiento().equals(modelTrenapvista.getMunnacimiento()) && 
							listaTpadron.get(i).getGenero().equals(modelTrenapvista.getGenero())
					) {
						control=1;
						objetoRespuesta.put("cui", cui);
						objetoRespuesta.put("resultado", messageEmpadronado);
						logger.log(Level.INFO,"DENTRO DE IF");
					}
				}
			}
		}
	}
	
	private void setRespuesta() {
		objetoRespuesta=new JSONObject();
		if(control==0) {
			objetoRespuesta.put("cui", cui);
			objetoRespuesta.put("resultado", messageNoEmpadronado);
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
