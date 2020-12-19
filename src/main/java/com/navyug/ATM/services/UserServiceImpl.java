package com.navyug.ATM.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.navyug.ATM.models.User;
import com.navyug.ATM.repository.IUserRepository;

@Service
public class UserServiceImpl implements IUserService{
	
	@Autowired
	private IUserRepository userRepository;
	
	@Override
	public List<User> getUsers() {
		
		return this.userRepository.findAll();
	}

	@Override
	public User getUserById(long userId) {

		return this.userRepository.findById(userId).orElseThrow();
	}

	@Override
	public void addUser(User user) {
		this.userRepository.save(user);		
	}

}
