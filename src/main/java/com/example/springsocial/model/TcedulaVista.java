package com.example.springsocial.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@SuppressWarnings("serial")
@Entity
@Table(name="TCEDULA")
public class TcedulaVista implements Serializable{

	@Id
	@Column(name="nroboleta")
	private Long nroboleta;
	
	@Column(name="ordenced")
	private String ordenced;
	
	@Column(name="registroced")
	private Long registroced;

	public TcedulaVista() {
	}

	public Long getNroboleta() {
		return nroboleta;
	}

	public String getOrdenced() {
		return ordenced;
	}

	public Long getRegistroced() {
		return registroced;
	}

	public void setNroboleta(Long nroboleta) {
		this.nroboleta = nroboleta;
	}

	public void setOrdenced(String ordenced) {
		this.ordenced = ordenced;
	}

	public void setRegistroced(Long registroced) {
		this.registroced = registroced;
	}
	
	
	
}
