package com.lcwd.user.service.services;

import java.util.List;

import com.lcwd.user.service.entity.User;

public interface UserService {

//	save a particular user
	User saveUser(User user);
	
//	get the List of users
	List<User> getAllUser();
	
//	get a particular user
	User getUser(String userId);
}
