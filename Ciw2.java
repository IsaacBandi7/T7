package com.cap1.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CIW2")
public class Ciw2 {
	
	private String ADS_REGIONID;
	private String ads_officeid;
	 private String ads_cashid;
	 private float ads_transeq;
	 private float ads_msgseq;
	 private String ads_overridetype;
	 private String ads_reversible;
	 private String ads_reverse;
	 private String ads_partreverse;
	 private String ads_ipitem;
	 private String ads_stfwstatus;
	 private String ads_errorid;
	 private String ads_groupid;
	 private String ads_tranid;
	 private String ads_date;
	 private String ads_time;
	 private String ads_ejproclist;
	 private String ads_overrideoper;
	 private String ads_majorfnct;
	 private String ads_minorfnct;
	 private String ads_procdate;
	 private String ejciw_namfull_1;
	 private String ejciw_numtaxid_1;
	 private String ejciw_address_1;
	 private String ejciw_address_2;
	 private String ejciw_ctystzip_1;
	 private String ejciw_city;
	 private String ejciw_state;
	 private String ejciw_zip;
	 private String ejciw_dob_1;
	 private String ejciw_idnumber_1;
	 private String ejciw_typeid_1;
	 private String ejciw_country;
	 private String ejciw_descreln_1;
	 private String ejciw_numacct_1;
	 private String ejciw_transeq_1;
	 private String rtcagg_othercnd_1;
	 private String rtcagg_ident_1;
	 private String rtcagg_othname_1;
	 private String rtcagg_name_1;
	 private String rtcagg_tin_1;
	 private String rtcagg_unabletp_1;
	 private String rtcagg_numtaxid_1;
	 private float custseqnm;
	 private String nou_chkagreement;

	 public String getADS_REGIONID() {
			return ADS_REGIONID;
		}
	 @XmlElement(name = "ADS_REGIONID")
	 public void setADS_REGIONID(String aDS_REGIONID) {
			ADS_REGIONID = aDS_REGIONID;
		}
	public String getAds_officeid() {
		return ads_officeid;
	}
	@XmlElement(name = "ADS_OFFICEID")
	public void setAds_officeid(String ads_officeid) {
		this.ads_officeid = ads_officeid;
	}
	public String getAds_cashid() {
		return ads_cashid;
	}
	@XmlElement(name ="ADS_CASHID")
	public void setAds_cashid(String ads_cashid) {
		this.ads_cashid = ads_cashid;
	}
	public float getAds_transeq() {
		return ads_transeq;
	}
	@XmlElement(name ="ADS_TRANSEQ")
	public void setAds_transeq(float ads_transeq) {
		this.ads_transeq = ads_transeq;
	}
	public float getAds_msgseq() {
		return ads_msgseq;
	}
	@XmlElement(name ="ADS_MSGSEQ")
	public void setAds_msgseq(float ads_msgseq) {
		this.ads_msgseq = ads_msgseq;
	}
	public String getAds_overridetype() {
		return ads_overridetype;
	}
	@XmlElement(name ="ADS_OVERRIDETYPE")
	public void setAds_overridetype(String ads_overridetype) {
		this.ads_overridetype = ads_overridetype;
	}
	public String getAds_reversible() {
		return ads_reversible;
	}
	@XmlElement(name ="ADS_REVERSIBLE")
	public void setAds_reversible(String ads_reversible) {
		this.ads_reversible = ads_reversible;
	}
	public String getAds_reverse() {
		return ads_reverse;
	}
	@XmlElement(name ="ADS_REVERSE")
	public void setAds_reverse(String ads_reverse) {
		this.ads_reverse = ads_reverse;
	}
	public String getAds_partreverse() {
		return ads_partreverse;
	}
	@XmlElement(name ="ADS_PARTREVERSE")
	public void setAds_partreverse(String ads_partreverse) {
		this.ads_partreverse = ads_partreverse;
	}
	public String getAds_ipitem() {
		return ads_ipitem;
	}
	@XmlElement(name ="ADS_IPITEM")
	public void setAds_ipitem(String ads_ipitem) {
		this.ads_ipitem = ads_ipitem;
	}
	public String getAds_stfwstatus() {
		return ads_stfwstatus;
	}
	@XmlElement(name ="ADS_STFWSTATUS")
	public void setAds_stfwstatus(String ads_stfwstatus) {
		this.ads_stfwstatus = ads_stfwstatus;
	}
	public String getAds_errorid() {
		return ads_errorid;
	}
	@XmlElement(name ="ADS_ERRORID")
	public void setAds_errorid(String ads_errorid) {
		this.ads_errorid = ads_errorid;
	}
	public String getAds_groupid() {
		return ads_groupid;
	}
	@XmlElement(name ="ADS_GROUPID")
	public void setAds_groupid(String ads_groupid) {
		this.ads_groupid = ads_groupid;
	}
	public String getAds_tranid() {
		return ads_tranid;
	}
	@XmlElement(name ="ADS_TRANID")
	public void setAds_tranid(String ads_tranid) {
		this.ads_tranid = ads_tranid;
	}
	public String getAds_date() {
		return ads_date;
	}
	@XmlElement(name ="ADS_DATE")
	public void setAds_date(String ads_date) {
		this.ads_date = ads_date;
	}
	public String getAds_time() {
		return ads_time;
	}
	@XmlElement(name ="ADS_TIME")
	public void setAds_time(String ads_time) {
		this.ads_time = ads_time;
	}
	public String getAds_ejproclist() {
		return ads_ejproclist;
	}
	@XmlElement(name ="ADS_EJPROCLIST")
	public void setAds_ejproclist(String ads_ejproclist) {
		this.ads_ejproclist = ads_ejproclist;
	}
	public String getAds_overrideoper() {
		return ads_overrideoper;
	}
	@XmlElement(name ="ADS_OVERRIDEOPER")
	public void setAds_overrideoper(String ads_overrideoper) {
		this.ads_overrideoper = ads_overrideoper;
	}
	public String getAds_majorfnct() {
		return ads_majorfnct;
	}
	@XmlElement(name ="ADS_MAJORFNCT")
	public void setAds_majorfnct(String ads_majorfnct) {
		this.ads_majorfnct = ads_majorfnct;
	}
	public String getAds_minorfnct() {
		return ads_minorfnct;
	}
	@XmlElement(name ="ADS_MINORFNCT")
	public void setAds_minorfnct(String ads_minorfnct) {
		this.ads_minorfnct = ads_minorfnct;
	}
	public String getAds_procdate() {
		return ads_procdate;
	}
	@XmlElement(name ="ADS_PROCDATE")
	public void setAds_procdate(String ads_procdate) {
		this.ads_procdate = ads_procdate;
	}
	public String getEjciw_namfull_1() {
		return ejciw_namfull_1;
	}
	@XmlElement(name ="EJCIW_NAMFULL_1")
	public void setEjciw_namfull_1(String ejciw_namfull_1) {
		this.ejciw_namfull_1 = ejciw_namfull_1;
	}
	public String getEjciw_numtaxid_1() {
		return ejciw_numtaxid_1;
	}
	@XmlElement(name ="EJCIW_NUMTAXID_1")
	public void setEjciw_numtaxid_1(String ejciw_numtaxid_1) {
		this.ejciw_numtaxid_1 = ejciw_numtaxid_1;
	}
	public String getEjciw_address_1() {
		return ejciw_address_1;
	}
	@XmlElement(name ="EJCIW_ADDRESS_1")
	public void setEjciw_address_1(String ejciw_address_1) {
		this.ejciw_address_1 = ejciw_address_1;
	}
	public String getEjciw_address_2() {
		return ejciw_address_2;
	}
	@XmlElement(name ="EJCIW_ADDRESS_2")
	public void setEjciw_address_2(String ejciw_address_2) {
		this.ejciw_address_2 = ejciw_address_2;
	}
	public String getEjciw_ctystzip_1() {
		return ejciw_ctystzip_1;
	}
	@XmlElement(name ="EJCIW_CTYSTZIP_1")
	public void setEjciw_ctystzip_1(String ejciw_ctystzip_1) {
		this.ejciw_ctystzip_1 = ejciw_ctystzip_1;
	}
	public String getEjciw_city() {
		return ejciw_city;
	}
	@XmlElement(name ="EJCIW_CiTY")
	public void setEjciw_city(String ejciw_city) {
		this.ejciw_city = ejciw_city;
	}
	public String getEjciw_state() {
		return ejciw_state;
	}
	@XmlElement(name ="EJCIW_STATE")
	public void setEjciw_state(String ejciw_state) {
		this.ejciw_state = ejciw_state;
	}
	public String getEjciw_zip() {
		return ejciw_zip;
	}
	@XmlElement(name ="EJCIW_ZIP")
	public void setEjciw_zip(String ejciw_zip) {
		this.ejciw_zip = ejciw_zip;
	}
	public String getEjciw_dob_1() {
		return ejciw_dob_1;
	}
	@XmlElement(name ="EJCIW_DOB_1")
	public void setEjciw_dob_1(String ejciw_dob_1) {
		this.ejciw_dob_1 = ejciw_dob_1;
	}
	public String getEjciw_idnumber_1() {
		return ejciw_idnumber_1;
	}
	@XmlElement(name ="EJCIW_IDNUMBER_1")
	public void setEjciw_idnumber_1(String ejciw_idnumber_1) {
		this.ejciw_idnumber_1 = ejciw_idnumber_1;
	}
	public String getEjciw_typeid_1() {
		return ejciw_typeid_1;
	}
	@XmlElement(name ="EJCIW_TYPEID_1")
	public void setEjciw_typeid_1(String ejciw_typeid_1) {
		this.ejciw_typeid_1 = ejciw_typeid_1;
	}
	public String getEjciw_country() {
		return ejciw_country;
	}
	@XmlElement(name ="EJCIW_COUNTRY")
	public void setEjciw_country(String ejciw_country) {
		this.ejciw_country = ejciw_country;
	}
	public String getEjciw_descreln_1() {
		return ejciw_descreln_1;
	}
	@XmlElement(name ="EJCIW_DESCRELN_1")
	public void setEjciw_descreln_1(String ejciw_descreln_1) {
		this.ejciw_descreln_1 = ejciw_descreln_1;
	}
	public String getEjciw_numacct_1() {
		return ejciw_numacct_1;
	}
	@XmlElement(name ="EJCIW_NUMACCT_1")
	public void setEjciw_numacct_1(String ejciw_numacct_1) {
		this.ejciw_numacct_1 = ejciw_numacct_1;
	}
	public String getEjciw_transeq_1() {
		return ejciw_transeq_1;
	}
	@XmlElement(name ="EJCIW_TRANSEQ_1")
	public void setEjciw_transeq_1(String ejciw_transeq_1) {
		this.ejciw_transeq_1 = ejciw_transeq_1;
	}
	public String getRtcagg_othercnd_1() {
		return rtcagg_othercnd_1;
	}
	@XmlElement(name ="RTCAGG_OTHERCND_1")
	public void setRtcagg_othercnd_1(String rtcagg_othercnd_1) {
		this.rtcagg_othercnd_1 = rtcagg_othercnd_1;
	}
	public String getRtcagg_ident_1() {
		return rtcagg_ident_1;
	}
	@XmlElement(name ="RTCAGG_IDENT_1")
	public void setRtcagg_ident_1(String rtcagg_ident_1) {
		this.rtcagg_ident_1 = rtcagg_ident_1;
	}
	public String getRtcagg_othname_1() {
		return rtcagg_othname_1;
	}
	@XmlElement(name ="RTCAGG_OTHNAME_1")
	public void setRtcagg_othname_1(String rtcagg_othname_1) {
		this.rtcagg_othname_1 = rtcagg_othname_1;
	}
	public String getRtcagg_name_1() {
		return rtcagg_name_1;
	}
	@XmlElement(name ="RTCAGG_NAME_1")
	public void setRtcagg_name_1(String rtcagg_name_1) {
		this.rtcagg_name_1 = rtcagg_name_1;
	}
	public String getRtcagg_tin_1() {
		return rtcagg_tin_1;
	}
	@XmlElement(name ="RTCAGG_TIN_1")
	public void setRtcagg_tin_1(String rtcagg_tin_1) {
		this.rtcagg_tin_1 = rtcagg_tin_1;
	}
	public String getRtcagg_unabletp_1() {
		return rtcagg_unabletp_1;
	}
	@XmlElement(name ="RTCAGG_UNABLETP_1")
	public void setRtcagg_unabletp_1(String rtcagg_unabletp_1) {
		this.rtcagg_unabletp_1 = rtcagg_unabletp_1;
	}
	public String getRtcagg_numtaxid_1() {
		return rtcagg_numtaxid_1;
	}
	@XmlElement(name ="RTCAGG_NUMTAXID_1")
	public void setRtcagg_numtaxid_1(String rtcagg_numtaxid_1) {
		this.rtcagg_numtaxid_1 = rtcagg_numtaxid_1;
	}
	public float getCustseqnm() {
		return custseqnm;
	}
	@XmlElement(name ="CUSTSEQNM")
	public void setCustseqnm(float custseqnm) {
		this.custseqnm = custseqnm;
	}
	public String getNou_chkagreement() {
		return nou_chkagreement;
	}
	@XmlElement(name ="NOU_CHKAGREEMENT")
	public void setNou_chkagreement(String nou_chkagreement) {
		this.nou_chkagreement = nou_chkagreement;
	}
	
}
