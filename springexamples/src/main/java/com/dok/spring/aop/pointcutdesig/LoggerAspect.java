package com.dok.spring.aop.pointcutdesig;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LoggerAspect {

	
	@Before("execution(public * *(..))")
	private void pointcutExecPublic(JoinPoint joinPoint) {
		/*
		System.out.println("EXECUTES BEFORE ANY PUBLIC METHOD CALL");
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("******");
		*/
	}
	
	@Before("execution(* sub*(..))")
	private void pointcutExecRegExMethodName() {
		System.out.println("execution pointcut designator:EXECUTES BEFORE ANY  METHOD STARTING WITH KEYWORD SUB");
	}
	
	@Before("execution(* com.dok.spring.aop.pointcutdesig.Multiply.*(..))")
	private void pointcutExecByInterfaceName(){
		System.out.println("execution pointcut designator:EXECUTES BEFORE ANY METHOD OF INTERFACE MULTIPLY");
	}
	
	@Before("execution(* com.dok.spring.aop.pointcutdesig.packagepointcut.*.*(..))")
	private void pointcutExecByPackage(){
		System.out.println("execution pointcut designator:Executes before every method in package com.dok.spring.aop.pointcutdesig.packagepointcut");
	}
	
	@Before("within(com.dok.spring.aop.pointcutdesig.packagepointcut.*)")
	private void pointcutWithinByPackage(){
		System.out.println("within pointcut designator: runs before every method in package com.dok.spring.aop.pointcutdesig.packagepointcut");
	}
	
	@Before("this(com.dok.spring.aop.pointcutdesig.Multiply)")
	private void pointcutThisByBeanType(){
		System.out.println("this pointcut designator: EXECUTES BEFORE ANY METHOD OF INTERFACE MULTIPLY");
	}
	
	@Before("target(com.dok.spring.aop.pointcutdesig.Multiply)")
	private void pointcutTargetByBeanType(){
		System.out.println("target pointcut designator: EXECUTES BEFORE ANY METHOD OF INTERFACE MULTIPLY");
	}
	
	/*
	@Before("@target(com.dok.spring.aop.pointcutdesig.CustomTransaction)")
	private void pointcutTargetObjectHavingAnnotation(){
		System.out.println("@target pointcut designator: EXECUTES BEFORE ANY METHOD OF bean having @CustomTransaction");
	}
	*/
	
	
}
