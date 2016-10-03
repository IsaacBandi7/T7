/*package com.cap1.model;

import javax.xml.bind.annotation.XmlElement;

public class ImageDet {

	 private float seq_num;
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
	 private float ejchkdet_amttotal;
	 private float ejchkdet_numtotal;
	 private float monetary_sessfund;
	 private float monetary_amtcsbk;
	 private float monetary_amtcash;
	 private float monetary_amtcheck;
	 private float sesstran_trngroup;
	 private String account_abanumbr;
	 private String ejchkdet_abanumbr_1;
	 private String ejchkdet_abanumbr_2;
	 private String ejchkdet_abanumbr_3;
	 private String ejchkdet_abanumbr_4;
	 private String ejchkdet_abanumbr_5;
	 private String ejchkdet_abanumbr_6;
	 private String ejchkdet_abanumbr_7;
	 private String ejchkdet_abanumbr_8;
	 private String ejchkdet_abanumbr_9;
	 private String ejchkdet_abanumbr_10;
	 private String ejchkdet_abanumbr_11;
	 private String ejchkdet_abanumbr_12;
	 private String ejchkdet_abanumbr_13;
	 private String ejchkdet_abanumbr_14;
	 private String ejchkdet_abanumbr_15;
	 private String ejchkdet_abanumbr_16;
	 private String ejchkdet_abanumbr_17;
	 private String ejchkdet_abanumbr_18;
	 private String ejchkdet_abanumbr_19;
	 private String ejchkdet_abanumbr_20;
	 private String ejchkdet_abanumbr_21;
	 private String ejchkdet_abanumbr_22;
	 private String ejchkdet_abanumbr_23;
	 private String ejchkdet_abanumbr_24;
	 private String ejchkdet_abanumbr_25;
	 private String ejchkdet_numact19_1;
	 private String ejchkdet_numact19_2;
	 private String ejchkdet_numact19_3;
	 private String ejchkdet_numact19_4;
	 private String ejchkdet_numact19_5;
	 private String ejchkdet_numact19_6;
	 private String ejchkdet_numact19_7;
	 private String ejchkdet_numact19_8;
	 private String ejchkdet_numact19_9;
	 private String ejchkdet_numact19_10;
	 private String ejchkdet_numact19_11;
	 private String ejchkdet_numact19_12;
	 private String ejchkdet_numact19_13;
	 private String ejchkdet_numact19_14;
	 private String ejchkdet_numact19_15;
	 private String ejchkdet_numact19_16;
	 private String ejchkdet_numact19_17;
	 private String ejchkdet_numact19_18;
	 private String ejchkdet_numact19_19;
	 private String ejchkdet_numact19_20;
	 private String ejchkdet_numact19_21;
	 private String ejchkdet_numact19_22;
	 private String ejchkdet_numact19_23;
	 private String ejchkdet_numact19_24;
	 private String ejchkdet_numact19_25;
	 private float ejchkdet_amtcheck_1;
	 private float ejchkdet_amtcheck_2;
	 private float ejchkdet_amtcheck_3;
	 private float ejchkdet_amtcheck_4;
	 private float ejchkdet_amtcheck_5;
	 private float ejchkdet_amtcheck_6;
	 private float ejchkdet_amtcheck_7;
	 private float ejchkdet_amtcheck_8;
	 private float ejchkdet_amtcheck_9;
	 private float ejchkdet_amtcheck_10;
	 private float ejchkdet_amtcheck_11;
	 private float ejchkdet_amtcheck_12;
	 private float ejchkdet_amtcheck_13;
	 private float ejchkdet_amtcheck_14;
	 private float ejchkdet_amtcheck_15;
	 private float ejchkdet_amtcheck_16;
	 private float ejchkdet_amtcheck_17;
	 private float ejchkdet_amtcheck_18;
	 private float ejchkdet_amtcheck_19;
	 private float ejchkdet_amtcheck_20;
	 private float ejchkdet_amtcheck_21;
	 private float ejchkdet_amtcheck_22;
	 private float ejchkdet_amtcheck_23;
	 private float ejchkdet_amtcheck_24;
	 private float ejchkdet_amtcheck_25;
	 private String ejchkdet_numcheck_1;
	 private String ejchkdet_numcheck_2;
	 private String ejchkdet_numcheck_3;
	 private String ejchkdet_numcheck_4;
	 private String ejchkdet_numcheck_5;
	 private String ejchkdet_numcheck_6;
	 private String ejchkdet_numcheck_7;
	 private String ejchkdet_numcheck_8;
	 private String ejchkdet_numcheck_9;
	 private String ejchkdet_numcheck_10;
	 private String ejchkdet_numcheck_11;
	 private String ejchkdet_numcheck_12;
	 private String ejchkdet_numcheck_13;
	 private String ejchkdet_numcheck_14;
	 private String ejchkdet_numcheck_15;
	 private String ejchkdet_numcheck_16;
	 private String ejchkdet_numcheck_17;
	 private String ejchkdet_numcheck_18;
	 private String ejchkdet_numcheck_19;
	 private String ejchkdet_numcheck_20;
	 private String ejchkdet_numcheck_21;
	 private String ejchkdet_numcheck_22;
	 private String ejchkdet_numcheck_23;
	 private String ejchkdet_numcheck_24;
	 private String ejchkdet_numcheck_25;
	 private String ejchkdet_documtid_1;
	 private String ejchkdet_documtid_2;
	 private String ejchkdet_documtid_3;
	 private String ejchkdet_documtid_4;
	 private String ejchkdet_documtid_5;
	 private String ejchkdet_documtid_6;
	 private String ejchkdet_documtid_7;
	 private String ejchkdet_documtid_8;
	 private String ejchkdet_documtid_9;
	 private String ejchkdet_documtid_10;
	 private String ejchkdet_documtid_11;
	 private String ejchkdet_documtid_12;
	 private String ejchkdet_documtid_13;
	 private String ejchkdet_documtid_14;
	 private String ejchkdet_documtid_15;
	 private String ejchkdet_documtid_16;
	 private String ejchkdet_documtid_17;
	 private String ejchkdet_documtid_18;
	 private String ejchkdet_documtid_19;
	 private String ejchkdet_documtid_20;
	 private String ejchkdet_documtid_21;
	 private String ejchkdet_documtid_22;
	 private String ejchkdet_documtid_23;
	 private String ejchkdet_documtid_24;
	 private String ejchkdet_documtid_25;
	 private float ejchkdet_numconfi_1;
	 private float ejchkdet_numconfi_2;
	 private float ejchkdet_numconfi_3;
	 private float ejchkdet_numconfi_4;
	 private float ejchkdet_numconfi_5;
	 private float ejchkdet_numconfi_6;
	 private float ejchkdet_numconfi_7;
	 private float ejchkdet_numconfi_8;
	 private float ejchkdet_numconfi_9;
	 private float ejchkdet_numconfi_10;
	 private float ejchkdet_numconfi_11;
	 private float ejchkdet_numconfi_12;
	 private float ejchkdet_numconfi_13;
	 private float ejchkdet_numconfi_14;
	 private float ejchkdet_numconfi_15;
	 private float ejchkdet_numconfi_16;
	 private float ejchkdet_numconfi_17;
	 private float ejchkdet_numconfi_18;
	 private float ejchkdet_numconfi_19;
	 private float ejchkdet_numconfi_20;
	 private float ejchkdet_numconfi_21;
	 private float ejchkdet_numconfi_22;
	 private float ejchkdet_numconfi_23;
	 private float ejchkdet_numconfi_24;
	 private float ejchkdet_numconfi_25;
	 private float ejchkdet_amtred_1;
	 private float ejchkdet_amtred_2;
	 private float ejchkdet_amtred_3;
	 private float ejchkdet_amtred_4;
	 private float ejchkdet_amtred_5;
	 private float ejchkdet_amtred_6;
	 private float ejchkdet_amtred_7;
	 private float ejchkdet_amtred_8;
	 private float ejchkdet_amtred_9;
	 private float ejchkdet_amtred_10;
	 private float ejchkdet_amtred_11;
	 private float ejchkdet_amtred_12;
	 private float ejchkdet_amtred_13;
	 private float ejchkdet_amtred_14;
	 private float ejchkdet_amtred_15;
	 private float ejchkdet_amtred_16;
	 private float ejchkdet_amtred_17;
	 private float ejchkdet_amtred_18;
	 private float ejchkdet_amtred_19;
	 private float ejchkdet_amtred_20;
	 private float ejchkdet_amtred_21;
	 private float ejchkdet_amtred_22;
	 private float ejchkdet_amtred_23;
	 private float ejchkdet_amtred_24;
	 private float ejchkdet_amtred_25;
	 private String ejchkdet_iqapass_1;
	 private String ejchkdet_iqapass_2;
	 private String ejchkdet_iqapass_3;
	 private String ejchkdet_iqapass_4;
	 private String ejchkdet_iqapass_5;
	 private String ejchkdet_iqapass_6;
	 private String ejchkdet_iqapass_7;
	 private String ejchkdet_iqapass_8;
	 private String ejchkdet_iqapass_9;
	 private String ejchkdet_iqapass_10;
	 private String ejchkdet_iqapass_11;
	 private String ejchkdet_iqapass_12;
	 private String ejchkdet_iqapass_13;
	 private String ejchkdet_iqapass_14;
	 private String ejchkdet_iqapass_15;
	 private String ejchkdet_iqapass_16;
	 private String ejchkdet_iqapass_17;
	 private String ejchkdet_iqapass_18;
	 private String ejchkdet_iqapass_19;
	 private String ejchkdet_iqapass_20;
	 private String ejchkdet_iqapass_21;
	 private String ejchkdet_iqapass_22;
	 private String ejchkdet_iqapass_23;
	 private String ejchkdet_iqapass_24;
	 private String ejchkdet_iqapass_25;
	 private String ejchkdet_scnerror_1;
	 private String ejchkdet_scnerror_2;
	 private String ejchkdet_scnerror_3;
	 private String ejchkdet_scnerror_4;
	 private String ejchkdet_scnerror_5;
	 private String ejchkdet_scnerror_6;
	 private String ejchkdet_scnerror_7;
	 private String ejchkdet_scnerror_8;
	 private String ejchkdet_scnerror_9;
	 private String ejchkdet_scnerror_10;
	 private String ejchkdet_scnerror_11;
	 private String ejchkdet_scnerror_12;
	 private String ejchkdet_scnerror_13;
	 private String ejchkdet_scnerror_14;
	 private String ejchkdet_scnerror_15;
	 private String ejchkdet_scnerror_16;
	 private String ejchkdet_scnerror_17;
	 private String ejchkdet_scnerror_18;
	 private String ejchkdet_scnerror_19;
	 private String ejchkdet_scnerror_20;
	 private String ejchkdet_scnerror_21;
	 private String ejchkdet_scnerror_22;
	 private String ejchkdet_scnerror_23;
	 private String ejchkdet_scnerror_24;
	 private String ejchkdet_scnerror_25;
	 private String ejchkdet_actionuc_1;
	 private String ejchkdet_actionuc_2;
	 private String ejchkdet_actionuc_3;
	 private String ejchkdet_actionuc_4;
	 private String ejchkdet_actionuc_5;
	 private String ejchkdet_actionuc_6;
	 private String ejchkdet_actionuc_7;
	 private String ejchkdet_actionuc_8;
	 private String ejchkdet_actionuc_9;
	 private String ejchkdet_actionuc_10;
	 private String ejchkdet_actionuc_11;
	 private String ejchkdet_actionuc_12;
	 private String ejchkdet_actionuc_13;
	 private String ejchkdet_actionuc_14;
	 private String ejchkdet_actionuc_15;
	 private String ejchkdet_actionuc_16;
	 private String ejchkdet_actionuc_17;
	 private String ejchkdet_actionuc_18;
	 private String ejchkdet_actionuc_19;
	 private String ejchkdet_actionuc_20;
	 private String ejchkdet_actionuc_21;
	 private String ejchkdet_actionuc_22;
	 private String ejchkdet_actionuc_23;
	 private String ejchkdet_actionuc_24;
	 private String ejchkdet_actionuc_25;
	 private float ejchkdet__curcnt_1;
	 private float ejchkdet__curcnt_2;
	 private float ejchkdet__curcnt_3;
	 private float ejchkdet__curcnt_4;
	 private float ejchkdet__curcnt_5;
	 private float ejchkdet__curcnt_6;
	 private float ejchkdet__curcnt_7;
	 private float ejchkdet__curcnt_8;
	 private float ejchkdet__curcnt_9;
	 private float ejchkdet__curcnt_10;
	 private float ejchkdet__curcnt_11;
	 private float ejchkdet__curcnt_12;
	 private float ejchkdet__curcnt_13;
	 private float ejchkdet__curcnt_14;
	 private float ejchkdet__curcnt_15;
	 private float ejchkdet__curcnt_16;
	 private float ejchkdet__curcnt_17;
	 private float ejchkdet__curcnt_18;
	 private float ejchkdet__curcnt_19;
	 private float ejchkdet__curcnt_20;
	 private float ejchkdet__curcnt_21;
	 private float ejchkdet__curcnt_22;
	 private float ejchkdet__curcnt_23;
	 private float ejchkdet__curcnt_24;
	 private float ejchkdet__curcnt_25;
	 private float ejchkdet__curcntb_1;
	 private float ejchkdet__curcntb_2;
	 private float ejchkdet__curcntb_3;
	 private float ejchkdet__curcntb_4;
	 private float ejchkdet__curcntb_5;
	 private float ejchkdet__curcntb_6;
	 private float ejchkdet__curcntb_7;
	 private float ejchkdet__curcntb_8;
	 private float ejchkdet__curcntb_9;
	 private float ejchkdet__curcntb_10;
	 private float ejchkdet__curcntb_11;
	 private float ejchkdet__curcntb_12;
	 private float ejchkdet__curcntb_13;
	 private float ejchkdet__curcntb_14;
	 private float ejchkdet__curcntb_15;
	 private float ejchkdet__curcntb_16;
	 private float ejchkdet__curcntb_17;
	 private float ejchkdet__curcntb_18;
	 private float ejchkdet__curcntb_19;
	 private float ejchkdet__curcntb_20;
	 private float ejchkdet__curcntb_21;
	 private float ejchkdet__curcntb_22;
	 private float ejchkdet__curcntb_23;
	 private float ejchkdet__curcntb_24;
	 private float ejchkdet__curcntb_25;
	 private float ejchkdet_docnumb_1;
	 private float ejchkdet_docnumb_2;
	 private float ejchkdet_docnumb_3;
	 private float ejchkdet_docnumb_4;
	 private float ejchkdet_docnumb_5;
	 private float ejchkdet_docnumb_6;
	 private float ejchkdet_docnumb_7;
	 private float ejchkdet_docnumb_8;
	 private float ejchkdet_docnumb_9;
	 private float ejchkdet_docnumb_10;
	 private float ejchkdet_docnumb_11;
	 private float ejchkdet_docnumb_12;
	 private float ejchkdet_docnumb_13;
	 private float ejchkdet_docnumb_14;
	 private float ejchkdet_docnumb_15;
	 private float ejchkdet_docnumb_16;
	 private float ejchkdet_docnumb_17;
	 private float ejchkdet_docnumb_18;
	 private float ejchkdet_docnumb_19;
	 private float ejchkdet_docnumb_20;
	 private float ejchkdet_docnumb_21;
	 private float ejchkdet_docnumb_22;
	 private float ejchkdet_docnumb_23;
	 private float ejchkdet_docnumb_24;
	 private float ejchkdet_docnumb_25;
	 private String ejchkdet_crdr_1;
	 private String ejchkdet_crdr_2;
	 private String ejchkdet_crdr_3;
	 private String ejchkdet_crdr_4;
	 private String ejchkdet_crdr_5;
	 private String ejchkdet_crdr_6;
	 private String ejchkdet_crdr_7;
	 private String ejchkdet_crdr_8;
	 private String ejchkdet_crdr_9;
	 private String ejchkdet_crdr_10;
	 private String ejchkdet_crdr_11;
	 private String ejchkdet_crdr_12;
	 private String ejchkdet_crdr_13;
	 private String ejchkdet_crdr_14;
	 private String ejchkdet_crdr_15;
	 private String ejchkdet_crdr_16;
	 private String ejchkdet_crdr_17;
	 private String ejchkdet_crdr_18;
	 private String ejchkdet_crdr_19;
	 private String ejchkdet_crdr_20;
	 private String ejchkdet_crdr_21;
	 private String ejchkdet_crdr_22;
	 private String ejchkdet_crdr_23;
	 private String ejchkdet_crdr_24;
	 private String ejchkdet_crdr_25;
	 private float ejchkdet_num002_1;
	 private float ejchkdet_num002_2;
	 private String ejchkdet_tc_1;
	 private String ejchkdet_tc_2;
	 private String ejchkdet_tc_3;
	 private String ejchkdet_tc_4;
	 private String ejchkdet_tc_5;
	 private String ejchkdet_tc_6;
	 private String ejchkdet_tc_7;
	 private String ejchkdet_tc_8;
	 private String ejchkdet_tc_9;
	 private String ejchkdet_tc_10;
	 private String ejchkdet_tc_11;
	 private String ejchkdet_tc_12;
	 private String ejchkdet_tc_13;
	 private String ejchkdet_tc_14;
	 private String ejchkdet_tc_15;
	 private String ejchkdet_tc_16;
	 private String ejchkdet_tc_17;
	 private String ejchkdet_tc_18;
	 private String ejchkdet_tc_19;
	 private String ejchkdet_tc_20;
	 private String ejchkdet_tc_21;
	 private String ejchkdet_tc_22;
	 private String ejchkdet_tc_23;
	 private String ejchkdet_tc_24;
	 private String ejchkdet_tc_25;
	 private String ejchkdet_char004_1;
	 private String ejchkdet_char004_2;
	 private String ejchkdet_char004_3;
	 private String ejchkdet_char004_4;
	 private String ejchkdet_char004_5;
	 private String ejchkdet_char004_6;
	 private String ejchkdet_char004_7;
	 private String ejchkdet_char004_8;
	 private String ejchkdet_char004_9;
	 private String ejchkdet_char004_10;
	 private String ejchkdet_char004_11;
	 private String ejchkdet_char004_12;
	 private String ejchkdet_char004_13;
	 private String ejchkdet_char004_14;
	 private String ejchkdet_char004_15;
	 private String ejchkdet_char004_16;
	 private String ejchkdet_char004_17;
	 private String ejchkdet_char004_18;
	 private String ejchkdet_char004_19;
	 private String ejchkdet_char004_20;
	 private String ejchkdet_char004_21;
	 private String ejchkdet_char004_22;
	 private String ejchkdet_char004_23;
	 private String ejchkdet_char004_24;
	 private String ejchkdet_char004_25;
	 private String ejchkdet_char016_1;
	 private String ejchkdet_char016_2;
	 private String ejchkdet_char016_3;
	 private String ejchkdet_char016_4;
	 private String ejchkdet_char016_5;
	 private String ejchkdet_char016_6;
	 private String ejchkdet_char016_7;
	 private String ejchkdet_char016_8;
	 private String ejchkdet_char016_9;
	 private String ejchkdet_char016_10;
	 private String ejchkdet_char016_11;
	 private String ejchkdet_char016_12;
	 private String ejchkdet_char016_13;
	 private String ejchkdet_char016_14;
	 private String ejchkdet_char016_15;
	 private String ejchkdet_char016_16;
	 private String ejchkdet_char016_17;
	 private String ejchkdet_char016_18;
	 private String ejchkdet_char016_19;
	 private String ejchkdet_char016_20;
	 private String ejchkdet_char016_21;
	 private String ejchkdet_char016_22;
	 private String ejchkdet_char016_23;
	 private String ejchkdet_char016_24;
	 private String ejchkdet_char016_25;
	 private String ejchkdet_serial_1;
	 private String ejchkdet_serial_2;
	 private String ejchkdet_serial_3;
	 private String ejchkdet_serial_4;
	 private String ejchkdet_serial_5;
	 private String ejchkdet_serial_6;
	 private String ejchkdet_serial_7;
	 private String ejchkdet_serial_8;
	 private String ejchkdet_serial_9;
	 private String ejchkdet_serial_10;
	 private String ejchkdet_serial_11;
	 private String ejchkdet_serial_12;
	 private String ejchkdet_serial_13;
	 private String ejchkdet_serial_14;
	 private String ejchkdet_serial_15;
	 private String ejchkdet_serial_16;
	 private String ejchkdet_serial_17;
	 private String ejchkdet_serial_18;
	 private String ejchkdet_serial_19;
	 private String ejchkdet_serial_20;
	 private String ejchkdet_serial_21;
	 private String ejchkdet_serial_22;
	 private String ejchkdet_serial_23;
	 private String ejchkdet_serial_24;
	 private String ejchkdet_serial_25;
	 private float ejchkdet__itemtyp_1;
	 private float ejchkdet__itemtyp_2;
	 private float ejchkdet__itemtyp_3;
	 private float ejchkdet__itemtyp_4;
	 private float ejchkdet__itemtyp_5;
	 private float ejchkdet__itemtyp_6;
	 private float ejchkdet__itemtyp_7;
	 private float ejchkdet__itemtyp_8;
	 private float ejchkdet__itemtyp_9;
	 private float ejchkdet__itemtyp_10;
	 private float ejchkdet__itemtyp_11;
	 private float ejchkdet__itemtyp_12;
	 private float ejchkdet__itemtyp_13;
	 private float ejchkdet__itemtyp_14;
	 private float ejchkdet__itemtyp_15;
	 private float ejchkdet__itemtyp_16;
	 private float ejchkdet__itemtyp_17;
	 private float ejchkdet__itemtyp_18;
	 private float ejchkdet__itemtyp_19;
	 private float ejchkdet__itemtyp_20;
	 private float ejchkdet__itemtyp_21;
	 private float ejchkdet__itemtyp_22;
	 private float ejchkdet__itemtyp_23;
	 private float ejchkdet__itemtyp_24;
	 private float ejchkdet__itemtyp_25;
	 private String ejchkdet_dvtype;
	 private String ejchkdet_operid;
	 private String ejchkdet_flag;
	 private float ejchkdet__uid_1;
	 private float ejchkdet__uid_2;
	 private float ejchkdet__uid_3;
	 private float ejchkdet__uid_4;
	 private float ejchkdet__uid_5;
	 private float ejchkdet__uid_6;
	 private float ejchkdet__uid_7;
	 private float ejchkdet__uid_8;
	 private float ejchkdet__uid_9;
	 private float ejchkdet__uid_10;
	 private float ejchkdet__uid_11;
	 private float ejchkdet__uid_12;
	 private float ejchkdet__uid_13;
	 private float ejchkdet__uid_14;
	 private float ejchkdet__uid_15;
	 private float ejchkdet__uid_16;
	 private float ejchkdet__uid_17;
	 private float ejchkdet__uid_18;
	 private float ejchkdet__uid_19;
	 private float ejchkdet__uid_20;
	 private float ejchkdet__uid_21;
	 private float ejchkdet__uid_22;
	 private float ejchkdet__uid_23;
	 private float ejchkdet__uid_24;
	 private float ejchkdet__uid_25;
	 private String ejchkdet__name;
	 private String ejchkdet_sourcecd_1;
	 private String ejchkdet_sourcecd_2;
	 private String ejchkdet_sourcecd_3;
	 private String ejchkdet_sourcecd_4;
	 private String ejchkdet_sourcecd_5;
	 private String ejchkdet_sourcecd_6;
	 private String ejchkdet_sourcecd_7;
	 private String ejchkdet_sourcecd_8;
	 private String ejchkdet_sourcecd_9;
	 private String ejchkdet_sourcecd_10;
	 private String ejchkdet_sourcecd_11;
	 private String ejchkdet_sourcecd_12;
	 private String ejchkdet_sourcecd_13;
	 private String ejchkdet_sourcecd_14;
	 private String ejchkdet_sourcecd_15;
	 private String ejchkdet_sourcecd_16;
	 private String ejchkdet_sourcecd_17;
	 private String ejchkdet_sourcecd_18;
	 private String ejchkdet_sourcecd_19;
	 private String ejchkdet_sourcecd_20;
	 private String ejchkdet_sourcecd_21;
	 private String ejchkdet_sourcecd_22;
	 private String ejchkdet_sourcecd_23;
	 private String ejchkdet_sourcecd_24;
	 private String ejchkdet_sourcecd_25;
	 private String ejchkdet_procdate_1;
	 private String ejchkdet_procdate_2;
	 private String ejchkdet_procdate_3;
	 private String ejchkdet_procdate_4;
	 private String ejchkdet_procdate_5;
	 private String ejchkdet_procdate_6;
	 private String ejchkdet_procdate_7;
	 private String ejchkdet_procdate_8;
	 private String ejchkdet_procdate_9;
	 private String ejchkdet_procdate_10;
	 private String ejchkdet_procdate_11;
	 private String ejchkdet_procdate_12;
	 private String ejchkdet_procdate_13;
	 private String ejchkdet_procdate_14;
	 private String ejchkdet_procdate_15;
	 private String ejchkdet_procdate_16;
	 private String ejchkdet_procdate_17;
	 private String ejchkdet_procdate_18;
	 private String ejchkdet_procdate_19;
	 private String ejchkdet_procdate_20;
	 private String ejchkdet_procdate_21;
	 private String ejchkdet_procdate_22;
	 private String ejchkdet_procdate_23;
	 private String ejchkdet_procdate_24;
	 private String ejchkdet_procdate_25;
	 private String ejchkdet_caldate_1;
	 private String ejchkdet_caldate_2;
	 private String ejchkdet_caldate_3;
	 private String ejchkdet_caldate_4;
	 private String ejchkdet_caldate_5;
	 private String ejchkdet_caldate_6;
	 private String ejchkdet_caldate_7;
	 private String ejchkdet_caldate_8;
	 private String ejchkdet_caldate_9;
	 private String ejchkdet_caldate_10;
	 private String ejchkdet_caldate_11;
	 private String ejchkdet_caldate_12;
	 private String ejchkdet_caldate_13;
	 private String ejchkdet_caldate_14;
	 private String ejchkdet_caldate_15;
	 private String ejchkdet_caldate_16;
	 private String ejchkdet_caldate_17;
	 private String ejchkdet_caldate_18;
	 private String ejchkdet_caldate_19;
	 private String ejchkdet_caldate_20;
	 private String ejchkdet_caldate_21;
	 private String ejchkdet_caldate_22;
	 private String ejchkdet_caldate_23;
	 private String ejchkdet_caldate_24;
	 private String ejchkdet_caldate_25;
	 private String ejchkdet_time_1;
	 private String ejchkdet_time_2;
	 private String ejchkdet_time_3;
	 private String ejchkdet_time_4;
	 private String ejchkdet_time_5;
	 private String ejchkdet_time_6;
	 private String ejchkdet_time_7;
	 private String ejchkdet_time_8;
	 private String ejchkdet_time_9;
	 private String ejchkdet_time_10;
	 private String ejchkdet_time_11;
	 private String ejchkdet_time_12;
	 private String ejchkdet_time_13;
	 private String ejchkdet_time_14;
	 private String ejchkdet_time_15;
	 private String ejchkdet_time_16;
	 private String ejchkdet_time_17;
	 private String ejchkdet_time_18;
	 private String ejchkdet_time_19;
	 private String ejchkdet_time_20;
	 private String ejchkdet_time_21;
	 private String ejchkdet_time_22;
	 private String ejchkdet_time_23;
	 private String ejchkdet_time_24;
	 private String ejchkdet_time_25;
	 private String ejchkdet_operid2;
	 private String ejchkdet_rawmicr_1;
	 private String ejchkdet_rawmicr_2;
	 private String ejchkdet_rawmicr_3;
	 private String ejchkdet_rawmicr_4;
	 private String ejchkdet_rawmicr_5;
	 private String ejchkdet_rawmicr_6;
	 private String ejchkdet_rawmicr_7;
	 private String ejchkdet_rawmicr_8;
	 private String ejchkdet_rawmicr_9;
	 private String ejchkdet_rawmicr_10;
	 private String ejchkdet_rawmicr_11;
	 private String ejchkdet_rawmicr_12;
	 private String ejchkdet_rawmicr_13;
	 private String ejchkdet_rawmicr_14;
	 private String ejchkdet_rawmicr_15;
	 private String ejchkdet_rawmicr_16;
	 private String ejchkdet_rawmicr_17;
	 private String ejchkdet_rawmicr_18;
	 private String ejchkdet_rawmicr_19;
	 private String ejchkdet_rawmicr_20;
	 private String ejchkdet_rawmicr_21;
	 private String ejchkdet_rawmicr_22;
	 private String ejchkdet_rawmicr_23;
	 private String ejchkdet_rawmicr_24;
	 private String ejchkdet_rawmicr_25;
	 private float ejchkdet_amtexp;
	 private float ejchkdet_amtscan;
	 private String ejchkdet_reprocss;
	 private String dvoroper__bcpdate;
	 private String dvoroper_char008;
	 private float batch_amttotal_1;
	 private float batch_amttotal_2;
	 private float batch_amttotal_3;
	 private float batch_amttotal_4;
	 private float batch_amttotal_5;
	 private float batch_amttotal_6;
	 private float batch_amttotal_7;
	 private float batch_amttotal_8;
	 private float batch_amttotal_9;
	 private float batch_amttotal_10;
	 private float batch_amttotal_11;
	 private float batch_amttotal_12;
	 private float batch_amttotal_13;
	 private float batch_amttotal_14;
	 private float batch_amttotal_15;
	 private float batch_amttotal_16;
	 private float batch_amttotal_17;
	 private float batch_amttotal_18;
	 private float batch_amttotal_19;
	 private float batch_amttotal_20;
	 private float batch_amttotal_21;
	 private float batch_amttotal_22;
	 private float batch_amttotal_23;
	 private float batch_amttotal_24;
	 private float batch_amttotal_25;
	 private float batch_amttotal_26;
	 private float batch_amttotal_27;
	 private float batch_amttotal_28;
	 private float batch_amttotal_29;
	 private float batch_amttotal_30;
	 private float batch_amttotal_31;
	 private float batch_amttotal_32;
	 private float batch_amttotal_33;
	 private float batch_amttotal_34;
	 private float batch_amttotal_35;
	 private float batch_amttotal_36;
	 private float batch_amttotal_37;
	 private float batch_amttotal_38;
	 private float batch_amttotal_39;
	 private float batch_amttotal_40;
	 private float batch_amttotal_41;
	 private float batch_amttotal_42;
	 private float batch_amttotal_43;
	 private float batch_amttotal_44;
	 private float batch_amttotal_45;
	 private float batch_amttotal_46;
	 private float batch_amttotal_47;
	 private float batch_amttotal_48;
	 private float batch_amttotal_49;
	 private float batch_amttotal_50;
	 private float batch_amttotal_51;
	 private float batch_amttotal_52;
	 private float batch_amttotal_53;
	 private float batch_amttotal_54;
	 private float batch_amttotal_55;
	 private float batch_amttotal_56;
	 private float batch_amttotal_57;
	 private float batch_amttotal_58;
	 private float batch_amttotal_59;
	 private float batch_amttotal_60;
	 private float batch_amttotal_61;
	 private float batch_amttotal_62;
	 private float batch_amttotal_63;
	 private float batch_amttotal_64;
	 private float batch_amttotal_65;
	 private float batch_amttotal_66;
	 private float batch_amttotal_67;
	 private float batch_amttotal_68;
	 private float batch_amttotal_69;
	 private float batch_amttotal_70;
	 private float batch_amttotal_71;
	 private float batch_amttotal_72;
	 private float batch_amttotal_73;
	 private float batch_amttotal_74;
	 private float batch_amttotal_75;
	 private float batch_amttotal_76;
	 private String ejchkdet_flagcrt_1;
	 private String ejchkdet_flagcrt_2;
	 private String ejchkdet_flagcrt_3;
	 private String ejchkdet_flagcrt_4;
	 private String ejchkdet_flagcrt_5;
	 private String ejchkdet_flagcrt_6;
	 private String ejchkdet_flagcrt_7;
	 private String ejchkdet_flagcrt_8;
	 private String ejchkdet_flagcrt_9;
	 private String ejchkdet_flagcrt_10;
	 private String ejchkdet_flagcrt_11;
	 private String ejchkdet_flagcrt_12;
	 private String ejchkdet_flagcrt_13;
	 private String ejchkdet_flagcrt_14;
	 private String ejchkdet_flagcrt_15;
	 private String ejchkdet_flagcrt_16;
	 private String ejchkdet_flagcrt_17;
	 private String ejchkdet_flagcrt_18;
	 private String ejchkdet_flagcrt_19;
	 private String ejchkdet_flagcrt_20;
	 private String ejchkdet_flagcrt_21;
	 private String ejchkdet_flagcrt_22;
	 private String ejchkdet_flagcrt_23;
	 private String ejchkdet_flagcrt_24;
	 private String ejchkdet_flagcrt_25;
	 private float custseqnm;
	 
	 
	 
	public float getSeq_num() {
		return seq_num;
	}
	public void setSeq_num(float seq_num) {
		this.seq_num = seq_num;
	}
	public String getAds_regionid() {
		return ads_regionid;
	}
	@XmlElement(name = "ADS_REGIONID")
	public void setAds_regionid(String ads_regionid) {
		this.ads_regionid = ads_regionid;
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
	@XmlElement(name = "ADS_CASHID")
	public void setAds_cashid(String ads_cashid) {
		this.ads_cashid = ads_cashid;
	}
	public float getAds_transeq() {
		return ads_transeq;
	}
	@XmlElement(name = "ADS_TRANSEQ")
	public void setAds_transeq(float ads_transeq) {
		this.ads_transeq = ads_transeq;
	}
	public float getAds_msgseq() {
		return ads_msgseq;
	}
	@XmlElement(name = "ADS_MSGSEQ")
	public void setAds_msgseq(float ads_msgseq) {
		this.ads_msgseq = ads_msgseq;
	}
	public String getAds_overridetype() {
		return ads_overridetype;
	}
	@XmlElement(name = "ADS_OVERRIDETYPE")
	public void setAds_overridetype(String ads_overridetype) {
		this.ads_overridetype = ads_overridetype;
	}
	public String getAds_reversible() {
		return ads_reversible;
	}
	@XmlElement(name = "ADS_REVERSIBLE")
	public void setAds_reversible(String ads_reversible) {
		this.ads_reversible = ads_reversible;
	}
	public String getAds_reverse() {
		return ads_reverse;
	}
	@XmlElement(name = "ADS_REVERSE")
	public void setAds_reverse(String ads_reverse) {
		this.ads_reverse = ads_reverse;
	}
	public String getAds_partreverse() {
		return ads_partreverse;
	}
	@XmlElement(name = "ADS_PARTREVERSE")
	public void setAds_partreverse(String ads_partreverse) {
		this.ads_partreverse = ads_partreverse;
	}
	public String getAds_ipitem() {
		return ads_ipitem;
	}
	@XmlElement(name = "ADS_IPITEM")
	public void setAds_ipitem(String ads_ipitem) {
		this.ads_ipitem = ads_ipitem;
	}
	public String getAds_stfwstatus() {
		return ads_stfwstatus;
	}
	@XmlElement(name = "ADS_STFWSTATUS")
	public void setAds_stfwstatus(String ads_stfwstatus) {
		this.ads_stfwstatus = ads_stfwstatus;
	}
	public String getAds_errorid() {
		return ads_errorid;
	}
	@XmlElement(name = "ADS_ERRORID")
	public void setAds_errorid(String ads_errorid) {
		this.ads_errorid = ads_errorid;
	}
	public String getAds_groupid() {
		return ads_groupid;
	}
	@XmlElement(name = "ADS_GROUPID")
	public void setAds_groupid(String ads_groupid) {
		this.ads_groupid = ads_groupid;
	}
	public String getAds_tranid() {
		return ads_tranid;
	}
	@XmlElement(name = "ADS_TRANID")
	public void setAds_tranid(String ads_tranid) {
		this.ads_tranid = ads_tranid;
	}
	public String getAds_date() {
		return ads_date;
	}
	@XmlElement(name = "ADS_DATE")
	public void setAds_date(String ads_date) {
		this.ads_date = ads_date;
	}
	public String getAds_time() {
		return ads_time;
	}
	@XmlElement(name = "ADS_TIME")
	public void setAds_time(String ads_time) {
		this.ads_time = ads_time;
	}
	public String getAds_ejproclist() {
		return ads_ejproclist;
	}
	@XmlElement(name = "ADS_EJPROCLIST")
	public void setAds_ejproclist(String ads_ejproclist) {
		this.ads_ejproclist = ads_ejproclist;
	}
	public String getAds_overrideoper() {
		return ads_overrideoper;
	}
	@XmlElement(name = "ADS_OVERRIDEOPER")
	public void setAds_overrideoper(String ads_overrideoper) {
		this.ads_overrideoper = ads_overrideoper;
	}
	public String getAds_majorfnct() {
		return ads_majorfnct;
	}
	@XmlElement(name = "ADS_MAJORFNCT")
	public void setAds_majorfnct(String ads_majorfnct) {
		this.ads_majorfnct = ads_majorfnct;
	}
	public String getAds_minorfnct() {
		return ads_minorfnct;
	}
	@XmlElement(name = "ADS_MAJORFNCT")
	public void setAds_minorfnct(String ads_minorfnct) {
		this.ads_minorfnct = ads_minorfnct;
	}
	public String getAds_procdate() {
		return ads_procdate;
	}
	@XmlElement(name = "ADS_PROCDATE")
	public void setAds_procdate(String ads_procdate) {
		this.ads_procdate = ads_procdate;
	}
	public float getEjchkdet_amttotal() {
		return ejchkdet_amttotal;
	}
	@XmlElement(name ="EJCHKDET_AMTTOTAL")
	public void setEjchkdet_amttotal(float ejchkdet_amttotal) {
		this.ejchkdet_amttotal = ejchkdet_amttotal;
	}
	public float getEjchkdet_numtotal() {
		return ejchkdet_numtotal;
	}
	public void setEjchkdet_numtotal(float ejchkdet_numtotal) {
		this.ejchkdet_numtotal = ejchkdet_numtotal;
	}
	public float getMonetary_sessfund() {
		return monetary_sessfund;
	}
	public void setMonetary_sessfund(float monetary_sessfund) {
		this.monetary_sessfund = monetary_sessfund;
	}
	public float getMonetary_amtcsbk() {
		return monetary_amtcsbk;
	}
	public void setMonetary_amtcsbk(float monetary_amtcsbk) {
		this.monetary_amtcsbk = monetary_amtcsbk;
	}
	public float getMonetary_amtcash() {
		return monetary_amtcash;
	}
	public void setMonetary_amtcash(float monetary_amtcash) {
		this.monetary_amtcash = monetary_amtcash;
	}
	public float getMonetary_amtcheck() {
		return monetary_amtcheck;
	}
	public void setMonetary_amtcheck(float monetary_amtcheck) {
		this.monetary_amtcheck = monetary_amtcheck;
	}
	public float getSesstran_trngroup() {
		return sesstran_trngroup;
	}
	public void setSesstran_trngroup(float sesstran_trngroup) {
		this.sesstran_trngroup = sesstran_trngroup;
	}
	public String getAccount_abanumbr() {
		return account_abanumbr;
	}
	public void setAccount_abanumbr(String account_abanumbr) {
		this.account_abanumbr = account_abanumbr;
	}
	public String getEjchkdet_abanumbr_1() {
		return ejchkdet_abanumbr_1;
	}
	public void setEjchkdet_abanumbr_1(String ejchkdet_abanumbr_1) {
		this.ejchkdet_abanumbr_1 = ejchkdet_abanumbr_1;
	}
	public String getEjchkdet_abanumbr_2() {
		return ejchkdet_abanumbr_2;
	}
	public void setEjchkdet_abanumbr_2(String ejchkdet_abanumbr_2) {
		this.ejchkdet_abanumbr_2 = ejchkdet_abanumbr_2;
	}
	public String getEjchkdet_abanumbr_3() {
		return ejchkdet_abanumbr_3;
	}
	public void setEjchkdet_abanumbr_3(String ejchkdet_abanumbr_3) {
		this.ejchkdet_abanumbr_3 = ejchkdet_abanumbr_3;
	}
	public String getEjchkdet_abanumbr_4() {
		return ejchkdet_abanumbr_4;
	}
	public void setEjchkdet_abanumbr_4(String ejchkdet_abanumbr_4) {
		this.ejchkdet_abanumbr_4 = ejchkdet_abanumbr_4;
	}
	public String getEjchkdet_abanumbr_5() {
		return ejchkdet_abanumbr_5;
	}
	public void setEjchkdet_abanumbr_5(String ejchkdet_abanumbr_5) {
		this.ejchkdet_abanumbr_5 = ejchkdet_abanumbr_5;
	}
	public String getEjchkdet_abanumbr_6() {
		return ejchkdet_abanumbr_6;
	}
	public void setEjchkdet_abanumbr_6(String ejchkdet_abanumbr_6) {
		this.ejchkdet_abanumbr_6 = ejchkdet_abanumbr_6;
	}
	public String getEjchkdet_abanumbr_7() {
		return ejchkdet_abanumbr_7;
	}
	public void setEjchkdet_abanumbr_7(String ejchkdet_abanumbr_7) {
		this.ejchkdet_abanumbr_7 = ejchkdet_abanumbr_7;
	}
	public String getEjchkdet_abanumbr_8() {
		return ejchkdet_abanumbr_8;
	}
	public void setEjchkdet_abanumbr_8(String ejchkdet_abanumbr_8) {
		this.ejchkdet_abanumbr_8 = ejchkdet_abanumbr_8;
	}
	public String getEjchkdet_abanumbr_9() {
		return ejchkdet_abanumbr_9;
	}
	public void setEjchkdet_abanumbr_9(String ejchkdet_abanumbr_9) {
		this.ejchkdet_abanumbr_9 = ejchkdet_abanumbr_9;
	}
	public String getEjchkdet_abanumbr_10() {
		return ejchkdet_abanumbr_10;
	}
	public void setEjchkdet_abanumbr_10(String ejchkdet_abanumbr_10) {
		this.ejchkdet_abanumbr_10 = ejchkdet_abanumbr_10;
	}
	public String getEjchkdet_abanumbr_11() {
		return ejchkdet_abanumbr_11;
	}
	public void setEjchkdet_abanumbr_11(String ejchkdet_abanumbr_11) {
		this.ejchkdet_abanumbr_11 = ejchkdet_abanumbr_11;
	}
	public String getEjchkdet_abanumbr_12() {
		return ejchkdet_abanumbr_12;
	}
	public void setEjchkdet_abanumbr_12(String ejchkdet_abanumbr_12) {
		this.ejchkdet_abanumbr_12 = ejchkdet_abanumbr_12;
	}
	public String getEjchkdet_abanumbr_13() {
		return ejchkdet_abanumbr_13;
	}
	public void setEjchkdet_abanumbr_13(String ejchkdet_abanumbr_13) {
		this.ejchkdet_abanumbr_13 = ejchkdet_abanumbr_13;
	}
	public String getEjchkdet_abanumbr_14() {
		return ejchkdet_abanumbr_14;
	}
	public void setEjchkdet_abanumbr_14(String ejchkdet_abanumbr_14) {
		this.ejchkdet_abanumbr_14 = ejchkdet_abanumbr_14;
	}
	public String getEjchkdet_abanumbr_15() {
		return ejchkdet_abanumbr_15;
	}
	public void setEjchkdet_abanumbr_15(String ejchkdet_abanumbr_15) {
		this.ejchkdet_abanumbr_15 = ejchkdet_abanumbr_15;
	}
	public String getEjchkdet_abanumbr_16() {
		return ejchkdet_abanumbr_16;
	}
	public void setEjchkdet_abanumbr_16(String ejchkdet_abanumbr_16) {
		this.ejchkdet_abanumbr_16 = ejchkdet_abanumbr_16;
	}
	public String getEjchkdet_abanumbr_17() {
		return ejchkdet_abanumbr_17;
	}
	public void setEjchkdet_abanumbr_17(String ejchkdet_abanumbr_17) {
		this.ejchkdet_abanumbr_17 = ejchkdet_abanumbr_17;
	}
	public String getEjchkdet_abanumbr_18() {
		return ejchkdet_abanumbr_18;
	}
	public void setEjchkdet_abanumbr_18(String ejchkdet_abanumbr_18) {
		this.ejchkdet_abanumbr_18 = ejchkdet_abanumbr_18;
	}
	public String getEjchkdet_abanumbr_19() {
		return ejchkdet_abanumbr_19;
	}
	public void setEjchkdet_abanumbr_19(String ejchkdet_abanumbr_19) {
		this.ejchkdet_abanumbr_19 = ejchkdet_abanumbr_19;
	}
	public String getEjchkdet_abanumbr_20() {
		return ejchkdet_abanumbr_20;
	}
	public void setEjchkdet_abanumbr_20(String ejchkdet_abanumbr_20) {
		this.ejchkdet_abanumbr_20 = ejchkdet_abanumbr_20;
	}
	public String getEjchkdet_abanumbr_21() {
		return ejchkdet_abanumbr_21;
	}
	public void setEjchkdet_abanumbr_21(String ejchkdet_abanumbr_21) {
		this.ejchkdet_abanumbr_21 = ejchkdet_abanumbr_21;
	}
	public String getEjchkdet_abanumbr_22() {
		return ejchkdet_abanumbr_22;
	}
	public void setEjchkdet_abanumbr_22(String ejchkdet_abanumbr_22) {
		this.ejchkdet_abanumbr_22 = ejchkdet_abanumbr_22;
	}
	public String getEjchkdet_abanumbr_23() {
		return ejchkdet_abanumbr_23;
	}
	public void setEjchkdet_abanumbr_23(String ejchkdet_abanumbr_23) {
		this.ejchkdet_abanumbr_23 = ejchkdet_abanumbr_23;
	}
	public String getEjchkdet_abanumbr_24() {
		return ejchkdet_abanumbr_24;
	}
	public void setEjchkdet_abanumbr_24(String ejchkdet_abanumbr_24) {
		this.ejchkdet_abanumbr_24 = ejchkdet_abanumbr_24;
	}
	public String getEjchkdet_abanumbr_25() {
		return ejchkdet_abanumbr_25;
	}
	public void setEjchkdet_abanumbr_25(String ejchkdet_abanumbr_25) {
		this.ejchkdet_abanumbr_25 = ejchkdet_abanumbr_25;
	}
	public String getEjchkdet_numact19_1() {
		return ejchkdet_numact19_1;
	}
	public void setEjchkdet_numact19_1(String ejchkdet_numact19_1) {
		this.ejchkdet_numact19_1 = ejchkdet_numact19_1;
	}
	public String getEjchkdet_numact19_2() {
		return ejchkdet_numact19_2;
	}
	public void setEjchkdet_numact19_2(String ejchkdet_numact19_2) {
		this.ejchkdet_numact19_2 = ejchkdet_numact19_2;
	}
	public String getEjchkdet_numact19_3() {
		return ejchkdet_numact19_3;
	}
	public void setEjchkdet_numact19_3(String ejchkdet_numact19_3) {
		this.ejchkdet_numact19_3 = ejchkdet_numact19_3;
	}
	public String getEjchkdet_numact19_4() {
		return ejchkdet_numact19_4;
	}
	public void setEjchkdet_numact19_4(String ejchkdet_numact19_4) {
		this.ejchkdet_numact19_4 = ejchkdet_numact19_4;
	}
	public String getEjchkdet_numact19_5() {
		return ejchkdet_numact19_5;
	}
	public void setEjchkdet_numact19_5(String ejchkdet_numact19_5) {
		this.ejchkdet_numact19_5 = ejchkdet_numact19_5;
	}
	public String getEjchkdet_numact19_6() {
		return ejchkdet_numact19_6;
	}
	public void setEjchkdet_numact19_6(String ejchkdet_numact19_6) {
		this.ejchkdet_numact19_6 = ejchkdet_numact19_6;
	}
	public String getEjchkdet_numact19_7() {
		return ejchkdet_numact19_7;
	}
	public void setEjchkdet_numact19_7(String ejchkdet_numact19_7) {
		this.ejchkdet_numact19_7 = ejchkdet_numact19_7;
	}
	public String getEjchkdet_numact19_8() {
		return ejchkdet_numact19_8;
	}
	public void setEjchkdet_numact19_8(String ejchkdet_numact19_8) {
		this.ejchkdet_numact19_8 = ejchkdet_numact19_8;
	}
	public String getEjchkdet_numact19_9() {
		return ejchkdet_numact19_9;
	}
	public void setEjchkdet_numact19_9(String ejchkdet_numact19_9) {
		this.ejchkdet_numact19_9 = ejchkdet_numact19_9;
	}
	public String getEjchkdet_numact19_10() {
		return ejchkdet_numact19_10;
	}
	public void setEjchkdet_numact19_10(String ejchkdet_numact19_10) {
		this.ejchkdet_numact19_10 = ejchkdet_numact19_10;
	}
	public String getEjchkdet_numact19_11() {
		return ejchkdet_numact19_11;
	}
	public void setEjchkdet_numact19_11(String ejchkdet_numact19_11) {
		this.ejchkdet_numact19_11 = ejchkdet_numact19_11;
	}
	public String getEjchkdet_numact19_12() {
		return ejchkdet_numact19_12;
	}
	public void setEjchkdet_numact19_12(String ejchkdet_numact19_12) {
		this.ejchkdet_numact19_12 = ejchkdet_numact19_12;
	}
	public String getEjchkdet_numact19_13() {
		return ejchkdet_numact19_13;
	}
	public void setEjchkdet_numact19_13(String ejchkdet_numact19_13) {
		this.ejchkdet_numact19_13 = ejchkdet_numact19_13;
	}
	public String getEjchkdet_numact19_14() {
		return ejchkdet_numact19_14;
	}
	public void setEjchkdet_numact19_14(String ejchkdet_numact19_14) {
		this.ejchkdet_numact19_14 = ejchkdet_numact19_14;
	}
	public String getEjchkdet_numact19_15() {
		return ejchkdet_numact19_15;
	}
	public void setEjchkdet_numact19_15(String ejchkdet_numact19_15) {
		this.ejchkdet_numact19_15 = ejchkdet_numact19_15;
	}
	public String getEjchkdet_numact19_16() {
		return ejchkdet_numact19_16;
	}
	public void setEjchkdet_numact19_16(String ejchkdet_numact19_16) {
		this.ejchkdet_numact19_16 = ejchkdet_numact19_16;
	}
	public String getEjchkdet_numact19_17() {
		return ejchkdet_numact19_17;
	}
	public void setEjchkdet_numact19_17(String ejchkdet_numact19_17) {
		this.ejchkdet_numact19_17 = ejchkdet_numact19_17;
	}
	public String getEjchkdet_numact19_18() {
		return ejchkdet_numact19_18;
	}
	public void setEjchkdet_numact19_18(String ejchkdet_numact19_18) {
		this.ejchkdet_numact19_18 = ejchkdet_numact19_18;
	}
	public String getEjchkdet_numact19_19() {
		return ejchkdet_numact19_19;
	}
	public void setEjchkdet_numact19_19(String ejchkdet_numact19_19) {
		this.ejchkdet_numact19_19 = ejchkdet_numact19_19;
	}
	public String getEjchkdet_numact19_20() {
		return ejchkdet_numact19_20;
	}
	public void setEjchkdet_numact19_20(String ejchkdet_numact19_20) {
		this.ejchkdet_numact19_20 = ejchkdet_numact19_20;
	}
	public String getEjchkdet_numact19_21() {
		return ejchkdet_numact19_21;
	}
	public void setEjchkdet_numact19_21(String ejchkdet_numact19_21) {
		this.ejchkdet_numact19_21 = ejchkdet_numact19_21;
	}
	public String getEjchkdet_numact19_22() {
		return ejchkdet_numact19_22;
	}
	public void setEjchkdet_numact19_22(String ejchkdet_numact19_22) {
		this.ejchkdet_numact19_22 = ejchkdet_numact19_22;
	}
	public String getEjchkdet_numact19_23() {
		return ejchkdet_numact19_23;
	}
	public void setEjchkdet_numact19_23(String ejchkdet_numact19_23) {
		this.ejchkdet_numact19_23 = ejchkdet_numact19_23;
	}
	public String getEjchkdet_numact19_24() {
		return ejchkdet_numact19_24;
	}
	public void setEjchkdet_numact19_24(String ejchkdet_numact19_24) {
		this.ejchkdet_numact19_24 = ejchkdet_numact19_24;
	}
	public String getEjchkdet_numact19_25() {
		return ejchkdet_numact19_25;
	}
	public void setEjchkdet_numact19_25(String ejchkdet_numact19_25) {
		this.ejchkdet_numact19_25 = ejchkdet_numact19_25;
	}
	public float getEjchkdet_amtcheck_1() {
		return ejchkdet_amtcheck_1;
	}
	public void setEjchkdet_amtcheck_1(float ejchkdet_amtcheck_1) {
		this.ejchkdet_amtcheck_1 = ejchkdet_amtcheck_1;
	}
	public float getEjchkdet_amtcheck_2() {
		return ejchkdet_amtcheck_2;
	}
	public void setEjchkdet_amtcheck_2(float ejchkdet_amtcheck_2) {
		this.ejchkdet_amtcheck_2 = ejchkdet_amtcheck_2;
	}
	public float getEjchkdet_amtcheck_3() {
		return ejchkdet_amtcheck_3;
	}
	public void setEjchkdet_amtcheck_3(float ejchkdet_amtcheck_3) {
		this.ejchkdet_amtcheck_3 = ejchkdet_amtcheck_3;
	}
	public float getEjchkdet_amtcheck_4() {
		return ejchkdet_amtcheck_4;
	}
	public void setEjchkdet_amtcheck_4(float ejchkdet_amtcheck_4) {
		this.ejchkdet_amtcheck_4 = ejchkdet_amtcheck_4;
	}
	public float getEjchkdet_amtcheck_5() {
		return ejchkdet_amtcheck_5;
	}
	public void setEjchkdet_amtcheck_5(float ejchkdet_amtcheck_5) {
		this.ejchkdet_amtcheck_5 = ejchkdet_amtcheck_5;
	}
	public float getEjchkdet_amtcheck_6() {
		return ejchkdet_amtcheck_6;
	}
	public void setEjchkdet_amtcheck_6(float ejchkdet_amtcheck_6) {
		this.ejchkdet_amtcheck_6 = ejchkdet_amtcheck_6;
	}
	public float getEjchkdet_amtcheck_7() {
		return ejchkdet_amtcheck_7;
	}
	public void setEjchkdet_amtcheck_7(float ejchkdet_amtcheck_7) {
		this.ejchkdet_amtcheck_7 = ejchkdet_amtcheck_7;
	}
	public float getEjchkdet_amtcheck_8() {
		return ejchkdet_amtcheck_8;
	}
	public void setEjchkdet_amtcheck_8(float ejchkdet_amtcheck_8) {
		this.ejchkdet_amtcheck_8 = ejchkdet_amtcheck_8;
	}
	public float getEjchkdet_amtcheck_9() {
		return ejchkdet_amtcheck_9;
	}
	public void setEjchkdet_amtcheck_9(float ejchkdet_amtcheck_9) {
		this.ejchkdet_amtcheck_9 = ejchkdet_amtcheck_9;
	}
	public float getEjchkdet_amtcheck_10() {
		return ejchkdet_amtcheck_10;
	}
	public void setEjchkdet_amtcheck_10(float ejchkdet_amtcheck_10) {
		this.ejchkdet_amtcheck_10 = ejchkdet_amtcheck_10;
	}
	public float getEjchkdet_amtcheck_11() {
		return ejchkdet_amtcheck_11;
	}
	public void setEjchkdet_amtcheck_11(float ejchkdet_amtcheck_11) {
		this.ejchkdet_amtcheck_11 = ejchkdet_amtcheck_11;
	}
	public float getEjchkdet_amtcheck_12() {
		return ejchkdet_amtcheck_12;
	}
	public void setEjchkdet_amtcheck_12(float ejchkdet_amtcheck_12) {
		this.ejchkdet_amtcheck_12 = ejchkdet_amtcheck_12;
	}
	public float getEjchkdet_amtcheck_13() {
		return ejchkdet_amtcheck_13;
	}
	public void setEjchkdet_amtcheck_13(float ejchkdet_amtcheck_13) {
		this.ejchkdet_amtcheck_13 = ejchkdet_amtcheck_13;
	}
	public float getEjchkdet_amtcheck_14() {
		return ejchkdet_amtcheck_14;
	}
	public void setEjchkdet_amtcheck_14(float ejchkdet_amtcheck_14) {
		this.ejchkdet_amtcheck_14 = ejchkdet_amtcheck_14;
	}
	public float getEjchkdet_amtcheck_15() {
		return ejchkdet_amtcheck_15;
	}
	public void setEjchkdet_amtcheck_15(float ejchkdet_amtcheck_15) {
		this.ejchkdet_amtcheck_15 = ejchkdet_amtcheck_15;
	}
	public float getEjchkdet_amtcheck_16() {
		return ejchkdet_amtcheck_16;
	}
	public void setEjchkdet_amtcheck_16(float ejchkdet_amtcheck_16) {
		this.ejchkdet_amtcheck_16 = ejchkdet_amtcheck_16;
	}
	public float getEjchkdet_amtcheck_17() {
		return ejchkdet_amtcheck_17;
	}
	public void setEjchkdet_amtcheck_17(float ejchkdet_amtcheck_17) {
		this.ejchkdet_amtcheck_17 = ejchkdet_amtcheck_17;
	}
	public float getEjchkdet_amtcheck_18() {
		return ejchkdet_amtcheck_18;
	}
	public void setEjchkdet_amtcheck_18(float ejchkdet_amtcheck_18) {
		this.ejchkdet_amtcheck_18 = ejchkdet_amtcheck_18;
	}
	public float getEjchkdet_amtcheck_19() {
		return ejchkdet_amtcheck_19;
	}
	public void setEjchkdet_amtcheck_19(float ejchkdet_amtcheck_19) {
		this.ejchkdet_amtcheck_19 = ejchkdet_amtcheck_19;
	}
	public float getEjchkdet_amtcheck_20() {
		return ejchkdet_amtcheck_20;
	}
	public void setEjchkdet_amtcheck_20(float ejchkdet_amtcheck_20) {
		this.ejchkdet_amtcheck_20 = ejchkdet_amtcheck_20;
	}
	public float getEjchkdet_amtcheck_21() {
		return ejchkdet_amtcheck_21;
	}
	public void setEjchkdet_amtcheck_21(float ejchkdet_amtcheck_21) {
		this.ejchkdet_amtcheck_21 = ejchkdet_amtcheck_21;
	}
	public float getEjchkdet_amtcheck_22() {
		return ejchkdet_amtcheck_22;
	}
	public void setEjchkdet_amtcheck_22(float ejchkdet_amtcheck_22) {
		this.ejchkdet_amtcheck_22 = ejchkdet_amtcheck_22;
	}
	public float getEjchkdet_amtcheck_23() {
		return ejchkdet_amtcheck_23;
	}
	public void setEjchkdet_amtcheck_23(float ejchkdet_amtcheck_23) {
		this.ejchkdet_amtcheck_23 = ejchkdet_amtcheck_23;
	}
	public float getEjchkdet_amtcheck_24() {
		return ejchkdet_amtcheck_24;
	}
	public void setEjchkdet_amtcheck_24(float ejchkdet_amtcheck_24) {
		this.ejchkdet_amtcheck_24 = ejchkdet_amtcheck_24;
	}
	public float getEjchkdet_amtcheck_25() {
		return ejchkdet_amtcheck_25;
	}
	public void setEjchkdet_amtcheck_25(float ejchkdet_amtcheck_25) {
		this.ejchkdet_amtcheck_25 = ejchkdet_amtcheck_25;
	}
	public String getEjchkdet_numcheck_1() {
		return ejchkdet_numcheck_1;
	}
	public void setEjchkdet_numcheck_1(String ejchkdet_numcheck_1) {
		this.ejchkdet_numcheck_1 = ejchkdet_numcheck_1;
	}
	public String getEjchkdet_numcheck_2() {
		return ejchkdet_numcheck_2;
	}
	public void setEjchkdet_numcheck_2(String ejchkdet_numcheck_2) {
		this.ejchkdet_numcheck_2 = ejchkdet_numcheck_2;
	}
	public String getEjchkdet_numcheck_3() {
		return ejchkdet_numcheck_3;
	}
	public void setEjchkdet_numcheck_3(String ejchkdet_numcheck_3) {
		this.ejchkdet_numcheck_3 = ejchkdet_numcheck_3;
	}
	public String getEjchkdet_numcheck_4() {
		return ejchkdet_numcheck_4;
	}
	public void setEjchkdet_numcheck_4(String ejchkdet_numcheck_4) {
		this.ejchkdet_numcheck_4 = ejchkdet_numcheck_4;
	}
	public String getEjchkdet_numcheck_5() {
		return ejchkdet_numcheck_5;
	}
	public void setEjchkdet_numcheck_5(String ejchkdet_numcheck_5) {
		this.ejchkdet_numcheck_5 = ejchkdet_numcheck_5;
	}
	public String getEjchkdet_numcheck_6() {
		return ejchkdet_numcheck_6;
	}
	public void setEjchkdet_numcheck_6(String ejchkdet_numcheck_6) {
		this.ejchkdet_numcheck_6 = ejchkdet_numcheck_6;
	}
	public String getEjchkdet_numcheck_7() {
		return ejchkdet_numcheck_7;
	}
	public void setEjchkdet_numcheck_7(String ejchkdet_numcheck_7) {
		this.ejchkdet_numcheck_7 = ejchkdet_numcheck_7;
	}
	public String getEjchkdet_numcheck_8() {
		return ejchkdet_numcheck_8;
	}
	public void setEjchkdet_numcheck_8(String ejchkdet_numcheck_8) {
		this.ejchkdet_numcheck_8 = ejchkdet_numcheck_8;
	}
	public String getEjchkdet_numcheck_9() {
		return ejchkdet_numcheck_9;
	}
	public void setEjchkdet_numcheck_9(String ejchkdet_numcheck_9) {
		this.ejchkdet_numcheck_9 = ejchkdet_numcheck_9;
	}
	public String getEjchkdet_numcheck_10() {
		return ejchkdet_numcheck_10;
	}
	public void setEjchkdet_numcheck_10(String ejchkdet_numcheck_10) {
		this.ejchkdet_numcheck_10 = ejchkdet_numcheck_10;
	}
	public String getEjchkdet_numcheck_11() {
		return ejchkdet_numcheck_11;
	}
	public void setEjchkdet_numcheck_11(String ejchkdet_numcheck_11) {
		this.ejchkdet_numcheck_11 = ejchkdet_numcheck_11;
	}
	public String getEjchkdet_numcheck_12() {
		return ejchkdet_numcheck_12;
	}
	public void setEjchkdet_numcheck_12(String ejchkdet_numcheck_12) {
		this.ejchkdet_numcheck_12 = ejchkdet_numcheck_12;
	}
	public String getEjchkdet_numcheck_13() {
		return ejchkdet_numcheck_13;
	}
	public void setEjchkdet_numcheck_13(String ejchkdet_numcheck_13) {
		this.ejchkdet_numcheck_13 = ejchkdet_numcheck_13;
	}
	public String getEjchkdet_numcheck_14() {
		return ejchkdet_numcheck_14;
	}
	public void setEjchkdet_numcheck_14(String ejchkdet_numcheck_14) {
		this.ejchkdet_numcheck_14 = ejchkdet_numcheck_14;
	}
	public String getEjchkdet_numcheck_15() {
		return ejchkdet_numcheck_15;
	}
	public void setEjchkdet_numcheck_15(String ejchkdet_numcheck_15) {
		this.ejchkdet_numcheck_15 = ejchkdet_numcheck_15;
	}
	public String getEjchkdet_numcheck_16() {
		return ejchkdet_numcheck_16;
	}
	public void setEjchkdet_numcheck_16(String ejchkdet_numcheck_16) {
		this.ejchkdet_numcheck_16 = ejchkdet_numcheck_16;
	}
	public String getEjchkdet_numcheck_17() {
		return ejchkdet_numcheck_17;
	}
	public void setEjchkdet_numcheck_17(String ejchkdet_numcheck_17) {
		this.ejchkdet_numcheck_17 = ejchkdet_numcheck_17;
	}
	public String getEjchkdet_numcheck_18() {
		return ejchkdet_numcheck_18;
	}
	public void setEjchkdet_numcheck_18(String ejchkdet_numcheck_18) {
		this.ejchkdet_numcheck_18 = ejchkdet_numcheck_18;
	}
	public String getEjchkdet_numcheck_19() {
		return ejchkdet_numcheck_19;
	}
	public void setEjchkdet_numcheck_19(String ejchkdet_numcheck_19) {
		this.ejchkdet_numcheck_19 = ejchkdet_numcheck_19;
	}
	public String getEjchkdet_numcheck_20() {
		return ejchkdet_numcheck_20;
	}
	public void setEjchkdet_numcheck_20(String ejchkdet_numcheck_20) {
		this.ejchkdet_numcheck_20 = ejchkdet_numcheck_20;
	}
	public String getEjchkdet_numcheck_21() {
		return ejchkdet_numcheck_21;
	}
	public void setEjchkdet_numcheck_21(String ejchkdet_numcheck_21) {
		this.ejchkdet_numcheck_21 = ejchkdet_numcheck_21;
	}
	public String getEjchkdet_numcheck_22() {
		return ejchkdet_numcheck_22;
	}
	public void setEjchkdet_numcheck_22(String ejchkdet_numcheck_22) {
		this.ejchkdet_numcheck_22 = ejchkdet_numcheck_22;
	}
	public String getEjchkdet_numcheck_23() {
		return ejchkdet_numcheck_23;
	}
	public void setEjchkdet_numcheck_23(String ejchkdet_numcheck_23) {
		this.ejchkdet_numcheck_23 = ejchkdet_numcheck_23;
	}
	public String getEjchkdet_numcheck_24() {
		return ejchkdet_numcheck_24;
	}
	public void setEjchkdet_numcheck_24(String ejchkdet_numcheck_24) {
		this.ejchkdet_numcheck_24 = ejchkdet_numcheck_24;
	}
	public String getEjchkdet_numcheck_25() {
		return ejchkdet_numcheck_25;
	}
	public void setEjchkdet_numcheck_25(String ejchkdet_numcheck_25) {
		this.ejchkdet_numcheck_25 = ejchkdet_numcheck_25;
	}
	public String getEjchkdet_documtid_1() {
		return ejchkdet_documtid_1;
	}
	public void setEjchkdet_documtid_1(String ejchkdet_documtid_1) {
		this.ejchkdet_documtid_1 = ejchkdet_documtid_1;
	}
	public String getEjchkdet_documtid_2() {
		return ejchkdet_documtid_2;
	}
	public void setEjchkdet_documtid_2(String ejchkdet_documtid_2) {
		this.ejchkdet_documtid_2 = ejchkdet_documtid_2;
	}
	public String getEjchkdet_documtid_3() {
		return ejchkdet_documtid_3;
	}
	public void setEjchkdet_documtid_3(String ejchkdet_documtid_3) {
		this.ejchkdet_documtid_3 = ejchkdet_documtid_3;
	}
	public String getEjchkdet_documtid_4() {
		return ejchkdet_documtid_4;
	}
	public void setEjchkdet_documtid_4(String ejchkdet_documtid_4) {
		this.ejchkdet_documtid_4 = ejchkdet_documtid_4;
	}
	public String getEjchkdet_documtid_5() {
		return ejchkdet_documtid_5;
	}
	public void setEjchkdet_documtid_5(String ejchkdet_documtid_5) {
		this.ejchkdet_documtid_5 = ejchkdet_documtid_5;
	}
	public String getEjchkdet_documtid_6() {
		return ejchkdet_documtid_6;
	}
	public void setEjchkdet_documtid_6(String ejchkdet_documtid_6) {
		this.ejchkdet_documtid_6 = ejchkdet_documtid_6;
	}
	public String getEjchkdet_documtid_7() {
		return ejchkdet_documtid_7;
	}
	public void setEjchkdet_documtid_7(String ejchkdet_documtid_7) {
		this.ejchkdet_documtid_7 = ejchkdet_documtid_7;
	}
	public String getEjchkdet_documtid_8() {
		return ejchkdet_documtid_8;
	}
	public void setEjchkdet_documtid_8(String ejchkdet_documtid_8) {
		this.ejchkdet_documtid_8 = ejchkdet_documtid_8;
	}
	public String getEjchkdet_documtid_9() {
		return ejchkdet_documtid_9;
	}
	public void setEjchkdet_documtid_9(String ejchkdet_documtid_9) {
		this.ejchkdet_documtid_9 = ejchkdet_documtid_9;
	}
	public String getEjchkdet_documtid_10() {
		return ejchkdet_documtid_10;
	}
	public void setEjchkdet_documtid_10(String ejchkdet_documtid_10) {
		this.ejchkdet_documtid_10 = ejchkdet_documtid_10;
	}
	public String getEjchkdet_documtid_11() {
		return ejchkdet_documtid_11;
	}
	public void setEjchkdet_documtid_11(String ejchkdet_documtid_11) {
		this.ejchkdet_documtid_11 = ejchkdet_documtid_11;
	}
	public String getEjchkdet_documtid_12() {
		return ejchkdet_documtid_12;
	}
	public void setEjchkdet_documtid_12(String ejchkdet_documtid_12) {
		this.ejchkdet_documtid_12 = ejchkdet_documtid_12;
	}
	public String getEjchkdet_documtid_13() {
		return ejchkdet_documtid_13;
	}
	public void setEjchkdet_documtid_13(String ejchkdet_documtid_13) {
		this.ejchkdet_documtid_13 = ejchkdet_documtid_13;
	}
	public String getEjchkdet_documtid_14() {
		return ejchkdet_documtid_14;
	}
	public void setEjchkdet_documtid_14(String ejchkdet_documtid_14) {
		this.ejchkdet_documtid_14 = ejchkdet_documtid_14;
	}
	public String getEjchkdet_documtid_15() {
		return ejchkdet_documtid_15;
	}
	public void setEjchkdet_documtid_15(String ejchkdet_documtid_15) {
		this.ejchkdet_documtid_15 = ejchkdet_documtid_15;
	}
	public String getEjchkdet_documtid_16() {
		return ejchkdet_documtid_16;
	}
	public void setEjchkdet_documtid_16(String ejchkdet_documtid_16) {
		this.ejchkdet_documtid_16 = ejchkdet_documtid_16;
	}
	public String getEjchkdet_documtid_17() {
		return ejchkdet_documtid_17;
	}
	public void setEjchkdet_documtid_17(String ejchkdet_documtid_17) {
		this.ejchkdet_documtid_17 = ejchkdet_documtid_17;
	}
	public String getEjchkdet_documtid_18() {
		return ejchkdet_documtid_18;
	}
	public void setEjchkdet_documtid_18(String ejchkdet_documtid_18) {
		this.ejchkdet_documtid_18 = ejchkdet_documtid_18;
	}
	public String getEjchkdet_documtid_19() {
		return ejchkdet_documtid_19;
	}
	public void setEjchkdet_documtid_19(String ejchkdet_documtid_19) {
		this.ejchkdet_documtid_19 = ejchkdet_documtid_19;
	}
	public String getEjchkdet_documtid_20() {
		return ejchkdet_documtid_20;
	}
	public void setEjchkdet_documtid_20(String ejchkdet_documtid_20) {
		this.ejchkdet_documtid_20 = ejchkdet_documtid_20;
	}
	public String getEjchkdet_documtid_21() {
		return ejchkdet_documtid_21;
	}
	public void setEjchkdet_documtid_21(String ejchkdet_documtid_21) {
		this.ejchkdet_documtid_21 = ejchkdet_documtid_21;
	}
	public String getEjchkdet_documtid_22() {
		return ejchkdet_documtid_22;
	}
	public void setEjchkdet_documtid_22(String ejchkdet_documtid_22) {
		this.ejchkdet_documtid_22 = ejchkdet_documtid_22;
	}
	public String getEjchkdet_documtid_23() {
		return ejchkdet_documtid_23;
	}
	public void setEjchkdet_documtid_23(String ejchkdet_documtid_23) {
		this.ejchkdet_documtid_23 = ejchkdet_documtid_23;
	}
	public String getEjchkdet_documtid_24() {
		return ejchkdet_documtid_24;
	}
	public void setEjchkdet_documtid_24(String ejchkdet_documtid_24) {
		this.ejchkdet_documtid_24 = ejchkdet_documtid_24;
	}
	public String getEjchkdet_documtid_25() {
		return ejchkdet_documtid_25;
	}
	public void setEjchkdet_documtid_25(String ejchkdet_documtid_25) {
		this.ejchkdet_documtid_25 = ejchkdet_documtid_25;
	}
	public float getEjchkdet_numconfi_1() {
		return ejchkdet_numconfi_1;
	}
	public void setEjchkdet_numconfi_1(float ejchkdet_numconfi_1) {
		this.ejchkdet_numconfi_1 = ejchkdet_numconfi_1;
	}
	public float getEjchkdet_numconfi_2() {
		return ejchkdet_numconfi_2;
	}
	public void setEjchkdet_numconfi_2(float ejchkdet_numconfi_2) {
		this.ejchkdet_numconfi_2 = ejchkdet_numconfi_2;
	}
	public float getEjchkdet_numconfi_3() {
		return ejchkdet_numconfi_3;
	}
	public void setEjchkdet_numconfi_3(float ejchkdet_numconfi_3) {
		this.ejchkdet_numconfi_3 = ejchkdet_numconfi_3;
	}
	public float getEjchkdet_numconfi_4() {
		return ejchkdet_numconfi_4;
	}
	public void setEjchkdet_numconfi_4(float ejchkdet_numconfi_4) {
		this.ejchkdet_numconfi_4 = ejchkdet_numconfi_4;
	}
	public float getEjchkdet_numconfi_5() {
		return ejchkdet_numconfi_5;
	}
	public void setEjchkdet_numconfi_5(float ejchkdet_numconfi_5) {
		this.ejchkdet_numconfi_5 = ejchkdet_numconfi_5;
	}
	public float getEjchkdet_numconfi_6() {
		return ejchkdet_numconfi_6;
	}
	public void setEjchkdet_numconfi_6(float ejchkdet_numconfi_6) {
		this.ejchkdet_numconfi_6 = ejchkdet_numconfi_6;
	}
	public float getEjchkdet_numconfi_7() {
		return ejchkdet_numconfi_7;
	}
	public void setEjchkdet_numconfi_7(float ejchkdet_numconfi_7) {
		this.ejchkdet_numconfi_7 = ejchkdet_numconfi_7;
	}
	public float getEjchkdet_numconfi_8() {
		return ejchkdet_numconfi_8;
	}
	public void setEjchkdet_numconfi_8(float ejchkdet_numconfi_8) {
		this.ejchkdet_numconfi_8 = ejchkdet_numconfi_8;
	}
	public float getEjchkdet_numconfi_9() {
		return ejchkdet_numconfi_9;
	}
	public void setEjchkdet_numconfi_9(float ejchkdet_numconfi_9) {
		this.ejchkdet_numconfi_9 = ejchkdet_numconfi_9;
	}
	public float getEjchkdet_numconfi_10() {
		return ejchkdet_numconfi_10;
	}
	public void setEjchkdet_numconfi_10(float ejchkdet_numconfi_10) {
		this.ejchkdet_numconfi_10 = ejchkdet_numconfi_10;
	}
	public float getEjchkdet_numconfi_11() {
		return ejchkdet_numconfi_11;
	}
	public void setEjchkdet_numconfi_11(float ejchkdet_numconfi_11) {
		this.ejchkdet_numconfi_11 = ejchkdet_numconfi_11;
	}
	public float getEjchkdet_numconfi_12() {
		return ejchkdet_numconfi_12;
	}
	public void setEjchkdet_numconfi_12(float ejchkdet_numconfi_12) {
		this.ejchkdet_numconfi_12 = ejchkdet_numconfi_12;
	}
	public float getEjchkdet_numconfi_13() {
		return ejchkdet_numconfi_13;
	}
	public void setEjchkdet_numconfi_13(float ejchkdet_numconfi_13) {
		this.ejchkdet_numconfi_13 = ejchkdet_numconfi_13;
	}
	public float getEjchkdet_numconfi_14() {
		return ejchkdet_numconfi_14;
	}
	public void setEjchkdet_numconfi_14(float ejchkdet_numconfi_14) {
		this.ejchkdet_numconfi_14 = ejchkdet_numconfi_14;
	}
	public float getEjchkdet_numconfi_15() {
		return ejchkdet_numconfi_15;
	}
	public void setEjchkdet_numconfi_15(float ejchkdet_numconfi_15) {
		this.ejchkdet_numconfi_15 = ejchkdet_numconfi_15;
	}
	public float getEjchkdet_numconfi_16() {
		return ejchkdet_numconfi_16;
	}
	public void setEjchkdet_numconfi_16(float ejchkdet_numconfi_16) {
		this.ejchkdet_numconfi_16 = ejchkdet_numconfi_16;
	}
	public float getEjchkdet_numconfi_17() {
		return ejchkdet_numconfi_17;
	}
	public void setEjchkdet_numconfi_17(float ejchkdet_numconfi_17) {
		this.ejchkdet_numconfi_17 = ejchkdet_numconfi_17;
	}
	public float getEjchkdet_numconfi_18() {
		return ejchkdet_numconfi_18;
	}
	public void setEjchkdet_numconfi_18(float ejchkdet_numconfi_18) {
		this.ejchkdet_numconfi_18 = ejchkdet_numconfi_18;
	}
	public float getEjchkdet_numconfi_19() {
		return ejchkdet_numconfi_19;
	}
	public void setEjchkdet_numconfi_19(float ejchkdet_numconfi_19) {
		this.ejchkdet_numconfi_19 = ejchkdet_numconfi_19;
	}
	public float getEjchkdet_numconfi_20() {
		return ejchkdet_numconfi_20;
	}
	public void setEjchkdet_numconfi_20(float ejchkdet_numconfi_20) {
		this.ejchkdet_numconfi_20 = ejchkdet_numconfi_20;
	}
	public float getEjchkdet_numconfi_21() {
		return ejchkdet_numconfi_21;
	}
	public void setEjchkdet_numconfi_21(float ejchkdet_numconfi_21) {
		this.ejchkdet_numconfi_21 = ejchkdet_numconfi_21;
	}
	public float getEjchkdet_numconfi_22() {
		return ejchkdet_numconfi_22;
	}
	public void setEjchkdet_numconfi_22(float ejchkdet_numconfi_22) {
		this.ejchkdet_numconfi_22 = ejchkdet_numconfi_22;
	}
	public float getEjchkdet_numconfi_23() {
		return ejchkdet_numconfi_23;
	}
	public void setEjchkdet_numconfi_23(float ejchkdet_numconfi_23) {
		this.ejchkdet_numconfi_23 = ejchkdet_numconfi_23;
	}
	public float getEjchkdet_numconfi_24() {
		return ejchkdet_numconfi_24;
	}
	public void setEjchkdet_numconfi_24(float ejchkdet_numconfi_24) {
		this.ejchkdet_numconfi_24 = ejchkdet_numconfi_24;
	}
	public float getEjchkdet_numconfi_25() {
		return ejchkdet_numconfi_25;
	}
	public void setEjchkdet_numconfi_25(float ejchkdet_numconfi_25) {
		this.ejchkdet_numconfi_25 = ejchkdet_numconfi_25;
	}
	public float getEjchkdet_amtred_1() {
		return ejchkdet_amtred_1;
	}
	public void setEjchkdet_amtred_1(float ejchkdet_amtred_1) {
		this.ejchkdet_amtred_1 = ejchkdet_amtred_1;
	}
	public float getEjchkdet_amtred_2() {
		return ejchkdet_amtred_2;
	}
	public void setEjchkdet_amtred_2(float ejchkdet_amtred_2) {
		this.ejchkdet_amtred_2 = ejchkdet_amtred_2;
	}
	public float getEjchkdet_amtred_3() {
		return ejchkdet_amtred_3;
	}
	public void setEjchkdet_amtred_3(float ejchkdet_amtred_3) {
		this.ejchkdet_amtred_3 = ejchkdet_amtred_3;
	}
	public float getEjchkdet_amtred_4() {
		return ejchkdet_amtred_4;
	}
	public void setEjchkdet_amtred_4(float ejchkdet_amtred_4) {
		this.ejchkdet_amtred_4 = ejchkdet_amtred_4;
	}
	public float getEjchkdet_amtred_5() {
		return ejchkdet_amtred_5;
	}
	public void setEjchkdet_amtred_5(float ejchkdet_amtred_5) {
		this.ejchkdet_amtred_5 = ejchkdet_amtred_5;
	}
	public float getEjchkdet_amtred_6() {
		return ejchkdet_amtred_6;
	}
	public void setEjchkdet_amtred_6(float ejchkdet_amtred_6) {
		this.ejchkdet_amtred_6 = ejchkdet_amtred_6;
	}
	public float getEjchkdet_amtred_7() {
		return ejchkdet_amtred_7;
	}
	public void setEjchkdet_amtred_7(float ejchkdet_amtred_7) {
		this.ejchkdet_amtred_7 = ejchkdet_amtred_7;
	}
	public float getEjchkdet_amtred_8() {
		return ejchkdet_amtred_8;
	}
	public void setEjchkdet_amtred_8(float ejchkdet_amtred_8) {
		this.ejchkdet_amtred_8 = ejchkdet_amtred_8;
	}
	public float getEjchkdet_amtred_9() {
		return ejchkdet_amtred_9;
	}
	public void setEjchkdet_amtred_9(float ejchkdet_amtred_9) {
		this.ejchkdet_amtred_9 = ejchkdet_amtred_9;
	}
	public float getEjchkdet_amtred_10() {
		return ejchkdet_amtred_10;
	}
	public void setEjchkdet_amtred_10(float ejchkdet_amtred_10) {
		this.ejchkdet_amtred_10 = ejchkdet_amtred_10;
	}
	public float getEjchkdet_amtred_11() {
		return ejchkdet_amtred_11;
	}
	public void setEjchkdet_amtred_11(float ejchkdet_amtred_11) {
		this.ejchkdet_amtred_11 = ejchkdet_amtred_11;
	}
	public float getEjchkdet_amtred_12() {
		return ejchkdet_amtred_12;
	}
	public void setEjchkdet_amtred_12(float ejchkdet_amtred_12) {
		this.ejchkdet_amtred_12 = ejchkdet_amtred_12;
	}
	public float getEjchkdet_amtred_13() {
		return ejchkdet_amtred_13;
	}
	public void setEjchkdet_amtred_13(float ejchkdet_amtred_13) {
		this.ejchkdet_amtred_13 = ejchkdet_amtred_13;
	}
	public float getEjchkdet_amtred_14() {
		return ejchkdet_amtred_14;
	}
	public void setEjchkdet_amtred_14(float ejchkdet_amtred_14) {
		this.ejchkdet_amtred_14 = ejchkdet_amtred_14;
	}
	public float getEjchkdet_amtred_15() {
		return ejchkdet_amtred_15;
	}
	public void setEjchkdet_amtred_15(float ejchkdet_amtred_15) {
		this.ejchkdet_amtred_15 = ejchkdet_amtred_15;
	}
	public float getEjchkdet_amtred_16() {
		return ejchkdet_amtred_16;
	}
	public void setEjchkdet_amtred_16(float ejchkdet_amtred_16) {
		this.ejchkdet_amtred_16 = ejchkdet_amtred_16;
	}
	public float getEjchkdet_amtred_17() {
		return ejchkdet_amtred_17;
	}
	public void setEjchkdet_amtred_17(float ejchkdet_amtred_17) {
		this.ejchkdet_amtred_17 = ejchkdet_amtred_17;
	}
	public float getEjchkdet_amtred_18() {
		return ejchkdet_amtred_18;
	}
	public void setEjchkdet_amtred_18(float ejchkdet_amtred_18) {
		this.ejchkdet_amtred_18 = ejchkdet_amtred_18;
	}
	public float getEjchkdet_amtred_19() {
		return ejchkdet_amtred_19;
	}
	public void setEjchkdet_amtred_19(float ejchkdet_amtred_19) {
		this.ejchkdet_amtred_19 = ejchkdet_amtred_19;
	}
	public float getEjchkdet_amtred_20() {
		return ejchkdet_amtred_20;
	}
	public void setEjchkdet_amtred_20(float ejchkdet_amtred_20) {
		this.ejchkdet_amtred_20 = ejchkdet_amtred_20;
	}
	public float getEjchkdet_amtred_21() {
		return ejchkdet_amtred_21;
	}
	public void setEjchkdet_amtred_21(float ejchkdet_amtred_21) {
		this.ejchkdet_amtred_21 = ejchkdet_amtred_21;
	}
	public float getEjchkdet_amtred_22() {
		return ejchkdet_amtred_22;
	}
	public void setEjchkdet_amtred_22(float ejchkdet_amtred_22) {
		this.ejchkdet_amtred_22 = ejchkdet_amtred_22;
	}
	public float getEjchkdet_amtred_23() {
		return ejchkdet_amtred_23;
	}
	public void setEjchkdet_amtred_23(float ejchkdet_amtred_23) {
		this.ejchkdet_amtred_23 = ejchkdet_amtred_23;
	}
	public float getEjchkdet_amtred_24() {
		return ejchkdet_amtred_24;
	}
	public void setEjchkdet_amtred_24(float ejchkdet_amtred_24) {
		this.ejchkdet_amtred_24 = ejchkdet_amtred_24;
	}
	public float getEjchkdet_amtred_25() {
		return ejchkdet_amtred_25;
	}
	public void setEjchkdet_amtred_25(float ejchkdet_amtred_25) {
		this.ejchkdet_amtred_25 = ejchkdet_amtred_25;
	}
	public String getEjchkdet_iqapass_1() {
		return ejchkdet_iqapass_1;
	}
	public void setEjchkdet_iqapass_1(String ejchkdet_iqapass_1) {
		this.ejchkdet_iqapass_1 = ejchkdet_iqapass_1;
	}
	public String getEjchkdet_iqapass_2() {
		return ejchkdet_iqapass_2;
	}
	public void setEjchkdet_iqapass_2(String ejchkdet_iqapass_2) {
		this.ejchkdet_iqapass_2 = ejchkdet_iqapass_2;
	}
	public String getEjchkdet_iqapass_3() {
		return ejchkdet_iqapass_3;
	}
	public void setEjchkdet_iqapass_3(String ejchkdet_iqapass_3) {
		this.ejchkdet_iqapass_3 = ejchkdet_iqapass_3;
	}
	public String getEjchkdet_iqapass_4() {
		return ejchkdet_iqapass_4;
	}
	public void setEjchkdet_iqapass_4(String ejchkdet_iqapass_4) {
		this.ejchkdet_iqapass_4 = ejchkdet_iqapass_4;
	}
	public String getEjchkdet_iqapass_5() {
		return ejchkdet_iqapass_5;
	}
	public void setEjchkdet_iqapass_5(String ejchkdet_iqapass_5) {
		this.ejchkdet_iqapass_5 = ejchkdet_iqapass_5;
	}
	public String getEjchkdet_iqapass_6() {
		return ejchkdet_iqapass_6;
	}
	public void setEjchkdet_iqapass_6(String ejchkdet_iqapass_6) {
		this.ejchkdet_iqapass_6 = ejchkdet_iqapass_6;
	}
	public String getEjchkdet_iqapass_7() {
		return ejchkdet_iqapass_7;
	}
	public void setEjchkdet_iqapass_7(String ejchkdet_iqapass_7) {
		this.ejchkdet_iqapass_7 = ejchkdet_iqapass_7;
	}
	public String getEjchkdet_iqapass_8() {
		return ejchkdet_iqapass_8;
	}
	public void setEjchkdet_iqapass_8(String ejchkdet_iqapass_8) {
		this.ejchkdet_iqapass_8 = ejchkdet_iqapass_8;
	}
	public String getEjchkdet_iqapass_9() {
		return ejchkdet_iqapass_9;
	}
	public void setEjchkdet_iqapass_9(String ejchkdet_iqapass_9) {
		this.ejchkdet_iqapass_9 = ejchkdet_iqapass_9;
	}
	public String getEjchkdet_iqapass_10() {
		return ejchkdet_iqapass_10;
	}
	public void setEjchkdet_iqapass_10(String ejchkdet_iqapass_10) {
		this.ejchkdet_iqapass_10 = ejchkdet_iqapass_10;
	}
	public String getEjchkdet_iqapass_11() {
		return ejchkdet_iqapass_11;
	}
	public void setEjchkdet_iqapass_11(String ejchkdet_iqapass_11) {
		this.ejchkdet_iqapass_11 = ejchkdet_iqapass_11;
	}
	public String getEjchkdet_iqapass_12() {
		return ejchkdet_iqapass_12;
	}
	public void setEjchkdet_iqapass_12(String ejchkdet_iqapass_12) {
		this.ejchkdet_iqapass_12 = ejchkdet_iqapass_12;
	}
	public String getEjchkdet_iqapass_13() {
		return ejchkdet_iqapass_13;
	}
	public void setEjchkdet_iqapass_13(String ejchkdet_iqapass_13) {
		this.ejchkdet_iqapass_13 = ejchkdet_iqapass_13;
	}
	public String getEjchkdet_iqapass_14() {
		return ejchkdet_iqapass_14;
	}
	public void setEjchkdet_iqapass_14(String ejchkdet_iqapass_14) {
		this.ejchkdet_iqapass_14 = ejchkdet_iqapass_14;
	}
	public String getEjchkdet_iqapass_15() {
		return ejchkdet_iqapass_15;
	}
	public void setEjchkdet_iqapass_15(String ejchkdet_iqapass_15) {
		this.ejchkdet_iqapass_15 = ejchkdet_iqapass_15;
	}
	public String getEjchkdet_iqapass_16() {
		return ejchkdet_iqapass_16;
	}
	public void setEjchkdet_iqapass_16(String ejchkdet_iqapass_16) {
		this.ejchkdet_iqapass_16 = ejchkdet_iqapass_16;
	}
	public String getEjchkdet_iqapass_17() {
		return ejchkdet_iqapass_17;
	}
	public void setEjchkdet_iqapass_17(String ejchkdet_iqapass_17) {
		this.ejchkdet_iqapass_17 = ejchkdet_iqapass_17;
	}
	public String getEjchkdet_iqapass_18() {
		return ejchkdet_iqapass_18;
	}
	public void setEjchkdet_iqapass_18(String ejchkdet_iqapass_18) {
		this.ejchkdet_iqapass_18 = ejchkdet_iqapass_18;
	}
	public String getEjchkdet_iqapass_19() {
		return ejchkdet_iqapass_19;
	}
	public void setEjchkdet_iqapass_19(String ejchkdet_iqapass_19) {
		this.ejchkdet_iqapass_19 = ejchkdet_iqapass_19;
	}
	public String getEjchkdet_iqapass_20() {
		return ejchkdet_iqapass_20;
	}
	public void setEjchkdet_iqapass_20(String ejchkdet_iqapass_20) {
		this.ejchkdet_iqapass_20 = ejchkdet_iqapass_20;
	}
	public String getEjchkdet_iqapass_21() {
		return ejchkdet_iqapass_21;
	}
	public void setEjchkdet_iqapass_21(String ejchkdet_iqapass_21) {
		this.ejchkdet_iqapass_21 = ejchkdet_iqapass_21;
	}
	public String getEjchkdet_iqapass_22() {
		return ejchkdet_iqapass_22;
	}
	public void setEjchkdet_iqapass_22(String ejchkdet_iqapass_22) {
		this.ejchkdet_iqapass_22 = ejchkdet_iqapass_22;
	}
	public String getEjchkdet_iqapass_23() {
		return ejchkdet_iqapass_23;
	}
	public void setEjchkdet_iqapass_23(String ejchkdet_iqapass_23) {
		this.ejchkdet_iqapass_23 = ejchkdet_iqapass_23;
	}
	public String getEjchkdet_iqapass_24() {
		return ejchkdet_iqapass_24;
	}
	public void setEjchkdet_iqapass_24(String ejchkdet_iqapass_24) {
		this.ejchkdet_iqapass_24 = ejchkdet_iqapass_24;
	}
	public String getEjchkdet_iqapass_25() {
		return ejchkdet_iqapass_25;
	}
	public void setEjchkdet_iqapass_25(String ejchkdet_iqapass_25) {
		this.ejchkdet_iqapass_25 = ejchkdet_iqapass_25;
	}
	public String getEjchkdet_scnerror_1() {
		return ejchkdet_scnerror_1;
	}
	public void setEjchkdet_scnerror_1(String ejchkdet_scnerror_1) {
		this.ejchkdet_scnerror_1 = ejchkdet_scnerror_1;
	}
	public String getEjchkdet_scnerror_2() {
		return ejchkdet_scnerror_2;
	}
	public void setEjchkdet_scnerror_2(String ejchkdet_scnerror_2) {
		this.ejchkdet_scnerror_2 = ejchkdet_scnerror_2;
	}
	public String getEjchkdet_scnerror_3() {
		return ejchkdet_scnerror_3;
	}
	public void setEjchkdet_scnerror_3(String ejchkdet_scnerror_3) {
		this.ejchkdet_scnerror_3 = ejchkdet_scnerror_3;
	}
	public String getEjchkdet_scnerror_4() {
		return ejchkdet_scnerror_4;
	}
	public void setEjchkdet_scnerror_4(String ejchkdet_scnerror_4) {
		this.ejchkdet_scnerror_4 = ejchkdet_scnerror_4;
	}
	public String getEjchkdet_scnerror_5() {
		return ejchkdet_scnerror_5;
	}
	public void setEjchkdet_scnerror_5(String ejchkdet_scnerror_5) {
		this.ejchkdet_scnerror_5 = ejchkdet_scnerror_5;
	}
	public String getEjchkdet_scnerror_6() {
		return ejchkdet_scnerror_6;
	}
	public void setEjchkdet_scnerror_6(String ejchkdet_scnerror_6) {
		this.ejchkdet_scnerror_6 = ejchkdet_scnerror_6;
	}
	public String getEjchkdet_scnerror_7() {
		return ejchkdet_scnerror_7;
	}
	public void setEjchkdet_scnerror_7(String ejchkdet_scnerror_7) {
		this.ejchkdet_scnerror_7 = ejchkdet_scnerror_7;
	}
	public String getEjchkdet_scnerror_8() {
		return ejchkdet_scnerror_8;
	}
	public void setEjchkdet_scnerror_8(String ejchkdet_scnerror_8) {
		this.ejchkdet_scnerror_8 = ejchkdet_scnerror_8;
	}
	public String getEjchkdet_scnerror_9() {
		return ejchkdet_scnerror_9;
	}
	public void setEjchkdet_scnerror_9(String ejchkdet_scnerror_9) {
		this.ejchkdet_scnerror_9 = ejchkdet_scnerror_9;
	}
	public String getEjchkdet_scnerror_10() {
		return ejchkdet_scnerror_10;
	}
	public void setEjchkdet_scnerror_10(String ejchkdet_scnerror_10) {
		this.ejchkdet_scnerror_10 = ejchkdet_scnerror_10;
	}
	public String getEjchkdet_scnerror_11() {
		return ejchkdet_scnerror_11;
	}
	public void setEjchkdet_scnerror_11(String ejchkdet_scnerror_11) {
		this.ejchkdet_scnerror_11 = ejchkdet_scnerror_11;
	}
	public String getEjchkdet_scnerror_12() {
		return ejchkdet_scnerror_12;
	}
	public void setEjchkdet_scnerror_12(String ejchkdet_scnerror_12) {
		this.ejchkdet_scnerror_12 = ejchkdet_scnerror_12;
	}
	public String getEjchkdet_scnerror_13() {
		return ejchkdet_scnerror_13;
	}
	public void setEjchkdet_scnerror_13(String ejchkdet_scnerror_13) {
		this.ejchkdet_scnerror_13 = ejchkdet_scnerror_13;
	}
	public String getEjchkdet_scnerror_14() {
		return ejchkdet_scnerror_14;
	}
	public void setEjchkdet_scnerror_14(String ejchkdet_scnerror_14) {
		this.ejchkdet_scnerror_14 = ejchkdet_scnerror_14;
	}
	public String getEjchkdet_scnerror_15() {
		return ejchkdet_scnerror_15;
	}
	public void setEjchkdet_scnerror_15(String ejchkdet_scnerror_15) {
		this.ejchkdet_scnerror_15 = ejchkdet_scnerror_15;
	}
	public String getEjchkdet_scnerror_16() {
		return ejchkdet_scnerror_16;
	}
	public void setEjchkdet_scnerror_16(String ejchkdet_scnerror_16) {
		this.ejchkdet_scnerror_16 = ejchkdet_scnerror_16;
	}
	public String getEjchkdet_scnerror_17() {
		return ejchkdet_scnerror_17;
	}
	public void setEjchkdet_scnerror_17(String ejchkdet_scnerror_17) {
		this.ejchkdet_scnerror_17 = ejchkdet_scnerror_17;
	}
	public String getEjchkdet_scnerror_18() {
		return ejchkdet_scnerror_18;
	}
	public void setEjchkdet_scnerror_18(String ejchkdet_scnerror_18) {
		this.ejchkdet_scnerror_18 = ejchkdet_scnerror_18;
	}
	public String getEjchkdet_scnerror_19() {
		return ejchkdet_scnerror_19;
	}
	public void setEjchkdet_scnerror_19(String ejchkdet_scnerror_19) {
		this.ejchkdet_scnerror_19 = ejchkdet_scnerror_19;
	}
	public String getEjchkdet_scnerror_20() {
		return ejchkdet_scnerror_20;
	}
	public void setEjchkdet_scnerror_20(String ejchkdet_scnerror_20) {
		this.ejchkdet_scnerror_20 = ejchkdet_scnerror_20;
	}
	public String getEjchkdet_scnerror_21() {
		return ejchkdet_scnerror_21;
	}
	public void setEjchkdet_scnerror_21(String ejchkdet_scnerror_21) {
		this.ejchkdet_scnerror_21 = ejchkdet_scnerror_21;
	}
	public String getEjchkdet_scnerror_22() {
		return ejchkdet_scnerror_22;
	}
	public void setEjchkdet_scnerror_22(String ejchkdet_scnerror_22) {
		this.ejchkdet_scnerror_22 = ejchkdet_scnerror_22;
	}
	public String getEjchkdet_scnerror_23() {
		return ejchkdet_scnerror_23;
	}
	public void setEjchkdet_scnerror_23(String ejchkdet_scnerror_23) {
		this.ejchkdet_scnerror_23 = ejchkdet_scnerror_23;
	}
	public String getEjchkdet_scnerror_24() {
		return ejchkdet_scnerror_24;
	}
	public void setEjchkdet_scnerror_24(String ejchkdet_scnerror_24) {
		this.ejchkdet_scnerror_24 = ejchkdet_scnerror_24;
	}
	public String getEjchkdet_scnerror_25() {
		return ejchkdet_scnerror_25;
	}
	public void setEjchkdet_scnerror_25(String ejchkdet_scnerror_25) {
		this.ejchkdet_scnerror_25 = ejchkdet_scnerror_25;
	}
	public String getEjchkdet_actionuc_1() {
		return ejchkdet_actionuc_1;
	}
	public void setEjchkdet_actionuc_1(String ejchkdet_actionuc_1) {
		this.ejchkdet_actionuc_1 = ejchkdet_actionuc_1;
	}
	public String getEjchkdet_actionuc_2() {
		return ejchkdet_actionuc_2;
	}
	public void setEjchkdet_actionuc_2(String ejchkdet_actionuc_2) {
		this.ejchkdet_actionuc_2 = ejchkdet_actionuc_2;
	}
	public String getEjchkdet_actionuc_3() {
		return ejchkdet_actionuc_3;
	}
	public void setEjchkdet_actionuc_3(String ejchkdet_actionuc_3) {
		this.ejchkdet_actionuc_3 = ejchkdet_actionuc_3;
	}
	public String getEjchkdet_actionuc_4() {
		return ejchkdet_actionuc_4;
	}
	public void setEjchkdet_actionuc_4(String ejchkdet_actionuc_4) {
		this.ejchkdet_actionuc_4 = ejchkdet_actionuc_4;
	}
	public String getEjchkdet_actionuc_5() {
		return ejchkdet_actionuc_5;
	}
	public void setEjchkdet_actionuc_5(String ejchkdet_actionuc_5) {
		this.ejchkdet_actionuc_5 = ejchkdet_actionuc_5;
	}
	public String getEjchkdet_actionuc_6() {
		return ejchkdet_actionuc_6;
	}
	public void setEjchkdet_actionuc_6(String ejchkdet_actionuc_6) {
		this.ejchkdet_actionuc_6 = ejchkdet_actionuc_6;
	}
	public String getEjchkdet_actionuc_7() {
		return ejchkdet_actionuc_7;
	}
	public void setEjchkdet_actionuc_7(String ejchkdet_actionuc_7) {
		this.ejchkdet_actionuc_7 = ejchkdet_actionuc_7;
	}
	public String getEjchkdet_actionuc_8() {
		return ejchkdet_actionuc_8;
	}
	public void setEjchkdet_actionuc_8(String ejchkdet_actionuc_8) {
		this.ejchkdet_actionuc_8 = ejchkdet_actionuc_8;
	}
	public String getEjchkdet_actionuc_9() {
		return ejchkdet_actionuc_9;
	}
	public void setEjchkdet_actionuc_9(String ejchkdet_actionuc_9) {
		this.ejchkdet_actionuc_9 = ejchkdet_actionuc_9;
	}
	public String getEjchkdet_actionuc_10() {
		return ejchkdet_actionuc_10;
	}
	public void setEjchkdet_actionuc_10(String ejchkdet_actionuc_10) {
		this.ejchkdet_actionuc_10 = ejchkdet_actionuc_10;
	}
	public String getEjchkdet_actionuc_11() {
		return ejchkdet_actionuc_11;
	}
	public void setEjchkdet_actionuc_11(String ejchkdet_actionuc_11) {
		this.ejchkdet_actionuc_11 = ejchkdet_actionuc_11;
	}
	public String getEjchkdet_actionuc_12() {
		return ejchkdet_actionuc_12;
	}
	public void setEjchkdet_actionuc_12(String ejchkdet_actionuc_12) {
		this.ejchkdet_actionuc_12 = ejchkdet_actionuc_12;
	}
	public String getEjchkdet_actionuc_13() {
		return ejchkdet_actionuc_13;
	}
	public void setEjchkdet_actionuc_13(String ejchkdet_actionuc_13) {
		this.ejchkdet_actionuc_13 = ejchkdet_actionuc_13;
	}
	public String getEjchkdet_actionuc_14() {
		return ejchkdet_actionuc_14;
	}
	public void setEjchkdet_actionuc_14(String ejchkdet_actionuc_14) {
		this.ejchkdet_actionuc_14 = ejchkdet_actionuc_14;
	}
	public String getEjchkdet_actionuc_15() {
		return ejchkdet_actionuc_15;
	}
	public void setEjchkdet_actionuc_15(String ejchkdet_actionuc_15) {
		this.ejchkdet_actionuc_15 = ejchkdet_actionuc_15;
	}
	public String getEjchkdet_actionuc_16() {
		return ejchkdet_actionuc_16;
	}
	public void setEjchkdet_actionuc_16(String ejchkdet_actionuc_16) {
		this.ejchkdet_actionuc_16 = ejchkdet_actionuc_16;
	}
	public String getEjchkdet_actionuc_17() {
		return ejchkdet_actionuc_17;
	}
	public void setEjchkdet_actionuc_17(String ejchkdet_actionuc_17) {
		this.ejchkdet_actionuc_17 = ejchkdet_actionuc_17;
	}
	public String getEjchkdet_actionuc_18() {
		return ejchkdet_actionuc_18;
	}
	public void setEjchkdet_actionuc_18(String ejchkdet_actionuc_18) {
		this.ejchkdet_actionuc_18 = ejchkdet_actionuc_18;
	}
	public String getEjchkdet_actionuc_19() {
		return ejchkdet_actionuc_19;
	}
	public void setEjchkdet_actionuc_19(String ejchkdet_actionuc_19) {
		this.ejchkdet_actionuc_19 = ejchkdet_actionuc_19;
	}
	public String getEjchkdet_actionuc_20() {
		return ejchkdet_actionuc_20;
	}
	public void setEjchkdet_actionuc_20(String ejchkdet_actionuc_20) {
		this.ejchkdet_actionuc_20 = ejchkdet_actionuc_20;
	}
	public String getEjchkdet_actionuc_21() {
		return ejchkdet_actionuc_21;
	}
	public void setEjchkdet_actionuc_21(String ejchkdet_actionuc_21) {
		this.ejchkdet_actionuc_21 = ejchkdet_actionuc_21;
	}
	public String getEjchkdet_actionuc_22() {
		return ejchkdet_actionuc_22;
	}
	public void setEjchkdet_actionuc_22(String ejchkdet_actionuc_22) {
		this.ejchkdet_actionuc_22 = ejchkdet_actionuc_22;
	}
	public String getEjchkdet_actionuc_23() {
		return ejchkdet_actionuc_23;
	}
	public void setEjchkdet_actionuc_23(String ejchkdet_actionuc_23) {
		this.ejchkdet_actionuc_23 = ejchkdet_actionuc_23;
	}
	public String getEjchkdet_actionuc_24() {
		return ejchkdet_actionuc_24;
	}
	public void setEjchkdet_actionuc_24(String ejchkdet_actionuc_24) {
		this.ejchkdet_actionuc_24 = ejchkdet_actionuc_24;
	}
	public String getEjchkdet_actionuc_25() {
		return ejchkdet_actionuc_25;
	}
	public void setEjchkdet_actionuc_25(String ejchkdet_actionuc_25) {
		this.ejchkdet_actionuc_25 = ejchkdet_actionuc_25;
	}
	public float getEjchkdet__curcnt_1() {
		return ejchkdet__curcnt_1;
	}
	public void setEjchkdet__curcnt_1(float ejchkdet__curcnt_1) {
		this.ejchkdet__curcnt_1 = ejchkdet__curcnt_1;
	}
	public float getEjchkdet__curcnt_2() {
		return ejchkdet__curcnt_2;
	}
	public void setEjchkdet__curcnt_2(float ejchkdet__curcnt_2) {
		this.ejchkdet__curcnt_2 = ejchkdet__curcnt_2;
	}
	public float getEjchkdet__curcnt_3() {
		return ejchkdet__curcnt_3;
	}
	public void setEjchkdet__curcnt_3(float ejchkdet__curcnt_3) {
		this.ejchkdet__curcnt_3 = ejchkdet__curcnt_3;
	}
	public float getEjchkdet__curcnt_4() {
		return ejchkdet__curcnt_4;
	}
	public void setEjchkdet__curcnt_4(float ejchkdet__curcnt_4) {
		this.ejchkdet__curcnt_4 = ejchkdet__curcnt_4;
	}
	public float getEjchkdet__curcnt_5() {
		return ejchkdet__curcnt_5;
	}
	public void setEjchkdet__curcnt_5(float ejchkdet__curcnt_5) {
		this.ejchkdet__curcnt_5 = ejchkdet__curcnt_5;
	}
	public float getEjchkdet__curcnt_6() {
		return ejchkdet__curcnt_6;
	}
	public void setEjchkdet__curcnt_6(float ejchkdet__curcnt_6) {
		this.ejchkdet__curcnt_6 = ejchkdet__curcnt_6;
	}
	public float getEjchkdet__curcnt_7() {
		return ejchkdet__curcnt_7;
	}
	public void setEjchkdet__curcnt_7(float ejchkdet__curcnt_7) {
		this.ejchkdet__curcnt_7 = ejchkdet__curcnt_7;
	}
	public float getEjchkdet__curcnt_8() {
		return ejchkdet__curcnt_8;
	}
	public void setEjchkdet__curcnt_8(float ejchkdet__curcnt_8) {
		this.ejchkdet__curcnt_8 = ejchkdet__curcnt_8;
	}
	public float getEjchkdet__curcnt_9() {
		return ejchkdet__curcnt_9;
	}
	public void setEjchkdet__curcnt_9(float ejchkdet__curcnt_9) {
		this.ejchkdet__curcnt_9 = ejchkdet__curcnt_9;
	}
	public float getEjchkdet__curcnt_10() {
		return ejchkdet__curcnt_10;
	}
	public void setEjchkdet__curcnt_10(float ejchkdet__curcnt_10) {
		this.ejchkdet__curcnt_10 = ejchkdet__curcnt_10;
	}
	public float getEjchkdet__curcnt_11() {
		return ejchkdet__curcnt_11;
	}
	public void setEjchkdet__curcnt_11(float ejchkdet__curcnt_11) {
		this.ejchkdet__curcnt_11 = ejchkdet__curcnt_11;
	}
	public float getEjchkdet__curcnt_12() {
		return ejchkdet__curcnt_12;
	}
	public void setEjchkdet__curcnt_12(float ejchkdet__curcnt_12) {
		this.ejchkdet__curcnt_12 = ejchkdet__curcnt_12;
	}
	public float getEjchkdet__curcnt_13() {
		return ejchkdet__curcnt_13;
	}
	public void setEjchkdet__curcnt_13(float ejchkdet__curcnt_13) {
		this.ejchkdet__curcnt_13 = ejchkdet__curcnt_13;
	}
	public float getEjchkdet__curcnt_14() {
		return ejchkdet__curcnt_14;
	}
	public void setEjchkdet__curcnt_14(float ejchkdet__curcnt_14) {
		this.ejchkdet__curcnt_14 = ejchkdet__curcnt_14;
	}
	public float getEjchkdet__curcnt_15() {
		return ejchkdet__curcnt_15;
	}
	public void setEjchkdet__curcnt_15(float ejchkdet__curcnt_15) {
		this.ejchkdet__curcnt_15 = ejchkdet__curcnt_15;
	}
	public float getEjchkdet__curcnt_16() {
		return ejchkdet__curcnt_16;
	}
	public void setEjchkdet__curcnt_16(float ejchkdet__curcnt_16) {
		this.ejchkdet__curcnt_16 = ejchkdet__curcnt_16;
	}
	public float getEjchkdet__curcnt_17() {
		return ejchkdet__curcnt_17;
	}
	public void setEjchkdet__curcnt_17(float ejchkdet__curcnt_17) {
		this.ejchkdet__curcnt_17 = ejchkdet__curcnt_17;
	}
	public float getEjchkdet__curcnt_18() {
		return ejchkdet__curcnt_18;
	}
	public void setEjchkdet__curcnt_18(float ejchkdet__curcnt_18) {
		this.ejchkdet__curcnt_18 = ejchkdet__curcnt_18;
	}
	public float getEjchkdet__curcnt_19() {
		return ejchkdet__curcnt_19;
	}
	public void setEjchkdet__curcnt_19(float ejchkdet__curcnt_19) {
		this.ejchkdet__curcnt_19 = ejchkdet__curcnt_19;
	}
	public float getEjchkdet__curcnt_20() {
		return ejchkdet__curcnt_20;
	}
	public void setEjchkdet__curcnt_20(float ejchkdet__curcnt_20) {
		this.ejchkdet__curcnt_20 = ejchkdet__curcnt_20;
	}
	public float getEjchkdet__curcnt_21() {
		return ejchkdet__curcnt_21;
	}
	public void setEjchkdet__curcnt_21(float ejchkdet__curcnt_21) {
		this.ejchkdet__curcnt_21 = ejchkdet__curcnt_21;
	}
	public float getEjchkdet__curcnt_22() {
		return ejchkdet__curcnt_22;
	}
	public void setEjchkdet__curcnt_22(float ejchkdet__curcnt_22) {
		this.ejchkdet__curcnt_22 = ejchkdet__curcnt_22;
	}
	public float getEjchkdet__curcnt_23() {
		return ejchkdet__curcnt_23;
	}
	public void setEjchkdet__curcnt_23(float ejchkdet__curcnt_23) {
		this.ejchkdet__curcnt_23 = ejchkdet__curcnt_23;
	}
	public float getEjchkdet__curcnt_24() {
		return ejchkdet__curcnt_24;
	}
	public void setEjchkdet__curcnt_24(float ejchkdet__curcnt_24) {
		this.ejchkdet__curcnt_24 = ejchkdet__curcnt_24;
	}
	public float getEjchkdet__curcnt_25() {
		return ejchkdet__curcnt_25;
	}
	public void setEjchkdet__curcnt_25(float ejchkdet__curcnt_25) {
		this.ejchkdet__curcnt_25 = ejchkdet__curcnt_25;
	}
	public float getEjchkdet__curcntb_1() {
		return ejchkdet__curcntb_1;
	}
	public void setEjchkdet__curcntb_1(float ejchkdet__curcntb_1) {
		this.ejchkdet__curcntb_1 = ejchkdet__curcntb_1;
	}
	public float getEjchkdet__curcntb_2() {
		return ejchkdet__curcntb_2;
	}
	public void setEjchkdet__curcntb_2(float ejchkdet__curcntb_2) {
		this.ejchkdet__curcntb_2 = ejchkdet__curcntb_2;
	}
	public float getEjchkdet__curcntb_3() {
		return ejchkdet__curcntb_3;
	}
	public void setEjchkdet__curcntb_3(float ejchkdet__curcntb_3) {
		this.ejchkdet__curcntb_3 = ejchkdet__curcntb_3;
	}
	public float getEjchkdet__curcntb_4() {
		return ejchkdet__curcntb_4;
	}
	public void setEjchkdet__curcntb_4(float ejchkdet__curcntb_4) {
		this.ejchkdet__curcntb_4 = ejchkdet__curcntb_4;
	}
	public float getEjchkdet__curcntb_5() {
		return ejchkdet__curcntb_5;
	}
	public void setEjchkdet__curcntb_5(float ejchkdet__curcntb_5) {
		this.ejchkdet__curcntb_5 = ejchkdet__curcntb_5;
	}
	public float getEjchkdet__curcntb_6() {
		return ejchkdet__curcntb_6;
	}
	public void setEjchkdet__curcntb_6(float ejchkdet__curcntb_6) {
		this.ejchkdet__curcntb_6 = ejchkdet__curcntb_6;
	}
	public float getEjchkdet__curcntb_7() {
		return ejchkdet__curcntb_7;
	}
	public void setEjchkdet__curcntb_7(float ejchkdet__curcntb_7) {
		this.ejchkdet__curcntb_7 = ejchkdet__curcntb_7;
	}
	public float getEjchkdet__curcntb_8() {
		return ejchkdet__curcntb_8;
	}
	public void setEjchkdet__curcntb_8(float ejchkdet__curcntb_8) {
		this.ejchkdet__curcntb_8 = ejchkdet__curcntb_8;
	}
	public float getEjchkdet__curcntb_9() {
		return ejchkdet__curcntb_9;
	}
	public void setEjchkdet__curcntb_9(float ejchkdet__curcntb_9) {
		this.ejchkdet__curcntb_9 = ejchkdet__curcntb_9;
	}
	public float getEjchkdet__curcntb_10() {
		return ejchkdet__curcntb_10;
	}
	public void setEjchkdet__curcntb_10(float ejchkdet__curcntb_10) {
		this.ejchkdet__curcntb_10 = ejchkdet__curcntb_10;
	}
	public float getEjchkdet__curcntb_11() {
		return ejchkdet__curcntb_11;
	}
	public void setEjchkdet__curcntb_11(float ejchkdet__curcntb_11) {
		this.ejchkdet__curcntb_11 = ejchkdet__curcntb_11;
	}
	public float getEjchkdet__curcntb_12() {
		return ejchkdet__curcntb_12;
	}
	public void setEjchkdet__curcntb_12(float ejchkdet__curcntb_12) {
		this.ejchkdet__curcntb_12 = ejchkdet__curcntb_12;
	}
	public float getEjchkdet__curcntb_13() {
		return ejchkdet__curcntb_13;
	}
	public void setEjchkdet__curcntb_13(float ejchkdet__curcntb_13) {
		this.ejchkdet__curcntb_13 = ejchkdet__curcntb_13;
	}
	public float getEjchkdet__curcntb_14() {
		return ejchkdet__curcntb_14;
	}
	public void setEjchkdet__curcntb_14(float ejchkdet__curcntb_14) {
		this.ejchkdet__curcntb_14 = ejchkdet__curcntb_14;
	}
	public float getEjchkdet__curcntb_15() {
		return ejchkdet__curcntb_15;
	}
	public void setEjchkdet__curcntb_15(float ejchkdet__curcntb_15) {
		this.ejchkdet__curcntb_15 = ejchkdet__curcntb_15;
	}
	public float getEjchkdet__curcntb_16() {
		return ejchkdet__curcntb_16;
	}
	public void setEjchkdet__curcntb_16(float ejchkdet__curcntb_16) {
		this.ejchkdet__curcntb_16 = ejchkdet__curcntb_16;
	}
	public float getEjchkdet__curcntb_17() {
		return ejchkdet__curcntb_17;
	}
	public void setEjchkdet__curcntb_17(float ejchkdet__curcntb_17) {
		this.ejchkdet__curcntb_17 = ejchkdet__curcntb_17;
	}
	public float getEjchkdet__curcntb_18() {
		return ejchkdet__curcntb_18;
	}
	public void setEjchkdet__curcntb_18(float ejchkdet__curcntb_18) {
		this.ejchkdet__curcntb_18 = ejchkdet__curcntb_18;
	}
	public float getEjchkdet__curcntb_19() {
		return ejchkdet__curcntb_19;
	}
	public void setEjchkdet__curcntb_19(float ejchkdet__curcntb_19) {
		this.ejchkdet__curcntb_19 = ejchkdet__curcntb_19;
	}
	public float getEjchkdet__curcntb_20() {
		return ejchkdet__curcntb_20;
	}
	public void setEjchkdet__curcntb_20(float ejchkdet__curcntb_20) {
		this.ejchkdet__curcntb_20 = ejchkdet__curcntb_20;
	}
	public float getEjchkdet__curcntb_21() {
		return ejchkdet__curcntb_21;
	}
	public void setEjchkdet__curcntb_21(float ejchkdet__curcntb_21) {
		this.ejchkdet__curcntb_21 = ejchkdet__curcntb_21;
	}
	public float getEjchkdet__curcntb_22() {
		return ejchkdet__curcntb_22;
	}
	public void setEjchkdet__curcntb_22(float ejchkdet__curcntb_22) {
		this.ejchkdet__curcntb_22 = ejchkdet__curcntb_22;
	}
	public float getEjchkdet__curcntb_23() {
		return ejchkdet__curcntb_23;
	}
	public void setEjchkdet__curcntb_23(float ejchkdet__curcntb_23) {
		this.ejchkdet__curcntb_23 = ejchkdet__curcntb_23;
	}
	public float getEjchkdet__curcntb_24() {
		return ejchkdet__curcntb_24;
	}
	public void setEjchkdet__curcntb_24(float ejchkdet__curcntb_24) {
		this.ejchkdet__curcntb_24 = ejchkdet__curcntb_24;
	}
	public float getEjchkdet__curcntb_25() {
		return ejchkdet__curcntb_25;
	}
	public void setEjchkdet__curcntb_25(float ejchkdet__curcntb_25) {
		this.ejchkdet__curcntb_25 = ejchkdet__curcntb_25;
	}
	public float getEjchkdet_docnumb_1() {
		return ejchkdet_docnumb_1;
	}
	public void setEjchkdet_docnumb_1(float ejchkdet_docnumb_1) {
		this.ejchkdet_docnumb_1 = ejchkdet_docnumb_1;
	}
	public float getEjchkdet_docnumb_2() {
		return ejchkdet_docnumb_2;
	}
	public void setEjchkdet_docnumb_2(float ejchkdet_docnumb_2) {
		this.ejchkdet_docnumb_2 = ejchkdet_docnumb_2;
	}
	public float getEjchkdet_docnumb_3() {
		return ejchkdet_docnumb_3;
	}
	public void setEjchkdet_docnumb_3(float ejchkdet_docnumb_3) {
		this.ejchkdet_docnumb_3 = ejchkdet_docnumb_3;
	}
	public float getEjchkdet_docnumb_4() {
		return ejchkdet_docnumb_4;
	}
	public void setEjchkdet_docnumb_4(float ejchkdet_docnumb_4) {
		this.ejchkdet_docnumb_4 = ejchkdet_docnumb_4;
	}
	public float getEjchkdet_docnumb_5() {
		return ejchkdet_docnumb_5;
	}
	public void setEjchkdet_docnumb_5(float ejchkdet_docnumb_5) {
		this.ejchkdet_docnumb_5 = ejchkdet_docnumb_5;
	}
	public float getEjchkdet_docnumb_6() {
		return ejchkdet_docnumb_6;
	}
	public void setEjchkdet_docnumb_6(float ejchkdet_docnumb_6) {
		this.ejchkdet_docnumb_6 = ejchkdet_docnumb_6;
	}
	public float getEjchkdet_docnumb_7() {
		return ejchkdet_docnumb_7;
	}
	public void setEjchkdet_docnumb_7(float ejchkdet_docnumb_7) {
		this.ejchkdet_docnumb_7 = ejchkdet_docnumb_7;
	}
	public float getEjchkdet_docnumb_8() {
		return ejchkdet_docnumb_8;
	}
	public void setEjchkdet_docnumb_8(float ejchkdet_docnumb_8) {
		this.ejchkdet_docnumb_8 = ejchkdet_docnumb_8;
	}
	public float getEjchkdet_docnumb_9() {
		return ejchkdet_docnumb_9;
	}
	public void setEjchkdet_docnumb_9(float ejchkdet_docnumb_9) {
		this.ejchkdet_docnumb_9 = ejchkdet_docnumb_9;
	}
	public float getEjchkdet_docnumb_10() {
		return ejchkdet_docnumb_10;
	}
	public void setEjchkdet_docnumb_10(float ejchkdet_docnumb_10) {
		this.ejchkdet_docnumb_10 = ejchkdet_docnumb_10;
	}
	public float getEjchkdet_docnumb_11() {
		return ejchkdet_docnumb_11;
	}
	public void setEjchkdet_docnumb_11(float ejchkdet_docnumb_11) {
		this.ejchkdet_docnumb_11 = ejchkdet_docnumb_11;
	}
	public float getEjchkdet_docnumb_12() {
		return ejchkdet_docnumb_12;
	}
	public void setEjchkdet_docnumb_12(float ejchkdet_docnumb_12) {
		this.ejchkdet_docnumb_12 = ejchkdet_docnumb_12;
	}
	public float getEjchkdet_docnumb_13() {
		return ejchkdet_docnumb_13;
	}
	public void setEjchkdet_docnumb_13(float ejchkdet_docnumb_13) {
		this.ejchkdet_docnumb_13 = ejchkdet_docnumb_13;
	}
	public float getEjchkdet_docnumb_14() {
		return ejchkdet_docnumb_14;
	}
	public void setEjchkdet_docnumb_14(float ejchkdet_docnumb_14) {
		this.ejchkdet_docnumb_14 = ejchkdet_docnumb_14;
	}
	public float getEjchkdet_docnumb_15() {
		return ejchkdet_docnumb_15;
	}
	public void setEjchkdet_docnumb_15(float ejchkdet_docnumb_15) {
		this.ejchkdet_docnumb_15 = ejchkdet_docnumb_15;
	}
	public float getEjchkdet_docnumb_16() {
		return ejchkdet_docnumb_16;
	}
	public void setEjchkdet_docnumb_16(float ejchkdet_docnumb_16) {
		this.ejchkdet_docnumb_16 = ejchkdet_docnumb_16;
	}
	public float getEjchkdet_docnumb_17() {
		return ejchkdet_docnumb_17;
	}
	public void setEjchkdet_docnumb_17(float ejchkdet_docnumb_17) {
		this.ejchkdet_docnumb_17 = ejchkdet_docnumb_17;
	}
	public float getEjchkdet_docnumb_18() {
		return ejchkdet_docnumb_18;
	}
	public void setEjchkdet_docnumb_18(float ejchkdet_docnumb_18) {
		this.ejchkdet_docnumb_18 = ejchkdet_docnumb_18;
	}
	public float getEjchkdet_docnumb_19() {
		return ejchkdet_docnumb_19;
	}
	public void setEjchkdet_docnumb_19(float ejchkdet_docnumb_19) {
		this.ejchkdet_docnumb_19 = ejchkdet_docnumb_19;
	}
	public float getEjchkdet_docnumb_20() {
		return ejchkdet_docnumb_20;
	}
	public void setEjchkdet_docnumb_20(float ejchkdet_docnumb_20) {
		this.ejchkdet_docnumb_20 = ejchkdet_docnumb_20;
	}
	public float getEjchkdet_docnumb_21() {
		return ejchkdet_docnumb_21;
	}
	public void setEjchkdet_docnumb_21(float ejchkdet_docnumb_21) {
		this.ejchkdet_docnumb_21 = ejchkdet_docnumb_21;
	}
	public float getEjchkdet_docnumb_22() {
		return ejchkdet_docnumb_22;
	}
	public void setEjchkdet_docnumb_22(float ejchkdet_docnumb_22) {
		this.ejchkdet_docnumb_22 = ejchkdet_docnumb_22;
	}
	public float getEjchkdet_docnumb_23() {
		return ejchkdet_docnumb_23;
	}
	public void setEjchkdet_docnumb_23(float ejchkdet_docnumb_23) {
		this.ejchkdet_docnumb_23 = ejchkdet_docnumb_23;
	}
	public float getEjchkdet_docnumb_24() {
		return ejchkdet_docnumb_24;
	}
	public void setEjchkdet_docnumb_24(float ejchkdet_docnumb_24) {
		this.ejchkdet_docnumb_24 = ejchkdet_docnumb_24;
	}
	public float getEjchkdet_docnumb_25() {
		return ejchkdet_docnumb_25;
	}
	public void setEjchkdet_docnumb_25(float ejchkdet_docnumb_25) {
		this.ejchkdet_docnumb_25 = ejchkdet_docnumb_25;
	}
	public String getEjchkdet_crdr_1() {
		return ejchkdet_crdr_1;
	}
	public void setEjchkdet_crdr_1(String ejchkdet_crdr_1) {
		this.ejchkdet_crdr_1 = ejchkdet_crdr_1;
	}
	public String getEjchkdet_crdr_2() {
		return ejchkdet_crdr_2;
	}
	public void setEjchkdet_crdr_2(String ejchkdet_crdr_2) {
		this.ejchkdet_crdr_2 = ejchkdet_crdr_2;
	}
	public String getEjchkdet_crdr_3() {
		return ejchkdet_crdr_3;
	}
	public void setEjchkdet_crdr_3(String ejchkdet_crdr_3) {
		this.ejchkdet_crdr_3 = ejchkdet_crdr_3;
	}
	public String getEjchkdet_crdr_4() {
		return ejchkdet_crdr_4;
	}
	public void setEjchkdet_crdr_4(String ejchkdet_crdr_4) {
		this.ejchkdet_crdr_4 = ejchkdet_crdr_4;
	}
	public String getEjchkdet_crdr_5() {
		return ejchkdet_crdr_5;
	}
	public void setEjchkdet_crdr_5(String ejchkdet_crdr_5) {
		this.ejchkdet_crdr_5 = ejchkdet_crdr_5;
	}
	public String getEjchkdet_crdr_6() {
		return ejchkdet_crdr_6;
	}
	public void setEjchkdet_crdr_6(String ejchkdet_crdr_6) {
		this.ejchkdet_crdr_6 = ejchkdet_crdr_6;
	}
	public String getEjchkdet_crdr_7() {
		return ejchkdet_crdr_7;
	}
	public void setEjchkdet_crdr_7(String ejchkdet_crdr_7) {
		this.ejchkdet_crdr_7 = ejchkdet_crdr_7;
	}
	public String getEjchkdet_crdr_8() {
		return ejchkdet_crdr_8;
	}
	public void setEjchkdet_crdr_8(String ejchkdet_crdr_8) {
		this.ejchkdet_crdr_8 = ejchkdet_crdr_8;
	}
	public String getEjchkdet_crdr_9() {
		return ejchkdet_crdr_9;
	}
	public void setEjchkdet_crdr_9(String ejchkdet_crdr_9) {
		this.ejchkdet_crdr_9 = ejchkdet_crdr_9;
	}
	public String getEjchkdet_crdr_10() {
		return ejchkdet_crdr_10;
	}
	public void setEjchkdet_crdr_10(String ejchkdet_crdr_10) {
		this.ejchkdet_crdr_10 = ejchkdet_crdr_10;
	}
	public String getEjchkdet_crdr_11() {
		return ejchkdet_crdr_11;
	}
	public void setEjchkdet_crdr_11(String ejchkdet_crdr_11) {
		this.ejchkdet_crdr_11 = ejchkdet_crdr_11;
	}
	public String getEjchkdet_crdr_12() {
		return ejchkdet_crdr_12;
	}
	public void setEjchkdet_crdr_12(String ejchkdet_crdr_12) {
		this.ejchkdet_crdr_12 = ejchkdet_crdr_12;
	}
	public String getEjchkdet_crdr_13() {
		return ejchkdet_crdr_13;
	}
	public void setEjchkdet_crdr_13(String ejchkdet_crdr_13) {
		this.ejchkdet_crdr_13 = ejchkdet_crdr_13;
	}
	public String getEjchkdet_crdr_14() {
		return ejchkdet_crdr_14;
	}
	public void setEjchkdet_crdr_14(String ejchkdet_crdr_14) {
		this.ejchkdet_crdr_14 = ejchkdet_crdr_14;
	}
	public String getEjchkdet_crdr_15() {
		return ejchkdet_crdr_15;
	}
	public void setEjchkdet_crdr_15(String ejchkdet_crdr_15) {
		this.ejchkdet_crdr_15 = ejchkdet_crdr_15;
	}
	public String getEjchkdet_crdr_16() {
		return ejchkdet_crdr_16;
	}
	public void setEjchkdet_crdr_16(String ejchkdet_crdr_16) {
		this.ejchkdet_crdr_16 = ejchkdet_crdr_16;
	}
	public String getEjchkdet_crdr_17() {
		return ejchkdet_crdr_17;
	}
	public void setEjchkdet_crdr_17(String ejchkdet_crdr_17) {
		this.ejchkdet_crdr_17 = ejchkdet_crdr_17;
	}
	public String getEjchkdet_crdr_18() {
		return ejchkdet_crdr_18;
	}
	public void setEjchkdet_crdr_18(String ejchkdet_crdr_18) {
		this.ejchkdet_crdr_18 = ejchkdet_crdr_18;
	}
	public String getEjchkdet_crdr_19() {
		return ejchkdet_crdr_19;
	}
	public void setEjchkdet_crdr_19(String ejchkdet_crdr_19) {
		this.ejchkdet_crdr_19 = ejchkdet_crdr_19;
	}
	public String getEjchkdet_crdr_20() {
		return ejchkdet_crdr_20;
	}
	public void setEjchkdet_crdr_20(String ejchkdet_crdr_20) {
		this.ejchkdet_crdr_20 = ejchkdet_crdr_20;
	}
	public String getEjchkdet_crdr_21() {
		return ejchkdet_crdr_21;
	}
	public void setEjchkdet_crdr_21(String ejchkdet_crdr_21) {
		this.ejchkdet_crdr_21 = ejchkdet_crdr_21;
	}
	public String getEjchkdet_crdr_22() {
		return ejchkdet_crdr_22;
	}
	public void setEjchkdet_crdr_22(String ejchkdet_crdr_22) {
		this.ejchkdet_crdr_22 = ejchkdet_crdr_22;
	}
	public String getEjchkdet_crdr_23() {
		return ejchkdet_crdr_23;
	}
	public void setEjchkdet_crdr_23(String ejchkdet_crdr_23) {
		this.ejchkdet_crdr_23 = ejchkdet_crdr_23;
	}
	public String getEjchkdet_crdr_24() {
		return ejchkdet_crdr_24;
	}
	public void setEjchkdet_crdr_24(String ejchkdet_crdr_24) {
		this.ejchkdet_crdr_24 = ejchkdet_crdr_24;
	}
	public String getEjchkdet_crdr_25() {
		return ejchkdet_crdr_25;
	}
	public void setEjchkdet_crdr_25(String ejchkdet_crdr_25) {
		this.ejchkdet_crdr_25 = ejchkdet_crdr_25;
	}
	public float getEjchkdet_num002_1() {
		return ejchkdet_num002_1;
	}
	public void setEjchkdet_num002_1(float ejchkdet_num002_1) {
		this.ejchkdet_num002_1 = ejchkdet_num002_1;
	}
	public float getEjchkdet_num002_2() {
		return ejchkdet_num002_2;
	}
	public void setEjchkdet_num002_2(float ejchkdet_num002_2) {
		this.ejchkdet_num002_2 = ejchkdet_num002_2;
	}
	public String getEjchkdet_tc_1() {
		return ejchkdet_tc_1;
	}
	public void setEjchkdet_tc_1(String ejchkdet_tc_1) {
		this.ejchkdet_tc_1 = ejchkdet_tc_1;
	}
	public String getEjchkdet_tc_2() {
		return ejchkdet_tc_2;
	}
	public void setEjchkdet_tc_2(String ejchkdet_tc_2) {
		this.ejchkdet_tc_2 = ejchkdet_tc_2;
	}
	public String getEjchkdet_tc_3() {
		return ejchkdet_tc_3;
	}
	public void setEjchkdet_tc_3(String ejchkdet_tc_3) {
		this.ejchkdet_tc_3 = ejchkdet_tc_3;
	}
	public String getEjchkdet_tc_4() {
		return ejchkdet_tc_4;
	}
	public void setEjchkdet_tc_4(String ejchkdet_tc_4) {
		this.ejchkdet_tc_4 = ejchkdet_tc_4;
	}
	public String getEjchkdet_tc_5() {
		return ejchkdet_tc_5;
	}
	public void setEjchkdet_tc_5(String ejchkdet_tc_5) {
		this.ejchkdet_tc_5 = ejchkdet_tc_5;
	}
	public String getEjchkdet_tc_6() {
		return ejchkdet_tc_6;
	}
	public void setEjchkdet_tc_6(String ejchkdet_tc_6) {
		this.ejchkdet_tc_6 = ejchkdet_tc_6;
	}
	public String getEjchkdet_tc_7() {
		return ejchkdet_tc_7;
	}
	public void setEjchkdet_tc_7(String ejchkdet_tc_7) {
		this.ejchkdet_tc_7 = ejchkdet_tc_7;
	}
	public String getEjchkdet_tc_8() {
		return ejchkdet_tc_8;
	}
	public void setEjchkdet_tc_8(String ejchkdet_tc_8) {
		this.ejchkdet_tc_8 = ejchkdet_tc_8;
	}
	public String getEjchkdet_tc_9() {
		return ejchkdet_tc_9;
	}
	public void setEjchkdet_tc_9(String ejchkdet_tc_9) {
		this.ejchkdet_tc_9 = ejchkdet_tc_9;
	}
	public String getEjchkdet_tc_10() {
		return ejchkdet_tc_10;
	}
	public void setEjchkdet_tc_10(String ejchkdet_tc_10) {
		this.ejchkdet_tc_10 = ejchkdet_tc_10;
	}
	public String getEjchkdet_tc_11() {
		return ejchkdet_tc_11;
	}
	public void setEjchkdet_tc_11(String ejchkdet_tc_11) {
		this.ejchkdet_tc_11 = ejchkdet_tc_11;
	}
	public String getEjchkdet_tc_12() {
		return ejchkdet_tc_12;
	}
	public void setEjchkdet_tc_12(String ejchkdet_tc_12) {
		this.ejchkdet_tc_12 = ejchkdet_tc_12;
	}
	public String getEjchkdet_tc_13() {
		return ejchkdet_tc_13;
	}
	public void setEjchkdet_tc_13(String ejchkdet_tc_13) {
		this.ejchkdet_tc_13 = ejchkdet_tc_13;
	}
	public String getEjchkdet_tc_14() {
		return ejchkdet_tc_14;
	}
	public void setEjchkdet_tc_14(String ejchkdet_tc_14) {
		this.ejchkdet_tc_14 = ejchkdet_tc_14;
	}
	public String getEjchkdet_tc_15() {
		return ejchkdet_tc_15;
	}
	public void setEjchkdet_tc_15(String ejchkdet_tc_15) {
		this.ejchkdet_tc_15 = ejchkdet_tc_15;
	}
	public String getEjchkdet_tc_16() {
		return ejchkdet_tc_16;
	}
	public void setEjchkdet_tc_16(String ejchkdet_tc_16) {
		this.ejchkdet_tc_16 = ejchkdet_tc_16;
	}
	public String getEjchkdet_tc_17() {
		return ejchkdet_tc_17;
	}
	public void setEjchkdet_tc_17(String ejchkdet_tc_17) {
		this.ejchkdet_tc_17 = ejchkdet_tc_17;
	}
	public String getEjchkdet_tc_18() {
		return ejchkdet_tc_18;
	}
	public void setEjchkdet_tc_18(String ejchkdet_tc_18) {
		this.ejchkdet_tc_18 = ejchkdet_tc_18;
	}
	public String getEjchkdet_tc_19() {
		return ejchkdet_tc_19;
	}
	public void setEjchkdet_tc_19(String ejchkdet_tc_19) {
		this.ejchkdet_tc_19 = ejchkdet_tc_19;
	}
	public String getEjchkdet_tc_20() {
		return ejchkdet_tc_20;
	}
	public void setEjchkdet_tc_20(String ejchkdet_tc_20) {
		this.ejchkdet_tc_20 = ejchkdet_tc_20;
	}
	public String getEjchkdet_tc_21() {
		return ejchkdet_tc_21;
	}
	public void setEjchkdet_tc_21(String ejchkdet_tc_21) {
		this.ejchkdet_tc_21 = ejchkdet_tc_21;
	}
	public String getEjchkdet_tc_22() {
		return ejchkdet_tc_22;
	}
	public void setEjchkdet_tc_22(String ejchkdet_tc_22) {
		this.ejchkdet_tc_22 = ejchkdet_tc_22;
	}
	public String getEjchkdet_tc_23() {
		return ejchkdet_tc_23;
	}
	public void setEjchkdet_tc_23(String ejchkdet_tc_23) {
		this.ejchkdet_tc_23 = ejchkdet_tc_23;
	}
	public String getEjchkdet_tc_24() {
		return ejchkdet_tc_24;
	}
	public void setEjchkdet_tc_24(String ejchkdet_tc_24) {
		this.ejchkdet_tc_24 = ejchkdet_tc_24;
	}
	public String getEjchkdet_tc_25() {
		return ejchkdet_tc_25;
	}
	public void setEjchkdet_tc_25(String ejchkdet_tc_25) {
		this.ejchkdet_tc_25 = ejchkdet_tc_25;
	}
	public String getEjchkdet_char004_1() {
		return ejchkdet_char004_1;
	}
	public void setEjchkdet_char004_1(String ejchkdet_char004_1) {
		this.ejchkdet_char004_1 = ejchkdet_char004_1;
	}
	public String getEjchkdet_char004_2() {
		return ejchkdet_char004_2;
	}
	public void setEjchkdet_char004_2(String ejchkdet_char004_2) {
		this.ejchkdet_char004_2 = ejchkdet_char004_2;
	}
	public String getEjchkdet_char004_3() {
		return ejchkdet_char004_3;
	}
	public void setEjchkdet_char004_3(String ejchkdet_char004_3) {
		this.ejchkdet_char004_3 = ejchkdet_char004_3;
	}
	public String getEjchkdet_char004_4() {
		return ejchkdet_char004_4;
	}
	public void setEjchkdet_char004_4(String ejchkdet_char004_4) {
		this.ejchkdet_char004_4 = ejchkdet_char004_4;
	}
	public String getEjchkdet_char004_5() {
		return ejchkdet_char004_5;
	}
	public void setEjchkdet_char004_5(String ejchkdet_char004_5) {
		this.ejchkdet_char004_5 = ejchkdet_char004_5;
	}
	public String getEjchkdet_char004_6() {
		return ejchkdet_char004_6;
	}
	public void setEjchkdet_char004_6(String ejchkdet_char004_6) {
		this.ejchkdet_char004_6 = ejchkdet_char004_6;
	}
	public String getEjchkdet_char004_7() {
		return ejchkdet_char004_7;
	}
	public void setEjchkdet_char004_7(String ejchkdet_char004_7) {
		this.ejchkdet_char004_7 = ejchkdet_char004_7;
	}
	public String getEjchkdet_char004_8() {
		return ejchkdet_char004_8;
	}
	public void setEjchkdet_char004_8(String ejchkdet_char004_8) {
		this.ejchkdet_char004_8 = ejchkdet_char004_8;
	}
	public String getEjchkdet_char004_9() {
		return ejchkdet_char004_9;
	}
	public void setEjchkdet_char004_9(String ejchkdet_char004_9) {
		this.ejchkdet_char004_9 = ejchkdet_char004_9;
	}
	public String getEjchkdet_char004_10() {
		return ejchkdet_char004_10;
	}
	public void setEjchkdet_char004_10(String ejchkdet_char004_10) {
		this.ejchkdet_char004_10 = ejchkdet_char004_10;
	}
	public String getEjchkdet_char004_11() {
		return ejchkdet_char004_11;
	}
	public void setEjchkdet_char004_11(String ejchkdet_char004_11) {
		this.ejchkdet_char004_11 = ejchkdet_char004_11;
	}
	public String getEjchkdet_char004_12() {
		return ejchkdet_char004_12;
	}
	public void setEjchkdet_char004_12(String ejchkdet_char004_12) {
		this.ejchkdet_char004_12 = ejchkdet_char004_12;
	}
	public String getEjchkdet_char004_13() {
		return ejchkdet_char004_13;
	}
	public void setEjchkdet_char004_13(String ejchkdet_char004_13) {
		this.ejchkdet_char004_13 = ejchkdet_char004_13;
	}
	public String getEjchkdet_char004_14() {
		return ejchkdet_char004_14;
	}
	public void setEjchkdet_char004_14(String ejchkdet_char004_14) {
		this.ejchkdet_char004_14 = ejchkdet_char004_14;
	}
	public String getEjchkdet_char004_15() {
		return ejchkdet_char004_15;
	}
	public void setEjchkdet_char004_15(String ejchkdet_char004_15) {
		this.ejchkdet_char004_15 = ejchkdet_char004_15;
	}
	public String getEjchkdet_char004_16() {
		return ejchkdet_char004_16;
	}
	public void setEjchkdet_char004_16(String ejchkdet_char004_16) {
		this.ejchkdet_char004_16 = ejchkdet_char004_16;
	}
	public String getEjchkdet_char004_17() {
		return ejchkdet_char004_17;
	}
	public void setEjchkdet_char004_17(String ejchkdet_char004_17) {
		this.ejchkdet_char004_17 = ejchkdet_char004_17;
	}
	public String getEjchkdet_char004_18() {
		return ejchkdet_char004_18;
	}
	public void setEjchkdet_char004_18(String ejchkdet_char004_18) {
		this.ejchkdet_char004_18 = ejchkdet_char004_18;
	}
	public String getEjchkdet_char004_19() {
		return ejchkdet_char004_19;
	}
	public void setEjchkdet_char004_19(String ejchkdet_char004_19) {
		this.ejchkdet_char004_19 = ejchkdet_char004_19;
	}
	public String getEjchkdet_char004_20() {
		return ejchkdet_char004_20;
	}
	public void setEjchkdet_char004_20(String ejchkdet_char004_20) {
		this.ejchkdet_char004_20 = ejchkdet_char004_20;
	}
	public String getEjchkdet_char004_21() {
		return ejchkdet_char004_21;
	}
	public void setEjchkdet_char004_21(String ejchkdet_char004_21) {
		this.ejchkdet_char004_21 = ejchkdet_char004_21;
	}
	public String getEjchkdet_char004_22() {
		return ejchkdet_char004_22;
	}
	public void setEjchkdet_char004_22(String ejchkdet_char004_22) {
		this.ejchkdet_char004_22 = ejchkdet_char004_22;
	}
	public String getEjchkdet_char004_23() {
		return ejchkdet_char004_23;
	}
	public void setEjchkdet_char004_23(String ejchkdet_char004_23) {
		this.ejchkdet_char004_23 = ejchkdet_char004_23;
	}
	public String getEjchkdet_char004_24() {
		return ejchkdet_char004_24;
	}
	public void setEjchkdet_char004_24(String ejchkdet_char004_24) {
		this.ejchkdet_char004_24 = ejchkdet_char004_24;
	}
	public String getEjchkdet_char004_25() {
		return ejchkdet_char004_25;
	}
	public void setEjchkdet_char004_25(String ejchkdet_char004_25) {
		this.ejchkdet_char004_25 = ejchkdet_char004_25;
	}
	public String getEjchkdet_char016_1() {
		return ejchkdet_char016_1;
	}
	public void setEjchkdet_char016_1(String ejchkdet_char016_1) {
		this.ejchkdet_char016_1 = ejchkdet_char016_1;
	}
	public String getEjchkdet_char016_2() {
		return ejchkdet_char016_2;
	}
	public void setEjchkdet_char016_2(String ejchkdet_char016_2) {
		this.ejchkdet_char016_2 = ejchkdet_char016_2;
	}
	public String getEjchkdet_char016_3() {
		return ejchkdet_char016_3;
	}
	public void setEjchkdet_char016_3(String ejchkdet_char016_3) {
		this.ejchkdet_char016_3 = ejchkdet_char016_3;
	}
	public String getEjchkdet_char016_4() {
		return ejchkdet_char016_4;
	}
	public void setEjchkdet_char016_4(String ejchkdet_char016_4) {
		this.ejchkdet_char016_4 = ejchkdet_char016_4;
	}
	public String getEjchkdet_char016_5() {
		return ejchkdet_char016_5;
	}
	public void setEjchkdet_char016_5(String ejchkdet_char016_5) {
		this.ejchkdet_char016_5 = ejchkdet_char016_5;
	}
	public String getEjchkdet_char016_6() {
		return ejchkdet_char016_6;
	}
	public void setEjchkdet_char016_6(String ejchkdet_char016_6) {
		this.ejchkdet_char016_6 = ejchkdet_char016_6;
	}
	public String getEjchkdet_char016_7() {
		return ejchkdet_char016_7;
	}
	public void setEjchkdet_char016_7(String ejchkdet_char016_7) {
		this.ejchkdet_char016_7 = ejchkdet_char016_7;
	}
	public String getEjchkdet_char016_8() {
		return ejchkdet_char016_8;
	}
	public void setEjchkdet_char016_8(String ejchkdet_char016_8) {
		this.ejchkdet_char016_8 = ejchkdet_char016_8;
	}
	public String getEjchkdet_char016_9() {
		return ejchkdet_char016_9;
	}
	public void setEjchkdet_char016_9(String ejchkdet_char016_9) {
		this.ejchkdet_char016_9 = ejchkdet_char016_9;
	}
	public String getEjchkdet_char016_10() {
		return ejchkdet_char016_10;
	}
	public void setEjchkdet_char016_10(String ejchkdet_char016_10) {
		this.ejchkdet_char016_10 = ejchkdet_char016_10;
	}
	public String getEjchkdet_char016_11() {
		return ejchkdet_char016_11;
	}
	public void setEjchkdet_char016_11(String ejchkdet_char016_11) {
		this.ejchkdet_char016_11 = ejchkdet_char016_11;
	}
	public String getEjchkdet_char016_12() {
		return ejchkdet_char016_12;
	}
	public void setEjchkdet_char016_12(String ejchkdet_char016_12) {
		this.ejchkdet_char016_12 = ejchkdet_char016_12;
	}
	public String getEjchkdet_char016_13() {
		return ejchkdet_char016_13;
	}
	public void setEjchkdet_char016_13(String ejchkdet_char016_13) {
		this.ejchkdet_char016_13 = ejchkdet_char016_13;
	}
	public String getEjchkdet_char016_14() {
		return ejchkdet_char016_14;
	}
	public void setEjchkdet_char016_14(String ejchkdet_char016_14) {
		this.ejchkdet_char016_14 = ejchkdet_char016_14;
	}
	public String getEjchkdet_char016_15() {
		return ejchkdet_char016_15;
	}
	public void setEjchkdet_char016_15(String ejchkdet_char016_15) {
		this.ejchkdet_char016_15 = ejchkdet_char016_15;
	}
	public String getEjchkdet_char016_16() {
		return ejchkdet_char016_16;
	}
	public void setEjchkdet_char016_16(String ejchkdet_char016_16) {
		this.ejchkdet_char016_16 = ejchkdet_char016_16;
	}
	public String getEjchkdet_char016_17() {
		return ejchkdet_char016_17;
	}
	public void setEjchkdet_char016_17(String ejchkdet_char016_17) {
		this.ejchkdet_char016_17 = ejchkdet_char016_17;
	}
	public String getEjchkdet_char016_18() {
		return ejchkdet_char016_18;
	}
	public void setEjchkdet_char016_18(String ejchkdet_char016_18) {
		this.ejchkdet_char016_18 = ejchkdet_char016_18;
	}
	public String getEjchkdet_char016_19() {
		return ejchkdet_char016_19;
	}
	public void setEjchkdet_char016_19(String ejchkdet_char016_19) {
		this.ejchkdet_char016_19 = ejchkdet_char016_19;
	}
	public String getEjchkdet_char016_20() {
		return ejchkdet_char016_20;
	}
	public void setEjchkdet_char016_20(String ejchkdet_char016_20) {
		this.ejchkdet_char016_20 = ejchkdet_char016_20;
	}
	public String getEjchkdet_char016_21() {
		return ejchkdet_char016_21;
	}
	public void setEjchkdet_char016_21(String ejchkdet_char016_21) {
		this.ejchkdet_char016_21 = ejchkdet_char016_21;
	}
	public String getEjchkdet_char016_22() {
		return ejchkdet_char016_22;
	}
	public void setEjchkdet_char016_22(String ejchkdet_char016_22) {
		this.ejchkdet_char016_22 = ejchkdet_char016_22;
	}
	public String getEjchkdet_char016_23() {
		return ejchkdet_char016_23;
	}
	public void setEjchkdet_char016_23(String ejchkdet_char016_23) {
		this.ejchkdet_char016_23 = ejchkdet_char016_23;
	}
	public String getEjchkdet_char016_24() {
		return ejchkdet_char016_24;
	}
	public void setEjchkdet_char016_24(String ejchkdet_char016_24) {
		this.ejchkdet_char016_24 = ejchkdet_char016_24;
	}
	public String getEjchkdet_char016_25() {
		return ejchkdet_char016_25;
	}
	public void setEjchkdet_char016_25(String ejchkdet_char016_25) {
		this.ejchkdet_char016_25 = ejchkdet_char016_25;
	}
	public String getEjchkdet_serial_1() {
		return ejchkdet_serial_1;
	}
	public void setEjchkdet_serial_1(String ejchkdet_serial_1) {
		this.ejchkdet_serial_1 = ejchkdet_serial_1;
	}
	public String getEjchkdet_serial_2() {
		return ejchkdet_serial_2;
	}
	public void setEjchkdet_serial_2(String ejchkdet_serial_2) {
		this.ejchkdet_serial_2 = ejchkdet_serial_2;
	}
	public String getEjchkdet_serial_3() {
		return ejchkdet_serial_3;
	}
	public void setEjchkdet_serial_3(String ejchkdet_serial_3) {
		this.ejchkdet_serial_3 = ejchkdet_serial_3;
	}
	public String getEjchkdet_serial_4() {
		return ejchkdet_serial_4;
	}
	public void setEjchkdet_serial_4(String ejchkdet_serial_4) {
		this.ejchkdet_serial_4 = ejchkdet_serial_4;
	}
	public String getEjchkdet_serial_5() {
		return ejchkdet_serial_5;
	}
	public void setEjchkdet_serial_5(String ejchkdet_serial_5) {
		this.ejchkdet_serial_5 = ejchkdet_serial_5;
	}
	public String getEjchkdet_serial_6() {
		return ejchkdet_serial_6;
	}
	public void setEjchkdet_serial_6(String ejchkdet_serial_6) {
		this.ejchkdet_serial_6 = ejchkdet_serial_6;
	}
	public String getEjchkdet_serial_7() {
		return ejchkdet_serial_7;
	}
	public void setEjchkdet_serial_7(String ejchkdet_serial_7) {
		this.ejchkdet_serial_7 = ejchkdet_serial_7;
	}
	public String getEjchkdet_serial_8() {
		return ejchkdet_serial_8;
	}
	public void setEjchkdet_serial_8(String ejchkdet_serial_8) {
		this.ejchkdet_serial_8 = ejchkdet_serial_8;
	}
	public String getEjchkdet_serial_9() {
		return ejchkdet_serial_9;
	}
	public void setEjchkdet_serial_9(String ejchkdet_serial_9) {
		this.ejchkdet_serial_9 = ejchkdet_serial_9;
	}
	public String getEjchkdet_serial_10() {
		return ejchkdet_serial_10;
	}
	public void setEjchkdet_serial_10(String ejchkdet_serial_10) {
		this.ejchkdet_serial_10 = ejchkdet_serial_10;
	}
	public String getEjchkdet_serial_11() {
		return ejchkdet_serial_11;
	}
	public void setEjchkdet_serial_11(String ejchkdet_serial_11) {
		this.ejchkdet_serial_11 = ejchkdet_serial_11;
	}
	public String getEjchkdet_serial_12() {
		return ejchkdet_serial_12;
	}
	public void setEjchkdet_serial_12(String ejchkdet_serial_12) {
		this.ejchkdet_serial_12 = ejchkdet_serial_12;
	}
	public String getEjchkdet_serial_13() {
		return ejchkdet_serial_13;
	}
	public void setEjchkdet_serial_13(String ejchkdet_serial_13) {
		this.ejchkdet_serial_13 = ejchkdet_serial_13;
	}
	public String getEjchkdet_serial_14() {
		return ejchkdet_serial_14;
	}
	public void setEjchkdet_serial_14(String ejchkdet_serial_14) {
		this.ejchkdet_serial_14 = ejchkdet_serial_14;
	}
	public String getEjchkdet_serial_15() {
		return ejchkdet_serial_15;
	}
	public void setEjchkdet_serial_15(String ejchkdet_serial_15) {
		this.ejchkdet_serial_15 = ejchkdet_serial_15;
	}
	public String getEjchkdet_serial_16() {
		return ejchkdet_serial_16;
	}
	public void setEjchkdet_serial_16(String ejchkdet_serial_16) {
		this.ejchkdet_serial_16 = ejchkdet_serial_16;
	}
	public String getEjchkdet_serial_17() {
		return ejchkdet_serial_17;
	}
	public void setEjchkdet_serial_17(String ejchkdet_serial_17) {
		this.ejchkdet_serial_17 = ejchkdet_serial_17;
	}
	public String getEjchkdet_serial_18() {
		return ejchkdet_serial_18;
	}
	public void setEjchkdet_serial_18(String ejchkdet_serial_18) {
		this.ejchkdet_serial_18 = ejchkdet_serial_18;
	}
	public String getEjchkdet_serial_19() {
		return ejchkdet_serial_19;
	}
	public void setEjchkdet_serial_19(String ejchkdet_serial_19) {
		this.ejchkdet_serial_19 = ejchkdet_serial_19;
	}
	public String getEjchkdet_serial_20() {
		return ejchkdet_serial_20;
	}
	public void setEjchkdet_serial_20(String ejchkdet_serial_20) {
		this.ejchkdet_serial_20 = ejchkdet_serial_20;
	}
	public String getEjchkdet_serial_21() {
		return ejchkdet_serial_21;
	}
	public void setEjchkdet_serial_21(String ejchkdet_serial_21) {
		this.ejchkdet_serial_21 = ejchkdet_serial_21;
	}
	public String getEjchkdet_serial_22() {
		return ejchkdet_serial_22;
	}
	public void setEjchkdet_serial_22(String ejchkdet_serial_22) {
		this.ejchkdet_serial_22 = ejchkdet_serial_22;
	}
	public String getEjchkdet_serial_23() {
		return ejchkdet_serial_23;
	}
	public void setEjchkdet_serial_23(String ejchkdet_serial_23) {
		this.ejchkdet_serial_23 = ejchkdet_serial_23;
	}
	public String getEjchkdet_serial_24() {
		return ejchkdet_serial_24;
	}
	public void setEjchkdet_serial_24(String ejchkdet_serial_24) {
		this.ejchkdet_serial_24 = ejchkdet_serial_24;
	}
	public String getEjchkdet_serial_25() {
		return ejchkdet_serial_25;
	}
	public void setEjchkdet_serial_25(String ejchkdet_serial_25) {
		this.ejchkdet_serial_25 = ejchkdet_serial_25;
	}
	public float getEjchkdet__itemtyp_1() {
		return ejchkdet__itemtyp_1;
	}
	public void setEjchkdet__itemtyp_1(float ejchkdet__itemtyp_1) {
		this.ejchkdet__itemtyp_1 = ejchkdet__itemtyp_1;
	}
	public float getEjchkdet__itemtyp_2() {
		return ejchkdet__itemtyp_2;
	}
	public void setEjchkdet__itemtyp_2(float ejchkdet__itemtyp_2) {
		this.ejchkdet__itemtyp_2 = ejchkdet__itemtyp_2;
	}
	public float getEjchkdet__itemtyp_3() {
		return ejchkdet__itemtyp_3;
	}
	public void setEjchkdet__itemtyp_3(float ejchkdet__itemtyp_3) {
		this.ejchkdet__itemtyp_3 = ejchkdet__itemtyp_3;
	}
	public float getEjchkdet__itemtyp_4() {
		return ejchkdet__itemtyp_4;
	}
	public void setEjchkdet__itemtyp_4(float ejchkdet__itemtyp_4) {
		this.ejchkdet__itemtyp_4 = ejchkdet__itemtyp_4;
	}
	public float getEjchkdet__itemtyp_5() {
		return ejchkdet__itemtyp_5;
	}
	public void setEjchkdet__itemtyp_5(float ejchkdet__itemtyp_5) {
		this.ejchkdet__itemtyp_5 = ejchkdet__itemtyp_5;
	}
	public float getEjchkdet__itemtyp_6() {
		return ejchkdet__itemtyp_6;
	}
	public void setEjchkdet__itemtyp_6(float ejchkdet__itemtyp_6) {
		this.ejchkdet__itemtyp_6 = ejchkdet__itemtyp_6;
	}
	public float getEjchkdet__itemtyp_7() {
		return ejchkdet__itemtyp_7;
	}
	public void setEjchkdet__itemtyp_7(float ejchkdet__itemtyp_7) {
		this.ejchkdet__itemtyp_7 = ejchkdet__itemtyp_7;
	}
	public float getEjchkdet__itemtyp_8() {
		return ejchkdet__itemtyp_8;
	}
	public void setEjchkdet__itemtyp_8(float ejchkdet__itemtyp_8) {
		this.ejchkdet__itemtyp_8 = ejchkdet__itemtyp_8;
	}
	public float getEjchkdet__itemtyp_9() {
		return ejchkdet__itemtyp_9;
	}
	public void setEjchkdet__itemtyp_9(float ejchkdet__itemtyp_9) {
		this.ejchkdet__itemtyp_9 = ejchkdet__itemtyp_9;
	}
	public float getEjchkdet__itemtyp_10() {
		return ejchkdet__itemtyp_10;
	}
	public void setEjchkdet__itemtyp_10(float ejchkdet__itemtyp_10) {
		this.ejchkdet__itemtyp_10 = ejchkdet__itemtyp_10;
	}
	public float getEjchkdet__itemtyp_11() {
		return ejchkdet__itemtyp_11;
	}
	public void setEjchkdet__itemtyp_11(float ejchkdet__itemtyp_11) {
		this.ejchkdet__itemtyp_11 = ejchkdet__itemtyp_11;
	}
	public float getEjchkdet__itemtyp_12() {
		return ejchkdet__itemtyp_12;
	}
	public void setEjchkdet__itemtyp_12(float ejchkdet__itemtyp_12) {
		this.ejchkdet__itemtyp_12 = ejchkdet__itemtyp_12;
	}
	public float getEjchkdet__itemtyp_13() {
		return ejchkdet__itemtyp_13;
	}
	public void setEjchkdet__itemtyp_13(float ejchkdet__itemtyp_13) {
		this.ejchkdet__itemtyp_13 = ejchkdet__itemtyp_13;
	}
	public float getEjchkdet__itemtyp_14() {
		return ejchkdet__itemtyp_14;
	}
	public void setEjchkdet__itemtyp_14(float ejchkdet__itemtyp_14) {
		this.ejchkdet__itemtyp_14 = ejchkdet__itemtyp_14;
	}
	public float getEjchkdet__itemtyp_15() {
		return ejchkdet__itemtyp_15;
	}
	public void setEjchkdet__itemtyp_15(float ejchkdet__itemtyp_15) {
		this.ejchkdet__itemtyp_15 = ejchkdet__itemtyp_15;
	}
	public float getEjchkdet__itemtyp_16() {
		return ejchkdet__itemtyp_16;
	}
	public void setEjchkdet__itemtyp_16(float ejchkdet__itemtyp_16) {
		this.ejchkdet__itemtyp_16 = ejchkdet__itemtyp_16;
	}
	public float getEjchkdet__itemtyp_17() {
		return ejchkdet__itemtyp_17;
	}
	public void setEjchkdet__itemtyp_17(float ejchkdet__itemtyp_17) {
		this.ejchkdet__itemtyp_17 = ejchkdet__itemtyp_17;
	}
	public float getEjchkdet__itemtyp_18() {
		return ejchkdet__itemtyp_18;
	}
	public void setEjchkdet__itemtyp_18(float ejchkdet__itemtyp_18) {
		this.ejchkdet__itemtyp_18 = ejchkdet__itemtyp_18;
	}
	public float getEjchkdet__itemtyp_19() {
		return ejchkdet__itemtyp_19;
	}
	public void setEjchkdet__itemtyp_19(float ejchkdet__itemtyp_19) {
		this.ejchkdet__itemtyp_19 = ejchkdet__itemtyp_19;
	}
	public float getEjchkdet__itemtyp_20() {
		return ejchkdet__itemtyp_20;
	}
	public void setEjchkdet__itemtyp_20(float ejchkdet__itemtyp_20) {
		this.ejchkdet__itemtyp_20 = ejchkdet__itemtyp_20;
	}
	public float getEjchkdet__itemtyp_21() {
		return ejchkdet__itemtyp_21;
	}
	public void setEjchkdet__itemtyp_21(float ejchkdet__itemtyp_21) {
		this.ejchkdet__itemtyp_21 = ejchkdet__itemtyp_21;
	}
	public float getEjchkdet__itemtyp_22() {
		return ejchkdet__itemtyp_22;
	}
	public void setEjchkdet__itemtyp_22(float ejchkdet__itemtyp_22) {
		this.ejchkdet__itemtyp_22 = ejchkdet__itemtyp_22;
	}
	public float getEjchkdet__itemtyp_23() {
		return ejchkdet__itemtyp_23;
	}
	public void setEjchkdet__itemtyp_23(float ejchkdet__itemtyp_23) {
		this.ejchkdet__itemtyp_23 = ejchkdet__itemtyp_23;
	}
	public float getEjchkdet__itemtyp_24() {
		return ejchkdet__itemtyp_24;
	}
	public void setEjchkdet__itemtyp_24(float ejchkdet__itemtyp_24) {
		this.ejchkdet__itemtyp_24 = ejchkdet__itemtyp_24;
	}
	public float getEjchkdet__itemtyp_25() {
		return ejchkdet__itemtyp_25;
	}
	public void setEjchkdet__itemtyp_25(float ejchkdet__itemtyp_25) {
		this.ejchkdet__itemtyp_25 = ejchkdet__itemtyp_25;
	}
	public String getEjchkdet_dvtype() {
		return ejchkdet_dvtype;
	}
	public void setEjchkdet_dvtype(String ejchkdet_dvtype) {
		this.ejchkdet_dvtype = ejchkdet_dvtype;
	}
	public String getEjchkdet_operid() {
		return ejchkdet_operid;
	}
	public void setEjchkdet_operid(String ejchkdet_operid) {
		this.ejchkdet_operid = ejchkdet_operid;
	}
	public String getEjchkdet_flag() {
		return ejchkdet_flag;
	}
	public void setEjchkdet_flag(String ejchkdet_flag) {
		this.ejchkdet_flag = ejchkdet_flag;
	}
	public float getEjchkdet__uid_1() {
		return ejchkdet__uid_1;
	}
	public void setEjchkdet__uid_1(float ejchkdet__uid_1) {
		this.ejchkdet__uid_1 = ejchkdet__uid_1;
	}
	public float getEjchkdet__uid_2() {
		return ejchkdet__uid_2;
	}
	public void setEjchkdet__uid_2(float ejchkdet__uid_2) {
		this.ejchkdet__uid_2 = ejchkdet__uid_2;
	}
	public float getEjchkdet__uid_3() {
		return ejchkdet__uid_3;
	}
	public void setEjchkdet__uid_3(float ejchkdet__uid_3) {
		this.ejchkdet__uid_3 = ejchkdet__uid_3;
	}
	public float getEjchkdet__uid_4() {
		return ejchkdet__uid_4;
	}
	public void setEjchkdet__uid_4(float ejchkdet__uid_4) {
		this.ejchkdet__uid_4 = ejchkdet__uid_4;
	}
	public float getEjchkdet__uid_5() {
		return ejchkdet__uid_5;
	}
	public void setEjchkdet__uid_5(float ejchkdet__uid_5) {
		this.ejchkdet__uid_5 = ejchkdet__uid_5;
	}
	public float getEjchkdet__uid_6() {
		return ejchkdet__uid_6;
	}
	public void setEjchkdet__uid_6(float ejchkdet__uid_6) {
		this.ejchkdet__uid_6 = ejchkdet__uid_6;
	}
	public float getEjchkdet__uid_7() {
		return ejchkdet__uid_7;
	}
	public void setEjchkdet__uid_7(float ejchkdet__uid_7) {
		this.ejchkdet__uid_7 = ejchkdet__uid_7;
	}
	public float getEjchkdet__uid_8() {
		return ejchkdet__uid_8;
	}
	public void setEjchkdet__uid_8(float ejchkdet__uid_8) {
		this.ejchkdet__uid_8 = ejchkdet__uid_8;
	}
	public float getEjchkdet__uid_9() {
		return ejchkdet__uid_9;
	}
	public void setEjchkdet__uid_9(float ejchkdet__uid_9) {
		this.ejchkdet__uid_9 = ejchkdet__uid_9;
	}
	public float getEjchkdet__uid_10() {
		return ejchkdet__uid_10;
	}
	public void setEjchkdet__uid_10(float ejchkdet__uid_10) {
		this.ejchkdet__uid_10 = ejchkdet__uid_10;
	}
	public float getEjchkdet__uid_11() {
		return ejchkdet__uid_11;
	}
	public void setEjchkdet__uid_11(float ejchkdet__uid_11) {
		this.ejchkdet__uid_11 = ejchkdet__uid_11;
	}
	public float getEjchkdet__uid_12() {
		return ejchkdet__uid_12;
	}
	public void setEjchkdet__uid_12(float ejchkdet__uid_12) {
		this.ejchkdet__uid_12 = ejchkdet__uid_12;
	}
	public float getEjchkdet__uid_13() {
		return ejchkdet__uid_13;
	}
	public void setEjchkdet__uid_13(float ejchkdet__uid_13) {
		this.ejchkdet__uid_13 = ejchkdet__uid_13;
	}
	public float getEjchkdet__uid_14() {
		return ejchkdet__uid_14;
	}
	public void setEjchkdet__uid_14(float ejchkdet__uid_14) {
		this.ejchkdet__uid_14 = ejchkdet__uid_14;
	}
	public float getEjchkdet__uid_15() {
		return ejchkdet__uid_15;
	}
	public void setEjchkdet__uid_15(float ejchkdet__uid_15) {
		this.ejchkdet__uid_15 = ejchkdet__uid_15;
	}
	public float getEjchkdet__uid_16() {
		return ejchkdet__uid_16;
	}
	public void setEjchkdet__uid_16(float ejchkdet__uid_16) {
		this.ejchkdet__uid_16 = ejchkdet__uid_16;
	}
	public float getEjchkdet__uid_17() {
		return ejchkdet__uid_17;
	}
	public void setEjchkdet__uid_17(float ejchkdet__uid_17) {
		this.ejchkdet__uid_17 = ejchkdet__uid_17;
	}
	public float getEjchkdet__uid_18() {
		return ejchkdet__uid_18;
	}
	public void setEjchkdet__uid_18(float ejchkdet__uid_18) {
		this.ejchkdet__uid_18 = ejchkdet__uid_18;
	}
	public float getEjchkdet__uid_19() {
		return ejchkdet__uid_19;
	}
	public void setEjchkdet__uid_19(float ejchkdet__uid_19) {
		this.ejchkdet__uid_19 = ejchkdet__uid_19;
	}
	public float getEjchkdet__uid_20() {
		return ejchkdet__uid_20;
	}
	public void setEjchkdet__uid_20(float ejchkdet__uid_20) {
		this.ejchkdet__uid_20 = ejchkdet__uid_20;
	}
	public float getEjchkdet__uid_21() {
		return ejchkdet__uid_21;
	}
	public void setEjchkdet__uid_21(float ejchkdet__uid_21) {
		this.ejchkdet__uid_21 = ejchkdet__uid_21;
	}
	public float getEjchkdet__uid_22() {
		return ejchkdet__uid_22;
	}
	public void setEjchkdet__uid_22(float ejchkdet__uid_22) {
		this.ejchkdet__uid_22 = ejchkdet__uid_22;
	}
	public float getEjchkdet__uid_23() {
		return ejchkdet__uid_23;
	}
	public void setEjchkdet__uid_23(float ejchkdet__uid_23) {
		this.ejchkdet__uid_23 = ejchkdet__uid_23;
	}
	public float getEjchkdet__uid_24() {
		return ejchkdet__uid_24;
	}
	public void setEjchkdet__uid_24(float ejchkdet__uid_24) {
		this.ejchkdet__uid_24 = ejchkdet__uid_24;
	}
	public float getEjchkdet__uid_25() {
		return ejchkdet__uid_25;
	}
	public void setEjchkdet__uid_25(float ejchkdet__uid_25) {
		this.ejchkdet__uid_25 = ejchkdet__uid_25;
	}
	public String getEjchkdet__name() {
		return ejchkdet__name;
	}
	public void setEjchkdet__name(String ejchkdet__name) {
		this.ejchkdet__name = ejchkdet__name;
	}
	public String getEjchkdet_sourcecd_1() {
		return ejchkdet_sourcecd_1;
	}
	public void setEjchkdet_sourcecd_1(String ejchkdet_sourcecd_1) {
		this.ejchkdet_sourcecd_1 = ejchkdet_sourcecd_1;
	}
	public String getEjchkdet_sourcecd_2() {
		return ejchkdet_sourcecd_2;
	}
	public void setEjchkdet_sourcecd_2(String ejchkdet_sourcecd_2) {
		this.ejchkdet_sourcecd_2 = ejchkdet_sourcecd_2;
	}
	public String getEjchkdet_sourcecd_3() {
		return ejchkdet_sourcecd_3;
	}
	public void setEjchkdet_sourcecd_3(String ejchkdet_sourcecd_3) {
		this.ejchkdet_sourcecd_3 = ejchkdet_sourcecd_3;
	}
	public String getEjchkdet_sourcecd_4() {
		return ejchkdet_sourcecd_4;
	}
	public void setEjchkdet_sourcecd_4(String ejchkdet_sourcecd_4) {
		this.ejchkdet_sourcecd_4 = ejchkdet_sourcecd_4;
	}
	public String getEjchkdet_sourcecd_5() {
		return ejchkdet_sourcecd_5;
	}
	public void setEjchkdet_sourcecd_5(String ejchkdet_sourcecd_5) {
		this.ejchkdet_sourcecd_5 = ejchkdet_sourcecd_5;
	}
	public String getEjchkdet_sourcecd_6() {
		return ejchkdet_sourcecd_6;
	}
	public void setEjchkdet_sourcecd_6(String ejchkdet_sourcecd_6) {
		this.ejchkdet_sourcecd_6 = ejchkdet_sourcecd_6;
	}
	public String getEjchkdet_sourcecd_7() {
		return ejchkdet_sourcecd_7;
	}
	public void setEjchkdet_sourcecd_7(String ejchkdet_sourcecd_7) {
		this.ejchkdet_sourcecd_7 = ejchkdet_sourcecd_7;
	}
	public String getEjchkdet_sourcecd_8() {
		return ejchkdet_sourcecd_8;
	}
	public void setEjchkdet_sourcecd_8(String ejchkdet_sourcecd_8) {
		this.ejchkdet_sourcecd_8 = ejchkdet_sourcecd_8;
	}
	public String getEjchkdet_sourcecd_9() {
		return ejchkdet_sourcecd_9;
	}
	public void setEjchkdet_sourcecd_9(String ejchkdet_sourcecd_9) {
		this.ejchkdet_sourcecd_9 = ejchkdet_sourcecd_9;
	}
	public String getEjchkdet_sourcecd_10() {
		return ejchkdet_sourcecd_10;
	}
	public void setEjchkdet_sourcecd_10(String ejchkdet_sourcecd_10) {
		this.ejchkdet_sourcecd_10 = ejchkdet_sourcecd_10;
	}
	public String getEjchkdet_sourcecd_11() {
		return ejchkdet_sourcecd_11;
	}
	public void setEjchkdet_sourcecd_11(String ejchkdet_sourcecd_11) {
		this.ejchkdet_sourcecd_11 = ejchkdet_sourcecd_11;
	}
	public String getEjchkdet_sourcecd_12() {
		return ejchkdet_sourcecd_12;
	}
	public void setEjchkdet_sourcecd_12(String ejchkdet_sourcecd_12) {
		this.ejchkdet_sourcecd_12 = ejchkdet_sourcecd_12;
	}
	public String getEjchkdet_sourcecd_13() {
		return ejchkdet_sourcecd_13;
	}
	public void setEjchkdet_sourcecd_13(String ejchkdet_sourcecd_13) {
		this.ejchkdet_sourcecd_13 = ejchkdet_sourcecd_13;
	}
	public String getEjchkdet_sourcecd_14() {
		return ejchkdet_sourcecd_14;
	}
	public void setEjchkdet_sourcecd_14(String ejchkdet_sourcecd_14) {
		this.ejchkdet_sourcecd_14 = ejchkdet_sourcecd_14;
	}
	public String getEjchkdet_sourcecd_15() {
		return ejchkdet_sourcecd_15;
	}
	public void setEjchkdet_sourcecd_15(String ejchkdet_sourcecd_15) {
		this.ejchkdet_sourcecd_15 = ejchkdet_sourcecd_15;
	}
	public String getEjchkdet_sourcecd_16() {
		return ejchkdet_sourcecd_16;
	}
	public void setEjchkdet_sourcecd_16(String ejchkdet_sourcecd_16) {
		this.ejchkdet_sourcecd_16 = ejchkdet_sourcecd_16;
	}
	public String getEjchkdet_sourcecd_17() {
		return ejchkdet_sourcecd_17;
	}
	public void setEjchkdet_sourcecd_17(String ejchkdet_sourcecd_17) {
		this.ejchkdet_sourcecd_17 = ejchkdet_sourcecd_17;
	}
	public String getEjchkdet_sourcecd_18() {
		return ejchkdet_sourcecd_18;
	}
	public void setEjchkdet_sourcecd_18(String ejchkdet_sourcecd_18) {
		this.ejchkdet_sourcecd_18 = ejchkdet_sourcecd_18;
	}
	public String getEjchkdet_sourcecd_19() {
		return ejchkdet_sourcecd_19;
	}
	public void setEjchkdet_sourcecd_19(String ejchkdet_sourcecd_19) {
		this.ejchkdet_sourcecd_19 = ejchkdet_sourcecd_19;
	}
	public String getEjchkdet_sourcecd_20() {
		return ejchkdet_sourcecd_20;
	}
	public void setEjchkdet_sourcecd_20(String ejchkdet_sourcecd_20) {
		this.ejchkdet_sourcecd_20 = ejchkdet_sourcecd_20;
	}
	public String getEjchkdet_sourcecd_21() {
		return ejchkdet_sourcecd_21;
	}
	public void setEjchkdet_sourcecd_21(String ejchkdet_sourcecd_21) {
		this.ejchkdet_sourcecd_21 = ejchkdet_sourcecd_21;
	}
	public String getEjchkdet_sourcecd_22() {
		return ejchkdet_sourcecd_22;
	}
	public void setEjchkdet_sourcecd_22(String ejchkdet_sourcecd_22) {
		this.ejchkdet_sourcecd_22 = ejchkdet_sourcecd_22;
	}
	public String getEjchkdet_sourcecd_23() {
		return ejchkdet_sourcecd_23;
	}
	public void setEjchkdet_sourcecd_23(String ejchkdet_sourcecd_23) {
		this.ejchkdet_sourcecd_23 = ejchkdet_sourcecd_23;
	}
	public String getEjchkdet_sourcecd_24() {
		return ejchkdet_sourcecd_24;
	}
	public void setEjchkdet_sourcecd_24(String ejchkdet_sourcecd_24) {
		this.ejchkdet_sourcecd_24 = ejchkdet_sourcecd_24;
	}
	public String getEjchkdet_sourcecd_25() {
		return ejchkdet_sourcecd_25;
	}
	public void setEjchkdet_sourcecd_25(String ejchkdet_sourcecd_25) {
		this.ejchkdet_sourcecd_25 = ejchkdet_sourcecd_25;
	}
	public String getEjchkdet_procdate_1() {
		return ejchkdet_procdate_1;
	}
	public void setEjchkdet_procdate_1(String ejchkdet_procdate_1) {
		this.ejchkdet_procdate_1 = ejchkdet_procdate_1;
	}
	public String getEjchkdet_procdate_2() {
		return ejchkdet_procdate_2;
	}
	public void setEjchkdet_procdate_2(String ejchkdet_procdate_2) {
		this.ejchkdet_procdate_2 = ejchkdet_procdate_2;
	}
	public String getEjchkdet_procdate_3() {
		return ejchkdet_procdate_3;
	}
	public void setEjchkdet_procdate_3(String ejchkdet_procdate_3) {
		this.ejchkdet_procdate_3 = ejchkdet_procdate_3;
	}
	public String getEjchkdet_procdate_4() {
		return ejchkdet_procdate_4;
	}
	public void setEjchkdet_procdate_4(String ejchkdet_procdate_4) {
		this.ejchkdet_procdate_4 = ejchkdet_procdate_4;
	}
	public String getEjchkdet_procdate_5() {
		return ejchkdet_procdate_5;
	}
	public void setEjchkdet_procdate_5(String ejchkdet_procdate_5) {
		this.ejchkdet_procdate_5 = ejchkdet_procdate_5;
	}
	public String getEjchkdet_procdate_6() {
		return ejchkdet_procdate_6;
	}
	public void setEjchkdet_procdate_6(String ejchkdet_procdate_6) {
		this.ejchkdet_procdate_6 = ejchkdet_procdate_6;
	}
	public String getEjchkdet_procdate_7() {
		return ejchkdet_procdate_7;
	}
	public void setEjchkdet_procdate_7(String ejchkdet_procdate_7) {
		this.ejchkdet_procdate_7 = ejchkdet_procdate_7;
	}
	public String getEjchkdet_procdate_8() {
		return ejchkdet_procdate_8;
	}
	public void setEjchkdet_procdate_8(String ejchkdet_procdate_8) {
		this.ejchkdet_procdate_8 = ejchkdet_procdate_8;
	}
	public String getEjchkdet_procdate_9() {
		return ejchkdet_procdate_9;
	}
	public void setEjchkdet_procdate_9(String ejchkdet_procdate_9) {
		this.ejchkdet_procdate_9 = ejchkdet_procdate_9;
	}
	public String getEjchkdet_procdate_10() {
		return ejchkdet_procdate_10;
	}
	public void setEjchkdet_procdate_10(String ejchkdet_procdate_10) {
		this.ejchkdet_procdate_10 = ejchkdet_procdate_10;
	}
	public String getEjchkdet_procdate_11() {
		return ejchkdet_procdate_11;
	}
	public void setEjchkdet_procdate_11(String ejchkdet_procdate_11) {
		this.ejchkdet_procdate_11 = ejchkdet_procdate_11;
	}
	public String getEjchkdet_procdate_12() {
		return ejchkdet_procdate_12;
	}
	public void setEjchkdet_procdate_12(String ejchkdet_procdate_12) {
		this.ejchkdet_procdate_12 = ejchkdet_procdate_12;
	}
	public String getEjchkdet_procdate_13() {
		return ejchkdet_procdate_13;
	}
	public void setEjchkdet_procdate_13(String ejchkdet_procdate_13) {
		this.ejchkdet_procdate_13 = ejchkdet_procdate_13;
	}
	public String getEjchkdet_procdate_14() {
		return ejchkdet_procdate_14;
	}
	public void setEjchkdet_procdate_14(String ejchkdet_procdate_14) {
		this.ejchkdet_procdate_14 = ejchkdet_procdate_14;
	}
	public String getEjchkdet_procdate_15() {
		return ejchkdet_procdate_15;
	}
	public void setEjchkdet_procdate_15(String ejchkdet_procdate_15) {
		this.ejchkdet_procdate_15 = ejchkdet_procdate_15;
	}
	public String getEjchkdet_procdate_16() {
		return ejchkdet_procdate_16;
	}
	public void setEjchkdet_procdate_16(String ejchkdet_procdate_16) {
		this.ejchkdet_procdate_16 = ejchkdet_procdate_16;
	}
	public String getEjchkdet_procdate_17() {
		return ejchkdet_procdate_17;
	}
	public void setEjchkdet_procdate_17(String ejchkdet_procdate_17) {
		this.ejchkdet_procdate_17 = ejchkdet_procdate_17;
	}
	public String getEjchkdet_procdate_18() {
		return ejchkdet_procdate_18;
	}
	public void setEjchkdet_procdate_18(String ejchkdet_procdate_18) {
		this.ejchkdet_procdate_18 = ejchkdet_procdate_18;
	}
	public String getEjchkdet_procdate_19() {
		return ejchkdet_procdate_19;
	}
	public void setEjchkdet_procdate_19(String ejchkdet_procdate_19) {
		this.ejchkdet_procdate_19 = ejchkdet_procdate_19;
	}
	public String getEjchkdet_procdate_20() {
		return ejchkdet_procdate_20;
	}
	public void setEjchkdet_procdate_20(String ejchkdet_procdate_20) {
		this.ejchkdet_procdate_20 = ejchkdet_procdate_20;
	}
	public String getEjchkdet_procdate_21() {
		return ejchkdet_procdate_21;
	}
	public void setEjchkdet_procdate_21(String ejchkdet_procdate_21) {
		this.ejchkdet_procdate_21 = ejchkdet_procdate_21;
	}
	public String getEjchkdet_procdate_22() {
		return ejchkdet_procdate_22;
	}
	public void setEjchkdet_procdate_22(String ejchkdet_procdate_22) {
		this.ejchkdet_procdate_22 = ejchkdet_procdate_22;
	}
	public String getEjchkdet_procdate_23() {
		return ejchkdet_procdate_23;
	}
	public void setEjchkdet_procdate_23(String ejchkdet_procdate_23) {
		this.ejchkdet_procdate_23 = ejchkdet_procdate_23;
	}
	public String getEjchkdet_procdate_24() {
		return ejchkdet_procdate_24;
	}
	public void setEjchkdet_procdate_24(String ejchkdet_procdate_24) {
		this.ejchkdet_procdate_24 = ejchkdet_procdate_24;
	}
	public String getEjchkdet_procdate_25() {
		return ejchkdet_procdate_25;
	}
	public void setEjchkdet_procdate_25(String ejchkdet_procdate_25) {
		this.ejchkdet_procdate_25 = ejchkdet_procdate_25;
	}
	public String getEjchkdet_caldate_1() {
		return ejchkdet_caldate_1;
	}
	public void setEjchkdet_caldate_1(String ejchkdet_caldate_1) {
		this.ejchkdet_caldate_1 = ejchkdet_caldate_1;
	}
	public String getEjchkdet_caldate_2() {
		return ejchkdet_caldate_2;
	}
	public void setEjchkdet_caldate_2(String ejchkdet_caldate_2) {
		this.ejchkdet_caldate_2 = ejchkdet_caldate_2;
	}
	public String getEjchkdet_caldate_3() {
		return ejchkdet_caldate_3;
	}
	public void setEjchkdet_caldate_3(String ejchkdet_caldate_3) {
		this.ejchkdet_caldate_3 = ejchkdet_caldate_3;
	}
	public String getEjchkdet_caldate_4() {
		return ejchkdet_caldate_4;
	}
	public void setEjchkdet_caldate_4(String ejchkdet_caldate_4) {
		this.ejchkdet_caldate_4 = ejchkdet_caldate_4;
	}
	public String getEjchkdet_caldate_5() {
		return ejchkdet_caldate_5;
	}
	public void setEjchkdet_caldate_5(String ejchkdet_caldate_5) {
		this.ejchkdet_caldate_5 = ejchkdet_caldate_5;
	}
	public String getEjchkdet_caldate_6() {
		return ejchkdet_caldate_6;
	}
	public void setEjchkdet_caldate_6(String ejchkdet_caldate_6) {
		this.ejchkdet_caldate_6 = ejchkdet_caldate_6;
	}
	public String getEjchkdet_caldate_7() {
		return ejchkdet_caldate_7;
	}
	public void setEjchkdet_caldate_7(String ejchkdet_caldate_7) {
		this.ejchkdet_caldate_7 = ejchkdet_caldate_7;
	}
	public String getEjchkdet_caldate_8() {
		return ejchkdet_caldate_8;
	}
	public void setEjchkdet_caldate_8(String ejchkdet_caldate_8) {
		this.ejchkdet_caldate_8 = ejchkdet_caldate_8;
	}
	public String getEjchkdet_caldate_9() {
		return ejchkdet_caldate_9;
	}
	public void setEjchkdet_caldate_9(String ejchkdet_caldate_9) {
		this.ejchkdet_caldate_9 = ejchkdet_caldate_9;
	}
	public String getEjchkdet_caldate_10() {
		return ejchkdet_caldate_10;
	}
	public void setEjchkdet_caldate_10(String ejchkdet_caldate_10) {
		this.ejchkdet_caldate_10 = ejchkdet_caldate_10;
	}
	public String getEjchkdet_caldate_11() {
		return ejchkdet_caldate_11;
	}
	public void setEjchkdet_caldate_11(String ejchkdet_caldate_11) {
		this.ejchkdet_caldate_11 = ejchkdet_caldate_11;
	}
	public String getEjchkdet_caldate_12() {
		return ejchkdet_caldate_12;
	}
	public void setEjchkdet_caldate_12(String ejchkdet_caldate_12) {
		this.ejchkdet_caldate_12 = ejchkdet_caldate_12;
	}
	public String getEjchkdet_caldate_13() {
		return ejchkdet_caldate_13;
	}
	public void setEjchkdet_caldate_13(String ejchkdet_caldate_13) {
		this.ejchkdet_caldate_13 = ejchkdet_caldate_13;
	}
	public String getEjchkdet_caldate_14() {
		return ejchkdet_caldate_14;
	}
	public void setEjchkdet_caldate_14(String ejchkdet_caldate_14) {
		this.ejchkdet_caldate_14 = ejchkdet_caldate_14;
	}
	public String getEjchkdet_caldate_15() {
		return ejchkdet_caldate_15;
	}
	public void setEjchkdet_caldate_15(String ejchkdet_caldate_15) {
		this.ejchkdet_caldate_15 = ejchkdet_caldate_15;
	}
	public String getEjchkdet_caldate_16() {
		return ejchkdet_caldate_16;
	}
	public void setEjchkdet_caldate_16(String ejchkdet_caldate_16) {
		this.ejchkdet_caldate_16 = ejchkdet_caldate_16;
	}
	public String getEjchkdet_caldate_17() {
		return ejchkdet_caldate_17;
	}
	public void setEjchkdet_caldate_17(String ejchkdet_caldate_17) {
		this.ejchkdet_caldate_17 = ejchkdet_caldate_17;
	}
	public String getEjchkdet_caldate_18() {
		return ejchkdet_caldate_18;
	}
	public void setEjchkdet_caldate_18(String ejchkdet_caldate_18) {
		this.ejchkdet_caldate_18 = ejchkdet_caldate_18;
	}
	public String getEjchkdet_caldate_19() {
		return ejchkdet_caldate_19;
	}
	public void setEjchkdet_caldate_19(String ejchkdet_caldate_19) {
		this.ejchkdet_caldate_19 = ejchkdet_caldate_19;
	}
	public String getEjchkdet_caldate_20() {
		return ejchkdet_caldate_20;
	}
	public void setEjchkdet_caldate_20(String ejchkdet_caldate_20) {
		this.ejchkdet_caldate_20 = ejchkdet_caldate_20;
	}
	public String getEjchkdet_caldate_21() {
		return ejchkdet_caldate_21;
	}
	public void setEjchkdet_caldate_21(String ejchkdet_caldate_21) {
		this.ejchkdet_caldate_21 = ejchkdet_caldate_21;
	}
	public String getEjchkdet_caldate_22() {
		return ejchkdet_caldate_22;
	}
	public void setEjchkdet_caldate_22(String ejchkdet_caldate_22) {
		this.ejchkdet_caldate_22 = ejchkdet_caldate_22;
	}
	public String getEjchkdet_caldate_23() {
		return ejchkdet_caldate_23;
	}
	public void setEjchkdet_caldate_23(String ejchkdet_caldate_23) {
		this.ejchkdet_caldate_23 = ejchkdet_caldate_23;
	}
	public String getEjchkdet_caldate_24() {
		return ejchkdet_caldate_24;
	}
	public void setEjchkdet_caldate_24(String ejchkdet_caldate_24) {
		this.ejchkdet_caldate_24 = ejchkdet_caldate_24;
	}
	public String getEjchkdet_caldate_25() {
		return ejchkdet_caldate_25;
	}
	public void setEjchkdet_caldate_25(String ejchkdet_caldate_25) {
		this.ejchkdet_caldate_25 = ejchkdet_caldate_25;
	}
	public String getEjchkdet_time_1() {
		return ejchkdet_time_1;
	}
	public void setEjchkdet_time_1(String ejchkdet_time_1) {
		this.ejchkdet_time_1 = ejchkdet_time_1;
	}
	public String getEjchkdet_time_2() {
		return ejchkdet_time_2;
	}
	public void setEjchkdet_time_2(String ejchkdet_time_2) {
		this.ejchkdet_time_2 = ejchkdet_time_2;
	}
	public String getEjchkdet_time_3() {
		return ejchkdet_time_3;
	}
	public void setEjchkdet_time_3(String ejchkdet_time_3) {
		this.ejchkdet_time_3 = ejchkdet_time_3;
	}
	public String getEjchkdet_time_4() {
		return ejchkdet_time_4;
	}
	public void setEjchkdet_time_4(String ejchkdet_time_4) {
		this.ejchkdet_time_4 = ejchkdet_time_4;
	}
	public String getEjchkdet_time_5() {
		return ejchkdet_time_5;
	}
	public void setEjchkdet_time_5(String ejchkdet_time_5) {
		this.ejchkdet_time_5 = ejchkdet_time_5;
	}
	public String getEjchkdet_time_6() {
		return ejchkdet_time_6;
	}
	public void setEjchkdet_time_6(String ejchkdet_time_6) {
		this.ejchkdet_time_6 = ejchkdet_time_6;
	}
	public String getEjchkdet_time_7() {
		return ejchkdet_time_7;
	}
	public void setEjchkdet_time_7(String ejchkdet_time_7) {
		this.ejchkdet_time_7 = ejchkdet_time_7;
	}
	public String getEjchkdet_time_8() {
		return ejchkdet_time_8;
	}
	public void setEjchkdet_time_8(String ejchkdet_time_8) {
		this.ejchkdet_time_8 = ejchkdet_time_8;
	}
	public String getEjchkdet_time_9() {
		return ejchkdet_time_9;
	}
	public void setEjchkdet_time_9(String ejchkdet_time_9) {
		this.ejchkdet_time_9 = ejchkdet_time_9;
	}
	public String getEjchkdet_time_10() {
		return ejchkdet_time_10;
	}
	public void setEjchkdet_time_10(String ejchkdet_time_10) {
		this.ejchkdet_time_10 = ejchkdet_time_10;
	}
	public String getEjchkdet_time_11() {
		return ejchkdet_time_11;
	}
	public void setEjchkdet_time_11(String ejchkdet_time_11) {
		this.ejchkdet_time_11 = ejchkdet_time_11;
	}
	public String getEjchkdet_time_12() {
		return ejchkdet_time_12;
	}
	public void setEjchkdet_time_12(String ejchkdet_time_12) {
		this.ejchkdet_time_12 = ejchkdet_time_12;
	}
	public String getEjchkdet_time_13() {
		return ejchkdet_time_13;
	}
	public void setEjchkdet_time_13(String ejchkdet_time_13) {
		this.ejchkdet_time_13 = ejchkdet_time_13;
	}
	public String getEjchkdet_time_14() {
		return ejchkdet_time_14;
	}
	public void setEjchkdet_time_14(String ejchkdet_time_14) {
		this.ejchkdet_time_14 = ejchkdet_time_14;
	}
	public String getEjchkdet_time_15() {
		return ejchkdet_time_15;
	}
	public void setEjchkdet_time_15(String ejchkdet_time_15) {
		this.ejchkdet_time_15 = ejchkdet_time_15;
	}
	public String getEjchkdet_time_16() {
		return ejchkdet_time_16;
	}
	public void setEjchkdet_time_16(String ejchkdet_time_16) {
		this.ejchkdet_time_16 = ejchkdet_time_16;
	}
	public String getEjchkdet_time_17() {
		return ejchkdet_time_17;
	}
	public void setEjchkdet_time_17(String ejchkdet_time_17) {
		this.ejchkdet_time_17 = ejchkdet_time_17;
	}
	public String getEjchkdet_time_18() {
		return ejchkdet_time_18;
	}
	public void setEjchkdet_time_18(String ejchkdet_time_18) {
		this.ejchkdet_time_18 = ejchkdet_time_18;
	}
	public String getEjchkdet_time_19() {
		return ejchkdet_time_19;
	}
	public void setEjchkdet_time_19(String ejchkdet_time_19) {
		this.ejchkdet_time_19 = ejchkdet_time_19;
	}
	public String getEjchkdet_time_20() {
		return ejchkdet_time_20;
	}
	public void setEjchkdet_time_20(String ejchkdet_time_20) {
		this.ejchkdet_time_20 = ejchkdet_time_20;
	}
	public String getEjchkdet_time_21() {
		return ejchkdet_time_21;
	}
	public void setEjchkdet_time_21(String ejchkdet_time_21) {
		this.ejchkdet_time_21 = ejchkdet_time_21;
	}
	public String getEjchkdet_time_22() {
		return ejchkdet_time_22;
	}
	public void setEjchkdet_time_22(String ejchkdet_time_22) {
		this.ejchkdet_time_22 = ejchkdet_time_22;
	}
	public String getEjchkdet_time_23() {
		return ejchkdet_time_23;
	}
	public void setEjchkdet_time_23(String ejchkdet_time_23) {
		this.ejchkdet_time_23 = ejchkdet_time_23;
	}
	public String getEjchkdet_time_24() {
		return ejchkdet_time_24;
	}
	public void setEjchkdet_time_24(String ejchkdet_time_24) {
		this.ejchkdet_time_24 = ejchkdet_time_24;
	}
	public String getEjchkdet_time_25() {
		return ejchkdet_time_25;
	}
	public void setEjchkdet_time_25(String ejchkdet_time_25) {
		this.ejchkdet_time_25 = ejchkdet_time_25;
	}
	public String getEjchkdet_operid2() {
		return ejchkdet_operid2;
	}
	public void setEjchkdet_operid2(String ejchkdet_operid2) {
		this.ejchkdet_operid2 = ejchkdet_operid2;
	}
	public String getEjchkdet_rawmicr_1() {
		return ejchkdet_rawmicr_1;
	}
	public void setEjchkdet_rawmicr_1(String ejchkdet_rawmicr_1) {
		this.ejchkdet_rawmicr_1 = ejchkdet_rawmicr_1;
	}
	public String getEjchkdet_rawmicr_2() {
		return ejchkdet_rawmicr_2;
	}
	public void setEjchkdet_rawmicr_2(String ejchkdet_rawmicr_2) {
		this.ejchkdet_rawmicr_2 = ejchkdet_rawmicr_2;
	}
	public String getEjchkdet_rawmicr_3() {
		return ejchkdet_rawmicr_3;
	}
	public void setEjchkdet_rawmicr_3(String ejchkdet_rawmicr_3) {
		this.ejchkdet_rawmicr_3 = ejchkdet_rawmicr_3;
	}
	public String getEjchkdet_rawmicr_4() {
		return ejchkdet_rawmicr_4;
	}
	public void setEjchkdet_rawmicr_4(String ejchkdet_rawmicr_4) {
		this.ejchkdet_rawmicr_4 = ejchkdet_rawmicr_4;
	}
	public String getEjchkdet_rawmicr_5() {
		return ejchkdet_rawmicr_5;
	}
	public void setEjchkdet_rawmicr_5(String ejchkdet_rawmicr_5) {
		this.ejchkdet_rawmicr_5 = ejchkdet_rawmicr_5;
	}
	public String getEjchkdet_rawmicr_6() {
		return ejchkdet_rawmicr_6;
	}
	public void setEjchkdet_rawmicr_6(String ejchkdet_rawmicr_6) {
		this.ejchkdet_rawmicr_6 = ejchkdet_rawmicr_6;
	}
	public String getEjchkdet_rawmicr_7() {
		return ejchkdet_rawmicr_7;
	}
	public void setEjchkdet_rawmicr_7(String ejchkdet_rawmicr_7) {
		this.ejchkdet_rawmicr_7 = ejchkdet_rawmicr_7;
	}
	public String getEjchkdet_rawmicr_8() {
		return ejchkdet_rawmicr_8;
	}
	public void setEjchkdet_rawmicr_8(String ejchkdet_rawmicr_8) {
		this.ejchkdet_rawmicr_8 = ejchkdet_rawmicr_8;
	}
	public String getEjchkdet_rawmicr_9() {
		return ejchkdet_rawmicr_9;
	}
	public void setEjchkdet_rawmicr_9(String ejchkdet_rawmicr_9) {
		this.ejchkdet_rawmicr_9 = ejchkdet_rawmicr_9;
	}
	public String getEjchkdet_rawmicr_10() {
		return ejchkdet_rawmicr_10;
	}
	public void setEjchkdet_rawmicr_10(String ejchkdet_rawmicr_10) {
		this.ejchkdet_rawmicr_10 = ejchkdet_rawmicr_10;
	}
	public String getEjchkdet_rawmicr_11() {
		return ejchkdet_rawmicr_11;
	}
	public void setEjchkdet_rawmicr_11(String ejchkdet_rawmicr_11) {
		this.ejchkdet_rawmicr_11 = ejchkdet_rawmicr_11;
	}
	public String getEjchkdet_rawmicr_12() {
		return ejchkdet_rawmicr_12;
	}
	public void setEjchkdet_rawmicr_12(String ejchkdet_rawmicr_12) {
		this.ejchkdet_rawmicr_12 = ejchkdet_rawmicr_12;
	}
	public String getEjchkdet_rawmicr_13() {
		return ejchkdet_rawmicr_13;
	}
	public void setEjchkdet_rawmicr_13(String ejchkdet_rawmicr_13) {
		this.ejchkdet_rawmicr_13 = ejchkdet_rawmicr_13;
	}
	public String getEjchkdet_rawmicr_14() {
		return ejchkdet_rawmicr_14;
	}
	public void setEjchkdet_rawmicr_14(String ejchkdet_rawmicr_14) {
		this.ejchkdet_rawmicr_14 = ejchkdet_rawmicr_14;
	}
	public String getEjchkdet_rawmicr_15() {
		return ejchkdet_rawmicr_15;
	}
	public void setEjchkdet_rawmicr_15(String ejchkdet_rawmicr_15) {
		this.ejchkdet_rawmicr_15 = ejchkdet_rawmicr_15;
	}
	public String getEjchkdet_rawmicr_16() {
		return ejchkdet_rawmicr_16;
	}
	public void setEjchkdet_rawmicr_16(String ejchkdet_rawmicr_16) {
		this.ejchkdet_rawmicr_16 = ejchkdet_rawmicr_16;
	}
	public String getEjchkdet_rawmicr_17() {
		return ejchkdet_rawmicr_17;
	}
	public void setEjchkdet_rawmicr_17(String ejchkdet_rawmicr_17) {
		this.ejchkdet_rawmicr_17 = ejchkdet_rawmicr_17;
	}
	public String getEjchkdet_rawmicr_18() {
		return ejchkdet_rawmicr_18;
	}
	public void setEjchkdet_rawmicr_18(String ejchkdet_rawmicr_18) {
		this.ejchkdet_rawmicr_18 = ejchkdet_rawmicr_18;
	}
	public String getEjchkdet_rawmicr_19() {
		return ejchkdet_rawmicr_19;
	}
	public void setEjchkdet_rawmicr_19(String ejchkdet_rawmicr_19) {
		this.ejchkdet_rawmicr_19 = ejchkdet_rawmicr_19;
	}
	public String getEjchkdet_rawmicr_20() {
		return ejchkdet_rawmicr_20;
	}
	public void setEjchkdet_rawmicr_20(String ejchkdet_rawmicr_20) {
		this.ejchkdet_rawmicr_20 = ejchkdet_rawmicr_20;
	}
	public String getEjchkdet_rawmicr_21() {
		return ejchkdet_rawmicr_21;
	}
	public void setEjchkdet_rawmicr_21(String ejchkdet_rawmicr_21) {
		this.ejchkdet_rawmicr_21 = ejchkdet_rawmicr_21;
	}
	public String getEjchkdet_rawmicr_22() {
		return ejchkdet_rawmicr_22;
	}
	public void setEjchkdet_rawmicr_22(String ejchkdet_rawmicr_22) {
		this.ejchkdet_rawmicr_22 = ejchkdet_rawmicr_22;
	}
	public String getEjchkdet_rawmicr_23() {
		return ejchkdet_rawmicr_23;
	}
	public void setEjchkdet_rawmicr_23(String ejchkdet_rawmicr_23) {
		this.ejchkdet_rawmicr_23 = ejchkdet_rawmicr_23;
	}
	public String getEjchkdet_rawmicr_24() {
		return ejchkdet_rawmicr_24;
	}
	public void setEjchkdet_rawmicr_24(String ejchkdet_rawmicr_24) {
		this.ejchkdet_rawmicr_24 = ejchkdet_rawmicr_24;
	}
	public String getEjchkdet_rawmicr_25() {
		return ejchkdet_rawmicr_25;
	}
	public void setEjchkdet_rawmicr_25(String ejchkdet_rawmicr_25) {
		this.ejchkdet_rawmicr_25 = ejchkdet_rawmicr_25;
	}
	public float getEjchkdet_amtexp() {
		return ejchkdet_amtexp;
	}
	public void setEjchkdet_amtexp(float ejchkdet_amtexp) {
		this.ejchkdet_amtexp = ejchkdet_amtexp;
	}
	public float getEjchkdet_amtscan() {
		return ejchkdet_amtscan;
	}
	public void setEjchkdet_amtscan(float ejchkdet_amtscan) {
		this.ejchkdet_amtscan = ejchkdet_amtscan;
	}
	public String getEjchkdet_reprocss() {
		return ejchkdet_reprocss;
	}
	public void setEjchkdet_reprocss(String ejchkdet_reprocss) {
		this.ejchkdet_reprocss = ejchkdet_reprocss;
	}
	public String getDvoroper__bcpdate() {
		return dvoroper__bcpdate;
	}
	public void setDvoroper__bcpdate(String dvoroper__bcpdate) {
		this.dvoroper__bcpdate = dvoroper__bcpdate;
	}
	public String getDvoroper_char008() {
		return dvoroper_char008;
	}
	public void setDvoroper_char008(String dvoroper_char008) {
		this.dvoroper_char008 = dvoroper_char008;
	}
	public float getBatch_amttotal_1() {
		return batch_amttotal_1;
	}
	public void setBatch_amttotal_1(float batch_amttotal_1) {
		this.batch_amttotal_1 = batch_amttotal_1;
	}
	public float getBatch_amttotal_2() {
		return batch_amttotal_2;
	}
	public void setBatch_amttotal_2(float batch_amttotal_2) {
		this.batch_amttotal_2 = batch_amttotal_2;
	}
	public float getBatch_amttotal_3() {
		return batch_amttotal_3;
	}
	public void setBatch_amttotal_3(float batch_amttotal_3) {
		this.batch_amttotal_3 = batch_amttotal_3;
	}
	public float getBatch_amttotal_4() {
		return batch_amttotal_4;
	}
	public void setBatch_amttotal_4(float batch_amttotal_4) {
		this.batch_amttotal_4 = batch_amttotal_4;
	}
	public float getBatch_amttotal_5() {
		return batch_amttotal_5;
	}
	public void setBatch_amttotal_5(float batch_amttotal_5) {
		this.batch_amttotal_5 = batch_amttotal_5;
	}
	public float getBatch_amttotal_6() {
		return batch_amttotal_6;
	}
	public void setBatch_amttotal_6(float batch_amttotal_6) {
		this.batch_amttotal_6 = batch_amttotal_6;
	}
	public float getBatch_amttotal_7() {
		return batch_amttotal_7;
	}
	public void setBatch_amttotal_7(float batch_amttotal_7) {
		this.batch_amttotal_7 = batch_amttotal_7;
	}
	public float getBatch_amttotal_8() {
		return batch_amttotal_8;
	}
	public void setBatch_amttotal_8(float batch_amttotal_8) {
		this.batch_amttotal_8 = batch_amttotal_8;
	}
	public float getBatch_amttotal_9() {
		return batch_amttotal_9;
	}
	public void setBatch_amttotal_9(float batch_amttotal_9) {
		this.batch_amttotal_9 = batch_amttotal_9;
	}
	public float getBatch_amttotal_10() {
		return batch_amttotal_10;
	}
	public void setBatch_amttotal_10(float batch_amttotal_10) {
		this.batch_amttotal_10 = batch_amttotal_10;
	}
	public float getBatch_amttotal_11() {
		return batch_amttotal_11;
	}
	public void setBatch_amttotal_11(float batch_amttotal_11) {
		this.batch_amttotal_11 = batch_amttotal_11;
	}
	public float getBatch_amttotal_12() {
		return batch_amttotal_12;
	}
	public void setBatch_amttotal_12(float batch_amttotal_12) {
		this.batch_amttotal_12 = batch_amttotal_12;
	}
	public float getBatch_amttotal_13() {
		return batch_amttotal_13;
	}
	public void setBatch_amttotal_13(float batch_amttotal_13) {
		this.batch_amttotal_13 = batch_amttotal_13;
	}
	public float getBatch_amttotal_14() {
		return batch_amttotal_14;
	}
	public void setBatch_amttotal_14(float batch_amttotal_14) {
		this.batch_amttotal_14 = batch_amttotal_14;
	}
	public float getBatch_amttotal_15() {
		return batch_amttotal_15;
	}
	public void setBatch_amttotal_15(float batch_amttotal_15) {
		this.batch_amttotal_15 = batch_amttotal_15;
	}
	public float getBatch_amttotal_16() {
		return batch_amttotal_16;
	}
	public void setBatch_amttotal_16(float batch_amttotal_16) {
		this.batch_amttotal_16 = batch_amttotal_16;
	}
	public float getBatch_amttotal_17() {
		return batch_amttotal_17;
	}
	public void setBatch_amttotal_17(float batch_amttotal_17) {
		this.batch_amttotal_17 = batch_amttotal_17;
	}
	public float getBatch_amttotal_18() {
		return batch_amttotal_18;
	}
	public void setBatch_amttotal_18(float batch_amttotal_18) {
		this.batch_amttotal_18 = batch_amttotal_18;
	}
	public float getBatch_amttotal_19() {
		return batch_amttotal_19;
	}
	BATCH_AMTTOTAL_19
	public void setBatch_amttotal_19(float batch_amttotal_19) {
		this.batch_amttotal_19 = batch_amttotal_19;
	}
	public float getBatch_amttotal_20() {
		return batch_amttotal_20;
	}
	BATCH_AMTTOTAL_20
	public void setBatch_amttotal_20(float batch_amttotal_20) {
		this.batch_amttotal_20 = batch_amttotal_20;
	}
	public float getBatch_amttotal_21() {
		return batch_amttotal_21;
	}
	BATCH_AMTTOTAL_21
	public void setBatch_amttotal_21(float batch_amttotal_21) {
		this.batch_amttotal_21 = batch_amttotal_21;
	}
	public float getBatch_amttotal_22() {
		return batch_amttotal_22;
	}
	BATCH_AMTTOTAL_22
	public void setBatch_amttotal_22(float batch_amttotal_22) {
		this.batch_amttotal_22 = batch_amttotal_22;
	}
	public float getBatch_amttotal_23() {
		return batch_amttotal_23;
	}
	BATCH_AMTTOTAL_23
	public void setBatch_amttotal_23(float batch_amttotal_23) {
		this.batch_amttotal_23 = batch_amttotal_23;
	}
	public float getBatch_amttotal_24() {
		return batch_amttotal_24;
	}
	BATCH_AMTTOTAL_24
	public void setBatch_amttotal_24(float batch_amttotal_24) {
		this.batch_amttotal_24 = batch_amttotal_24;
	}
	public float getBatch_amttotal_25() {
		return batch_amttotal_25;
	}
	BATCH_AMTTOTAL_25
	public void setBatch_amttotal_25(float batch_amttotal_25) {
		this.batch_amttotal_25 = batch_amttotal_25;
	}
	public float getBatch_amttotal_26() {
		return batch_amttotal_26;
	}
	BATCH_AMTTOTAL_26
	public void setBatch_amttotal_26(float batch_amttotal_26) {
		this.batch_amttotal_26 = batch_amttotal_26;
	}
	public float getBatch_amttotal_27() {
		return batch_amttotal_27;
	}
	BATCH_AMTTOTAL_27
	public void setBatch_amttotal_27(float batch_amttotal_27) {
		this.batch_amttotal_27 = batch_amttotal_27;
	}
	public float getBatch_amttotal_28() {
		return batch_amttotal_28;
	}
	BATCH_AMTTOTAL_28
	public void setBatch_amttotal_28(float batch_amttotal_28) {
		this.batch_amttotal_28 = batch_amttotal_28;
	}
	public float getBatch_amttotal_29() {
		return batch_amttotal_29;
	}
	BATCH_AMTTOTAL_29
	public void setBatch_amttotal_29(float batch_amttotal_29) {
		this.batch_amttotal_29 = batch_amttotal_29;
	}
	public float getBatch_amttotal_30() {
		return batch_amttotal_30;
	}
	BATCH_AMTTOTAL_30
	public void setBatch_amttotal_30(float batch_amttotal_30) {
		this.batch_amttotal_30 = batch_amttotal_30;
	}
	public float getBatch_amttotal_31() {
		return batch_amttotal_31;
	}
	BATCH_AMTTOTAL_31
	public void setBatch_amttotal_31(float batch_amttotal_31) {
		this.batch_amttotal_31 = batch_amttotal_31;
	}
	public float getBatch_amttotal_32() {
		return batch_amttotal_32;
	}
	BATCH_AMTTOTAL_32
	public void setBatch_amttotal_32(float batch_amttotal_32) {
		this.batch_amttotal_32 = batch_amttotal_32;
	}
	public float getBatch_amttotal_33() {
		return batch_amttotal_33;
	}
	BATCH_AMTTOTAL_33
	public void setBatch_amttotal_33(float batch_amttotal_33) {
		this.batch_amttotal_33 = batch_amttotal_33;
	}
	public float getBatch_amttotal_34() {
		return batch_amttotal_34;
	}
	BATCH_AMTTOTAL_34
	public void setBatch_amttotal_34(float batch_amttotal_34) {
		this.batch_amttotal_34 = batch_amttotal_34;
	}
	public float getBatch_amttotal_35() {
		return batch_amttotal_35;
	}
	BATCH_AMTTOTAL_35
	public void setBatch_amttotal_35(float batch_amttotal_35) {
		this.batch_amttotal_35 = batch_amttotal_35;
	}
	public float getBatch_amttotal_36() {
		return batch_amttotal_36;
	}
	BATCH_AMTTOTAL_36
	public void setBatch_amttotal_36(float batch_amttotal_36) {
		this.batch_amttotal_36 = batch_amttotal_36;
	}
	public float getBatch_amttotal_37() {
		return batch_amttotal_37;
	}
	BATCH_AMTTOTAL_37
	public void setBatch_amttotal_37(float batch_amttotal_37) {
		this.batch_amttotal_37 = batch_amttotal_37;
	}
	public float getBatch_amttotal_38() {
		return batch_amttotal_38;
	}
	BATCH_AMTTOTAL_38
	public void setBatch_amttotal_38(float batch_amttotal_38) {
		this.batch_amttotal_38 = batch_amttotal_38;
	}
	public float getBatch_amttotal_39() {
		return batch_amttotal_39;
	}
	BATCH_AMTTOTAL_39
	public void setBatch_amttotal_39(float batch_amttotal_39) {
		this.batch_amttotal_39 = batch_amttotal_39;
	}
	public float getBatch_amttotal_40() {
		return batch_amttotal_40;
	}
	BATCH_AMTTOTAL_40
	public void setBatch_amttotal_40(float batch_amttotal_40) {
		this.batch_amttotal_40 = batch_amttotal_40;
	}
	public float getBatch_amttotal_41() {
		return batch_amttotal_41;
	}
	BATCH_AMTTOTAL_41
	public void setBatch_amttotal_41(float batch_amttotal_41) {
		this.batch_amttotal_41 = batch_amttotal_41;
	}
	public float getBatch_amttotal_42() {
		return batch_amttotal_42;
	}
	BATCH_AMTTOTAL_42
	public void setBatch_amttotal_42(float batch_amttotal_42) {
		this.batch_amttotal_42 = batch_amttotal_42;
	}
	public float getBatch_amttotal_43() {
		return batch_amttotal_43;
	}
	BATCH_AMTTOTAL_43
	public void setBatch_amttotal_43(float batch_amttotal_43) {
		this.batch_amttotal_43 = batch_amttotal_43;
	}
	public float getBatch_amttotal_44() {
		return batch_amttotal_44;
	}
	BATCH_AMTTOTAL_44
	public void setBatch_amttotal_44(float batch_amttotal_44) {
		this.batch_amttotal_44 = batch_amttotal_44;
	}
	public float getBatch_amttotal_45() {
		return batch_amttotal_45;
	}
	BATCH_AMTTOTAL_45
	public void setBatch_amttotal_45(float batch_amttotal_45) {
		this.batch_amttotal_45 = batch_amttotal_45;
	}
	public float getBatch_amttotal_46() {
		return batch_amttotal_46;
	}
	BATCH_AMTTOTAL_46
	public void setBatch_amttotal_46(float batch_amttotal_46) {
		this.batch_amttotal_46 = batch_amttotal_46;
	}
	public float getBatch_amttotal_47() {
		return batch_amttotal_47;
	}
	BATCH_AMTTOTAL_47
	public void setBatch_amttotal_47(float batch_amttotal_47) {
		this.batch_amttotal_47 = batch_amttotal_47;
	}
	public float getBatch_amttotal_48() {
		return batch_amttotal_48;
	}
	BATCH_AMTTOTAL_48
	public void setBatch_amttotal_48(float batch_amttotal_48) {
		this.batch_amttotal_48 = batch_amttotal_48;
	}
	public float getBatch_amttotal_49() {
		return batch_amttotal_49;
	}
	BATCH_AMTTOTAL_49
	public void setBatch_amttotal_49(float batch_amttotal_49) {
		this.batch_amttotal_49 = batch_amttotal_49;
	}
	public float getBatch_amttotal_50() {
		return batch_amttotal_50;
	}
	BATCH_AMTTOTAL_50
	public void setBatch_amttotal_50(float batch_amttotal_50) {
		this.batch_amttotal_50 = batch_amttotal_50;
	}
	public float getBatch_amttotal_51() {
		return batch_amttotal_51;
	}
	BATCH_AMTTOTAL_51
	public void setBatch_amttotal_51(float batch_amttotal_51) {
		this.batch_amttotal_51 = batch_amttotal_51;
	}
	public float getBatch_amttotal_52() {
		return batch_amttotal_52;
	}
	BATCH_AMTTOTAL_52
	public void setBatch_amttotal_52(float batch_amttotal_52) {
		this.batch_amttotal_52 = batch_amttotal_52;
	}
	public float getBatch_amttotal_53() {
		return batch_amttotal_53;
	}
	BATCH_AMTTOTAL_53
	public void setBatch_amttotal_53(float batch_amttotal_53) {
		this.batch_amttotal_53 = batch_amttotal_53;
	}
	public float getBatch_amttotal_54() {
		return batch_amttotal_54;
	}
	BATCH_AMTTOTAL_54
	public void setBatch_amttotal_54(float batch_amttotal_54) {
		this.batch_amttotal_54 = batch_amttotal_54;
	}
	public float getBatch_amttotal_55() {
		return batch_amttotal_55;
	}
	BATCH_AMTTOTAL_55
	public void setBatch_amttotal_55(float batch_amttotal_55) {
		this.batch_amttotal_55 = batch_amttotal_55;
	}
	public float getBatch_amttotal_56() {
		return batch_amttotal_56;
	}
	BATCH_AMTTOTAL_56
	public void setBatch_amttotal_56(float batch_amttotal_56) {
		this.batch_amttotal_56 = batch_amttotal_56;
	}
	public float getBatch_amttotal_57() {
		return batch_amttotal_57;
	}
	BATCH_AMTTOTAL_57
	public void setBatch_amttotal_57(float batch_amttotal_57) {
		this.batch_amttotal_57 = batch_amttotal_57;
	}
	public float getBatch_amttotal_58() {
		return batch_amttotal_58;
	}
	BATCH_AMTTOTAL_58
	public void setBatch_amttotal_58(float batch_amttotal_58) {
		this.batch_amttotal_58 = batch_amttotal_58;
	}
	public float getBatch_amttotal_59() {
		return batch_amttotal_59;
	}
	BATCH_AMTTOTAL_59
	public void setBatch_amttotal_59(float batch_amttotal_59) {
		this.batch_amttotal_59 = batch_amttotal_59;
	}
	public float getBatch_amttotal_60() {
		return batch_amttotal_60;
	}
	BATCH_AMTTOTAL_60
	public void setBatch_amttotal_60(float batch_amttotal_60) {
		this.batch_amttotal_60 = batch_amttotal_60;
	}
	public float getBatch_amttotal_61() {
		return batch_amttotal_61;
	}
	BATCH_AMTTOTAL_61
	public void setBatch_amttotal_61(float batch_amttotal_61) {
		this.batch_amttotal_61 = batch_amttotal_61;
	}
	public float getBatch_amttotal_62() {
		return batch_amttotal_62;
	}
	BATCH_AMTTOTAL_62
	public void setBatch_amttotal_62(float batch_amttotal_62) {
		this.batch_amttotal_62 = batch_amttotal_62;
	}
	public float getBatch_amttotal_63() {
		return batch_amttotal_63;
	}
	BATCH_AMTTOTAL_63
	public void setBatch_amttotal_63(float batch_amttotal_63) {
		this.batch_amttotal_63 = batch_amttotal_63;
	}
	public float getBatch_amttotal_64() {
		return batch_amttotal_64;
	}
	BATCH_AMTTOTAL_64
	public void setBatch_amttotal_64(float batch_amttotal_64) {
		this.batch_amttotal_64 = batch_amttotal_64;
	}
	public float getBatch_amttotal_65() {
		return batch_amttotal_65;
	}
	BATCH_AMTTOTAL_65
	public void setBatch_amttotal_65(float batch_amttotal_65) {
		this.batch_amttotal_65 = batch_amttotal_65;
	}
	public float getBatch_amttotal_66() {
		return batch_amttotal_66;
	}
	BATCH_AMTTOTAL_66
	public void setBatch_amttotal_66(float batch_amttotal_66) {
		this.batch_amttotal_66 = batch_amttotal_66;
	}
	public float getBatch_amttotal_67() {
		return batch_amttotal_67;
	}
	BATCH_AMTTOTAL_67
	public void setBatch_amttotal_67(float batch_amttotal_67) {
		this.batch_amttotal_67 = batch_amttotal_67;
	}
	public float getBatch_amttotal_68() {
		return batch_amttotal_68;
	}
	BATCH_AMTTOTAL_68
	public void setBatch_amttotal_68(float batch_amttotal_68) {
		this.batch_amttotal_68 = batch_amttotal_68;
	}
	public float getBatch_amttotal_69() {
		return batch_amttotal_69;
	}
	BATCH_AMTTOTAL_69
	public void setBatch_amttotal_69(float batch_amttotal_69) {
		this.batch_amttotal_69 = batch_amttotal_69;
	}
	public float getBatch_amttotal_70() {
		return batch_amttotal_70;
	}
	BATCH_AMTTOTAL_70
	public void setBatch_amttotal_70(float batch_amttotal_70) {
		this.batch_amttotal_70 = batch_amttotal_70;
	}
	public float getBatch_amttotal_71() {
		return batch_amttotal_71;
	}
	BATCH_AMTTOTAL_71
	public void setBatch_amttotal_71(float batch_amttotal_71) {
		this.batch_amttotal_71 = batch_amttotal_71;
	}
	public float getBatch_amttotal_72() {
		return batch_amttotal_72;
	}
	BATCH_AMTTOTAL_72
	public void setBatch_amttotal_72(float batch_amttotal_72) {
		this.batch_amttotal_72 = batch_amttotal_72;
	}
	public float getBatch_amttotal_73() {
		return batch_amttotal_73;
	}
	BATCH_AMTTOTAL_73
	public void setBatch_amttotal_73(float batch_amttotal_73) {
		this.batch_amttotal_73 = batch_amttotal_73;
	}
	public float getBatch_amttotal_74() {
		return batch_amttotal_74;
	}
	BATCH_AMTTOTAL_74
	public void setBatch_amttotal_74(float batch_amttotal_74) {
		this.batch_amttotal_74 = batch_amttotal_74;
	}
	public float getBatch_amttotal_75() {
		return batch_amttotal_75;
	}
	BATCH_AMTTOTAL_75
	public void setBatch_amttotal_75(float batch_amttotal_75) {
		this.batch_amttotal_75 = batch_amttotal_75;
	}
	public float getBatch_amttotal_76() {
		return batch_amttotal_76;
	}
	BATCH_AMTTOTAL_76
	public void setBatch_amttotal_76(float batch_amttotal_76) {
		this.batch_amttotal_76 = batch_amttotal_76;
	}
	public String getEjchkdet_flagcrt_1() {
		return ejchkdet_flagcrt_1;
	}
	EJCHKDET_FLAGCRT_1
	public void setEjchkdet_flagcrt_1(String ejchkdet_flagcrt_1) {
		this.ejchkdet_flagcrt_1 = ejchkdet_flagcrt_1;
	}
	public String getEjchkdet_flagcrt_2() {
		return ejchkdet_flagcrt_2;
	}
	EJCHKDET_FLAGCRT_2
	public void setEjchkdet_flagcrt_2(String ejchkdet_flagcrt_2) {
		this.ejchkdet_flagcrt_2 = ejchkdet_flagcrt_2;
	}
	public String getEjchkdet_flagcrt_3() {
		return ejchkdet_flagcrt_3;
	}
	EJCHKDET_FLAGCRT_3
	public void setEjchkdet_flagcrt_3(String ejchkdet_flagcrt_3) {
		this.ejchkdet_flagcrt_3 = ejchkdet_flagcrt_3;
	}
	public String getEjchkdet_flagcrt_4() {
		return ejchkdet_flagcrt_4;
	}
	EJCHKDET_FLAGCRT_4
	public void setEjchkdet_flagcrt_4(String ejchkdet_flagcrt_4) {
		this.ejchkdet_flagcrt_4 = ejchkdet_flagcrt_4;
	}
	public String getEjchkdet_flagcrt_5() {
		return ejchkdet_flagcrt_5;
	}
	EJCHKDET_FLAGCRT_5
	public void setEjchkdet_flagcrt_5(String ejchkdet_flagcrt_5) {
		this.ejchkdet_flagcrt_5 = ejchkdet_flagcrt_5;
	}
	public String getEjchkdet_flagcrt_6() {
		return ejchkdet_flagcrt_6;
	}
	EJCHKDET_FLAGCRT_6
	public void setEjchkdet_flagcrt_6(String ejchkdet_flagcrt_6) {
		this.ejchkdet_flagcrt_6 = ejchkdet_flagcrt_6;
	}
	public String getEjchkdet_flagcrt_7() {
		return ejchkdet_flagcrt_7;
	}
	EJCHKDET_FLAGCRT_7
	public void setEjchkdet_flagcrt_7(String ejchkdet_flagcrt_7) {
		this.ejchkdet_flagcrt_7 = ejchkdet_flagcrt_7;
	}
	public String getEjchkdet_flagcrt_8() {
		return ejchkdet_flagcrt_8;
	}
	EJCHKDET_FLAGCRT_8
	public void setEjchkdet_flagcrt_8(String ejchkdet_flagcrt_8) {
		this.ejchkdet_flagcrt_8 = ejchkdet_flagcrt_8;
	}
	public String getEjchkdet_flagcrt_9() {
		return ejchkdet_flagcrt_9;
	}
	EJCHKDET_FLAGCRT_9
	public void setEjchkdet_flagcrt_9(String ejchkdet_flagcrt_9) {
		this.ejchkdet_flagcrt_9 = ejchkdet_flagcrt_9;
	}
	public String getEjchkdet_flagcrt_10() {
		return ejchkdet_flagcrt_10;
	}
	EJCHKDET_FLAGCRT_10
	public void setEjchkdet_flagcrt_10(String ejchkdet_flagcrt_10) {
		this.ejchkdet_flagcrt_10 = ejchkdet_flagcrt_10;
	}
	public String getEjchkdet_flagcrt_11() {
		return ejchkdet_flagcrt_11;
	}
	EJCHKDET_FLAGCRT_11
	public void setEjchkdet_flagcrt_11(String ejchkdet_flagcrt_11) {
		this.ejchkdet_flagcrt_11 = ejchkdet_flagcrt_11;
	}
	public String getEjchkdet_flagcrt_12() {
		return ejchkdet_flagcrt_12;
	}
	EJCHKDET_FLAGCRT_12
	public void setEjchkdet_flagcrt_12(String ejchkdet_flagcrt_12) {
		this.ejchkdet_flagcrt_12 = ejchkdet_flagcrt_12;
	}
	public String getEjchkdet_flagcrt_13() {
		return ejchkdet_flagcrt_13;
	}
	EJCHKDET_FLAGCRT_13
	public void setEjchkdet_flagcrt_13(String ejchkdet_flagcrt_13) {
		this.ejchkdet_flagcrt_13 = ejchkdet_flagcrt_13;
	}
	public String getEjchkdet_flagcrt_14() {
		return ejchkdet_flagcrt_14;
	}
	EJCHKDET_FLAGCRT_14
	public void setEjchkdet_flagcrt_14(String ejchkdet_flagcrt_14) {
		this.ejchkdet_flagcrt_14 = ejchkdet_flagcrt_14;
	}
	public String getEjchkdet_flagcrt_15() {
		return ejchkdet_flagcrt_15;
	}
	EJCHKDET_FLAGCRT_15
	public void setEjchkdet_flagcrt_15(String ejchkdet_flagcrt_15) {
		this.ejchkdet_flagcrt_15 = ejchkdet_flagcrt_15;
	}
	public String getEjchkdet_flagcrt_16() {
		return ejchkdet_flagcrt_16;
	}
	@XmlElement(name ="EJCHKDET_FLAGCRT_16")
	public void setEjchkdet_flagcrt_16(String ejchkdet_flagcrt_16) {
		this.ejchkdet_flagcrt_16 = ejchkdet_flagcrt_16;
	}
	public String getEjchkdet_flagcrt_17() {
		return ejchkdet_flagcrt_17;
	}
	@XmlElement(name ="EJCHKDET_FLAGCRT_17")
	public void setEjchkdet_flagcrt_17(String ejchkdet_flagcrt_17) {
		this.ejchkdet_flagcrt_17 = ejchkdet_flagcrt_17;
	}
	public String getEjchkdet_flagcrt_18() {
		return ejchkdet_flagcrt_18;
	}
	@XmlElement(name ="EJCHKDET_FLAGCRT_18")
	public void setEjchkdet_flagcrt_18(String ejchkdet_flagcrt_18) {
		this.ejchkdet_flagcrt_18 = ejchkdet_flagcrt_18;
	}
	public String getEjchkdet_flagcrt_19() {
		return ejchkdet_flagcrt_19;
	}
	@XmlElement(name ="EJCHKDET_FLAGCRT_19")
	public void setEjchkdet_flagcrt_19(String ejchkdet_flagcrt_19) {
		this.ejchkdet_flagcrt_19 = ejchkdet_flagcrt_19;
	}
	public String getEjchkdet_flagcrt_20() {
		return ejchkdet_flagcrt_20;
	}
	@XmlElement(name ="EJCHKDET_FLAGCRT_20")
	public void setEjchkdet_flagcrt_20(String ejchkdet_flagcrt_20) {
		this.ejchkdet_flagcrt_20 = ejchkdet_flagcrt_20;
	}
	public String getEjchkdet_flagcrt_21() {
		return ejchkdet_flagcrt_21;
	}
	@XmlElement(name ="EJCHKDET_FLAGCRT_21")
	public void setEjchkdet_flagcrt_21(String ejchkdet_flagcrt_21) {
		this.ejchkdet_flagcrt_21 = ejchkdet_flagcrt_21;
	}
	public String getEjchkdet_flagcrt_22() {
		return ejchkdet_flagcrt_22;
	}
	@XmlElement(name ="EJCHKDET_FLAGCRT_22")
	public void setEjchkdet_flagcrt_22(String ejchkdet_flagcrt_22) {
		this.ejchkdet_flagcrt_22 = ejchkdet_flagcrt_22;
	}
	public String getEjchkdet_flagcrt_23() {
		return ejchkdet_flagcrt_23;
	}
	@XmlElement(name ="EJCHKDET_FLAGCRT_23")
	public void setEjchkdet_flagcrt_23(String ejchkdet_flagcrt_23) {
		this.ejchkdet_flagcrt_23 = ejchkdet_flagcrt_23;
	}
	public String getEjchkdet_flagcrt_24() {
		return ejchkdet_flagcrt_24;
	}
	@XmlElement(name ="EJCHKDET_FLAGCRT_24")
	public void setEjchkdet_flagcrt_24(String ejchkdet_flagcrt_24) {
		this.ejchkdet_flagcrt_24 = ejchkdet_flagcrt_24;
	}
	public String getEjchkdet_flagcrt_25() {
		return ejchkdet_flagcrt_25;
	}
	@XmlElement(name ="EJCHKDET_FLAGCRT_25")
	public void setEjchkdet_flagcrt_25(String ejchkdet_flagcrt_25) {
		this.ejchkdet_flagcrt_25 = ejchkdet_flagcrt_25;
	}
	public float getCustseqnm() {
		return custseqnm;
	}
	@XmlElement(name ="CUSTSEQNM")
	public void setCustseqnm(float custseqnm) {
		this.custseqnm = custseqnm;
	}
}
*/