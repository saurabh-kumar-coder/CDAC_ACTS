package com.user.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.user.model.User;

public interface UserService {
	public List<User> getUsers();
	public User getUserById(Long id);
	public User addUser(User user);
}
