package com.dok.spring.messageresource;

import java.util.Locale;

import org.springframework.context.MessageSource;

public class Employee {

	private MessageSource messagesource;

	public void setMessagesource(MessageSource messagesource) {
		this.messagesource = messagesource;
	}
	
	public String getMessage(){
		return this.messagesource.getMessage("argument.required", new String[]{"thou"}, Locale.UK);
	}
	
	
}
