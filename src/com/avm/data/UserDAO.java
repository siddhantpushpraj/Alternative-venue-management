package com.avm.data;
import com.avm.model.User;

public interface UserDAO {
	
	public void addUser(User user)throws Exception;
	public User getUser(String userId) throws Exception;
	
}