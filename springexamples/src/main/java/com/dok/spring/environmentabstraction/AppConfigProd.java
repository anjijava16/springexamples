package com.dok.spring.environmentabstraction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Configuration
@Profile("prod")
public class AppConfigProd {
	
	@Bean(name="ds")
	public DataSource dataSource(){
		return new ProdDataSource();
	}

}
