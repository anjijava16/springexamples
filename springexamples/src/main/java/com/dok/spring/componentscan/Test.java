package com.dok.spring.componentscan;

import junit.framework.Assert;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@org.junit.Test
	public void testComponentScan(){
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"componentscan/spring-componentscan.xml"});
		//EmployeeService service = context.getBean(EmployeeService.class);
		EmployeeService service = context.getBean("employeeservice",EmployeeService.class);
		
		Assert.assertSame("conan", service.read());
	}
	
	/*
	 * Spring provides further stereotype annotations: @Component, @Service, and @Controller. @Component is a generic stereotype for any Spring-managed 
	 * component. @Repository, @Service, and @Controller are specializations of @Component for more specific use cases, for example, in the
	 *  persistence, service, and presentation layers, respectively. Therefore, you can annotate your component classes with @Component, 
	 *  but by annotating them with @Repository, @Service, or @Controller instead, your classes are more properly suited for processing by 
	 *  tools or associating with aspects. For example, these stereotype annotations make ideal targets for pointcuts. It is also possible that 
	 *  @Repository, @Service, and @Controller may carry additional semantics in future releases of the Spring Framework. Thus, if you are choosing 
	 *  between using @Component or @Service for your service layer, @Service is clearly the better choice. Similarly, as stated above, @Repository 
	 *  is already supported as a marker for automatic exception translation in your persistence layer.
	 * 
	 */
}
