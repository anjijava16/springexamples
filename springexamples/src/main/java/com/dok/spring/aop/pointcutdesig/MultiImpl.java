package com.dok.spring.aop.pointcutdesig;

import org.springframework.stereotype.Component;

@Component
public class MultiImpl implements Multiply{

	public int multiply(int a, int b) {
		return a*b;
	}

}
