package com.cap1.config;

import java.io.File;

import javax.sql.DataSource;
import javax.xml.bind.Unmarshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.batch.item.file.MultiResourceItemReader;
import org.springframework.batch.item.file.transform.BeanWrapperFieldExtractor;
import org.springframework.batch.item.file.transform.DelimitedLineAggregator;
import org.springframework.batch.item.file.transform.LineAggregator;
import org.springframework.batch.item.xml.StaxEventItemReader;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.PathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.cap1.model.CashDet;
import com.cap1.model.Ciw2;
import com.cap1.model.Depmic2;
import com.cap1.model.EcboxBal;
import com.cap1.model.IpSignOn;
import com.cap1.model.SignOn;
import com.cap1.model.BuySell;
//import com.cap1.processor.SignOnProcessor;




@Configuration
@EnableBatchProcessing
@ComponentScan
public class BatchConfiguration {

	   @Autowired
	    public JobBuilderFactory jobBuilderFactory;

	    @Autowired
	    public StepBuilderFactory stepBuilderFactory;
	        
	    @Value("classpath:20160823_argo_ejxtract_030_du2_init.dat")
	    private Resource inputFile;
	    
	    @Autowired
	    public Tasklet tasklet;
	    // tag::readerwriterprocessor[]
	    @SuppressWarnings("rawtypes")
		@Bean
	    public StaxEventItemReader readSignOn() {
	    	StaxEventItemReader readSignOn = new StaxEventItemReader();
//	    	readSignOn.setResource(new ClassPathResource("20160823_argo_ejxtract_030_du2_init.dat"));
	    	readSignOn.setResource(inputFile);
	    	readSignOn.setFragmentRootElementName("SIGNON");
	    	
	        ((StaxEventItemReader) readSignOn).setUnmarshaller(unMarshaller());
	        
	        return readSignOn;
	    }
	    @Bean
	    public Jaxb2Marshaller unMarshaller(){
	    	Jaxb2Marshaller unMarshaller = new Jaxb2Marshaller();
	    	unMarshaller.setClassesToBeBound(SignOn.class);
	    	return unMarshaller;
	    }
	    
	   /* @Bean
	    public SignOnProcessor processor() {
	        return new SignOnProcessor();
	    }
	   */
	    @SuppressWarnings("rawtypes")
		@Bean
	    public FlatFileItemWriter writeSignOn() {
	    	String outputFile = "cvs/signOn.dat";
	    	FlatFileItemWriter writeSignOn = new FlatFileItemWriter();
	    	writeSignOn.setResource(new FileSystemResource(new File(outputFile)));
	    	writeSignOn.setLineAggregator(lineAggregatorSignOn());
	        return writeSignOn;
	    }
	    // end::readerwriterprocessor[]

	    @SuppressWarnings({ "unchecked", "rawtypes" })
		@Bean
		public LineAggregator lineAggregatorSignOn(){
	    	DelimitedLineAggregator lineAggregator = new DelimitedLineAggregator();
	    	lineAggregator.setDelimiter("|");
	    	lineAggregator.setFieldExtractor(fieldExtractorSignOn());
			return lineAggregator;
		}
	   
	    @SuppressWarnings("rawtypes")
		@Bean
	   public BeanWrapperFieldExtractor fieldExtractorSignOn(){
	    	BeanWrapperFieldExtractor fieldExtractor = new BeanWrapperFieldExtractor();
	    	fieldExtractor.setNames(new String[]{"ADS_REGIONID","ADS_OFFICEID","ADS_CASHID",
	    			"ADS_TRANSEQ","ADS_MSGSEQ","ADS_OVERRIDETYPE","ADS_REVERSIBLE","ADS_REVERSE",
	    			"ADS_PARTREVERSE","ADS_IPITEM","ADS_STFWSTATUS","ADS_ERRORID","ADS_GROUPID",
	    			"ADS_TRANID","ADS_DATE","ADS_TIME","ADS_EJPROCLIST","ADS_OVERRIDEOPER",
	    			"ADS_MAJORFNCT","ADS_MINORFNCT","ADS_PROCDATE","_OPRWORK__OPRID","_OPRWORK__CBOXNUM",
	    			"_OPRWORK__AREA"    	
	    	});
			return fieldExtractor;
	    }
	    
	    @SuppressWarnings("rawtypes")
		@Bean
	    public StaxEventItemReader readDepmic2() {
	    	System.out.println(">>>>>>>>>>>>>>>");
	    	StaxEventItemReader readDepmic2 = new StaxEventItemReader();
	    	readDepmic2.setResource(new ClassPathResource("20160823_argo_ejxtract_030_du2_init.dat"));
	    	readDepmic2.setFragmentRootElementName("DEPMIC2");
	        ((StaxEventItemReader) readDepmic2).setUnmarshaller(unMarshallerDepmic2());
	        
	        return readDepmic2;
	    }
	    @Bean
	    public Jaxb2Marshaller unMarshallerDepmic2(){
	    	Jaxb2Marshaller unMarshaller = new Jaxb2Marshaller();
	    	unMarshaller.setClassesToBeBound(Depmic2.class);
	    	return unMarshaller;
	    }
	    @SuppressWarnings({ "unchecked", "rawtypes" })
		@Bean
	    public FlatFileItemWriter writeDepmic2() {
			FlatFileItemWriter writer = new FlatFileItemWriter();
	        writer.setResource(new FileSystemResource(new File("cvs/depmic2.dat")));
	        writer.setLineAggregator(lineAggregatorDepmic2());
	        return writer;
	    }
	    // end::readerwriterprocessor[]

	    @SuppressWarnings("rawtypes")
		@Bean
		public LineAggregator lineAggregatorDepmic2(){
	    	DelimitedLineAggregator lineAggregator = new DelimitedLineAggregator();
	    	lineAggregator.setDelimiter("|");
	    	lineAggregator.setFieldExtractor(fieldExtractorDepmic2());
			return lineAggregator;
		}
	   
	    @SuppressWarnings("rawtypes")
		@Bean
	   public BeanWrapperFieldExtractor fieldExtractorDepmic2(){
	    	BeanWrapperFieldExtractor fieldExtractor = new BeanWrapperFieldExtractor();
	    	fieldExtractor.setNames(new String[]{"ADS_REGIONID","ADS_OFFICEID","ADS_CASHID","ADS_TRANSEQ","ADS_MSGSEQ","ADS_OVERRIDETYPE","ADS_REVERSIBLE","ADS_REVERSE",
	    			"ADS_PARTREVERSE","ADS_IPITEM","ADS_STFWSTATUS","ADS_ERRORID","ADS_GROUPID","ADS_TRANID","ADS_DATE","ADS_TIME","ADS_EJPROCLIST","ADS_OVERRIDEOPER",
	    			"ADS_MAJORFNCT","ADS_MINORFNCT","ADS_PROCDATE","ACCOUNT_NUMACT19","ACCOUNT_TYPEACCT","ACCOUNT_DESCACCT","ACCOUNT_NUMBANK","ACCOUNT_DESCBANK",
	    			"ACCOUNT_ABANUMBR","ACCOUNT_DOCUMTID","ACCOUNT_CHRMICRS","ACCOUNT__UID","ACCOUNT_DATE","ACCOUNT_TMSTP","MONETARY_AMTCASH","MONETARY_AMTCHECK",
	    			"MONETARY_AMTTOTAL","MONETARY_AMTCSBK","MONETARY_AMTRO","MONETARY_SESSFUND","SESSTRAN_TRNGROUP","HEADER_TRANID","HEADER_IDVERS","HEADER_EXCEPTN"
	    	});
			return fieldExtractor;
	    }
	    

	    @SuppressWarnings("rawtypes")
		@Bean
	    public StaxEventItemReader readCiw2() {
	    	System.out.println(">>>>>>>>>>>>>>>");
	    	@SuppressWarnings("rawtypes")
			StaxEventItemReader reader = new StaxEventItemReader();
	    	// need some logic , whicn be able to read dynamically 10 files, one after the other
	    	reader.setResource(new ClassPathResource("20160823_argo_ejxtract_030_du2_init.dat"));
	    	reader.setFragmentRootElementName("CIW2");
	        ((StaxEventItemReader) reader).setUnmarshaller(unMarshallerCiw2());
	        
	        return reader;
	    }
	    @Bean
	    public Jaxb2Marshaller unMarshallerCiw2(){
	    	Jaxb2Marshaller unMarshaller = new Jaxb2Marshaller();
	    	unMarshaller.setClassesToBeBound(Ciw2.class);
	    	return unMarshaller;
	    }
	    @Bean
	    public FlatFileItemWriter writeCiw2() {
	    	FlatFileItemWriter writer = new FlatFileItemWriter();
	        writer.setResource(new FileSystemResource(new File("cvs/ciw2.dat")));
	        writer.setLineAggregator(lineAggregatorCiw2());
	        return writer;
	    }
	    // end::readerwriterprocessor[]

	    @SuppressWarnings({ "rawtypes", "unchecked" })
		@Bean
		public LineAggregator lineAggregatorCiw2(){
			DelimitedLineAggregator lineAggregator = new DelimitedLineAggregator();
	    	lineAggregator.setDelimiter("|");
	    	lineAggregator.setFieldExtractor(fieldExtractorCiw2());
			return lineAggregator;
		}
	   
	    @SuppressWarnings("rawtypes")
		@Bean
	   public BeanWrapperFieldExtractor fieldExtractorCiw2(){
	    	BeanWrapperFieldExtractor fieldExtractor = new BeanWrapperFieldExtractor();
	    	fieldExtractor.setNames(new String[]{"ADS_REGIONID","ads_officeid","ads_cashid","ads_transeq","ads_msgseq","ads_overridetype","ads_reversible","ads_reverse",
	    			"ads_partreverse","ads_ipitem","ads_stfwstatus","ads_errorid","ads_groupid","ads_tranid","ads_date","ads_time","ads_ejproclist","ads_overrideoper",
	    			"ads_majorfnct","ads_minorfnct","ads_procdate","ejciw_namfull_1","ejciw_numtaxid_1","ejciw_address_1","ejciw_address_2","ejciw_ctystzip_1","ejciw_city",
	    			"ejciw_state","ejciw_zip","ejciw_dob_1","ejciw_idnumber_1","ejciw_typeid_1","ejciw_country","ejciw_descreln_1","ejciw_numacct_1","ejciw_transeq_1",
	    			"rtcagg_othercnd_1","rtcagg_ident_1","rtcagg_othname_1","rtcagg_name_1","rtcagg_tin_1","rtcagg_unabletp_1","rtcagg_numtaxid_1","custseqnm","nou_chkagreement"
	    	});
			return fieldExtractor;
	    }
	    
	    @SuppressWarnings("rawtypes")
		@Bean
	    public StaxEventItemReader readCashDet() {
	    	System.out.println(">>>>>>>>>>>>>>>");
	    	@SuppressWarnings("rawtypes")
			StaxEventItemReader reader = new StaxEventItemReader();
	    	// need some logic , whicn be able to read dynamically 10 files, one after the other
	    	reader.setResource(new ClassPathResource("20160823_argo_ejxtract_030_du2_init.dat"));
	    	reader.setFragmentRootElementName("CASHDET");
	        ((StaxEventItemReader) reader).setUnmarshaller(unMarshallerCashDet());
	        
	        return reader;
	    }
	    @Bean
	    public Jaxb2Marshaller unMarshallerCashDet(){
	    	Jaxb2Marshaller unMarshaller = new Jaxb2Marshaller();
	    	unMarshaller.setClassesToBeBound(CashDet.class);
	    	return unMarshaller;
	    }
	    @Bean
	    public FlatFileItemWriter writeCashDet() {
	    	FlatFileItemWriter writer = new FlatFileItemWriter();
	        writer.setResource(new FileSystemResource(new File("cvs/cashDet.dat")));
	        writer.setLineAggregator(lineAggregatorCashDet());
	        return writer;
	    }
	    // end::readerwriterprocessor[]

	    @SuppressWarnings({ "rawtypes", "unchecked" })
		@Bean
		public LineAggregator lineAggregatorCashDet(){
			DelimitedLineAggregator lineAggregator = new DelimitedLineAggregator();
	    	lineAggregator.setDelimiter("|");
	    	lineAggregator.setFieldExtractor(fieldExtractorCashDet());
			return lineAggregator;
		}
	   
	    @SuppressWarnings("rawtypes")
		@Bean
	   public BeanWrapperFieldExtractor fieldExtractorCashDet(){
	    	BeanWrapperFieldExtractor fieldExtractor = new BeanWrapperFieldExtractor();
	    	fieldExtractor.setNames(new String[]{"ads_regionid","ads_officeid","ads_cashid","ads_transeq","ads_msgseq","ads_overridetype","ads_reversible",
	    		"ads_reverse","ads_partreverse","ads_ipitem","ads_stfwstatus","ads_errorid","ads_groupid","ads_tranid","ads_date","ads_time","ads_ejproclist",
	    		"ads_overrideoper","ads_majorfnct","ads_minorfnct","ads_procdate","cashdet_amt001","cashdet_amt002","cashdet_amt005","cashdet_amt010",
	    		"cashdet_amt020","cashdet_amt050","cashdet_amt100","cashdet_amtc001","cashdet_amtc005","cashdet_amtc010","cashdet_amtc025","cashdet_amtc050",
	    		"cashdet_amtc100","cashdet_amtcoin","cashdet_amtcurr","cashdet_amttotal","cashdet_num001","cashdet_num002","cashdet_num005","cashdet_num010",
	    		"cashdet_num020","cashdet_num050","cashdet_num100","cashdet_numc001","cashdet_numc005","cashdet_numc010","cashdet_numc025","cashdet_numc050",
	    		"cashdet_numc100","cashdet_amtcsbk","cashdet_countamt","monetary_amtcsbk","monetary_sessfund","account_numacct","dvoroper__bcpdate","dvoroper_char008",
	    		"custseqnm" 
	    	});
			return fieldExtractor;
	    }
	    
	    @SuppressWarnings("rawtypes")
		@Bean
	    public StaxEventItemReader readEcboxBal() {
	    	System.out.println(">>>>>>>>>>>>>>>");
	    	@SuppressWarnings("rawtypes")
			StaxEventItemReader reader = new StaxEventItemReader();
	    	// need some logic , whicn be able to read dynamically 10 files, one after the other
	    	reader.setResource(new ClassPathResource("20160823_argo_ejxtract_030_du2_init.dat"));
	    	reader.setFragmentRootElementName("ECBOXBAL");
	        ((StaxEventItemReader) reader).setUnmarshaller(unMarshallerEcboxBal());
	        
	        return reader;
	    }
	    @Bean
	    public Jaxb2Marshaller unMarshallerEcboxBal(){
	    	Jaxb2Marshaller unMarshaller = new Jaxb2Marshaller();
	    	unMarshaller.setClassesToBeBound(EcboxBal.class);
	    	return unMarshaller;
	    }
	    @Bean
	    public FlatFileItemWriter writeEcboxBal() {
	    	FlatFileItemWriter writer = new FlatFileItemWriter();
	        writer.setResource(new FileSystemResource(new File("cvs/ecboxBal.dat")));
	        writer.setLineAggregator(lineAggregatorEcboxBal());
	        return writer;
	    }
	    // end::readerwriterprocessor[]

	    @SuppressWarnings({ "rawtypes", "unchecked" })
		@Bean
		public LineAggregator lineAggregatorEcboxBal(){
			DelimitedLineAggregator lineAggregator = new DelimitedLineAggregator();
	    	lineAggregator.setDelimiter("|");
	    	lineAggregator.setFieldExtractor(fieldExtractorEcboxBal());
			return lineAggregator;
		}
	   
	    @SuppressWarnings("rawtypes")
		@Bean
	   public BeanWrapperFieldExtractor fieldExtractorEcboxBal(){
	    	BeanWrapperFieldExtractor fieldExtractor = new BeanWrapperFieldExtractor();
	    	fieldExtractor.setNames(new String[]{"ads_regionid","ads_officeid","ads_cashid","ads_transeq","ads_msgseq","ads_overridetype","ads_reversible",
	    		"ads_reverse","ads_partreverse","ads_ipitem","ads_stfwstatus","ads_errorid","ads_groupid","ads_tranid","ads_date","ads_time","ads_ejproclist",
	    		"ads_overrideoper","ads_majorfnct","ads_minorfnct","ads_procdate","cashbox_balance","custseqnm"
	    	});
			return fieldExtractor;
	    }
	    
	    @SuppressWarnings("rawtypes")
		@Bean
	    public StaxEventItemReader readIpSignOn() {
	    	System.out.println(">>>>>>>>>>>>>>>");
	    	@SuppressWarnings("rawtypes")
			StaxEventItemReader reader = new StaxEventItemReader();
	    	// need some logic , whicn be able to read dynamically 10 files, one after the other
	    	reader.setResource(new ClassPathResource("20160823_argo_ejxtract_030_du2_init.dat"));
	    	reader.setFragmentRootElementName("IPSIGNON");
	        ((StaxEventItemReader) reader).setUnmarshaller(unMarshallerIpSignOn());
	        
	        return reader;
	    }
	    @Bean
	    public Jaxb2Marshaller unMarshallerIpSignOn(){
	    	Jaxb2Marshaller unMarshaller = new Jaxb2Marshaller();
	    	unMarshaller.setClassesToBeBound(IpSignOn.class);
	    	return unMarshaller;
	    }
	    @Bean
	    public FlatFileItemWriter writeIpSignOn() {
	    	FlatFileItemWriter writer = new FlatFileItemWriter();
	        writer.setResource(new FileSystemResource(new File("cvs/ipsignon.dat")));
	        writer.setLineAggregator(lineAggregatorIpSignOn());
	        return writer;
	    }
	    // end::readerwriterprocessor[]

	    @SuppressWarnings({ "rawtypes", "unchecked" })
		@Bean
		public LineAggregator lineAggregatorIpSignOn(){
			DelimitedLineAggregator lineAggregator = new DelimitedLineAggregator();
	    	lineAggregator.setDelimiter("|");
	    	lineAggregator.setFieldExtractor(fieldExtractorIpSignOn());
			return lineAggregator;
		}
	   
	    @SuppressWarnings("rawtypes")
		@Bean
	   public BeanWrapperFieldExtractor fieldExtractorIpSignOn(){
	    	BeanWrapperFieldExtractor fieldExtractor = new BeanWrapperFieldExtractor();
	    	fieldExtractor.setNames(new String[]{"ads_regionid","ads_officeid","ads_cashid","ads_transeq","ads_msgseq","ads_overridetype","ads_reversible",
	    		"ads_reverse","ads_partreverse","ads_ipitem","ads_stfwstatus","ads_errorid","ads_groupid","ads_tranid","ads_date","ads_time","ads_ejproclist",
	    		"ads_overrideoper","ads_majorfnct","ads_minorfnct","ads_procdate","_oprwork__oprid","_oprwork__cboxnum","_oprwork__dmpprdt","_oprwork__dmpnxdt",
	    		"_oprwork__area"
	    	});
			return fieldExtractor;
	    }
	    
	    @SuppressWarnings("rawtypes")
		@Bean
	    public StaxEventItemReader readBuySell() {
	    	System.out.println(">>>>>>>>>>>>>>>");
	    	@SuppressWarnings("rawtypes")
			StaxEventItemReader reader = new StaxEventItemReader();
	    	// need some logic , whicn be able to read dynamically 10 files, one after the other
	    	reader.setResource(new ClassPathResource("20160823_argo_ejxtract_030_du2_init.dat"));
	    	reader.setFragmentRootElementName("BUYSELL");
	        ((StaxEventItemReader) reader).setUnmarshaller(unMarshallerBuySell());
	        
	        return reader;
	    }
	    @Bean
	    public Jaxb2Marshaller unMarshallerBuySell(){
	    	Jaxb2Marshaller unMarshaller = new Jaxb2Marshaller();
	    	unMarshaller.setClassesToBeBound(BuySell.class);
	    	return unMarshaller;
	    }
	    @Bean
	    public FlatFileItemWriter writeBuySell() {
	    	FlatFileItemWriter writer = new FlatFileItemWriter();
	    	writer.setAppendAllowed(true);
	        writer.setResource(new FileSystemResource(new File("cvs/buysell.dat")));
	        writer.setLineAggregator(lineAggregatorBuySell());
	        return writer;
	    }
	    // end::readerwriterprocessor[]

	    @SuppressWarnings({ "rawtypes", "unchecked" })
		@Bean
		public LineAggregator lineAggregatorBuySell(){
			DelimitedLineAggregator lineAggregator = new DelimitedLineAggregator();
	    	lineAggregator.setDelimiter("|");
	    	lineAggregator.setFieldExtractor(fieldExtractorBuySell());
			return lineAggregator;
		}
	   
	    @SuppressWarnings("rawtypes")
		@Bean
	   public BeanWrapperFieldExtractor fieldExtractorBuySell(){
	    	BeanWrapperFieldExtractor fieldExtractor = new BeanWrapperFieldExtractor();
	    	fieldExtractor.setNames(new String[]{"ads_regionid","ads_officeid","ads_cashid","ads_transeq","ads_msgseq","ads_overridetype","ads_reversible",
	    		"ads_reverse","ads_partreverse","ads_ipitem","ads_stfwstatus","ads_errorid","ads_groupid","ads_tranid","ads_date","ads_time","ads_ejproclist",
	    		"ads_overrideoper","ads_majorfnct","ads_minorfnct","ads_procdate","buysell_flgbuysl","buysell_typebysl","buysell_typeex","buysell_title","buysell_atmtm12",
	    		"buysell_numtelr","buysell_numother","buysell_amt100","buysell_amt050","buysell_amt020","buysell_amt010","buysell_amt005","buysell_amt002","buysell_amt001",
	    		"buysell_amtc100","buysell_amtc050","buysell_amtc025","buysell_amtc010","buysell_amtc005","buysell_amtc001","monetar_amtcash","monetary_amtcsbk",
	    		"monetary_amttotal","buysell_amttotal","cashbox_balance","buysell_shipment","sesstran_trngroup","hsndmone_amtcash","hsndmone_amtcheck","hsndmone_amtcsbk",
	    		"custseqnm"	    	});
			return fieldExtractor;
	    }
	    public Tasklet taskletToDeleteFile(Resource inputFile){
			return null;
	    	
	    }
	    
	   /* @Bean
	    public StepExecutionListener_SignOn listener(){
	    	
	    }
*/	    @Bean
	    public Job importUserJob() {
	        return jobBuilderFactory.get("importUserJob")
	                .incrementer(new RunIdIncrementer())
	                .flow(stepSignOn())
	                .next(stepDepmic2())
	                .next(stepCiw2())
	                .next(stepCashDet())
	               .next(stepEcboxBal())
	               .next(stepIpSignOn())
	               .next(stepBuySell())
	               .next(step(inputFile))
	                .end()
	                .build();
	    }

	    @Bean
	    public Step stepSignOn() {
	        return stepBuilderFactory.get("stepSignOn")
	                .<SignOn,SignOn>chunk(1000)
	                .reader(readSignOn())
//	                .processor(processor())
	                .writer(writeSignOn())
	                .build();
	    }
	    @Bean
	    public Step stepDepmic2() {
	        return stepBuilderFactory.get("stepDepmic2")
	                .chunk(1000)
	                .reader(readDepmic2())
	                .writer(writeDepmic2())
	                .build();
	    }
	    @Bean
	    public Step stepCiw2() {
	        return stepBuilderFactory.get("stepCiw2")
	                .chunk(1000)
	                .reader(readCiw2())
	                .writer(writeCiw2())
	                .build();
	    }
	    
	    @Bean
	    public Step stepCashDet() {
	        return stepBuilderFactory.get("stepCashDet")
	                .chunk(1000)
	                .reader(readCashDet())
	                .writer(writeCashDet())
	                .build();
	    }
	    @Bean
	    public Step stepEcboxBal() {
	        return stepBuilderFactory.get("stepEcboxBal")
	                .chunk(1000)
	                .reader(readEcboxBal())
	                .writer(writeEcboxBal())
	                .build();
	    }
	    
	    @Bean
	    public Step stepIpSignOn() {
	        return stepBuilderFactory.get("stepIpSignOn")
	                .chunk(1000)
	                .reader(readIpSignOn())
	                .writer(writeIpSignOn())
	                .build();
	    }
	    @Bean
	    public Step stepBuySell() {
	        return stepBuilderFactory.get("stepBuySell")
	                .chunk(1000)
	                .reader(readBuySell())
	                .writer(writeBuySell())
	                .build();
	    }
	   /* @Bean
	    public Step step(Resource inputFile){
	    	return stepBuilderFactory.get("step(inputFile)")
	    			.tasklet(taskletToDeleteFile(inputFile))
	    			
	    			;
	    }*/
}
