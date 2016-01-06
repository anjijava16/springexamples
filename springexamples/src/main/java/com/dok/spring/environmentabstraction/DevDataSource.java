package com.dok.spring.environmentabstraction;

public class DevDataSource implements DataSource {

	public String getInfo() {
		return "DEV DS";
	}

}
