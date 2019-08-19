package com.avm.data;


import com.avm.model.admin;

public interface adminDAO {
	public void addUser(admin user)throws Exception;
	public admin getUser(String userId) throws Exception;
}
