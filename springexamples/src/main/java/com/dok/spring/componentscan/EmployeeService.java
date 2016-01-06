package com.dok.spring.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Scope("prototype")//default singleton
@Service("employeeservice")
public class EmployeeService {

	@Autowired
	private EmployeeRepository emprepo;
	
	public String read(){
		return emprepo.read();
	}
	
}
