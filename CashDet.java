package com.cap1.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CASHDET")
public class CashDet {


	 private String ads_regionid;
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
	 private float cashdet_amt001;
	 private float cashdet_amt002;
	 private float cashdet_amt005;
	 private float cashdet_amt010;
	 private float cashdet_amt020;
	 private float cashdet_amt050;
	 private float cashdet_amt100;
	 private float cashdet_amtc001;
	 private float cashdet_amtc005;
	 private float cashdet_amtc010;
	 private float cashdet_amtc025;
	 private float cashdet_amtc050;
	 private float cashdet_amtc100;
	 private float cashdet_amtcoin;
	 private float cashdet_amtcurr;
	 private float cashdet_amttotal;
	 private float cashdet_num001;
	 private float cashdet_num002;
	 private float cashdet_num005;
	 private float cashdet_num010;
	 private float cashdet_num020;
	 private float cashdet_num050;
	 private float cashdet_num100;
	 private float cashdet_numc001;
	 private float cashdet_numc005;
	 private float cashdet_numc010;
	 private float cashdet_numc025;
	 private float cashdet_numc050;
	 private float cashdet_numc100;
	 private float cashdet_amtcsbk;
	 private String cashdet_countamt;
	 private float monetary_amtcsbk;
	 private float monetary_sessfund;
	 private String account_numacct;
	 private String dvoroper__bcpdate;
	 private String dvoroper_char008;
	 private float custseqnm;
	 
	public String getAds_regionid() {
		return ads_regionid;
	}
	@XmlElement(name ="ADS_REGIONID")
	public void setAds_regionid(String ads_regionid) {
		this.ads_regionid = ads_regionid;
	}
	public String getAds_officeid() {
		return ads_officeid;
	}
	@XmlElement(name ="ADS_OFFICEID")
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
	public float getCashdet_amt001() {
		return cashdet_amt001;
	}
	@XmlElement(name ="CASHDET_AMT001")
	public void setCashdet_amt001(float cashdet_amt001) {
		this.cashdet_amt001 = cashdet_amt001;
	}
	public float getCashdet_amt002() {
		return cashdet_amt002;
	}
	@XmlElement(name ="CASHDET_AMT002")
	public void setCashdet_amt002(float cashdet_amt002) {
		this.cashdet_amt002 = cashdet_amt002;
	}
	public float getCashdet_amt005() {
		return cashdet_amt005;
	}
	@XmlElement(name ="CASHDET_AMT005")
	public void setCashdet_amt005(float cashdet_amt005) {
		this.cashdet_amt005 = cashdet_amt005;
	}
	public float getCashdet_amt010() {
		return cashdet_amt010;
	}
	@XmlElement(name ="CASHDET_AMT010")
	public void setCashdet_amt010(float cashdet_amt010) {
		this.cashdet_amt010 = cashdet_amt010;
	}
	public float getCashdet_amt020() {
		return cashdet_amt020;
	}
	@XmlElement(name ="CASHDET_AMT020")
	public void setCashdet_amt020(float cashdet_amt020) {
		this.cashdet_amt020 = cashdet_amt020;
	}
	public float getCashdet_amt050() {
		return cashdet_amt050;
	}
	@XmlElement(name ="CASHDET_AMT050")
	public void setCashdet_amt050(float cashdet_amt050) {
		this.cashdet_amt050 = cashdet_amt050;
	}
	public float getCashdet_amt100() {
		return cashdet_amt100;
	}
	@XmlElement(name ="CASHDET_AMT100")
	public void setCashdet_amt100(float cashdet_amt100) {
		this.cashdet_amt100 = cashdet_amt100;
	}
	public float getCashdet_amtc001() {
		return cashdet_amtc001;
	}
	@XmlElement(name ="CASHDET_AMTC001")
	public void setCashdet_amtc001(float cashdet_amtc001) {
		this.cashdet_amtc001 = cashdet_amtc001;
	}
	public float getCashdet_amtc005() {
		return cashdet_amtc005;
	}
	@XmlElement(name ="CASHDET_AMTC005")
	public void setCashdet_amtc005(float cashdet_amtc005) {
		this.cashdet_amtc005 = cashdet_amtc005;
	}
	public float getCashdet_amtc010() {
		return cashdet_amtc010;
	}
	@XmlElement(name ="CASHDET_AMTC010")
	public void setCashdet_amtc010(float cashdet_amtc010) {
		this.cashdet_amtc010 = cashdet_amtc010;
	}
	public float getCashdet_amtc025() {
		return cashdet_amtc025;
	}
	@XmlElement(name ="CASHDET_AMTC025")
	public void setCashdet_amtc025(float cashdet_amtc025) {
		this.cashdet_amtc025 = cashdet_amtc025;
	}
	public float getCashdet_amtc050() {
		return cashdet_amtc050;
	}
	@XmlElement(name ="CASHDET_AMTC050")
	public void setCashdet_amtc050(float cashdet_amtc050) {
		this.cashdet_amtc050 = cashdet_amtc050;
	}
	public float getCashdet_amtc100() {
		return cashdet_amtc100;
	}
	@XmlElement(name ="CASHDET_AMTC100")
	public void setCashdet_amtc100(float cashdet_amtc100) {
		this.cashdet_amtc100 = cashdet_amtc100;
	}
	public float getCashdet_amtcoin() {
		return cashdet_amtcoin;
	}
	@XmlElement(name ="CASHDET_AMTCOIN")
	public void setCashdet_amtcoin(float cashdet_amtcoin) {
		this.cashdet_amtcoin = cashdet_amtcoin;
	}
	public float getCashdet_amtcurr() {
		return cashdet_amtcurr;
	}
	@XmlElement(name ="CASHDET_AMTCURR")
	public void setCashdet_amtcurr(float cashdet_amtcurr) {
		this.cashdet_amtcurr = cashdet_amtcurr;
	}
	public float getCashdet_amttotal() {
		return cashdet_amttotal;
	}
	@XmlElement(name ="CASHDET_AMTTOTAL")
	public void setCashdet_amttotal(float cashdet_amttotal) {
		this.cashdet_amttotal = cashdet_amttotal;
	}
	public float getCashdet_num001() {
		return cashdet_num001;
	}
	@XmlElement(name ="CASHDET_NUM001")
	public void setCashdet_num001(float cashdet_num001) {
		this.cashdet_num001 = cashdet_num001;
	}
	public float getCashdet_num002() {
		return cashdet_num002;
	}
	@XmlElement(name ="CASHDET_NUM002")
	public void setCashdet_num002(float cashdet_num002) {
		this.cashdet_num002 = cashdet_num002;
	}
	public float getCashdet_num005() {
		return cashdet_num005;
	}
	@XmlElement(name ="CASHDET_NUM005")
	public void setCashdet_num005(float cashdet_num005) {
		this.cashdet_num005 = cashdet_num005;
	}
	public float getCashdet_num010() {
		return cashdet_num010;
	}
	@XmlElement(name ="CASHDET_NUM010")
	public void setCashdet_num010(float cashdet_num010) {
		this.cashdet_num010 = cashdet_num010;
	}
	public float getCashdet_num020() {
		return cashdet_num020;
	}
	@XmlElement(name ="CASHDET_NUM020")
	public void setCashdet_num020(float cashdet_num020) {
		this.cashdet_num020 = cashdet_num020;
	}
	public float getCashdet_num050() {
		return cashdet_num050;
	}
	@XmlElement(name ="CASHDET_NUM050")
	public void setCashdet_num050(float cashdet_num050) {
		this.cashdet_num050 = cashdet_num050;
	}
	public float getCashdet_num100() {
		return cashdet_num100;
	}
	@XmlElement(name ="CASHDET_NUM100")
	public void setCashdet_num100(float cashdet_num100) {
		this.cashdet_num100 = cashdet_num100;
	}
	public float getCashdet_numc001() {
		return cashdet_numc001;
	}
	@XmlElement(name ="CASHDET_NUMC001")
	public void setCashdet_numc001(float cashdet_numc001) {
		this.cashdet_numc001 = cashdet_numc001;
	}
	public float getCashdet_numc005() {
		return cashdet_numc005;
	}
	@XmlElement(name ="CASHDET_NUMC005")
	public void setCashdet_numc005(float cashdet_numc005) {
		this.cashdet_numc005 = cashdet_numc005;
	}
	public float getCashdet_numc010() {
		return cashdet_numc010;
	}
	@XmlElement(name ="CASHDET_NUMC010")
	public void setCashdet_numc010(float cashdet_numc010) {
		this.cashdet_numc010 = cashdet_numc010;
	}
	public float getCashdet_numc025() {
		return cashdet_numc025;
	}
	@XmlElement(name ="CASHDET_NUMC025")
	public void setCashdet_numc025(float cashdet_numc025) {
		this.cashdet_numc025 = cashdet_numc025;
	}
	public float getCashdet_numc050() {
		return cashdet_numc050;
	}
	@XmlElement(name ="CASHDET_NUMC050")
	public void setCashdet_numc050(float cashdet_numc050) {
		this.cashdet_numc050 = cashdet_numc050;
	}
	public float getCashdet_numc100() {
		return cashdet_numc100;
	}
	@XmlElement(name ="CASHDET_NUMC100")
	public void setCashdet_numc100(float cashdet_numc100) {
		this.cashdet_numc100 = cashdet_numc100;
	}
	public float getCashdet_amtcsbk() {
		return cashdet_amtcsbk;
	}
	@XmlElement(name ="CASHDET_AMTCSBK")
	public void setCashdet_amtcsbk(float cashdet_amtcsbk) {
		this.cashdet_amtcsbk = cashdet_amtcsbk;
	}
	public String getCashdet_countamt() {
		return cashdet_countamt;
	}
	@XmlElement(name ="CASHDET_COUNTAMT")
	public void setCashdet_countamt(String cashdet_countamt) {
		this.cashdet_countamt = cashdet_countamt;
	}
	public float getMonetary_amtcsbk() {
		return monetary_amtcsbk;
	}
	@XmlElement(name ="MONETARY_AMTCSBK")
	public void setMonetary_amtcsbk(float monetary_amtcsbk) {
		this.monetary_amtcsbk = monetary_amtcsbk;
	}
	public float getMonetary_sessfund() {
		return monetary_sessfund;
	}
	@XmlElement(name ="MONETARY_SESSFUND")
	public void setMonetary_sessfund(float monetary_sessfund) {
		this.monetary_sessfund = monetary_sessfund;
	}
	public String getAccount_numacct() {
		return account_numacct;
	}
	@XmlElement(name ="ACCOUNT_NUMACCT")
	public void setAccount_numacct(String account_numacct) {
		this.account_numacct = account_numacct;
	}
	public String getDvoroper__bcpdate() {
		return dvoroper__bcpdate;
	}
	@XmlElement(name ="DVOROPER__BCPDATE")
	public void setDvoroper__bcpdate(String dvoroper__bcpdate) {
		this.dvoroper__bcpdate = dvoroper__bcpdate;
	}
	public String getDvoroper_char008() {
		return dvoroper_char008;
	}
	@XmlElement(name ="DVOROPER_CHAR008")
	public void setDvoroper_char008(String dvoroper_char008) {
		this.dvoroper_char008 = dvoroper_char008;
	}
	public float getCustseqnm() {
		return custseqnm;
	}
	@XmlElement(name ="CUSTSEQNM")
	public void setCustseqnm(float custseqnm) {
		this.custseqnm = custseqnm;
	}
	 

}
