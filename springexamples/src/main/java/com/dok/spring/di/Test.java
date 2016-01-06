package com.dok.spring.di;

import junit.framework.Assert;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@org.junit.Test
	public void testConstructorInjection() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"di/spring-di.xml"});
		Employee emp = context.getBean("employee", Employee.class);
		Assert.assertEquals("Doing office work", emp.executeWork());
	}
	
	@org.junit.Test
	public void testSetterInjection(){
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"di/spring-di.xml"});
		Clerk clrk = context.getBean("clerk", Clerk.class);
		Assert.assertEquals("Doing office work", clrk.dowork());
	}

}
