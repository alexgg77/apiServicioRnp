package com.example.springsocial.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@SuppressWarnings("serial")
@Entity
@Table(name="TCOMPLEMENTO")
public class TcomplementoModel implements Serializable{

	@Id
	@Column(name="nroboleta")
	private	Long nroBoleta;
	

	@Column(name="ocupacion")
	private	Long profesionOficio;
	
	@Column(name="fecnacionalizacion")
	private	Date fechaNacionalizacion;
	
	@Column(name="nom1padre")
	private	String primerNomPadre;
	
	@Column(name="nom2padre")
	private	String segundoNomPadre;
	
	@Column(name="ape1padre")
	private	String primerApePadre;
	
	@Column(name="ape2padre")
	private	String segundoApePadre;
	
	@Column(name="nom1madre")
	private	String primerNomMadre;
	
	@Column(name="nom2madre")
	private	String segundoNomMadre;
	
	@Column(name="ape1madre")
	private	String primerApeMadre;
	
	@Column(name="ape2madre")
	private	String segundoApeMadre;
	
	@Column(name="telefonos")
	private	String telefono;
	
	
	@Column(name="email")
	private	String email;
	
	@Column(name="fecasientonacimiento")
	private	Date fechaAsientoNacimiento;
	
	
	
	@Column(name="observaciones")
	private	String observaciones;
	
	@Column(name="puestosolicitud")
	private	Long PuestoSolicitud;
	
	
	

	public TcomplementoModel() {
	}
	
	

	public Long getNroBoleta() {
		return nroBoleta;
	}

	public Long getProfesionOficio() {
		return profesionOficio;
	}

	public Date getFechaNacionalizacion() {
		return fechaNacionalizacion;
	}

	public String getPrimerNomPadre() {
		return primerNomPadre;
	}

	public String getSegundoNomPadre() {
		return segundoNomPadre;
	}

	public String getPrimerApePadre() {
		return primerApePadre;
	}

	public String getSegundoApePadre() {
		return segundoApePadre;
	}

	public String getPrimerNomMadre() {
		return primerNomMadre;
	}

	public String getSegundoNomMadre() {
		return segundoNomMadre;
	}

	public String getPrimerApeMadre() {
		return primerApeMadre;
	}

	public String getSegundoApeMadre() {
		return segundoApeMadre;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getEmail() {
		return email;
	}

	public Date getFechaAsientoNacimiento() {
		return fechaAsientoNacimiento;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public Long getPuestoSolicitud() {
		return PuestoSolicitud;
	}

	public void setNroBoleta(Long nroBoleta) {
		this.nroBoleta = nroBoleta;
	}

	public void setProfesionOficio(Long profesionOficio) {
		this.profesionOficio = profesionOficio;
	}

	public void setFechaNacionalizacion(Date fechaNacionalizacion) {
		this.fechaNacionalizacion = fechaNacionalizacion;
	}

	public void setPrimerNomPadre(String primerNomPadre) {
		this.primerNomPadre = primerNomPadre;
	}

	public void setSegundoNomPadre(String segundoNomPadre) {
		this.segundoNomPadre = segundoNomPadre;
	}

	public void setPrimerApePadre(String primerApePadre) {
		this.primerApePadre = primerApePadre;
	}

	public void setSegundoApePadre(String segundoApePadre) {
		this.segundoApePadre = segundoApePadre;
	}

	public void setPrimerNomMadre(String primerNomMadre) {
		this.primerNomMadre = primerNomMadre;
	}

	public void setSegundoNomMadre(String segundoNomMadre) {
		this.segundoNomMadre = segundoNomMadre;
	}

	public void setPrimerApeMadre(String primerApeMadre) {
		this.primerApeMadre = primerApeMadre;
	}

	public void setSegundoApeMadre(String segundoApeMadre) {
		this.segundoApeMadre = segundoApeMadre;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setFechaAsientoNacimiento(Date fechaAsientoNacimiento) {
		this.fechaAsientoNacimiento = fechaAsientoNacimiento;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public void setPuestoSolicitud(Long puestoSolicitud) {
		PuestoSolicitud = puestoSolicitud;
	}
	
	
	
}
