package com.example.springsocial.controller;


import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.example.springsocial.error.CustomException;
import com.example.springsocial.error.ErrorCode;
import com.example.springsocial.process.ConsultarTrenapn;
import com.example.springsocial.repository.TcedulaRepository;
import com.example.springsocial.repository.TpadronRepository;
import com.example.springsocial.repository.TrenapnRepository;
import com.example.springsocial.security.CurrentUser;
import com.example.springsocial.security.UserPrincipal;
import com.example.springsocial.tools.RestResponse;

@SuppressWarnings({"rawtypes","unchecked","unused"})
@RestController
@RequestMapping("consultaEstaEmpadronado")
public class ConsultaPadronController {
	@Autowired
	private TpadronRepository repository;
	@Autowired
	private TrenapnRepository repositoryrenap;
	@Autowired
	private TcedulaRepository repositorycedula;
	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;
	private JSONObject objetoRespuesta;
	private ConsultarTrenapn consultaTrenapn;
	private static final String messageEmpadronado="SI SE ENCUENTRA EMPADRONADO", messageNoEmpadronado="NO SE ENCUENTRA EMPADRONADO";
	private Logger logger = Logger.getLogger(ConsultaPadronController.class.getName());
	
	@GetMapping("list/{cui}")
    public RestResponse consulaCui(@CurrentUser UserPrincipal userprincipal, HttpServletRequest request,@PathVariable String cui) throws Exception, CustomException {
		RestResponse response = new RestResponse();
		
		objetoRespuesta=new JSONObject();
		String cuis = null;				
		logger.log(Level.INFO,"user: "+userprincipal.getUsername()+" password: "+userprincipal.getAuthorities()+" cui: "+cui);
		if(!userprincipal.hasPermissionToRoute(request)) return new RestResponse(null, new CustomException("Acceso denegado", ErrorCode.ACCESS_DENIED,
				this.getClass().getSimpleName(), 0));
		try {
			cuis= repository.consultaPorCui(cui);
			
			if (cuis!=null) {
				objetoRespuesta.put("estaEmpadronado", true);
				objetoRespuesta.put("message", messageEmpadronado);
				response.setData(objetoRespuesta);
				
			}else {
				consultaTrenapn = new ConsultarTrenapn();
				consultaTrenapn.setCui(cui);
				consultaTrenapn.setRepository(repositoryrenap,repository,repositorycedula);
				consultaTrenapn.setEntityManagerFactory(entityManagerFactory);
				consultaTrenapn.VerificarTrenapn();
				
				if (consultaTrenapn.getResponse().getError()!=null)throw new Exception(consultaTrenapn.getResponse().getError().toString());
				else {
					response.setData(consultaTrenapn.Respuesta());
				}
			}
			
		}catch(Exception exception) {
			CustomException customExcepction=  new CustomException(exception.getMessage(),exception,ErrorCode.REST_UPDATE,this.getClass().getSimpleName());
			response.setError(customExcepction);
		}
		
    	return response;
    }
	
}