package com.dok.spring.xmlconfig;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BasicTest {

	@Test
	public void testAdd() {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"xmlconfig/spring-xmlconfig.xml"});
		MathService mathservice = (MathService) context.getBean("mathOp");
		Assert.assertSame(15, mathservice.add(5, 10));
		
	}

}
