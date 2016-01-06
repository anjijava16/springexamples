package com.dok.spring.xmlenvironmentabstraction;

public class ProdDataSource implements DataSource {

	public String getInfo() {
		return "PROD DS";
	}

}
