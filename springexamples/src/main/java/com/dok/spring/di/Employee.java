package com.dok.spring.di;

public class Employee {
	
	private IWork work;

	public Employee(IWork work) {
		super();
		this.work = work;
	}
	
	public String  executeWork(){
		return this.work.dowork();
	}

}
