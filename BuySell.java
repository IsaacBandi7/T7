package com.cap1.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "BUYSELL")
public class BuySell {
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
	 private String buysell_flgbuysl;
	 private String buysell_typebysl;
	 private String buysell_typeex;
	 private String buysell_title;
	 private String buysell_atmtm12;
	 private String buysell_numtelr;
	 private String buysell_numother;
	 private float buysell_amt100;
	 private float buysell_amt050;
	 private float buysell_amt020;
	 private float buysell_amt010;
	 private float buysell_amt005;
	 private float buysell_amt002;
	 private float buysell_amt001;
	 private float buysell_amtc100;
	 private float buysell_amtc050;
	 private float buysell_amtc025;
	 private float buysell_amtc010;
	 private float buysell_amtc005;
	 private float buysell_amtc001;
	 private float monetar_amtcash;
	 private float monetary_amtcsbk;
	 private float monetary_amttotal;
	 private float buysell_amttotal;
	 private float cashbox_balance;
	 private String buysell_shipment;
	 private float sesstran_trngroup;
	 private float hsndmone_amtcash;
	 private float hsndmone_amtcheck;
	 private float hsndmone_amtcsbk;
	 private float custseqnm;
	 
	 
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
		public String getBuysell_flgbuysl() {
			return buysell_flgbuysl;
		}
		@XmlElement(name ="BUYSELL_FLGBUYSL")
		public void setBuysell_flgbuysl(String buysell_flgbuysl) {
			this.buysell_flgbuysl = buysell_flgbuysl;
		}
		public String getBuysell_typebysl() {
			return buysell_typebysl;
		}
		@XmlElement(name ="BUYSELL_TYPEBYSL")
		public void setBuysell_typebysl(String buysell_typebysl) {
			this.buysell_typebysl = buysell_typebysl;
		}
		public String getBuysell_typeex() {
			return buysell_typeex;
		}
		@XmlElement(name ="BUYSELL_TYPEEX")
		public void setBuysell_typeex(String buysell_typeex) {
			this.buysell_typeex = buysell_typeex;
		}
		public String getBuysell_title() {
			return buysell_title;
		}
		@XmlElement(name ="BUYSELL_TITLE")
		public void setBuysell_title(String buysell_title) {
			this.buysell_title = buysell_title;
		}
		public String getBuysell_atmtm12() {
			return buysell_atmtm12;
		}
		@XmlElement(name ="BUYSELL_ATMTM12")
		public void setBuysell_atmtm12(String buysell_atmtm12) {
			this.buysell_atmtm12 = buysell_atmtm12;
		}
		public String getBuysell_numtelr() {
			return buysell_numtelr;
		}
		@XmlElement(name ="BUYSELL_NUMTELR")
		public void setBuysell_numtelr(String buysell_numtelr) {
			this.buysell_numtelr = buysell_numtelr;
		}
		public String getBuysell_numother() {
			return buysell_numother;
		}
		@XmlElement(name ="BUYSELL_NUMOTHER")
		public void setBuysell_numother(String buysell_numother) {
			this.buysell_numother = buysell_numother;
		}
		public float getBuysell_amt100() {
			return buysell_amt100;
		}
		@XmlElement(name ="BUYSELL_AMTC100")
		public void setBuysell_amt100(float buysell_amt100) {
			this.buysell_amt100 = buysell_amt100;
		}
		public float getBuysell_amt050() {
			return buysell_amt050;
		}
		@XmlElement(name ="BUYSELL_AMTC050")
		public void setBuysell_amt050(float buysell_amt050) {
			this.buysell_amt050 = buysell_amt050;
		}
		public float getBuysell_amt020() {
			return buysell_amt020;
		}
		@XmlElement(name ="BUYSELL_AMTC020")
		public void setBuysell_amt020(float buysell_amt020) {
			this.buysell_amt020 = buysell_amt020;
		}
		public float getBuysell_amt010() {
			return buysell_amt010;
		}
		@XmlElement(name ="BUYSELL_AMTC010")
		public void setBuysell_amt010(float buysell_amt010) {
			this.buysell_amt010 = buysell_amt010;
		}
		public float getBuysell_amt005() {
			return buysell_amt005;
		}
		@XmlElement(name ="BUYSELL_AMTC005")
		public void setBuysell_amt005(float buysell_amt005) {
			this.buysell_amt005 = buysell_amt005;
		}
		public float getBuysell_amt002() {
			return buysell_amt002;
		}
		@XmlElement(name ="BUYSELL_AMTC002")
		public void setBuysell_amt002(float buysell_amt002) {
			this.buysell_amt002 = buysell_amt002;
		}
		public float getBuysell_amt001() {
			return buysell_amt001;
		}
		@XmlElement(name ="BUYSELL_AMTC001")
		public void setBuysell_amt001(float buysell_amt001) {
			this.buysell_amt001 = buysell_amt001;
		}
		public float getBuysell_amtc100() {
			return buysell_amtc100;
		}
		@XmlElement(name ="BUYSELL_AMTC100")
		public void setBuysell_amtc100(float buysell_amtc100) {
			this.buysell_amtc100 = buysell_amtc100;
		}
		public float getBuysell_amtc050() {
			return buysell_amtc050;
		}
		@XmlElement(name ="BUYSELL_AMTC050")
		public void setBuysell_amtc050(float buysell_amtc050) {
			this.buysell_amtc050 = buysell_amtc050;
		}
		public float getBuysell_amtc025() {
			return buysell_amtc025;
		}
		@XmlElement(name ="BUYSELL_AMTC025")
		public void setBuysell_amtc025(float buysell_amtc025) {
			this.buysell_amtc025 = buysell_amtc025;
		}
		public float getBuysell_amtc010() {
			return buysell_amtc010;
		}
		@XmlElement(name ="BUYSELL_AMTC010")
		public void setBuysell_amtc010(float buysell_amtc010) {
			this.buysell_amtc010 = buysell_amtc010;
		}
		public float getBuysell_amtc005() {
			return buysell_amtc005;
		}
		@XmlElement(name ="BUYSELL_AMTC005")
		public void setBuysell_amtc005(float buysell_amtc005) {
			this.buysell_amtc005 = buysell_amtc005;
		}
		public float getBuysell_amtc001() {
			return buysell_amtc001;
		}
		@XmlElement(name ="BUYSELL_AMTC001")
		public void setBuysell_amtc001(float buysell_amtc001) {
			this.buysell_amtc001 = buysell_amtc001;
		}
		public float getMonetar_amtcash() {
			return monetar_amtcash;
		}
		@XmlElement(name ="MONETAR_AMTCASH")
		public void setMonetar_amtcash(float monetar_amtcash) {
			this.monetar_amtcash = monetar_amtcash;
		}
		public float getMonetary_amtcsbk() {
			return monetary_amtcsbk;
		}
		@XmlElement(name ="MONETARY_AMTCSBK")
		public void setMonetary_amtcsbk(float monetary_amtcsbk) {
			this.monetary_amtcsbk = monetary_amtcsbk;
		}
		public float getMonetary_amttotal() {
			return monetary_amttotal;
		}
		@XmlElement(name ="MONETARY_AMTTOTAL")
		public void setMonetary_amttotal(float monetary_amttotal) {
			this.monetary_amttotal = monetary_amttotal;
		}
		public float getBuysell_amttotal() {
			return buysell_amttotal;
		}
		@XmlElement(name ="BUYSELL_AMTTOTAL")
		public void setBuysell_amttotal(float buysell_amttotal) {
			this.buysell_amttotal = buysell_amttotal;
		}
		public float getCashbox_balance() {
			return cashbox_balance;
		}
		@XmlElement(name ="CASHBOX_BALANCE")
		public void setCashbox_balance(float cashbox_balance) {
			this.cashbox_balance = cashbox_balance;
		}
		public String getBuysell_shipment() {
			return buysell_shipment;
		}
		@XmlElement(name ="BUYSELL_SHIPMENT")
		public void setBuysell_shipment(String buysell_shipment) {
			this.buysell_shipment = buysell_shipment;
		}
		public float getSesstran_trngroup() {
			return sesstran_trngroup;
		}
		@XmlElement(name ="SESSTRAN_TRNGROUP")
		public void setSesstran_trngroup(float sesstran_trngroup) {
			this.sesstran_trngroup = sesstran_trngroup;
		}
		public float getHsndmone_amtcash() {
			return hsndmone_amtcash;
		}
		@XmlElement(name ="HSNDMONE_AMTCASH")
		public void setHsndmone_amtcash(float hsndmone_amtcash) {
			this.hsndmone_amtcash = hsndmone_amtcash;
		}
		public float getHsndmone_amtcheck() {
			return hsndmone_amtcheck;
		}
		@XmlElement(name ="HSNDMONE_AMTCHECK")
		public void setHsndmone_amtcheck(float hsndmone_amtcheck) {
			this.hsndmone_amtcheck = hsndmone_amtcheck;
		}
		public float getHsndmone_amtcsbk() {
			return hsndmone_amtcsbk;
		}
		@XmlElement(name ="HSNDMONE_AMTCSBK")
		public void setHsndmone_amtcsbk(float hsndmone_amtcsbk) {
			this.hsndmone_amtcsbk = hsndmone_amtcsbk;
		}
		public float getCustseqnm() {
			return custseqnm;
		}
		@XmlElement(name ="CUSTSEQNM")
		public void setCustseqnm(float custseqnm) {
			this.custseqnm = custseqnm;
		}
		public String getAds_regionid() {
			return ads_regionid;
		}
}
