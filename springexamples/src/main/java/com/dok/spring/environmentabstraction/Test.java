package com.dok.spring.environmentabstraction;

import junit.framework.Assert;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	@org.junit.Test
	public void testComponentScan(){
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.getEnvironment().setActiveProfiles("prod");
		ctx.register(AppConfigDev.class,AppConfigProd.class);
		ctx.refresh();
		DataSource ds = ctx.getBean("ds",DataSource.class);
		
		Assert.assertSame("PROD DS", ds.getInfo());
	}
	/*
	 * In addition, profiles may also be activated declaratively through the spring.profiles.active property 
	 * which may be specified through system environment variables, 
	 * JVM system properties, servlet context parameters in web.xml or even as an entry in JNDI
	 * 
	 * 
	 * */
	
	 
}
