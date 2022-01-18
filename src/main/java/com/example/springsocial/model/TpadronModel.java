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
@Table(name="TPADRON")
public class TpadronModel implements Serializable{
	
	@Id
	@Column(name="nroboleta") 
	private	Long nroBoleta; 
	
	@Column(name="fecinscripcion")
	private	Date fechaInscripcion;
	
	@Column(name="nom1")
	private	String primerNombre;
	
	@Column(name="nom2")
	private	String segundoNombre;
	
	@Column(name="ape1")
	private	String primerApellido;
	
	@Column(name="ape2")
	private	String segundoApellido;
	
	@Column(name="ape3")
	private	String tercerApellido;
	
	@Column(name="status")
	private	Long statusPadron;
	
	@Column(name="fecnacimiento")
	private	Date FechaNacimiento;
	
	@Column(name="depnacimiento")
	private	Long depNacimiento;
	
	@Column(name="munnacimiento")
	private	Long munNacimiento;
	
	@ManyToOne
	@NotFound(
	        action = NotFoundAction.IGNORE)
	@JoinColumns({
		@JoinColumn(name="munnacimiento", referencedColumnName="CODMUN",insertable=false, updatable=false),
		@JoinColumn(name="depnacimiento", referencedColumnName="CODDEP",insertable=false, updatable=false)   
    })
	private MunicipioModel municipioNacimientoPadron;
	
	
	@ManyToOne
	@NotFound(
	        action = NotFoundAction.IGNORE)
	@JoinColumn(name="depnacimiento", referencedColumnName="CODDEP",insertable=false, updatable=false)
	private DepartamentoModel departamentoNacimientoPadron;
	
	@Column(name="genero")
	private	Long genero;
	
	@Column(name="alfabetismo")
	private	Long alfabetismo;
	
	@Column(name="novidente")
	private	Long noVidente;
	
	@Column(name="depresidencia")
	private	Long depResidencia;
	
	@Column(name="munresidencia")
	private	Long munResidencia;
	
	@ManyToOne
	@NotFound(
	        action = NotFoundAction.IGNORE)
	@JoinColumns({
		@JoinColumn(name="munresidencia", referencedColumnName="CODMUN",insertable=false, updatable=false),
		@JoinColumn(name="depresidencia", referencedColumnName="CODDEP",insertable=false, updatable=false)   
    })
	private MunicipioModel municipioResidenciaPadron;
	
	
	@ManyToOne
	@NotFound(
	        action = NotFoundAction.IGNORE)
	@JoinColumn(name="depresidencia", referencedColumnName="CODDEP",insertable=false, updatable=false)
	private DepartamentoModel departamentoResidenciaPadron;
	
	@Column(name="comresidencia")
	private	Long comuResidencia;
	
	@Column(name="cenvotacion")
	private	Long centroVotacion ;
	
	@Column(name="direccion")
	private	String direccion;
	
	@Column(name="nrocasa")
	private	String numeroCasa;
	
	@Column(name="nrozona")
	private	Long numeroZona;
	
	@Column(name="depempadrona")
	private	Long depEmpadronamiento;
	

	@Column(name="munempadrona")
	private	Long munEmpadronamiento;
	
	@Column(name="puestoempadrona")
	private	Long codPuestoEmpadronamiento;
	
	@Column(name="idpro")
	private Long idProceso;
	
	@Column(name="fecpro")
	private Date fechaProceso;
	
	@Column(name="fecultdir")
	private Date fechaUltimaDirección;
	
	@Column(name="control")
	private Long control;
	
	@Column(name="usrmod")
	private String usrmod;
	
	@Column(name="fecmod")
	private Date fecmod;
	
	@Column(name="puestomodifica")
	private Integer puestomodifica;
	
	@ManyToOne
	@NotFound(
	        action = NotFoundAction.IGNORE)
    @JoinColumn(name="nroboleta", referencedColumnName="nroboleta",insertable=false, updatable=false)
    private TdpiModel dpi;
	
	@ManyToOne
	@NotFound(
	        action = NotFoundAction.IGNORE)
    @JoinColumn(name="nroboleta", referencedColumnName="nroboleta",insertable=false, updatable=false)
    private TcedulaModel cedula;
    
	@ManyToOne
	@NotFound(
	        action = NotFoundAction.IGNORE)
    @JoinColumn(name="nroboleta", referencedColumnName="nroboleta",insertable=false, updatable=false)
    private TcomplementoModel complemento;
	
	
	
	
	public TpadronModel() {
	}
	
	public MunicipioModel getMunicipioResidenciaPadron() {
		return municipioResidenciaPadron;
	}

	public DepartamentoModel getDepartamentoResidenciaPadron() {
		return departamentoResidenciaPadron;
	}

	public void setMunicipioResidenciaPadron(MunicipioModel municipioResidenciaPadron) {
		this.municipioResidenciaPadron = municipioResidenciaPadron;
	}

	public void setDepartamentoResidenciaPadron(DepartamentoModel departamentoResidenciaPadron) {
		this.departamentoResidenciaPadron = departamentoResidenciaPadron;
	}

	public MunicipioModel getMunicipioNacimientoPadron() {
		return municipioNacimientoPadron;
	}
	public DepartamentoModel getDepartamentoNacimientoPadron() {
		return departamentoNacimientoPadron;
	}
	public void setMunicipioNacimientoPadron(MunicipioModel municipioNacimientoPadron) {
		this.municipioNacimientoPadron = municipioNacimientoPadron;
	}
	public void setDepartamentoNacimientoPadron(DepartamentoModel departamentoNacimientoPadron) {
		this.departamentoNacimientoPadron = departamentoNacimientoPadron;
	}
	public Long getNroBoleta() {
		return nroBoleta;
	}
	public Date getFechaInscripcion() {
		return fechaInscripcion;
	}
	public String getPrimerNombre() {
		return primerNombre;
	}
	public String getSegundoNombre() {
		return segundoNombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public String getTercerApellido() {
		return tercerApellido;
	}

	public Long getStatusPadron() {
		return statusPadron;
	}

	public Date getFechaNacimiento() {
		return FechaNacimiento;
	}

	public Long getDepNacimiento() {
		return depNacimiento;
	}

	public Long getMunNacimiento() {
		return munNacimiento;
	}

	public Long getGenero() {
		return genero;
	}

	public Long getAlfabetismo() {
		return alfabetismo;
	}

	public Long getNoVidente() {
		return noVidente;
	}

	public Long getDepResidencia() {
		return depResidencia;
	}

	public Long getMunResidencia() {
		return munResidencia;
	}

	public Long getComuResidencia() {
		return comuResidencia;
	}

	public Long getCentroVotacion() {
		return centroVotacion;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getNumeroCasa() {
		return numeroCasa;
	}

	public Long getNumeroZona() {
		return numeroZona;
	}

	public Long getDepEmpadronamiento() {
		return depEmpadronamiento;
	}

	public Long getMunEmpadronamiento() {
		return munEmpadronamiento;
	}

	public Long getCodPuestoEmpadronamiento() {
		return codPuestoEmpadronamiento;
	}

	



	public Long getIdProceso() {
		return idProceso;
	}

	public Date getFechaProceso() {
		return fechaProceso;
	}

	public Date getFechaUltimaDirección() {
		return fechaUltimaDirección;
	}

	public Long getControl() {
		return control;
	}

	public String getUsrmod() {
		return usrmod;
	}

	public Date getFecmod() {
		return fecmod;
	}

	public Integer getPuestomodifica() {
		return puestomodifica;
	}

	public TdpiModel getDpi() {
		return dpi;
	}

	/*public TcedulaModel getCedula() {
		return cedula;
	}*/

	public TcomplementoModel getComplemento() {
		return complemento;
	}

	public void setNroBoleta(Long nroBoleta) {
		this.nroBoleta = nroBoleta;
	}

	public void setFechaInscripcion(Date fechaInscripcion) {
		this.fechaInscripcion = fechaInscripcion;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public void setTercerApellido(String tercerApellido) {
		this.tercerApellido = tercerApellido;
	}

	public void setStatusPadron(Long statusPadron) {
		this.statusPadron = statusPadron;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}

	public void setDepNacimiento(Long depNacimiento) {
		this.depNacimiento = depNacimiento;
	}

	public void setMunNacimiento(Long munNacimiento) {
		this.munNacimiento = munNacimiento;
	}

	public void setGenero(Long genero) {
		this.genero = genero;
	}

	public void setAlfabetismo(Long alfabetismo) {
		this.alfabetismo = alfabetismo;
	}

	public void setNoVidente(Long noVidente) {
		this.noVidente = noVidente;
	}

	public void setDepResidencia(Long depResidencia) {
		this.depResidencia = depResidencia;
	}

	public void setMunResidencia(Long munResidencia) {
		this.munResidencia = munResidencia;
	}

	public void setComuResidencia(Long comuResidencia) {
		this.comuResidencia = comuResidencia;
	}

	public void setCentroVotacion(Long centroVotacion) {
		this.centroVotacion = centroVotacion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setNumeroCasa(String numeroCasa) {
		this.numeroCasa = numeroCasa;
	}

	public void setNumeroZona(Long numeroZona) {
		this.numeroZona = numeroZona;
	}

	public void setDepEmpadronamiento(Long depEmpadronamiento) {
		this.depEmpadronamiento = depEmpadronamiento;
	}

	public void setMunEmpadronamiento(Long munEmpadronamiento) {
		this.munEmpadronamiento = munEmpadronamiento;
	}

	public void setCodPuestoEmpadronamiento(Long codPuestoEmpadronamiento) {
		this.codPuestoEmpadronamiento = codPuestoEmpadronamiento;
	}

	

	public void setIdProceso(Long idProceso) {
		this.idProceso = idProceso;
	}

	public void setFechaProceso(Date fechaProceso) {
		this.fechaProceso = fechaProceso;
	}

	public void setFechaUltimaDirección(Date fechaUltimaDirección) {
		this.fechaUltimaDirección = fechaUltimaDirección;
	}

	public void setControl(Long control) {
		this.control = control;
	}

	public void setUsrmod(String usrmod) {
		this.usrmod = usrmod;
	}

	public void setFecmod(Date fecmod) {
		this.fecmod = fecmod;
	}

	public void setPuestomodifica(Integer puestomodifica) {
		this.puestomodifica = puestomodifica;
	}

	public void setDpi(TdpiModel dpi) {
		this.dpi = dpi;
	}

	/*public void setCedula(TcedulaModel cedula) {
		this.cedula = cedula;
	}*/

	public void setComplemento(TcomplementoModel complemento) {
		this.complemento = complemento;
	}
	
	
	
}
