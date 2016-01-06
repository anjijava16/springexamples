package com.dok.spring.xmlenvironmentabstraction;

public class DevDataSource implements DataSource {

	public String getInfo() {
		return "DEV DS";
	}

}
