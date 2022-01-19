package com.example.springsocial.controller;

import java.io.Serializable;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.example.springsocial.api.ApiLoginSSO;
import com.example.springsocial.security.CurrentUser;
import com.example.springsocial.security.UserPrincipal;
import com.example.springsocial.tools.RestResponse;

@SuppressWarnings({"rawtypes","serial"})
@RestController
@RequestMapping("ssoAuth")
public class SSOAuthController implements Serializable {
	private Logger logger = Logger.getLogger(this.getClass().getName());
	private ApiLoginSSO apiSSO=null;
	RestResponse response;
	
	@PostMapping("login")
    public com.alibaba.fastjson.JSONObject login(@CurrentUser UserPrincipal userPrincipal, HttpServletRequest request, @RequestParam("searchCriteria") Optional<String> searchCriteria,
    		@RequestParam Optional<String> orderCriteria,@RequestBody Object createElement) throws JSONException {
			logger.log(Level.INFO,"Iniciando Login SSO");
			com.alibaba.fastjson.JSONObject  response= new com.alibaba.fastjson.JSONObject();
			
			try {			 
			 String jsonStr=com.alibaba.fastjson.JSONObject.toJSONString(createElement);			
			 JSONObject json = new JSONObject(jsonStr);
			 apiSSO=new ApiLoginSSO();
			 apiSSO.clearParms();						
			 apiSSO.setPostPathLogin();						
			 apiSSO.setParams(json);			
			 apiSSO.sendPost();
			 if (apiSSO.getRestResponse().getError()!=null)throw new Exception(apiSSO.getRestResponse().getError().toString());
				else {													
				 response=apiSSO.convertAtJSONTYPE(com.alibaba.fastjson.JSONObject.class);
				}
			}catch(Exception exception) {
				JSONObject objetoError=new JSONObject(exception.getMessage());
				response.put("error",objetoError);
				response.put("data", "");
			}
			return response;
	
	}
}
