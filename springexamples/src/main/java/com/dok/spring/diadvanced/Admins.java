package com.dok.spring.diadvanced;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Admins {

	
	private Properties adminnames;
	private List<String> adminlist;
	private Set<String> adminset;
	private Map<Integer,String> adminmap;
	public void setAdminnames(Properties adminnames) {
		this.adminnames = adminnames;
	}
	public void setAdminlist(List<String> adminlist) {
		this.adminlist = adminlist;
	}
	public void setAdminset(Set<String> adminset) {
		this.adminset = adminset;
	}
	public void setAdminmap(Map<Integer, String> adminmap) {
		this.adminmap = adminmap;
	}
	@Override
	public String toString() {
		return "Admins [adminnames=" + adminnames + ", adminlist=" + adminlist
				+ ", adminset=" + adminset + ", adminmap=" + adminmap + "]";
	}
	
	
	
	
}
