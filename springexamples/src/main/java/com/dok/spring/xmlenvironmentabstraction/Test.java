package com.dok.spring.xmlenvironmentabstraction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@org.junit.Test
	public void testConstructorInjection() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"xmlenvironmentabstraction/spring-xmlenvironmentabstraction-dev.xml",
				"xmlenvironmentabstraction/spring-xmlenvironmentabstraction-prod.xml"});
		
		
		
		}
	
	
		

}
