package com.lcwd.user.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.lcwd.user.service.entity.Rating;
import com.lcwd.user.service.entity.User;
import com.lcwd.user.service.exception.ResourceNotFoundException;
import com.lcwd.user.service.repository.UserRepository;
import com.lcwd.user.service.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class) ;
	
	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		String randomUserId = UUID.randomUUID().toString();
		user.setUserId(randomUserId);
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

//	@Override
//	public User getUser(String userId) {
//		// TODO Auto-generated method stub
//		return userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User with given id is not found on server!"));
//	}
	
	@Override
	public User getUser(String userId) {
		// TODO Auto-generated method stub
//		get user from database with the help of user repository
		User user = userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User with given id is not found on server!"));
//		fetch the rating of the above user from rating service
//		http://localhost:8083/ratings/users/ABC
		ArrayList<Rating> ratingsOfUser = restTemplate.getForObject("http://localhost:8083/ratings/users/b90b3e10-a40c-4837-88af-ee9c18721000", ArrayList.class);
		logger.info("{} ", ratingsOfUser);
		user.setRatings(ratingsOfUser);
		return user;
	}
	
}
