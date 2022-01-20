package com.example.springsocial.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="TPADRON16")
public class Tpadron16Vista implements Serializable{
	
	@Id
	@Column(name="nroboleta")
	private Long nroboleta;
	@Column(name="nom1")
	private String nom1;
	@Column(name="nom2")
	private String nom2;
	@Column(name="ape1")
	private String ape1;
	@Column(name="ape2")
	private String ape2;
	@Column(name="fecnacimiento")
	private Date fecnacimiento;
	@Column(name="depnacimiento")
	private Integer depnacimiento;
	@Column(name="munnacimiento")
	private Integer munnacimiento;
	@Column(name="ordenced")
	private String ordenced;
	@Column(name="registroced")
	private Long registroced;
	@Column(name="depcedula")
	private Integer depcedula;
	@Column(name="muncedula")
	private Integer muncedula;
	@Column(name="genero")
	private Integer genero;

	
	
	public Tpadron16Vista() {
	}
	

	public Long getNroboleta() {
		return nroboleta;
	}
	public void setNroboleta(Long nroboleta) {
		this.nroboleta = nroboleta;
	}
	public String getNom1() {
		return nom1;
	}

	public String getNom2() {
		return nom2;
	}

	public String getApe1() {
		return ape1;
	}

	public String getApe2() {
		return ape2;
	}

	public Date getFecnacimiento() {
		return fecnacimiento;
	}

	public Integer getDepnacimiento() {
		return depnacimiento;
	}

	public Integer getMunnacimiento() {
		return munnacimiento;
	}

	public String getOrdenced() {
		return ordenced;
	}

	public Long getRegistroced() {
		return registroced;
	}

	public Integer getDepcedula() {
		return depcedula;
	}

	public Integer getMuncedula() {
		return muncedula;
	}

	public Integer getGenero() {
		return genero;
	}

	public void setNom1(String nom1) {
		this.nom1 = nom1;
	}

	public void setNom2(String nom2) {
		this.nom2 = nom2;
	}

	public void setApe1(String ape1) {
		this.ape1 = ape1;
	}

	public void setApe2(String ape2) {
		this.ape2 = ape2;
	}

	public void setFecnacimiento(Date fecnacimiento) {
		this.fecnacimiento = fecnacimiento;
	}

	public void setDepnacimiento(Integer depnacimiento) {
		this.depnacimiento = depnacimiento;
	}

	public void setMunnacimiento(Integer munnacimiento) {
		this.munnacimiento = munnacimiento;
	}

	public void setOrdenced(String ordenced) {
		this.ordenced = ordenced;
	}

	public void setRegistroced(Long registroced) {
		this.registroced = registroced;
	}

	public void setDepcedula(Integer depcedula) {
		this.depcedula = depcedula;
	}

	public void setMuncedula(Integer muncedula) {
		this.muncedula = muncedula;
	}

	public void setGenero(Integer genero) {
		this.genero = genero;
	}
}
