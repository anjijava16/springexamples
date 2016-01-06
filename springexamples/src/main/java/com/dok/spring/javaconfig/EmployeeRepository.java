package com.dok.spring.javaconfig;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {

	public String read(){
		return "conan";
	}
}
