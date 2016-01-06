package com.dok.spring.beancreation;

import junit.framework.Assert;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@org.junit.Test
	public void testConstructorInstantiation() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"beancreation/spring-beancreation.xml"});
		Department dept = context.getBean("dept", Department.class);
		Assert.assertEquals("heisenberg", dept.getDepartmentDescription());
	}
	
	@org.junit.Test
	public void testLocalStaticFactoryMethodInstantiation(){
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"beancreation/spring-beancreation.xml"});
		Employee emp = context.getBean("emp", Employee.class);
		System.out.println(emp.toString());
		Assert.assertEquals("rod johnson", emp.getName());
	}
	
	@org.junit.Test
	public void testInstanceFactoryMethodInstantiation(){
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"beancreation/spring-beancreation.xml"});
		Student student = context.getBean("student", Student.class);
		System.out.println(student.toString());
		Assert.assertEquals("rod johnson", student.getName());
	}
	
	

}
