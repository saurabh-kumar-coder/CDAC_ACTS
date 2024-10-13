package com.lcwd.hotel.exception;

public class ResourceNotFoundException extends RuntimeException {
	public ResourceNotFoundException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
	
	public ResourceNotFoundException() {
		// TODO Auto-generated constructor stub
		super("resource not found");
	}
}
