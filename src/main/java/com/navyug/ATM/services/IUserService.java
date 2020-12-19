package com.navyug.ATM.services;

import java.util.List;

import com.navyug.ATM.models.User;

public interface IUserService {
	
	public List<User> getUsers();
	
	public User getUserById(long userId);
	
	public void addUser(User user);
	

}
