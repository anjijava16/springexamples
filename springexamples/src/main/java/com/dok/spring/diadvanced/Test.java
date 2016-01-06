package com.dok.spring.diadvanced;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@org.junit.Test
	public void testCollectionsAsBeanProps() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"diadvanced/spring-diadvanced.xml"});
		Admins admins= context.getBean("admins", Admins.class);
		System.out.println(admins.toString());
	
	}
	
	

}
