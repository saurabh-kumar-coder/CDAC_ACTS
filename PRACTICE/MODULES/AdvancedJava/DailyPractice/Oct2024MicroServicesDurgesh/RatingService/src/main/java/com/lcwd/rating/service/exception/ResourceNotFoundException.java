package com.lcwd.rating.service.exception;

public class ResourceNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1983786977936301315L;
	
	public ResourceNotFoundException() {
		super("Resource Not Found Exception");
		// TODO Auto-generated constructor stub
	}

	public ResourceNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}
