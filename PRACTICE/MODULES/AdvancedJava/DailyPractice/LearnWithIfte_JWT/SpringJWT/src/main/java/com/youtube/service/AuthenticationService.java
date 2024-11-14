package com.youtube.service;


import java.awt.desktop.UserSessionEvent.Reason;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.youtube.model.AuthenticationResponse;
import com.youtube.model.User;
import com.youtube.repository.UserRepository;

@Service
public class AuthenticationService {
	public final AuthenticationManager authenticationManager;
	public final UserRepository userRepository;
	public final PasswordEncoder passwordEncoder;
	private final JwtService jwtService;
	public AuthenticationService(AuthenticationManager authenticationManager, UserRepository userRepository,
			PasswordEncoder passwordEncoder, JwtService jwtService) {
		super();
		this.authenticationManager = authenticationManager;
		this.userRepository = userRepository;
		this.passwordEncoder = passwordEncoder;
		this.jwtService = jwtService;
	}
	
	public AuthenticationResponse register(User request) {
		User user = new User();
		user.setFirstName(request.getFirstName());
		user.setLastName(request.getLastName());
		user.setUserName(request.getUsername());
		user.setPassword(passwordEncoder.encode(request.getPassword()));
		user.setRole(request.getRole());
		userRepository.save(user);
		String token = jwtService.generateToken(user);
		return new AuthenticationResponse(token);
	}
	
	public AuthenticationResponse authenticate(User response) {
		authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(response.getUsername(), response.getPassword())
				);
		User user = (User) userRepository.findByUserName(response.getUsername()).orElseThrow();
		String token = jwtService.generateToken(user);
		return new AuthenticationResponse(token);
	}
}
