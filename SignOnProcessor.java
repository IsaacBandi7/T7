package com.cap1.processor;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import com.cap1.main.Ads_regionException;
import com.cap1.model.SignOn;




public class SignOnProcessor implements ItemProcessor<SignOn, SignOn>{

	private static final Logger log = LoggerFactory.getLogger(SignOnProcessor.class);
	@Override
	public SignOn process(SignOn signOn) throws Exception {
		try{
//		System.out.println("from SignOnProcessor");
			log.info("from SignOnProcessor");
		String ads_region=signOn.getADS_REGIONID().trim();
		if(ads_region != null&& !ads_region.equals("")){
			if(ads_region.length()>4)
				log.warn("Length is freater than 4");	
		}else{
			log.error("value cannot be null");
			System.out.println("value cannott be null -----");
			throw new Ads_regionException("ads_region cannot be null"); // stopping the job
		}
				
		}catch(Exception e){
			log.error("value --------null");  //error.txt 
		}
		
		return signOn;
	}

}
