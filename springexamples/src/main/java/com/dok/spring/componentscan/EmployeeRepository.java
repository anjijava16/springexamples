package com.dok.spring.componentscan;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {

	public String read(){
		return "conan";
	}
}
