package com.example.springsocial.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@SuppressWarnings("serial")
@Entity
@Table(name="TDPI")
public class TdpiModel implements Serializable{
	
	@Id
	@Column(name="nroboleta")
	private	Long nroboleta;
	 
	@Column(name="cui")
	private	String cui;
	

	
	@Column(name="depvecindad")
	private	Long depVecindad;
	
	@Column(name="munvecindad")
	private	Long munVecindad;
	
	
	@ManyToOne
	@NotFound(
	        action = NotFoundAction.IGNORE)
	@JoinColumns({
		@JoinColumn(name="munvecindad", referencedColumnName="CODMUN",insertable=false, updatable=false),
		@JoinColumn(name="depvecindad", referencedColumnName="CODDEP",insertable=false, updatable=false)   
    })
	private MunicipioModel municipioVecindad;
	
	
	@ManyToOne
	@NotFound(
	        action = NotFoundAction.IGNORE)
	@JoinColumn(name="depvecindad", referencedColumnName="CODDEP",insertable=false, updatable=false)
	private DepartamentoModel departamentoVecindad;
	
	
	@Column(name="fechaemision")
	private	Date fechaEmisionDpi;
	
	@Column(name="serie")
	private	String serieDpi;
	
	@Column(name="ordencedref")
	private	String ordenCedulaRef;
	
	@Column(name="registrocedref")
	private	Long registroCedulaRef;
	
	@Column(name="depcedularef")
	private	Long depCedulaRef;
	
	@Column(name="muncedularef")
	private	Long munCedulaRef;
	
	@ManyToOne
	@NotFound(
	        action = NotFoundAction.IGNORE)
	@JoinColumns({
		@JoinColumn(name="muncedularef", referencedColumnName="CODMUN",insertable=false, updatable=false),
		@JoinColumn(name="depcedularef", referencedColumnName="CODDEP",insertable=false, updatable=false)   
    })
	private MunicipioModel municipioCedula;
	
	
	@ManyToOne
	@NotFound(
	        action = NotFoundAction.IGNORE)
	@JoinColumn(name="depcedularef", referencedColumnName="CODDEP",insertable=false, updatable=false)
	private DepartamentoModel departamentoCedula;
	
	@Column(name="nrofoliocedref")
	private	String numFolioCedulaRef;
	
	@Column(name="nrolibrocedref")
	private	String numLibroCedulaRef;
	
	@Column(name="depnacimientodpi")
	private	Long depNacimientoDpi;
	
	@Column(name="munnacimientodpi")
	private	Long munNacimientoDpi;
	
	
	@ManyToOne
	@NotFound(
	        action = NotFoundAction.IGNORE)
	@JoinColumns({
		@JoinColumn(name="munnacimientodpi", referencedColumnName="CODMUN",insertable=false, updatable=false),
		@JoinColumn(name="depnacimientodpi", referencedColumnName="CODDEP",insertable=false, updatable=false)   
    })
	private MunicipioModel municipioNacimientoDpi;
	
	
	@ManyToOne
	@NotFound(
	        action = NotFoundAction.IGNORE)
	@JoinColumn(name="depnacimientodpi", referencedColumnName="CODDEP",insertable=false, updatable=false)
	private DepartamentoModel departamentoNacimientoDpi;
	
	
	@Column(name="fecasientonacdpi")
	private	Date FechaAdientoNacDpi;
	
	@Column(name="nrolibronacdpi")
	private	String nroLibroNacimientoDpi;
	
	@Column(name="nrofolionacdpi")
	private	String nroFolioNacimientoDpi;
	
	@Column(name="nropartnacdpi")
	private	String nroPartidaNacimeintoDpi;
	
	@Column(name="usrcre")
	private String usuarioCreador;
	
	@Column(name="feccre")
	private Date fechaCreacion;
	
	

	public TdpiModel() {
	}
	
	public MunicipioModel getMunicipioVecindad() {
		return municipioVecindad;
	}

	public DepartamentoModel getDepartamentoVecindad() {
		return departamentoVecindad;
	}

	public MunicipioModel getMunicipioCedula() {
		return municipioCedula;
	}

	public DepartamentoModel getDepartamentoCedula() {
		return departamentoCedula;
	}

	public MunicipioModel getMunicipioNacimientoDpi() {
		return municipioNacimientoDpi;
	}

	public DepartamentoModel getDepartamentoNacimientoDpi() {
		return departamentoNacimientoDpi;
	}

	public void setMunicipioVecindad(MunicipioModel municipioVecindad) {
		this.municipioVecindad = municipioVecindad;
	}

	public void setDepartamentoVecindad(DepartamentoModel departamentoVecindad) {
		this.departamentoVecindad = departamentoVecindad;
	}

	public void setMunicipioCedula(MunicipioModel municipioCedula) {
		this.municipioCedula = municipioCedula;
	}

	public void setDepartamentoCedula(DepartamentoModel departamentoCedula) {
		this.departamentoCedula = departamentoCedula;
	}

	public void setMunicipioNacimientoDpi(MunicipioModel municipioNacimientoDpi) {
		this.municipioNacimientoDpi = municipioNacimientoDpi;
	}

	public void setDepartamentoNacimientoDpi(DepartamentoModel departamentoNacimientoDpi) {
		this.departamentoNacimientoDpi = departamentoNacimientoDpi;
	}

	public Long getNroboleta() {
		return nroboleta;
	}

	public String getCui() {
		return cui;
	}

	public Long getDepVecindad() {
		return depVecindad;
	}

	public Long getMunVecindad() {
		return munVecindad;
	}

	public Date getFechaEmisionDpi() {
		return fechaEmisionDpi;
	}

	public String getSerieDpi() {
		return serieDpi;
	}

	public String getOrdenCedulaRef() {
		return ordenCedulaRef;
	}

	public Long getRegistroCedulaRef() {
		return registroCedulaRef;
	}

	public Long getDepCedulaRef() {
		return depCedulaRef;
	}

	public Long getMunCedulaRef() {
		return munCedulaRef;
	}

	public String getNumFolioCedulaRef() {
		return numFolioCedulaRef;
	}

	public String getNumLibroCedulaRef() {
		return numLibroCedulaRef;
	}

	public Long getDepNacimientoDpi() {
		return depNacimientoDpi;
	}

	public Long getMunNacimientoDpi() {
		return munNacimientoDpi;
	}

	public Date getFechaAdientoNacDpi() {
		return FechaAdientoNacDpi;
	}

	public String getNroLibroNacimientoDpi() {
		return nroLibroNacimientoDpi;
	}

	public String getNroFolioNacimientoDpi() {
		return nroFolioNacimientoDpi;
	}

	public String getNroPartidaNacimeintoDpi() {
		return nroPartidaNacimeintoDpi;
	}

	public String getUsuarioCreador() {
		return usuarioCreador;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setNroboleta(Long nroboleta) {
		this.nroboleta = nroboleta;
	}

	public void setCui(String cui) {
		this.cui = cui;
	}

	public void setDepVecindad(Long depVecindad) {
		this.depVecindad = depVecindad;
	}

	public void setMunVecindad(Long munVecindad) {
		this.munVecindad = munVecindad;
	}

	public void setFechaEmisionDpi(Date fechaEmisionDpi) {
		this.fechaEmisionDpi = fechaEmisionDpi;
	}

	public void setSerieDpi(String serieDpi) {
		this.serieDpi = serieDpi;
	}

	public void setOrdenCedulaRef(String ordenCedulaRef) {
		this.ordenCedulaRef = ordenCedulaRef;
	}

	public void setRegistroCedulaRef(Long registroCedulaRef) {
		this.registroCedulaRef = registroCedulaRef;
	}

	public void setDepCedulaRef(Long depCedulaRef) {
		this.depCedulaRef = depCedulaRef;
	}

	public void setMunCedulaRef(Long munCedulaRef) {
		this.munCedulaRef = munCedulaRef;
	}

	public void setNumFolioCedulaRef(String numFolioCedulaRef) {
		this.numFolioCedulaRef = numFolioCedulaRef;
	}

	public void setNumLibroCedulaRef(String numLibroCedulaRef) {
		this.numLibroCedulaRef = numLibroCedulaRef;
	}

	public void setDepNacimientoDpi(Long depNacimientoDpi) {
		this.depNacimientoDpi = depNacimientoDpi;
	}

	public void setMunNacimientoDpi(Long munNacimientoDpi) {
		this.munNacimientoDpi = munNacimientoDpi;
	}

	public void setFechaAdientoNacDpi(Date fechaAdientoNacDpi) {
		FechaAdientoNacDpi = fechaAdientoNacDpi;
	}

	public void setNroLibroNacimientoDpi(String nroLibroNacimientoDpi) {
		this.nroLibroNacimientoDpi = nroLibroNacimientoDpi;
	}

	public void setNroFolioNacimientoDpi(String nroFolioNacimientoDpi) {
		this.nroFolioNacimientoDpi = nroFolioNacimientoDpi;
	}

	public void setNroPartidaNacimeintoDpi(String nroPartidaNacimeintoDpi) {
		this.nroPartidaNacimeintoDpi = nroPartidaNacimeintoDpi;
	}

	public void setUsuarioCreador(String usuarioCreador) {
		this.usuarioCreador = usuarioCreador;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
	
}
