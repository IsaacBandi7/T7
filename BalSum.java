package com.cap1.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "BALSUM")
public class BalSum {
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
	 private float balance_amtdiff;
	 private float balance_amttotal;
	 private String balance_numacct6;
	 private float balance_amtend;
	 private float balance_amtcash;
	 private float balance_amtcsbk;
	 private float balance_amttrans;
	 private String balance_numact19;
	 private float balance_cashin15;
	 private float balance_cshout15;
	 private float balance_amtc100_1;
	 private float balance_amtc100_2;
	 private float balance_amtc050_1;
	 private float balance_amtc050_2;
	 private float balance_amtc025_1;
	 private float balance_amtc025_2;
	 private float balance_amtc010_1;
	 private float balance_amtc010_2;
	 private float balance_amtc005_1;
	 private float balance_amtc005_2;
	 private float balance_amtc001_1;
	 private float balance_amtc001_2;
	 private float balance_amtcoin_1;
	 private float balance_amtcoin_2;
	 private float balance_amt100_1;
	 private float balance_amt100_2;
	 private float balance_amt050_1;
	 private float balance_amt050_2;
	 private float balance_amt020_1;
	 private float balance_amt020_2;
	 private float balance_amt010_1;
	 private float balance_amt010_2;
	 private float balance_amt005_1;
	 private float balance_amt005_2;
	 private float balance_amt002_1;
	 private float balance_amt002_2;
	 private float balance_amt001_1;
	 private float balance_amt001_2;
	 private float balance_amtcurr_1;
	 private float balance_amtcurr_2;
	 private float balance_amtmutil_1;
	 private float balance_amtbait;
	 private float balance_amtother;
	 private String outage_reason;
	 private String outage_cd;
	 private String ir_transaction_no;
	 private String outage_comment;
	 private String helper_text;
	 
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
		public float getBalance_amtdiff() {
			return balance_amtdiff;
		}
		@XmlElement(name ="BALANCE_AMTDIFF")
		public void setBalance_amtdiff(float balance_amtdiff) {
			this.balance_amtdiff = balance_amtdiff;
		}
		public float getBalance_amttotal() {
			return balance_amttotal;
		}
		@XmlElement(name ="BALANCE_AMTTOTAL")
		public void setBalance_amttotal(float balance_amttotal) {
			this.balance_amttotal = balance_amttotal;
		}
		public String getBalance_numacct6() {
			return balance_numacct6;
		}
		@XmlElement(name ="BALANCE_NUMACCT6")
		public void setBalance_numacct6(String balance_numacct6) {
			this.balance_numacct6 = balance_numacct6;
		}
		public float getBalance_amtend() {
			return balance_amtend;
		}
		@XmlElement(name ="BALANCE_AMTEND")
		public void setBalance_amtend(float balance_amtend) {
			this.balance_amtend = balance_amtend;
		}
		public float getBalance_amtcash() {
			return balance_amtcash;
		}
		@XmlElement(name ="BALANCE_AMTCASH")
		public void setBalance_amtcash(float balance_amtcash) {
			this.balance_amtcash = balance_amtcash;
		}
		public float getBalance_amtcsbk() {
			return balance_amtcsbk;
		}
		@XmlElement(name ="BALANCE_AMTCSBK")
		public void setBalance_amtcsbk(float balance_amtcsbk) {
			this.balance_amtcsbk = balance_amtcsbk;
		}
		public float getBalance_amttrans() {
			return balance_amttrans;
		}
		@XmlElement(name ="BALANCE_AMTTRANS")
		public void setBalance_amttrans(float balance_amttrans) {
			this.balance_amttrans = balance_amttrans;
		}
		public String getBalance_numact19() {
			return balance_numact19;
		}
		@XmlElement(name ="BALANCE_NUMACT19")
		public void setBalance_numact19(String balance_numact19) {
			this.balance_numact19 = balance_numact19;
		}
		public float getBalance_cashin15() {
			return balance_cashin15;
		}
		@XmlElement(name ="BALANCE_CASHIN15")
		public void setBalance_cashin15(float balance_cashin15) {
			this.balance_cashin15 = balance_cashin15;
		}
		public float getBalance_cshout15() {
			return balance_cshout15;
		}
		@XmlElement(name ="BALANCE_CSHOUT15")
		public void setBalance_cshout15(float balance_cshout15) {
			this.balance_cshout15 = balance_cshout15;
		}
		public float getBalance_amtc100_1() {
			return balance_amtc100_1;
		}
		@XmlElement(name ="BALANCE_AMTC100_1")
		public void setBalance_amtc100_1(float balance_amtc100_1) {
			this.balance_amtc100_1 = balance_amtc100_1;
		}
		public float getBalance_amtc100_2() {
			return balance_amtc100_2;
		}
		@XmlElement(name ="BALANCE_AMTC100_2")
		public void setBalance_amtc100_2(float balance_amtc100_2) {
			this.balance_amtc100_2 = balance_amtc100_2;
		}
		public float getBalance_amtc050_1() {
			return balance_amtc050_1;
		}
		@XmlElement(name ="BALANCE_AMTC050_1")
		public void setBalance_amtc050_1(float balance_amtc050_1) {
			this.balance_amtc050_1 = balance_amtc050_1;
		}
		public float getBalance_amtc050_2() {
			return balance_amtc050_2;
		}
		@XmlElement(name ="BALANCE_AMTC050_2")
		public void setBalance_amtc050_2(float balance_amtc050_2) {
			this.balance_amtc050_2 = balance_amtc050_2;
		}
		public float getBalance_amtc025_1() {
			return balance_amtc025_1;
		}
		@XmlElement(name ="BALANCE_AMTC025_1")
		public void setBalance_amtc025_1(float balance_amtc025_1) {
			this.balance_amtc025_1 = balance_amtc025_1;
		}
		public float getBalance_amtc025_2() {
			return balance_amtc025_2;
		}
		@XmlElement(name ="BALANCE_AMTC025_2")
		public void setBalance_amtc025_2(float balance_amtc025_2) {
			this.balance_amtc025_2 = balance_amtc025_2;
		}
		public float getBalance_amtc010_1() {
			return balance_amtc010_1;
		}
		@XmlElement(name ="BALANCE_AMTC010_1")
		public void setBalance_amtc010_1(float balance_amtc010_1) {
			this.balance_amtc010_1 = balance_amtc010_1;
		}
		public float getBalance_amtc010_2() {
			return balance_amtc010_2;
		}
		@XmlElement(name ="BALANCE_AMTC010_2")
		public void setBalance_amtc010_2(float balance_amtc010_2) {
			this.balance_amtc010_2 = balance_amtc010_2;
		}
		public float getBalance_amtc005_1() {
			return balance_amtc005_1;
		}
		@XmlElement(name ="BALANCE_AMTC005_1")
		public void setBalance_amtc005_1(float balance_amtc005_1) {
			this.balance_amtc005_1 = balance_amtc005_1;
		}
		public float getBalance_amtc005_2() {
			return balance_amtc005_2;
		}
		@XmlElement(name ="BALANCE_AMTC005_2")
		public void setBalance_amtc005_2(float balance_amtc005_2) {
			this.balance_amtc005_2 = balance_amtc005_2;
		}
		public float getBalance_amtc001_1() {
			return balance_amtc001_1;
		}
		@XmlElement(name ="BALANCE_AMTC001_1")
		public void setBalance_amtc001_1(float balance_amtc001_1) {
			this.balance_amtc001_1 = balance_amtc001_1;
		}
		public float getBalance_amtc001_2() {
			return balance_amtc001_2;
		}
		@XmlElement(name ="BALANCE_AMTC001_2")
		public void setBalance_amtc001_2(float balance_amtc001_2) {
			this.balance_amtc001_2 = balance_amtc001_2;
		}
		public float getBalance_amtcoin_1() {
			return balance_amtcoin_1;
		}
		@XmlElement(name ="BALANCE_AMTCOIN_1")
		public void setBalance_amtcoin_1(float balance_amtcoin_1) {
			this.balance_amtcoin_1 = balance_amtcoin_1;
		}
		public float getBalance_amtcoin_2() {
			return balance_amtcoin_2;
		}
		@XmlElement(name ="BALANCE_AMTCOIN_2")
		public void setBalance_amtcoin_2(float balance_amtcoin_2) {
			this.balance_amtcoin_2 = balance_amtcoin_2;
		}
		public float getBalance_amt100_1() {
			return balance_amt100_1;
		}
		@XmlElement(name ="BALANCE_AMT100_1")
		public void setBalance_amt100_1(float balance_amt100_1) {
			this.balance_amt100_1 = balance_amt100_1;
		}
		public float getBalance_amt100_2() {
			return balance_amt100_2;
		}
		@XmlElement(name ="BALANCE_AMT100_2")
		public void setBalance_amt100_2(float balance_amt100_2) {
			this.balance_amt100_2 = balance_amt100_2;
		}
		public float getBalance_amt050_1() {
			return balance_amt050_1;
		}
		@XmlElement(name ="BALANCE_AMT050_1")
		public void setBalance_amt050_1(float balance_amt050_1) {
			this.balance_amt050_1 = balance_amt050_1;
		}
		public float getBalance_amt050_2() {
			return balance_amt050_2;
		}
		@XmlElement(name ="BALANCE_AMT050_2")
		public void setBalance_amt050_2(float balance_amt050_2) {
			this.balance_amt050_2 = balance_amt050_2;
		}
		public float getBalance_amt020_1() {
			return balance_amt020_1;
		}
		@XmlElement(name ="BALANCE_AMT020_1")
		public void setBalance_amt020_1(float balance_amt020_1) {
			this.balance_amt020_1 = balance_amt020_1;
		}
		public float getBalance_amt020_2() {
			return balance_amt020_2;
		}
		@XmlElement(name ="BALANCE_AMT020_2")
		public void setBalance_amt020_2(float balance_amt020_2) {
			this.balance_amt020_2 = balance_amt020_2;
		}
		public float getBalance_amt010_1() {
			return balance_amt010_1;
		}
		@XmlElement(name ="BALANCE_AMT010_1")
		public void setBalance_amt010_1(float balance_amt010_1) {
			this.balance_amt010_1 = balance_amt010_1;
		}
		public float getBalance_amt010_2() {
			return balance_amt010_2;
		}
		@XmlElement(name ="BALANCE_AMT010_2")
		public void setBalance_amt010_2(float balance_amt010_2) {
			this.balance_amt010_2 = balance_amt010_2;
		}
		public float getBalance_amt005_1() {
			return balance_amt005_1;
		}
		@XmlElement(name ="BALANCE_AMT005_1")
		public void setBalance_amt005_1(float balance_amt005_1) {
			this.balance_amt005_1 = balance_amt005_1;
		}
		public float getBalance_amt005_2() {
			return balance_amt005_2;
		}
		@XmlElement(name ="BALANCE_AMT005_2")
		public void setBalance_amt005_2(float balance_amt005_2) {
			this.balance_amt005_2 = balance_amt005_2;
		}
		public float getBalance_amt002_1() {
			return balance_amt002_1;
		}
		@XmlElement(name ="BALANCE_AMT002_1")
		public void setBalance_amt002_1(float balance_amt002_1) {
			this.balance_amt002_1 = balance_amt002_1;
		}
		public float getBalance_amt002_2() {
			return balance_amt002_2;
		}
		@XmlElement(name ="BALANCE_AMT002_2")
		public void setBalance_amt002_2(float balance_amt002_2) {
			this.balance_amt002_2 = balance_amt002_2;
		}
		public float getBalance_amt001_1() {
			return balance_amt001_1;
		}
		@XmlElement(name ="BALANCE_AMT001_1")
		public void setBalance_amt001_1(float balance_amt001_1) {
			this.balance_amt001_1 = balance_amt001_1;
		}
		public float getBalance_amt001_2() {
			return balance_amt001_2;
		}
		@XmlElement(name ="BALANCE_AMT001_2")
		public void setBalance_amt001_2(float balance_amt001_2) {
			this.balance_amt001_2 = balance_amt001_2;
		}
		public float getBalance_amtcurr_1() {
			return balance_amtcurr_1;
		}
		@XmlElement(name ="BALANCE_AMTCURR_1")
		public void setBalance_amtcurr_1(float balance_amtcurr_1) {
			this.balance_amtcurr_1 = balance_amtcurr_1;
		}
		public float getBalance_amtcurr_2() {
			return balance_amtcurr_2;
		}
		@XmlElement(name ="BALANCE_AMTCURR_2")
		public void setBalance_amtcurr_2(float balance_amtcurr_2) {
			this.balance_amtcurr_2 = balance_amtcurr_2;
		}
		public float getBalance_amtmutil_1() {
			return balance_amtmutil_1;
		}
		@XmlElement(name ="BALANCE_AMTMUTIL_1")
		public void setBalance_amtmutil_1(float balance_amtmutil_1) {
			this.balance_amtmutil_1 = balance_amtmutil_1;
		}
		public float getBalance_amtbait() {
			return balance_amtbait;
		}
		@XmlElement(name ="BALANCE_AMTBAIT")
		public void setBalance_amtbait(float balance_amtbait) {
			this.balance_amtbait = balance_amtbait;
		}
		public float getBalance_amtother() {
			return balance_amtother;
		}
		@XmlElement(name ="BALANCE_AMTOTHER")
		public void setBalance_amtother(float balance_amtother) {
			this.balance_amtother = balance_amtother;
		}
		public String getOutage_reason() {
			return outage_reason;
		}
		@XmlElement(name ="OUTAGE_CD")
		public void setOutage_reason(String outage_reason) {
			this.outage_reason = outage_reason;
		}
		public String getOutage_cd() {
			return outage_cd;
		}
		@XmlElement(name ="OUTAGE_REASON")
		public void setOutage_cd(String outage_cd) {
			this.outage_cd = outage_cd;
		}
		public String getIr_transaction_no() {
			return ir_transaction_no;
		}
		@XmlElement(name ="IR_TRANSACTION_NO")
		public void setIr_transaction_no(String ir_transaction_no) {
			this.ir_transaction_no = ir_transaction_no;
		}
		
		public String getOutage_comment() {
			return outage_comment;
		}
		@XmlElement(name ="OUTAGE_COMMENT")
		public void setOutage_comment(String outage_comment) {
			this.outage_comment = outage_comment;
		}
		public String getHelper_text() {
			return helper_text;
		}
		@XmlElement(name ="HELPER_TEXT")
		public void setHelper_text(String helper_text) {
			this.helper_text = helper_text;
		}


}
