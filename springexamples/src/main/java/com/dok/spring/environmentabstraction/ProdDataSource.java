package com.dok.spring.environmentabstraction;

public class ProdDataSource implements DataSource {

	public String getInfo() {
		return "PROD DS";
	}

}
