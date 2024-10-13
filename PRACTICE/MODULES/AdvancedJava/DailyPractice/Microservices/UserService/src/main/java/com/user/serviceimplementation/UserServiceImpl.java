package com.user.serviceimplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.user.exceptions.ResourceNotFoundException;
import com.user.model.User;
import com.user.repository.UserRepository;
import com.user.services.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		List<User> users = userRepository.findAll();
		return users;
	}

	@Override
	public User getUserById(Long id) {
		// TODO Auto-generated method stub
		Optional<User> user = userRepository.findById(id);
		return user.orElseThrow(() -> new ResourceNotFoundException("User " + id + " does not exist"));
	}

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		User usr = userRepository.save(user);
		return usr;
	}

}
