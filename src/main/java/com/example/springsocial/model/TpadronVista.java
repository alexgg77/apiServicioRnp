package com.example.springsocial.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="TPADRON")
public class TpadronVista implements Serializable{

	@Id
	@Column(name="cui") 
	private Long cui;
	
	@Column(name="resultado")
	private String resultado;
	

	public TpadronVista() {
	}

	public Long getCui() {
		return cui;
	}

	public String getResultado() {
		return resultado;
	}

	public void setCui(Long cui) {
		this.cui = cui;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	
	
	
	
	
}
