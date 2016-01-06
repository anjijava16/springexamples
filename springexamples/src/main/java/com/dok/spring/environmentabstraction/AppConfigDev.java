package com.dok.spring.environmentabstraction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class AppConfigDev {
	@Bean(name="ds")
	public DataSource dataSource(){
		return new DevDataSource();
	}
}
