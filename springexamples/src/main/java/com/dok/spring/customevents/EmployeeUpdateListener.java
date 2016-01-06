package com.dok.spring.customevents;

import org.springframework.context.ApplicationListener;

public class EmployeeUpdateListener implements ApplicationListener<EmployeeUpdateEvent>{

	public void onApplicationEvent(EmployeeUpdateEvent event) {
		System.out.println("Inside employee update listener");
		System.out.println(event.getEmployeename()+" Employee got updated");
	}

}
