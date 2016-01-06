package com.dok.spring.messageresource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@org.junit.Test
	public void testBasicMessageResource() {
		@SuppressWarnings("resource")
		MessageSource msgsource = new ClassPathXmlApplicationContext(new String[]{"messagesource/basic/spring-message-resource-1.xml"});
		System.out.println(msgsource.getMessage("message", null, null));
		System.out.println(msgsource.getMessage("windowsmessage", null, null, null));
		System.out.println(msgsource.getMessage("argument.required", new String[]{"first"}, "default", null));
	
	}
	
	
	@org.junit.Test
	public void testAdvancedMessageResource() {
		@SuppressWarnings("resource")
		ApplicationContext container = new ClassPathXmlApplicationContext(new String[]{"messagesource/advanced/spring-message-resource-1.xml"});
		Employee emp = container.getBean("emp", Employee.class);
		System.out.println(emp.getMessage());
	}
	
	
	
}
