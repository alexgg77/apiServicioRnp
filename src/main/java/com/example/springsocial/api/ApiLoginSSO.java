package com.example.springsocial.api;

public class ApiLoginSSO extends Api {

	public ApiLoginSSO() {
		//setApiUrl(System.getenv("FILES_API_URL"));

		setApiUrl("http://192.168.79.67:9763");
	}		
	public void setPostPathLogin() {setPath("/auth/login");	}
}
