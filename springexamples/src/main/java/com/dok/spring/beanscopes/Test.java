package com.dok.spring.beanscopes;

import junit.framework.Assert;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

		@org.junit.Test
		public void testSingletonBean() {
			@SuppressWarnings("resource")
			ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"beanscopes/spring-beanscopes.xml"});
			CalculaterService calc1 = context.getBean("calculator", CalculaterService.class);
			CalculaterService calc2 = context.getBean("calculator", CalculaterService.class);
			Assert.assertEquals(calc1,calc2);
		}	
		
		@org.junit.Test
		public void testPrototypeBean() {
			@SuppressWarnings("resource")
			ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"beanscopes/spring-beanscopes.xml"});
			PrintService print1 = context.getBean("printservice", PrintService.class);
			PrintService print2 = context.getBean("printservice", PrintService.class);
			Assert.assertNotSame(print1,print2);
		}	
		/*
		 * The request, session, and global session scopes are only available if you use a web-aware Spring ApplicationContext 
		 * implementation (such as XmlWebApplicationContext). If you use these scopes with regular Spring IoC containers such as the
		 *  ClassPathXmlApplicationContext, you get an IllegalStateException complaining about an unknown bean scope
		 * 
		 * 
		 * 
		 * 
		 * */
		
		
	

}
