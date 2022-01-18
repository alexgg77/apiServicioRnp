package com.example.springsocial.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@SuppressWarnings("serial")
@Entity
@Table(name="V_MUNICIPIOS")
public class MunicipioModel implements Serializable{
	
	@Column(name="CODDEP")
	private Long coddep;
	
	@Column(name="CODMUN")
	private Long codmun;
	
	@Id
	@Column(name="MUNICIPIO")
	private String municipio;
	
	
	public MunicipioModel() {
	}
	public Long getCoddep() {
		return coddep;
	}
	public Long getCodmun() {
		return codmun;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setCoddep(Long coddep) {
		this.coddep = coddep;
	}
	public void setCodmun(Long codmun) {
		this.codmun = codmun;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
}
