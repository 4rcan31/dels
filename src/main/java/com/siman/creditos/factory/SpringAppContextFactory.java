package com.siman.creditos.factory;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.siman.creditos.constants.CountryEnum;

public class SpringAppContextFactory {

	private static ApplicationContext ctxNoCountry = null;
	private static ApplicationContext ctxOrion = null;
	
	//Context para Sunnel
	private static ApplicationContext ctxSV = null;
	private static ApplicationContext ctxGT = null;
	private static ApplicationContext ctxNI = null;
	private static ApplicationContext ctxCR = null;
	
	private static void createInstance(){
		ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
		ctxNoCountry = WebApplicationContextUtils.getWebApplicationContext((ServletContext) context.getContext() );
//		ctxNoCountry = new ClassPathXmlApplicationContext("/com/siman/creditos/config/app-context-jpa.xml");
	}
	
	public static ApplicationContext getInstance(){
		if(ctxNoCountry==null) createInstance();
		return ctxNoCountry;
	}
	
	private static void createInstanceOrion(){
		try {
			//ctxOrion = WebApplicationContextUtils.getWebApplicationContext((ServletContext) context.getContext() );
	 		ctxOrion = new ClassPathXmlApplicationContext("/com/siman/creditos/config/app-context-jpa.xml");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static ApplicationContext getInstanceOrion(){	
		createInstanceOrion();
		return ctxOrion;
	}									   
	private static void createInstanceSV(){
		ctxSV = new ClassPathXmlApplicationContext("/com/siman/creditos/config/app-context-jpa-sv.xml");
	}
	
	private static void createInstanceGT(){
		ctxGT = new ClassPathXmlApplicationContext("/com/siman/creditos/config/app-context-jpa-gt.xml");
	}

	private static void createInstanceNI(){
		ctxNI = new ClassPathXmlApplicationContext("/com/siman/creditos/config/app-context-jpa-ni.xml");
	}
	
	private static void createInstanceCR(){
		ctxCR = new ClassPathXmlApplicationContext("/com/siman/creditos/config/app-context-jpa-cr.xml");
	}
	
	public static ApplicationContext getSarIntance(){
		return new ClassPathXmlApplicationContext("/com/siman/creditos/config/app-context-jpa-stgcreditos.xml");
	}
	
	public static ApplicationContext getOrionInstance(){
		return new ClassPathXmlApplicationContext("/com/siman/creditos/config/app-context-jpa.xml");
	}												 
	public static ApplicationContext getInstance(CountryEnum pais){
		switch(pais){
			case SV:
				if(ctxSV==null) createInstanceSV();
				return ctxSV;
			case GT:
				if(ctxGT==null) createInstanceGT();
				return ctxGT;
			case NI:
				if(ctxNI==null) createInstanceNI();
				return ctxNI;
			case CR:
				if(ctxCR==null) createInstanceCR();
				return ctxCR;
			default:
				return null;
				
		}
	}	
}
