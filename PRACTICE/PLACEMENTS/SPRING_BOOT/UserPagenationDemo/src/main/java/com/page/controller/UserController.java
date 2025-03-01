package com.page.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.page.dto.UserDTO;
import com.page.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping
	public ResponseEntity<List<UserDTO>> getPagenatedData(
				@RequestParam(defaultValue = "0") int current,
				@RequestParam(defaultValue = "5") int size,
				@RequestParam(defaultValue = "username") String sort
			) {
		return ResponseEntity.status(HttpStatus.FOUND).body(userService.getPagenatedData(current, size, sort));
	}
	
	@GetMapping("{userId}")
	public ResponseEntity<UserDTO> getUserById(@PathVariable Long userId) {
		UserDTO userById = userService.findUserById(userId);
		return ResponseEntity.status(HttpStatus.FOUND).body(userById);
	}
	
}
