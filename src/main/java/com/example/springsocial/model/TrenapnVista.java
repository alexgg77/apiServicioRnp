package com.example.springsocial.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="TRENAPN")
public class TrenapnVista implements Serializable{
	
	@Id
	@Column(name="cui")
	private Long cui;
	@Column(name="nom1ciudadano")
	private String nom1ciudadano;
	@Column(name="nom2ciudadano")
	private String nom2ciudadano;
	@Column(name="nom3ciudadano")
	private String nom3ciudadano;
	@Column(name="ape1ciudadano")
	private String ape1ciudadano;
	@Column(name="ape2ciudadano")
	private String ape2ciudadano;
	@Column(name="apellidocasada")
	private String apellidocasada;
	@Column(name="fecnacimiento")
	private Date fecnacimiento;
	@Column(name="ordencedula")
	private String ordencedula;
	@Column(name="registrocedula")
	private Long registrocedula;
	@Column(name="depnacimiento")
	private Integer depnacimiento;
	@Column(name="munnacimiento")
	private Integer munnacimiento;
	@Column(name="genero")
	private Integer genero;


	public TrenapnVista() {
	}
	
	public Long getCui() {
		return cui;
	}
	public String getNom1ciudadano() {
		return nom1ciudadano;
	}
	public String getNom2ciudadano() {
		return nom2ciudadano;
	}
	public String getNom3ciudadano() {
		return nom3ciudadano;
	}
	public String getApe1ciudadano() {
		return ape1ciudadano;
	}
	public String getApe2ciudadano() {
		return ape2ciudadano;
	}
	public String getApellidocasada() {
		return apellidocasada;
	}
	public Date getFecnacimiento() {
		return fecnacimiento;
	}
	public void setCui(Long cui) {
		this.cui = cui;
	}
	public void setNom1ciudadano(String nom1ciudadano) {
		this.nom1ciudadano = nom1ciudadano;
	}
	public void setNom2ciudadano(String nom2ciudadano) {
		this.nom2ciudadano = nom2ciudadano;
	}
	public void setNom3ciudadano(String nom3ciudadano) {
		this.nom3ciudadano = nom3ciudadano;
	}
	public void setApe1ciudadano(String ape1ciudadano) {
		this.ape1ciudadano = ape1ciudadano;
	}
	public void setApe2ciudadano(String ape2ciudadano) {
		this.ape2ciudadano = ape2ciudadano;
	}
	public void setApellidocasada(String apellidocasada) {
		this.apellidocasada = apellidocasada;
	}
	public void setFecnacimiento(Date fecnacimiento) {
		this.fecnacimiento = fecnacimiento;
	}

	public String getOrdencedula() {
		return ordencedula;
	}

	public Long getRegistrocedula() {
		return registrocedula;
	}

	public void setOrdencedula(String ordencedula) {
		this.ordencedula = ordencedula;
	}

	public void setRegistrocedula(Long registrocedula) {
		this.registrocedula = registrocedula;
	}

	public Integer getDepnacimiento() {
		return depnacimiento;
	}

	public Integer getMunnacimiento() {
		return munnacimiento;
	}

	public Integer getGenero() {
		return genero;
	}

	public void setDepnacimiento(Integer depnacimiento) {
		this.depnacimiento = depnacimiento;
	}

	public void setMunnacimiento(Integer munnacimiento) {
		this.munnacimiento = munnacimiento;
	}

	public void setGenero(Integer genero) {
		this.genero = genero;
	}
	
	
}
