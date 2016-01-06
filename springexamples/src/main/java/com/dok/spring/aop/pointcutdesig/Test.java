package com.dok.spring.aop.pointcutdesig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dok.spring.aop.pointcutdesig.packagepointcut.Greet;

public class Test {
	
	@org.junit.Test
	public void testPointcutExecPublic() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"/aop/pointcutdesig/spring-pointcutdesig.xml"});
		Math math = context.getBean(Math.class);
		math.add(1, 2);
	}
	
	@org.junit.Test
	public void testPointcutExecRegExMethodName() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"/aop/pointcutdesig/spring-pointcutdesig.xml"});
		Math math = context.getBean(Math.class);
		math.substract(10, 2);
	}
	
	@org.junit.Test
	public void testPointcutExecByInterfaceName() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"/aop/pointcutdesig/spring-pointcutdesig.xml"});
		Multiply multipl = context.getBean(Multiply.class);
		multipl.multiply(10, 10);
	}
	
	@org.junit.Test
	public void testPointcutExecByPackage() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"/aop/pointcutdesig/spring-pointcutdesig.xml"});
		Greet greet = context.getBean(Greet.class);
		greet.greet();
	}
	
	@org.junit.Test
	public void testPointcutWithinByPackage() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"/aop/pointcutdesig/spring-pointcutdesig.xml"});
		Greet greet = context.getBean(Greet.class);
		greet.greet();
	}
	
	@org.junit.Test
	public void testPointcutTargetObjectHavingAnnotation() {
//		@SuppressWarnings("resource")
//		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"/aop/pointcutdesig/spring-pointcutdesig.xml"});
//		EmployeeRepo repo = context.getBean(EmployeeRepo.class);
//		repo.save();
		
	}

}
