package com.dok.spring.beancreation;

class Student {
	
	private String name;
	private String dob;
	public Student(String name, String dob) {
		super();
		this.name = name;
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", dob=" + dob + "]";
	}
	public String getName() {
		return name;
	}
	public String getDob() {
		return dob;
	}
	
	
	

}
