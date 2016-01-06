package com.dok.spring.customevents;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class EmpService implements ApplicationEventPublisherAware{

	private ApplicationEventPublisher applicationEventPublisher;
	
	public void setApplicationEventPublisher(ApplicationEventPublisher eventpublisher) {
		this.applicationEventPublisher = eventpublisher;
	}
	
	public void updateEmployee(){
	  EmployeeUpdateEvent updateEvent = new EmployeeUpdateEvent(this, "rajesh");
	  applicationEventPublisher.publishEvent(updateEvent);
	}

}
