package com.springjwt.controller;

import org.springframework.web.bind.annotation.RestController;

import com.springjwt.model.AuthenticationResponse;
import com.springjwt.model.User;
import com.springjwt.service.AuthenticationService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class AuthenticationController {
	private final AuthenticationService authenticationService;

	public AuthenticationController(AuthenticationService authenticationService) {
		super();
		this.authenticationService = authenticationService;
	}
	
	@PostMapping("/register")	
	public ResponseEntity<AuthenticationResponse> register(@RequestBody User request) {
		//TODO: process POST request
		
		return ResponseEntity.ok(authenticationService.register(request));
	}
	
	@PostMapping("/login")
	public ResponseEntity<AuthenticationResponse> login(@RequestBody User request) {
		return ResponseEntity.ok(authenticationService.getAuthenticationResponse(request));
	}
	
}
