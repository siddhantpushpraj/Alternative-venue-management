package com.avm.model;

public class admin {
	
	private String adminId;
	private String password;
	private String name;
	
	
	public admin() {
		
		
	}
	
	public admin(String adminId, String password, String name) {
		
		this.adminId = adminId;
		this.password = password;
		this.name = name;
	}


	public admin(String adminId, String name) {
		
		this.adminId = adminId;
		this.name = name;
	}


	
	
	public String getAdminId() {
		return adminId;
	}


	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "admin [adminId=" + adminId + ", password=" + password + ", name=" + name + "]";
	}
	
	
	

}
