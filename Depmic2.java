package com.cap1.model;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "DEPMIC2")
public class Depmic2 implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ADS_REGIONID ;
	private String ADS_OFFICEID ;
	private String ADS_CASHID ;
	private float  ADS_TRANSEQ ;
	private float ADS_MSGSEQ ;
	private String  ADS_OVERRIDETYPE ;
	private String ADS_REVERSIBLE  ;
	private String ADS_REVERSE;
	private String ADS_PARTREVERSE;
	private String ADS_IPITEM ;
	private String ADS_STFWSTATUS ;
	private String ADS_ERRORID;
	private String ADS_GROUPID;
	private String  ADS_TRANID;
	private Date ADS_DATE;
	private float ADS_TIME;
	private String ADS_EJPROCLIST;
	private String ADS_OVERRIDEOPER;
	private String ADS_MAJORFNCT;
	private String ADS_MINORFNCT;
	private Date ADS_PROCDATE;
	private String ACCOUNT_NUMACT19 ;
	private String ACCOUNT_TYPEACCT;
	private String ACCOUNT_DESCACCT;
	private String ACCOUNT_NUMBANK;
	private String ACCOUNT_DESCBANK;
	private String ACCOUNT_ABANUMBR;
	private String ACCOUNT_DOCUMTID;
	private String ACCOUNT_CHRMICRS ;
	private float ACCOUNT__UID;
	private Date ACCOUNT_DATE;
	private String ACCOUNT_TMSTP;
	private float MONETARY_AMTCASH;
	private float MONETARY_AMTCHECK;
	private float MONETARY_AMTTOTAL;
	private float MONETARY_AMTCSBK ;
	private float MONETARY_AMTRO;
	private float MONETARY_SESSFUND;
	private float SESSTRAN_TRNGROUP;
	private String HEADER_TRANID;
	private String HEADER_IDVERS;
	private String HEADER_EXCEPTN;
	
	
	
	public String getADS_REGIONID() {
		return ADS_REGIONID;
	}
	@XmlElement(name = "ADS_REGIONID")
	public void setADS_REGIONID(String aDS_REGIONID) {
		ADS_REGIONID = aDS_REGIONID;
	}
	public String getADS_OFFICEID() {
		return ADS_OFFICEID;
	}
	@XmlElement(name = "ADS_OFFICEID")
	public void setADS_OFFICEID(String aDS_OFFICEID) {
		ADS_OFFICEID = aDS_OFFICEID;
	}
	public String getADS_CASHID() {
		return ADS_CASHID;
	}
	@XmlElement(name = "ADS_CASHID")
	public void setADS_CASHID(String aDS_CASHID) {
		ADS_CASHID = aDS_CASHID;
	}
	public float getADS_TRANSEQ() {
		return ADS_TRANSEQ;
	}
	@XmlElement(name = "ADS_TRANSEQ")
	public void setADS_TRANSEQ(float aDS_TRANSEQ) {
		ADS_TRANSEQ = aDS_TRANSEQ;
	}
	public float getADS_MSGSEQ() {
		return ADS_MSGSEQ;
	}
	@XmlElement(name = "ADS_MSGSEQ")
	public void setADS_MSGSEQ(float aDS_MSGSEQ) {
		ADS_MSGSEQ = aDS_MSGSEQ;
	}
	public String getADS_OVERRIDETYPE() {
		return ADS_OVERRIDETYPE;
	}
	@XmlElement(name = "ADS_OVERRIDETYPE")
	public void setADS_OVERRIDETYPE(String aDS_OVERRIDETYPE) {
		ADS_OVERRIDETYPE = aDS_OVERRIDETYPE;
	}
	public String getADS_REVERSIBLE() {
		return ADS_REVERSIBLE;
	}
	@XmlElement(name = "ADS_REVERSIBLE")
	public void setADS_REVERSIBLE(String aDS_REVERSIBLE) {
		ADS_REVERSIBLE = aDS_REVERSIBLE;
	}
	public String getADS_REVERSE() {
		return ADS_REVERSE;
	}
	@XmlElement(name = "ADS_REVERSE")
	public void setADS_REVERSE(String aDS_REVERSE) {
		ADS_REVERSE = aDS_REVERSE;
	}
	public String getADS_PARTREVERSE() {
		return ADS_PARTREVERSE;
	}
	@XmlElement(name = "ADS_PARTREVERSE")
	public void setADS_PARTREVERSE(String aDS_PARTREVERSE) {
		ADS_PARTREVERSE = aDS_PARTREVERSE;
	}
	public String getADS_IPITEM() {
		return ADS_IPITEM;
	}
	@XmlElement(name = "ADS_IPITEM")
	public void setADS_IPITEM(String aDS_IPITEM) {
		ADS_IPITEM = aDS_IPITEM;
	}
	public String getADS_STFWSTATUS() {
		return ADS_STFWSTATUS;
	}
	@XmlElement(name = "ADS_STFWSTATUS")
	public void setADS_STFWSTATUS(String aDS_STFWSTATUS) {
		ADS_STFWSTATUS = aDS_STFWSTATUS;
	}
	public String getADS_ERRORID() {
		return ADS_ERRORID;
	}
	@XmlElement(name = "ADS_ERRORID")
	public void setADS_ERRORID(String aDS_ERRORID) {
		ADS_ERRORID = aDS_ERRORID;
	}
	public String getADS_GROUPID() {
		return ADS_GROUPID;
	}
	@XmlElement(name = "ADS_GROUPID")
	public void setADS_GROUPID(String aDS_GROUPID) {
		ADS_GROUPID = aDS_GROUPID;
	}
	public String getADS_TRANID() {
		return ADS_TRANID;
	}
	@XmlElement(name = "ADS_TRANID")
	public void setADS_TRANID(String aDS_TRANID) {
		ADS_TRANID = aDS_TRANID;
	}
	public Date getADS_DATE() {
		return ADS_DATE;
	}
	@XmlElement(name = "ADS_DATE")
	public void setADS_DATE(Date aDS_DATE) {
		ADS_DATE = aDS_DATE;
	}
	public float getADS_TIME() {
		return ADS_TIME;
	}
	@XmlElement(name = "ADS_TIME")
	public void setADS_TIME(float aDS_TIME) {
		ADS_TIME = aDS_TIME;
	}
	public String getADS_EJPROCLIST() {
		return ADS_EJPROCLIST;
	}
	@XmlElement(name = "ADS_EJPROCLIST")
	public void setADS_EJPROCLIST(String aDS_EJPROCLIST) {
		ADS_EJPROCLIST = aDS_EJPROCLIST;
	}
	public String getADS_OVERRIDEOPER() {
		return ADS_OVERRIDEOPER;
	}
	@XmlElement(name = "ADS_OVERRIDEOPER")
	public void setADS_OVERRIDEOPER(String aDS_OVERRIDEOPER) {
		ADS_OVERRIDEOPER = aDS_OVERRIDEOPER;
	}
	public String getADS_MAJORFNCT() {
		return ADS_MAJORFNCT;
	}
	@XmlElement(name = "ADS_MAJORFNCT")
	public void setADS_MAJORFNCT(String aDS_MAJORFNCT) {
		ADS_MAJORFNCT = aDS_MAJORFNCT;
	}
	public String getADS_MINORFNCT() {
		return ADS_MINORFNCT;
	}
	@XmlElement(name = "ADS_MINORFNCT")
	public void setADS_MINORFNCT(String aDS_MINORFNCT) {
		ADS_MINORFNCT = aDS_MINORFNCT;
	}
	public Date getADS_PROCDATE() {
		return ADS_PROCDATE;
	}
	@XmlElement(name = "ADS_PROCDATE")
	public void setADS_PROCDATE(Date aDS_PROCDATE) {
		ADS_PROCDATE = aDS_PROCDATE;
	}
	public String getACCOUNT_NUMACT19() {
		return ACCOUNT_NUMACT19;
	}
	@XmlElement(name = "ACCOUNT_NUMACT19")
	public void setACCOUNT_NUMACT19(String aCCOUNT_NUMACT19) {
		ACCOUNT_NUMACT19 = aCCOUNT_NUMACT19;
	}
	public String getACCOUNT_TYPEACCT() {
		return ACCOUNT_TYPEACCT;
	}
	@XmlElement(name = "ACCOUNT_TYPEACCT")
	public void setACCOUNT_TYPEACCT(String aCCOUNT_TYPEACCT) {
		ACCOUNT_TYPEACCT = aCCOUNT_TYPEACCT;
	}
	public String getACCOUNT_DESCACCT() {
		return ACCOUNT_DESCACCT;
	}
	@XmlElement(name = "ACCOUNT_DESCACCT")
	public void setACCOUNT_DESCACCT(String aCCOUNT_DESCACCT) {
		ACCOUNT_DESCACCT = aCCOUNT_DESCACCT;
	}
	public String getACCOUNT_NUMBANK() {
		return ACCOUNT_NUMBANK;
	}
	@XmlElement(name = "ACCOUNT_NUMBANK")
	public void setACCOUNT_NUMBANK(String aCCOUNT_NUMBANK) {
		ACCOUNT_NUMBANK = aCCOUNT_NUMBANK;
	}
	public String getACCOUNT_DESCBANK() {
		return ACCOUNT_DESCBANK;
	}
	@XmlElement(name = "ACCOUNT_DESCBANK")
	public void setACCOUNT_DESCBANK(String aCCOUNT_DESCBANK) {
		ACCOUNT_DESCBANK = aCCOUNT_DESCBANK;
	}
	public String getACCOUNT_ABANUMBR() {
		return ACCOUNT_ABANUMBR;
	}
	@XmlElement(name = "ACCOUNT_ABANUMBR")
	public void setACCOUNT_ABANUMBR(String aCCOUNT_ABANUMBR) {
		ACCOUNT_ABANUMBR = aCCOUNT_ABANUMBR;
	}
	public String getACCOUNT_DOCUMTID() {
		return ACCOUNT_DOCUMTID;
	}
	@XmlElement(name = "ACCOUNT_DOCUMTID")
	public void setACCOUNT_DOCUMTID(String aCCOUNT_DOCUMTID) {
		ACCOUNT_DOCUMTID = aCCOUNT_DOCUMTID;
	}
	public String getACCOUNT_CHRMICRS() {
		return ACCOUNT_CHRMICRS;
	}
	@XmlElement(name = "ACCOUNT_CHRMICRS")
	public void setACCOUNT_CHRMICRS(String aCCOUNT_CHRMICRS) {
		ACCOUNT_CHRMICRS = aCCOUNT_CHRMICRS;
	}
	public float getACCOUNT__UID() {
		return ACCOUNT__UID;
	}
	@XmlElement(name = "ACCOUNT__UID")
	public void setACCOUNT__UID(float aCCOUNT__UID) {
		ACCOUNT__UID = aCCOUNT__UID;
	}
	public Date getACCOUNT_DATE() {
		return ACCOUNT_DATE;
	}
	@XmlElement(name = "ACCOUNT_DATE")
	public void setACCOUNT_DATE(Date aCCOUNT_DATE) {
		ACCOUNT_DATE = aCCOUNT_DATE;
	}
	public String getACCOUNT_TMSTP() {
		return ACCOUNT_TMSTP;
	}
	@XmlElement(name = "ACCOUNT_TMSTP")
	public void setACCOUNT_TMSTP(String aCCOUNT_TMSTP) {
		ACCOUNT_TMSTP = aCCOUNT_TMSTP;
	}
	public float getMONETARY_AMTCASH() {
		return MONETARY_AMTCASH;
	}
	@XmlElement(name = "MONETARY_AMTCASH")
	public void setMONETARY_AMTCASH(float mONETARY_AMTCASH) {
		MONETARY_AMTCASH = mONETARY_AMTCASH;
	}
	public float getMONETARY_AMTCHECK() {
		return MONETARY_AMTCHECK;
	}
	@XmlElement(name = "MONETARY_AMTCHECK")
	public void setMONETARY_AMTCHECK(float mONETARY_AMTCHECK) {
		MONETARY_AMTCHECK = mONETARY_AMTCHECK;
	}
	public float getMONETARY_AMTTOTAL() {
		return MONETARY_AMTTOTAL;
	}
	@XmlElement(name = "MONETARY_AMTTOTAL")
	public void setMONETARY_AMTTOTAL(float mONETARY_AMTTOTAL) {
		MONETARY_AMTTOTAL = mONETARY_AMTTOTAL;
	}
	public float getMONETARY_AMTCSBK() {
		return MONETARY_AMTCSBK;
	}
	@XmlElement(name = "MONETARY_AMTCSBK")
	public void setMONETARY_AMTCSBK(float mONETARY_AMTCSBK) {
		MONETARY_AMTCSBK = mONETARY_AMTCSBK;
	}
	public float getMONETARY_AMTRO() {
		return MONETARY_AMTRO;
	}
	@XmlElement(name = "MONETARY_AMTRO")
	public void setMONETARY_AMTRO(float mONETARY_AMTRO) {
		MONETARY_AMTRO = mONETARY_AMTRO;
	}
	public float getMONETARY_SESSFUND() {
		return MONETARY_SESSFUND;
	}
	@XmlElement(name = "MONETARY_SESSFUND")
	public void setMONETARY_SESSFUND(float mONETARY_SESSFUND) {
		MONETARY_SESSFUND = mONETARY_SESSFUND;
	}
	public float getSESSTRAN_TRNGROUP() {
		return SESSTRAN_TRNGROUP;
	}
	@XmlElement(name = "SESSTRAN_TRNGROUP")
	public void setSESSTRAN_TRNGROUP(float sESSTRAN_TRNGROUP) {
		SESSTRAN_TRNGROUP = sESSTRAN_TRNGROUP;
	}
	public String getHEADER_TRANID() {
		return HEADER_TRANID;
	}
	@XmlElement(name = "HEADER_TRANID")
	public void setHEADER_TRANID(String hEADER_TRANID) {
		HEADER_TRANID = hEADER_TRANID;
	}
	public String getHEADER_IDVERS() {
		return HEADER_IDVERS;
	}
	@XmlElement(name = "HEADER_IDVERS")
	public void setHEADER_IDVERS(String hEADER_IDVERS) {
		HEADER_IDVERS = hEADER_IDVERS;
	}
	public String getHEADER_EXCEPTN() {
		return HEADER_EXCEPTN;
	}
	@XmlElement(name = "HEADER_EXCEPTN")
	public void setHEADER_EXCEPTN(String hEADER_EXCEPTN) {
		HEADER_EXCEPTN = hEADER_EXCEPTN;
	}
	@Override
	public String toString() {
		return "Depmic2 [ADS_REGIONID=" + ADS_REGIONID + ", ADS_OFFICEID=" + ADS_OFFICEID + ", ADS_CASHID=" + ADS_CASHID
				+ ", ADS_TRANSEQ=" + ADS_TRANSEQ + ", ADS_MSGSEQ=" + ADS_MSGSEQ + ", ADS_OVERRIDETYPE="
				+ ADS_OVERRIDETYPE + ", ADS_REVERSIBLE=" + ADS_REVERSIBLE + ", ADS_REVERSE=" + ADS_REVERSE
				+ ", ADS_PARTREVERSE=" + ADS_PARTREVERSE + ", ADS_IPITEM=" + ADS_IPITEM + ", ADS_STFWSTATUS="
				+ ADS_STFWSTATUS + ", ADS_ERRORID=" + ADS_ERRORID + ", ADS_GROUPID=" + ADS_GROUPID + ", ADS_TRANID="
				+ ADS_TRANID + ", ADS_DATE=" + ADS_DATE + ", ADS_TIME=" + ADS_TIME + ", ADS_EJPROCLIST="
				+ ADS_EJPROCLIST + ", ADS_OVERRIDEOPER=" + ADS_OVERRIDEOPER + ", ADS_MAJORFNCT=" + ADS_MAJORFNCT
				+ ", ADS_MINORFNCT=" + ADS_MINORFNCT + ", ADS_PROCDATE=" + ADS_PROCDATE + ", ACCOUNT_NUMACT19="
				+ ACCOUNT_NUMACT19 + ", ACCOUNT_TYPEACCT=" + ACCOUNT_TYPEACCT + ", ACCOUNT_DESCACCT=" + ACCOUNT_DESCACCT
				+ ", ACCOUNT_NUMBANK=" + ACCOUNT_NUMBANK + ", ACCOUNT_DESCBANK=" + ACCOUNT_DESCBANK
				+ ", ACCOUNT_ABANUMBR=" + ACCOUNT_ABANUMBR + ", ACCOUNT_DOCUMTID=" + ACCOUNT_DOCUMTID
				+ ", ACCOUNT_CHRMICRS=" + ACCOUNT_CHRMICRS + ", ACCOUNT__UID=" + ACCOUNT__UID + ", ACCOUNT_DATE="
				+ ACCOUNT_DATE + ", ACCOUNT_TMSTP=" + ACCOUNT_TMSTP + ", MONETARY_AMTCASH=" + MONETARY_AMTCASH
				+ ", MONETARY_AMTCHECK=" + MONETARY_AMTCHECK + ", MONETARY_AMTTOTAL=" + MONETARY_AMTTOTAL
				+ ", MONETARY_AMTCSBK=" + MONETARY_AMTCSBK + ", MONETARY_AMTRO=" + MONETARY_AMTRO
				+ ", MONETARY_SESSFUND=" + MONETARY_SESSFUND + ", SESSTRAN_TRNGROUP=" + SESSTRAN_TRNGROUP
				+ ", HEADER_TRANID=" + HEADER_TRANID + ", HEADER_IDVERS=" + HEADER_IDVERS + ", HEADER_EXCEPTN="
				+ HEADER_EXCEPTN + "]";
	}
	
}
