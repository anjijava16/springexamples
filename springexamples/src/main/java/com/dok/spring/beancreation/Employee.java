package com.dok.spring.beancreation;

public class Employee {
	
	private String name;
	private String dob;
	private Employee(String name, String dob) {
		super();
		this.name = name;
		this.dob = dob;
	}
	
	public static Employee createInstance(String name,String dob){
		return new Employee(name, dob);
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", dob=" + dob + "]";
	}

	public String getName() {
		return name;
	}

	public String getDob() {
		return dob;
	}
	

}
