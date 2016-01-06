package com.dok.spring.beancreation;

public class StudentFactory {
	
	
	public Student createStudentInstance(String name,String dob){
		return new Student(name,dob);
	}

}
