package com.lcwd.hotel.service.exception;

public class ResourceNotFoundException extends RuntimeException {

	
	
	public ResourceNotFoundException() {
		super("Resource not found exception");
		// TODO Auto-generated constructor stub
	}

	public ResourceNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
