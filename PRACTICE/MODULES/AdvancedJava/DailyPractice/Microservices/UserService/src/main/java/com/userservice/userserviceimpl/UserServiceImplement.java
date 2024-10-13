package com.userservice.userserviceimpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userservice.entity.User;
import com.userservice.exception.ResourceNotFoundException;
import com.userservice.repository.UserRepository;
import com.userservice.service.UserService;

@Service
public class UserServiceImplement implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User create(User user) {
		// TODO Auto-generated method stub
		user.setUserId(UUID.randomUUID().toString());
		User user1 = userRepository.save(user);
		return user1;
		
	}

	@Override
	public User get(String userId) {
		// TODO Auto-generated method stub
		User user = userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User doesn't exist with id : " + userId));
		// get rating of the above user from RATING-SERVICE
		// URL used :
		// http://localhost:8083/ratings/604cbe35-97da-4b3f-b2fc-a972ec7d0847
		return user;
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		List<User> users = userRepository.findAll();
		return users;
	}

}
