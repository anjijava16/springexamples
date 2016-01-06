package com.dok.spring.aop.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MathsInvocationHandler implements InvocationHandler{

	private Object target;
	
	
	public Object getTarget() {
		return target;
	}


	public void setTarget(Object target) {
		this.target = target;
	}


	public MathsInvocationHandler(Object target) {
		super();
		this.target = target;
	}


	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		long a = System.currentTimeMillis();
		Object result = method.invoke(target, args);
		System.out.println("total time taken  "
				+ (System.currentTimeMillis() - a));
		return result;
	}

}
