package com.cap1.model;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "SIGNON")
public class SignOn implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ADS_REGIONID; 
	private String ADS_OFFICEID; 
	private String ADS_CASHID;  
	private float ADS_TRANSEQ;
	private float ADS_MSGSEQ;  
	private String ADS_OVERRIDETYPE; 
	private String ADS_REVERSIBLE;  
	private String ADS_REVERSE; 
	private String ADS_PARTREVERSE; 
	private String ADS_IPITEM;
	private String ADS_STFWSTATUS; 
	private String ADS_ERRORID; 
	private String ADS_GROUPID;
	private String ADS_TRANID; 
	private String ADS_DATE;
	private String ADS_TIME;
	private String ADS_EJPROCLIST; 
	private String ADS_OVERRIDEOPER; 
	private String ADS_MAJORFNCT;  
	private String ADS_MINORFNCT;  
	private Date ADS_PROCDATE;
	private String _OPRWORK__OPRID;
	private String _OPRWORK__CBOXNUM;
	private String _OPRWORK__AREA ;

	
	public String getADS_REGIONID() {
		return ADS_REGIONID;
	}
	public String getADS_OFFICEID() {
		return ADS_OFFICEID;
	}
	public String getADS_CASHID() {
		return ADS_CASHID;
	}
	public float getADS_TRANSEQ() {
		return ADS_TRANSEQ;
	}
	public float getADS_MSGSEQ() {
		return ADS_MSGSEQ;
	}
	public String getADS_OVERRIDETYPE() {
		return ADS_OVERRIDETYPE;
	}
	public String getADS_REVERSIBLE() {
		return ADS_REVERSIBLE;
	}
	public String getADS_REVERSE() {
		return ADS_REVERSE;
	}
	public String getADS_PARTREVERSE() {
		return ADS_PARTREVERSE;
	}
	public String getADS_IPITEM() {
		return ADS_IPITEM;
	}
	public String getADS_STFWSTATUS() {
		return ADS_STFWSTATUS;
	}
	public String getADS_ERRORID() {
		return ADS_ERRORID;
	}
	public String getADS_GROUPID() {
		return ADS_GROUPID;
	}
	public String getADS_TRANID() {
		return ADS_TRANID;
	}
	public String getADS_DATE() {
		return ADS_DATE;
	}
	public String getADS_TIME() {
		return ADS_TIME;
	}
	public String getADS_EJPROCLIST() {
		return ADS_EJPROCLIST;
	}
	public String getADS_OVERRIDEOPER() {
		return ADS_OVERRIDEOPER;
	}
	public String getADS_MAJORFNCT() {
		return ADS_MAJORFNCT;
	}
	public String getADS_MINORFNCT() {
		return ADS_MINORFNCT;
	}
	public Date getADS_PROCDATE() {
		return ADS_PROCDATE;
	}
	public String get_OPRWORK__OPRID() {
		return _OPRWORK__OPRID;
	}
	public String get_OPRWORK__CBOXNUM() {
		return _OPRWORK__CBOXNUM;
	}
	public String get_OPRWORK__AREA() {
		return _OPRWORK__AREA;
	}
	@XmlElement(name = "ADS_REGIONID")
	public void setADS_REGIONID(String aDS_REGIONID) {
		ADS_REGIONID = aDS_REGIONID;
	}
	@XmlElement(name = "ADS_OFFICEID")
	public void setADS_OFFICEID(String aDS_OFFICEID) {
		ADS_OFFICEID = aDS_OFFICEID;
	}
	@XmlElement(name ="ADS_CASHID")
	public void setADS_CASHID(String aDS_CASHID) {
		ADS_CASHID = aDS_CASHID;
	}
	@XmlElement(name ="ADS_TRANSEQ")
	public void setADS_TRANSEQ(float aDS_TRANSEQ) {
		ADS_TRANSEQ = aDS_TRANSEQ;
	}
	@XmlElement(name ="ADS_MSGSEQ")
	public void setADS_MSGSEQ(float aDS_MSGSEQ) {
		ADS_MSGSEQ = aDS_MSGSEQ;
	}
	@XmlElement(name ="ADS_OVERRIDETYPE")
	public void setADS_OVERRIDETYPE(String aDS_OVERRIDETYPE) {
		ADS_OVERRIDETYPE = aDS_OVERRIDETYPE;
	}
	@XmlElement(name ="ADS_REVERSIBLE")
	public void setADS_REVERSIBLE(String aDS_REVERSIBLE) {
		ADS_REVERSIBLE = aDS_REVERSIBLE;
	}
	@XmlElement(name ="ADS_REVERSE")
	public void setADS_REVERSE(String aDS_REVERSE) {
		ADS_REVERSE = aDS_REVERSE;
	}
	@XmlElement(name ="ADS_PARTREVERSE")
	public void setADS_PARTREVERSE(String aDS_PARTREVERSE) {
		ADS_PARTREVERSE = aDS_PARTREVERSE;
	}
	@XmlElement(name ="ADS_IPITEM")
	public void setADS_IPITEM(String aDS_IPITEM) {
		ADS_IPITEM = aDS_IPITEM;
	}
	@XmlElement(name ="ADS_STFWSTATUS")
	public void setADS_STFWSTATUS(String aDS_STFWSTATUS) {
		ADS_STFWSTATUS = aDS_STFWSTATUS;
	}
	@XmlElement(name ="ADS_ERRORID")
	public void setADS_ERRORID(String aDS_ERRORID) {
		ADS_ERRORID = aDS_ERRORID;
	}
	@XmlElement(name ="ADS_GROUPID")
	public void setADS_GROUPID(String aDS_GROUPID) {
		ADS_GROUPID = aDS_GROUPID;
	}
	@XmlElement(name ="ADS_TRANID")
	public void setADS_TRANID(String aDS_TRANID) {
		ADS_TRANID = aDS_TRANID;
	}
	@XmlElement(name ="ADS_DATE")
	public void setADS_DATE(String aDS_DATE) {
		ADS_DATE = aDS_DATE;
	}
	@XmlElement(name ="ADS_TIME")
	public void setADS_TIME(String aDS_TIME) {
		ADS_TIME = aDS_TIME;
	}
	@XmlElement(name ="ADS_EJPROCLIST")
	public void setADS_EJPROCLIST(String aDS_EJPROCLIST) {
		ADS_EJPROCLIST = aDS_EJPROCLIST;
	}
	@XmlElement(name ="ADS_OVERRIDEOPER")
	public void setADS_OVERRIDEOPER(String aDS_OVERRIDEOPER) {
		ADS_OVERRIDEOPER = aDS_OVERRIDEOPER;
	}
	@XmlElement(name ="ADS_MAJORFNCT")
	public void setADS_MAJORFNCT(String aDS_MAJORFNCT) {
		ADS_MAJORFNCT = aDS_MAJORFNCT;
	}
	@XmlElement(name ="ADS_MINORFNCT")
	public void setADS_MINORFNCT(String aDS_MINORFNCT) {
		ADS_MINORFNCT = aDS_MINORFNCT;
	}
	@XmlElement(name ="ADS_PROCDATE")
	public void setADS_PROCDATE(Date aDS_PROCDATE) {
		ADS_PROCDATE = aDS_PROCDATE;
	}
	@XmlElement(name ="_OPRWORK__OPRID")
	public void set_OPRWORK__OPRID(String _OPRWORK__OPRID) {
		this._OPRWORK__OPRID = _OPRWORK__OPRID;
	}
	@XmlElement(name ="_OPRWORK__CBOXNUM")
	public void set_OPRWORK__CBOXNUM(String _OPRWORK__CBOXNUM) {
		this._OPRWORK__CBOXNUM = _OPRWORK__CBOXNUM;
	}
	@XmlElement(name ="_OPRWORK__AREA")
	public void set_OPRWORK__AREA(String _OPRWORK__AREA) {
		this._OPRWORK__AREA = _OPRWORK__AREA;
	}
	@Override
	public String toString() {
		return "SignOn [ADS_REGIONID=" + ADS_REGIONID + ", ADS_OFFICEID=" + ADS_OFFICEID + ", ADS_CASHID=" + ADS_CASHID
				+ ", ADS_TRANSEQ=" + ADS_TRANSEQ + ", ADS_MSGSEQ=" + ADS_MSGSEQ + ", ADS_OVERRIDETYPE="
				+ ADS_OVERRIDETYPE + ", ADS_REVERSIBLE=" + ADS_REVERSIBLE + ", ADS_REVERSE=" + ADS_REVERSE
				+ ", ADS_PARTREVERSE=" + ADS_PARTREVERSE + ", ADS_IPITEM=" + ADS_IPITEM + ", ADS_STFWSTATUS="
				+ ADS_STFWSTATUS + ", ADS_ERRORID=" + ADS_ERRORID + ", ADS_GROUPID=" + ADS_GROUPID + ", ADS_TRANID="
				+ ADS_TRANID + ", ADS_DATE=" + ADS_DATE + ", ADS_TIME=" + ADS_TIME + ", ADS_EJPROCLIST="
				+ ADS_EJPROCLIST + ", ADS_OVERRIDEOPER=" + ADS_OVERRIDEOPER + ", ADS_MAJORFNCT=" + ADS_MAJORFNCT
				+ ", ADS_MINORFNCT=" + ADS_MINORFNCT + ", ADS_PROCDATE=" + ADS_PROCDATE + ", _OPRWORK__OPRID="
				+ _OPRWORK__OPRID + ", _OPRWORK__CBOXNUM=" + _OPRWORK__CBOXNUM + ", _OPRWORK__AREA=" + _OPRWORK__AREA
				+ "]";
	}
	
	public SignOn(){
		
	}
	
	
}
