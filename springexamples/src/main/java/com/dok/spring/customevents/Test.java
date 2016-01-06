package com.dok.spring.customevents;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	@org.junit.Test
	public void testCustomEventPublishingAndListening(){
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"customevents/spring-customevents.xml"});
		EmpService empservice = context.getBean("empservice", EmpService.class);
		empservice.updateEmployee();
	}
	

}
