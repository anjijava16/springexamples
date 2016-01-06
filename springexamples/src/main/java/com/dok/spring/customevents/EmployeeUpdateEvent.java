package com.dok.spring.customevents;

import org.springframework.context.ApplicationEvent;

public class EmployeeUpdateEvent extends ApplicationEvent{

	private String employeename;
	
	public EmployeeUpdateEvent(Object source,String empname) {
		
		super(source);
		this.employeename=empname;
		System.out.println("event created");
		
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getEmployeename() {
		return employeename;
	}
	
	

}
