package com.dok.spring.aop.pointcutdesig;

import org.springframework.stereotype.Component;

@CustomTransaction
@Component
public class EmployeeRepo {

	
	public void save(){
		System.out.println("executing save");
	}
}
