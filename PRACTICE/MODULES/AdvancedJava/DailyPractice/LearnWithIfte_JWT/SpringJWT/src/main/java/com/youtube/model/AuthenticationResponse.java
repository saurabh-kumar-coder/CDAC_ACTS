package com.youtube.model;

import lombok.Data;

@Data
public class AuthenticationResponse {
	public AuthenticationResponse(String token) {
		// TODO Auto-generated constructor stub
		this.token = token;
	}

	private String token;
}
