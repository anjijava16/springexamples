package com.dok.spring.annotationconfig;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	@Autowired
	private ShowStudent showstudent;
	
	public String printstudent(){
		return showstudent.show();
	}
	
	
}
