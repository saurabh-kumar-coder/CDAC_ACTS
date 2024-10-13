package com.springjwt.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springjwt.repository.UserRepository;
@Service
public class UserDetailsServiceImple implements UserDetailsService {

	private final UserRepository userRepository;
	
	public UserDetailsServiceImple(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return userRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("User does not exist with username : " + username));
	}

}
