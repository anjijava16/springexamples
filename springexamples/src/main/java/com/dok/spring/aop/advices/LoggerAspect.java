package com.dok.spring.aop.advices;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LoggerAspect {

	@Before("execution(com.dok.spring.aop.advices.AdviceTarget.doTask1(..))")
	public void doAccessCheck(){
		System.out.println("Before Advice initiated for access checking");
	}
	
	public void afterReturningAdvice(Object obj){
		System.out.println("After returning advice intiated");
	}
	
	public void afterThrowingadvice(BoException excp){
		System.out.println("After throwing advice initiated "+excp.getMessage());
	}
	
	public void afterFinally(){
		System.out.println("After finally advice initiated ");
	}
	
	
}
