package com.example.springsocial.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="TRENAPN",schema="RNPSOLICITUD")
public class Trenapn implements Serializable{
	
	@Column(name="ENTREGA")
	private Long ENTREGA;
	@Column(name="ENVIO")
	private Long ENVIO;
	
	@Id
	@Column(name="NROSOLICITUD")
	private String NROSOLICITUD;
	@Column(name="CUI")
	private Long CUI;
	@Column(name="SERIE")
	private String SERIE;
	@Column(name="FECHAEMISION")
	private Date FECHAEMISION;
	@Column(name="NOM1CIUDADANO")
	private String NOM1CIUDADANO;
	@Column(name="NOM2CIUDADANO")
	private String NOM2CIUDADANO;
	@Column(name="NOM3CIUDADANO")
	private String NOM3CIUDADANO;
	@Column(name="APE1CIUDADANO")
	private String APE1CIUDADANO;
	@Column(name="APE2CIUDADANO")
	private String APE2CIUDADANO;
	@Column(name="APELLIDOCASADA")
	private String APELLIDOCASADA;
	
	@Column(name="GENERO")
	private Long GENERO;
	@Column(name="ESTADOCIVIL")
	private String ESTADOCIVIL;
	@Column(name="FECNACIMIENTO")
	private Date  FECNACIMIENTO;       
	@Column(name="FECASIENTONACIMIENTO")
	private Date FECASIENTONACIMIENTO;
	@Column(name="PAISNACIMIENTO")
	private Long PAISNACIMIENTO;   
	@Column(name="DEPNACIMIENTO")
	private Long DEPNACIMIENTO;    
	@Column(name="MUNNACIMIENTO")
	private Long MUNNACIMIENTO; 
	@Column(name="NROLIBRONACIMIENTO")
	private String NROLIBRONACIMIENTO;
	@Column(name="NROFOLIONACIMIENTO")
	private String NROFOLIONACIMIENTO;
	@Column(name="NROPARTIDANACIMIENTO")
	private String NROPARTIDANACIMIENTO;
	
	@Column(name="NOM1PADRE")
	private String NOM1PADRE; 
	@Column(name="NOM2PADRE")
	private String NOM2PADRE;
	@Column(name="APE1PADRE")
	private String APE1PADRE;
	@Column(name="APE2PADRE")
	private String APE2PADRE;
	@Column(name="NOM1MADRE")
	private String NOM1MADRE;
	@Column(name="NOM2MADRE")
	private String NOM2MADRE;
	@Column(name="APE1MADRE")
	private String APE1MADRE; 
	@Column(name="APE2MADRE")
	private String APE2MADRE;
	@Column(name="FECSOLICITUD")
	private Date FECSOLICITUD;
	
	@Column(name="DEPSOLICITUD")
	private Long DEPSOLICITUD;   
	@Column(name="MUNSOLICITUD")
	private Long MUNSOLICITUD;
	@Column(name="EVENTO")
	private Long EVENTO; 
	@Column(name="SEDE_SOLICITUD")
	private Long SEDE_SOLICITUD;
	@Column(name="SEDE_ENTREGA")
	private Long SEDE_ENTREGA;
	@Column(name="PAIS_SOLICITUD")
	private Long PAIS_SOLICITUD;
	@Column(name="PAIS_RESIDENCIA")
	private Long PAIS_RESIDENCIA;
	@Column(name="DEPVECINDAD")
	private Long DEPVECINDAD;
	@Column(name="MUNVECINDAD")
	private Long MUNVECINDAD;
	
	@Column(name="ORDENCEDULA")
	private String ORDENCEDULA;
	@Column(name="REGISTROCEDULA")
	private String REGISTROCEDULA;
	@Column(name="DEPEXTCEDULA")
	private Long DEPEXTCEDULA;
	@Column(name="MUNEXTCEDULA")
	private Long MUNEXTCEDULA;
	@Column(name="OCUPACION")
	private Long OCUPACION;  
	@Column(name="LIMITACIONES")
	private Long LIMITACIONES;  
	@Column(name="ACTSERVICIOMILITAR")
	private String ACTSERVICIOMILITAR;
	@Column(name="ESCOLARIDAD")
	private Long ESCOLARIDAD;
	
	@Column(name="FECNACIONALIZACION")
	private Date FECNACIONALIZACION;    
	@Column(name="TIPONACIONALIZACION")
	private Long TIPONACIONALIZACION;
	@Column(name="DOCNACIONALIZACION")
	private String DOCNACIONALIZACION;
	@Column(name="TIPOTRAMITE")
	private String TIPOTRAMITE; 
	@Column(name="IDHUELLA")
	private Long IDHUELLA;
	@Column(name="CANTREPOSICIONES")
	private Long CANTREPOSICIONES;
	@Column(name="ETNIA")
	private Long ETNIA; 
	
	@Column(name="FALLECIDO")
	private Long FALLECIDO;
	@Column(name="FECDEFUNCION")
	private Date FECDEFUNCION;  
	@Column(name="DIRECCION")
	private String DIRECCION;
	@Column(name="CODAREACELULAR")
	private Long CODAREACELULAR;
	@Column(name="NUMCELULAR")
 	private Long NUMCELULAR;
	@Column(name="VIDENTE")
	private Long VIDENTE;
	@Column(name="EMAIL")
	private String EMAIL;
	@Column(name="SOLICITUD_EMPADRONAMIENTO")
	private Long SOLICITUD_EMPADRONAMIENTO;
	@Column(name="DIRECCION_ELECTORAL")
	private String DIRECCION_ELECTORAL;
	@Column(name="NROCASA")
	private String NROCASA;
	
	@Column(name="NROZONA")
	private Long NROZONA;
	@Column(name="DEPRESIDENCIA")
	private Long DEPRESIDENCIA;
	@Column(name="MUNRESIDENCIA")
	private Long MUNRESIDENCIA;
	@Column(name="MISMA_DIRRESIDENCIA_ELECTORAL")
	private Long MISMA_DIRRESIDENCIA_ELECTORAL;
	
	
	@Column(name="FECCARGA") //
	private Date FECCARGA;
	@Column(name="ESTATUS")
	private Long ESTATUS;
	@Column(name="NROBOLETATSE")
	private Long NROBOLETATSE;
	@Column(name="FECCRE")
	private Date FECCRE;
	@Column(name="FECMOD")
	private Date FECMOD;
	
	@Column(name="ENTREGAWS") //NO VIENE
	private Date ENTREGAWS;
	@Column(name="TELEFONO_CASA")//NO VIENE
	private Long TELEFONO_CASA;
	@Column(name="DESCRIPCION_OCUPACION") //NO VIENE
	private String DESCRIPCION_OCUPACION;
	@Column(name="NROBOLETA") // NO VIENE
	private String NROBOLETA;
	@Column(name="ALFABETISMO") // NO VIENE
	private Long ALFABETISMO;	
	
	
	
	public Trenapn() {
	}
	
	public Long getMUNNACIMIENTO() {
		return MUNNACIMIENTO;
	}

	public void setMUNNACIMIENTO(Long mUNNACIMIENTO) {
		MUNNACIMIENTO = mUNNACIMIENTO;
	}

	public Long getENTREGA() {
		return ENTREGA;
	}
	public Long getENVIO() {
		return ENVIO;
	}
	public String getNROSOLICITUD() {
		return NROSOLICITUD;
	}
	public Long getCUI() {
		return CUI;
	}
	public String getSERIE() {
		return SERIE;
	}
	public Long getCANTREPOSICIONES() {
		return CANTREPOSICIONES;
	}
	public Date getFECHAEMISION() {
		return FECHAEMISION;
	}
	public String getNOM1CIUDADANO() {
		return NOM1CIUDADANO;
	}
	public String getNOM2CIUDADANO() {
		return NOM2CIUDADANO;
	}
	public String getNOM3CIUDADANO() {
		return NOM3CIUDADANO;
	}
	public String getAPE1CIUDADANO() {
		return APE1CIUDADANO;
	}
	public String getAPE2CIUDADANO() {
		return APE2CIUDADANO;
	}
	public String getAPELLIDOCASADA() {
		return APELLIDOCASADA;
	}
	public Long getGENERO() {
		return GENERO;
	}
	public String getESTADOCIVIL() {
		return ESTADOCIVIL;
	}
	public Date getFECNACIMIENTO() {
		return FECNACIMIENTO;
	}
	public Date getFECASIENTONACIMIENTO() {
		return FECASIENTONACIMIENTO;
	}
	public Long getPAISNACIMIENTO() {
		return PAISNACIMIENTO;
	}
	public Long getDEPNACIMIENTO() {
		return DEPNACIMIENTO;
	}
	public String getNROLIBRONACIMIENTO() {
		return NROLIBRONACIMIENTO;
	}
	public String getNROFOLIONACIMIENTO() {
		return NROFOLIONACIMIENTO;
	}
	public String getNROPARTIDANACIMIENTO() {
		return NROPARTIDANACIMIENTO;
	}
	public String getNOM1PADRE() {
		return NOM1PADRE;
	}
	public String getNOM2PADRE() {
		return NOM2PADRE;
	}
	public String getAPE1PADRE() {
		return APE1PADRE;
	}
	public String getAPE2PADRE() {
		return APE2PADRE;
	}
	public String getNOM1MADRE() {
		return NOM1MADRE;
	}
	public String getNOM2MADRE() {
		return NOM2MADRE;
	}
	public String getAPE1MADRE() {
		return APE1MADRE;
	}
	public String getAPE2MADRE() {
		return APE2MADRE;
	}
	public Date getFECSOLICITUD() {
		return FECSOLICITUD;
	}
	public Long getDEPSOLICITUD() {
		return DEPSOLICITUD;
	}
	public Long getMUNSOLICITUD() {
		return MUNSOLICITUD;
	}
	public String getTIPOTRAMITE() {
		return TIPOTRAMITE;
	}
	public Long getDEPVECINDAD() {
		return DEPVECINDAD;
	}
	public Long getMUNVECINDAD() {
		return MUNVECINDAD;
	}
	public String getORDENCEDULA() {
		return ORDENCEDULA;
	}
	public String getREGISTROCEDULA() {
		return REGISTROCEDULA;
	}
	public Long getDEPEXTCEDULA() {
		return DEPEXTCEDULA;
	}
	public Long getMUNEXTCEDULA() {
		return MUNEXTCEDULA;
	}
	public String getNROBOLETA() {
		return NROBOLETA;
	}
	public Long getALFABETISMO() {
		return ALFABETISMO;
	}
	public Long getOCUPACION() {
		return OCUPACION;
	}
	public Long getLIMITACIONES() {
		return LIMITACIONES;
	}
	public String getACTSERVICIOMILITAR() {
		return ACTSERVICIOMILITAR;
	}
	public Long getETNIA() {
		return ETNIA;
	}
	public Long getESCOLARIDAD() {
		return ESCOLARIDAD;
	}
	public Date getFECNACIONALIZACION() {
		return FECNACIONALIZACION;
	}
	public Long getTIPONACIONALIZACION() {
		return TIPONACIONALIZACION;
	}
	public String getDOCNACIONALIZACION() {
		return DOCNACIONALIZACION;
	}
	public Long getFALLECIDO() {
		return FALLECIDO;
	}
	public Date getFECDEFUNCION() {
		return FECDEFUNCION;
	}
	public Long getIDHUELLA() {
		return IDHUELLA;
	}
	public Date getFECCARGA() {
		return FECCARGA;
	}
	public Long getESTATUS() {
		return ESTATUS;
	}
	public Long getNROBOLETATSE() {
		return NROBOLETATSE;
	}
	public Date getFECCRE() {
		return FECCRE;
	}
	public Date getFECMOD() {
		return FECMOD;
	}
	public Long getEVENTO() {
		return EVENTO;
	}
	public Long getSEDE_SOLICITUD() {
		return SEDE_SOLICITUD;
	}
	public Long getSEDE_ENTREGA() {
		return SEDE_ENTREGA;
	}
	public Long getPAIS_SOLICITUD() {
		return PAIS_SOLICITUD;
	}
	public Long getPAIS_RESIDENCIA() {
		return PAIS_RESIDENCIA;
	}
	public Date getENTREGAWS() {
		return ENTREGAWS;
	}
	public String getDIRECCION() {
		return DIRECCION;
	}
	public Long getTELEFONO_CASA() {
		return TELEFONO_CASA;
	}
	public Long getCODAREACELULAR() {
		return CODAREACELULAR;
	}
	public Long getNUMCELULAR() {
		return NUMCELULAR;
	}
	public Long getVIDENTE() {
		return VIDENTE;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public Long getSOLICITUD_EMPADRONAMIENTO() {
		return SOLICITUD_EMPADRONAMIENTO;
	}
	public String getDESCRIPCION_OCUPACION() {
		return DESCRIPCION_OCUPACION;
	}
	public String getDIRECCION_ELECTORAL() {
		return DIRECCION_ELECTORAL;
	}
	public String getNROCASA() {
		return NROCASA;
	}
	public Long getNROZONA() {
		return NROZONA;
	}
	public Long getDEPRESIDENCIA() {
		return DEPRESIDENCIA;
	}
	public Long getMUNRESIDENCIA() {
		return MUNRESIDENCIA;
	}
	public Long getMISMA_DIRRESIDENCIA_ELECTORAL() {
		return MISMA_DIRRESIDENCIA_ELECTORAL;
	}
	public void setENTREGA(Long eNTREGA) {
		ENTREGA = eNTREGA;
	}
	public void setENVIO(Long eNVIO) {
		ENVIO = eNVIO;
	}
	public void setNROSOLICITUD(String nROSOLICITUD) {
		NROSOLICITUD = nROSOLICITUD;
	}
	public void setCUI(Long cUI) {
		CUI = cUI;
	}
	public void setSERIE(String sERIE) {
		SERIE = sERIE;
	}
	public void setCANTREPOSICIONES(Long cANTREPOSICIONES) {
		CANTREPOSICIONES = cANTREPOSICIONES;
	}
	public void setFECHAEMISION(Date fECHAEMISION) {
		FECHAEMISION = fECHAEMISION;
	}
	public void setNOM1CIUDADANO(String nOM1CIUDADANO) {
		NOM1CIUDADANO = nOM1CIUDADANO;
	}
	public void setNOM2CIUDADANO(String nOM2CIUDADANO) {
		NOM2CIUDADANO = nOM2CIUDADANO;
	}
	public void setNOM3CIUDADANO(String nOM3CIUDADANO) {
		NOM3CIUDADANO = nOM3CIUDADANO;
	}
	public void setAPE1CIUDADANO(String aPE1CIUDADANO) {
		APE1CIUDADANO = aPE1CIUDADANO;
	}
	public void setAPE2CIUDADANO(String aPE2CIUDADANO) {
		APE2CIUDADANO = aPE2CIUDADANO;
	}
	public void setAPELLIDOCASADA(String aPELLIDOCASADA) {
		APELLIDOCASADA = aPELLIDOCASADA;
	}
	public void setGENERO(Long gENERO) {
		GENERO = gENERO;
	}
	public void setESTADOCIVIL(String eSTADOCIVIL) {
		ESTADOCIVIL = eSTADOCIVIL;
	}
	public void setFECNACIMIENTO(Date fECNACIMIENTO) {
		FECNACIMIENTO = fECNACIMIENTO;
	}
	public void setFECASIENTONACIMIENTO(Date fECASIENTONACIMIENTO) {
		FECASIENTONACIMIENTO = fECASIENTONACIMIENTO;
	}
	public void setPAISNACIMIENTO(Long pAISNACIMIENTO) {
		PAISNACIMIENTO = pAISNACIMIENTO;
	}
	public void setDEPNACIMIENTO(Long dEPNACIMIENTO) {
		DEPNACIMIENTO = dEPNACIMIENTO;
	}
	public void setNROLIBRONACIMIENTO(String nROLIBRONACIMIENTO) {
		NROLIBRONACIMIENTO = nROLIBRONACIMIENTO;
	}
	public void setNROFOLIONACIMIENTO(String nROFOLIONACIMIENTO) {
		NROFOLIONACIMIENTO = nROFOLIONACIMIENTO;
	}
	public void setNROPARTIDANACIMIENTO(String nROPARTIDANACIMIENTO) {
		NROPARTIDANACIMIENTO = nROPARTIDANACIMIENTO;
	}
	public void setNOM1PADRE(String nOM1PADRE) {
		NOM1PADRE = nOM1PADRE;
	}
	public void setNOM2PADRE(String nOM2PADRE) {
		NOM2PADRE = nOM2PADRE;
	}
	public void setAPE1PADRE(String aPE1PADRE) {
		APE1PADRE = aPE1PADRE;
	}
	public void setAPE2PADRE(String aPE2PADRE) {
		APE2PADRE = aPE2PADRE;
	}
	public void setNOM1MADRE(String nOM1MADRE) {
		NOM1MADRE = nOM1MADRE;
	}
	public void setNOM2MADRE(String nOM2MADRE) {
		NOM2MADRE = nOM2MADRE;
	}
	public void setAPE1MADRE(String aPE1MADRE) {
		APE1MADRE = aPE1MADRE;
	}
	public void setAPE2MADRE(String aPE2MADRE) {
		APE2MADRE = aPE2MADRE;
	}
	public void setFECSOLICITUD(Date fECSOLICITUD) {
		FECSOLICITUD = fECSOLICITUD;
	}
	public void setDEPSOLICITUD(Long dEPSOLICITUD) {
		DEPSOLICITUD = dEPSOLICITUD;
	}
	public void setMUNSOLICITUD(Long mUNSOLICITUD) {
		MUNSOLICITUD = mUNSOLICITUD;
	}
	public void setTIPOTRAMITE(String tIPOTRAMITE) {
		TIPOTRAMITE = tIPOTRAMITE;
	}
	public void setDEPVECINDAD(Long dEPVECINDAD) {
		DEPVECINDAD = dEPVECINDAD;
	}
	public void setMUNVECINDAD(Long mUNVECINDAD) {
		MUNVECINDAD = mUNVECINDAD;
	}
	public void setORDENCEDULA(String oRDENCEDULA) {
		ORDENCEDULA = oRDENCEDULA;
	}
	public void setREGISTROCEDULA(String rEGISTROCEDULA) {
		REGISTROCEDULA = rEGISTROCEDULA;
	}
	public void setDEPEXTCEDULA(Long dEPEXTCEDULA) {
		DEPEXTCEDULA = dEPEXTCEDULA;
	}
	public void setMUNEXTCEDULA(Long mUNEXTCEDULA) {
		MUNEXTCEDULA = mUNEXTCEDULA;
	}
	public void setNROBOLETA(String nROBOLETA) {
		NROBOLETA = nROBOLETA;
	}
	public void setALFABETISMO(Long aLFABETISMO) {
		ALFABETISMO = aLFABETISMO;
	}
	public void setOCUPACION(Long oCUPACION) {
		OCUPACION = oCUPACION;
	}
	public void setLIMITACIONES(Long lIMITACIONES) {
		LIMITACIONES = lIMITACIONES;
	}
	public void setACTSERVICIOMILITAR(String aCTSERVICIOMILITAR) {
		ACTSERVICIOMILITAR = aCTSERVICIOMILITAR;
	}
	public void setETNIA(Long eTNIA) {
		ETNIA = eTNIA;
	}
	public void setESCOLARIDAD(Long eSCOLARIDAD) {
		ESCOLARIDAD = eSCOLARIDAD;
	}
	public void setFECNACIONALIZACION(Date fECNACIONALIZACION) {
		FECNACIONALIZACION = fECNACIONALIZACION;
	}
	public void setTIPONACIONALIZACION(Long tIPONACIONALIZACION) {
		TIPONACIONALIZACION = tIPONACIONALIZACION;
	}
	public void setDOCNACIONALIZACION(String dOCNACIONALIZACION) {
		DOCNACIONALIZACION = dOCNACIONALIZACION;
	}
	public void setFALLECIDO(Long fALLECIDO) {
		FALLECIDO = fALLECIDO;
	}
	public void setFECDEFUNCION(Date fECDEFUNCION) {
		FECDEFUNCION = fECDEFUNCION;
	}
	public void setIDHUELLA(Long iDHUELLA) {
		IDHUELLA = iDHUELLA;
	}
	public void setFECCARGA(Date fECCARGA) {
		FECCARGA = fECCARGA;
	}
	public void setESTATUS(Long eSTATUS) {
		ESTATUS = eSTATUS;
	}
	public void setNROBOLETATSE(Long nROBOLETATSE) {
		NROBOLETATSE = nROBOLETATSE;
	}
	public void setFECCRE(Date fECCRE) {
		FECCRE = fECCRE;
	}
	public void setFECMOD(Date fECMOD) {
		FECMOD = fECMOD;
	}
	public void setEVENTO(Long eVENTO) {
		EVENTO = eVENTO;
	}
	public void setSEDE_SOLICITUD(Long sEDE_SOLICITUD) {
		SEDE_SOLICITUD = sEDE_SOLICITUD;
	}
	public void setSEDE_ENTREGA(Long sEDE_ENTREGA) {
		SEDE_ENTREGA = sEDE_ENTREGA;
	}
	public void setPAIS_SOLICITUD(Long pAIS_SOLICITUD) {
		PAIS_SOLICITUD = pAIS_SOLICITUD;
	}
	public void setPAIS_RESIDENCIA(Long pAIS_RESIDENCIA) {
		PAIS_RESIDENCIA = pAIS_RESIDENCIA;
	}
	public void setENTREGAWS(Date eNTREGAWS) {
		ENTREGAWS = eNTREGAWS;
	}
	public void setDIRECCION(String dIRECCION) {
		DIRECCION = dIRECCION;
	}
	public void setTELEFONO_CASA(Long tELEFONO_CASA) {
		TELEFONO_CASA = tELEFONO_CASA;
	}
	public void setCODAREACELULAR(Long cODAREACELULAR) {
		CODAREACELULAR = cODAREACELULAR;
	}
	public void setNUMCELULAR(Long nUMCELULAR) {
		NUMCELULAR = nUMCELULAR;
	}
	public void setVIDENTE(Long vIDENTE) {
		VIDENTE = vIDENTE;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	public void setSOLICITUD_EMPADRONAMIENTO(Long sOLICITUD_EMPADRONAMIENTO) {
		SOLICITUD_EMPADRONAMIENTO = sOLICITUD_EMPADRONAMIENTO;
	}
	public void setDESCRIPCION_OCUPACION(String dESCRIPCION_OCUPACION) {
		DESCRIPCION_OCUPACION = dESCRIPCION_OCUPACION;
	}
	public void setDIRECCION_ELECTORAL(String dIRECCION_ELECTORAL) {
		DIRECCION_ELECTORAL = dIRECCION_ELECTORAL;
	}
	public void setNROCASA(String nROCASA) {
		NROCASA = nROCASA;
	}
	public void setNROZONA(Long nROZONA) {
		NROZONA = nROZONA;
	}
	public void setDEPRESIDENCIA(Long dEPRESIDENCIA) {
		DEPRESIDENCIA = dEPRESIDENCIA;
	}
	public void setMUNRESIDENCIA(Long mUNRESIDENCIA) {
		MUNRESIDENCIA = mUNRESIDENCIA;
	}
	public void setMISMA_DIRRESIDENCIA_ELECTORAL(Long mISMA_DIRRESIDENCIA_ELECTORAL) {
		MISMA_DIRRESIDENCIA_ELECTORAL = mISMA_DIRRESIDENCIA_ELECTORAL;
	}

}
