package com.dok.spring.annotationconfig;

import junit.framework.Assert;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {


	@org.junit.Test
	public void testAutowiredAnnotation() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"annotationconfig/spring-annotationconfig.xml"});
		Student student = context.getBean("student", Student.class);
		Assert.assertEquals("Hi,I am Student", student.printstudent());
	}
	

	
}
