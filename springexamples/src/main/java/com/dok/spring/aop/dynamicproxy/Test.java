package com.dok.spring.aop.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;




public class Test {
	
	@org.junit.Test
	public void testDynamicProxyMaths() {
		Maths addop = new MathOps();
		
		Maths addopproxy = (Maths) Proxy.newProxyInstance(Test.class.getClassLoader(), addop.getClass().getInterfaces(),
				(InvocationHandler) new MathsInvocationHandler(addop));
		
		System.out.println(addopproxy.add(1, 2));
	}
	
}
