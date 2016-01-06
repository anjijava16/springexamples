package com.dok.spring.aop.pointcutdesig.packagepointcut;

import org.springframework.stereotype.Component;


@Component
public class GreetImpl implements Greet {

	public String greet() {
		return "Hi,how are you";

	}

}
