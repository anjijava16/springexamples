package com.dok.spring.javaconfig;

import junit.framework.Assert;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	@org.junit.Test
	public void testComponentScan(){
		ApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
		//EmployeeService service = context.getBean(EmployeeService.class);
		EmployeeService service = context.getBean("employeeservice",EmployeeService.class);
		
		Assert.assertSame("conan", service.read());
	}
	
	
	 
}
