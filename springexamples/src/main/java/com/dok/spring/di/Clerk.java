package com.dok.spring.di;

public class Clerk {
	
	private IWork work;

	public void setWork(IWork work) {
		this.work = work;
	}
	
	public String dowork(){
		return this.work.dowork();
	}

}
