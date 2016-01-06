package com.dok.spring.aop.pointcutdesig;

import org.springframework.stereotype.Component;

@Component
public class Math {

	public int add(int a,int b){
		return a+ b;
	}
	
	public int substract(int a,int b){
		return a- b;
	}

	
}
