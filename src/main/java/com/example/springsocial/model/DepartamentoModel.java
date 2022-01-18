package com.example.springsocial.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="V_DEPARTAMENTOS")
public class DepartamentoModel implements Serializable{
	
	@Id
	@Column(name="CODDEP")
	private Long coddep;
	
	@Column(name="DEPARTAMENTO")
	private String departamento;
	
	
	public DepartamentoModel() {
	}
	
	public Long getCoddep() {
		return coddep;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setCoddep(Long coddep) {
		this.coddep = coddep;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
}
