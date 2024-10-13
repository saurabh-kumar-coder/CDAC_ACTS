package com.userservice.service;

import java.util.List;

import com.userservice.entity.User;

public interface UserService {

	//create a user
	User create(User user);
	
	//get a user
	User get(String userId);
	
	//get all user
	List<User> getAll();
}
