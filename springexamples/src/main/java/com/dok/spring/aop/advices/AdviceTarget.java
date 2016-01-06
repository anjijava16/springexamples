package com.dok.spring.aop.advices;

import org.springframework.stereotype.Component;

@Component
public class AdviceTarget {

	public void doTask1(){
		System.out.println("Doing task 1");
	}
	
	
}
