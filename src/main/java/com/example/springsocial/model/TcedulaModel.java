package com.example.springsocial.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="TCEDULA")
public class TcedulaModel implements Serializable{

	@Id
	@Column(name="nroboleta")
	private Long nroboleta;
	@Column(name="ordenced")
	private String ordenced;
	@Column(name="registroced")
	private Long registroced;
	@Column(name="feccedula")
	private Date feccedula;
	@Column(name="depcedula")
	private Long depcedula;
	@Column(name="muncedula")
	private Long muncedula;

	
	
		
	public TcedulaModel() {
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
	public Date getFeccedula() {
		return feccedula;
	}
	public Long getDepcedula() {
		return depcedula;
	}
	public Long getMuncedula() {
		return muncedula;
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
	public void setFeccedula(Date feccedula) {
		this.feccedula = feccedula;
	}
	public void setDepcedula(Long depcedula) {
		this.depcedula = depcedula;
	}
	public void setMuncedula(Long muncedula) {
		this.muncedula = muncedula;
	}

}
