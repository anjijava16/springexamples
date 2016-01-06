package com.dok.spring.aop.advices;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdviceTest {

	@Test
	public void testBeforeAdvice() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"/aop/advices/spring-advices.xml"});
		AdviceTarget target = context.getBean(AdviceTarget.class);
		target.doTask1();
	}

	@Test
	public void testAfterReturningAdvice() {
		
	}

	@Test
	public void testAfterThrowingadvice() {
		
	}

	@Test
	public void testAfterFinally() {
		
	}

}
