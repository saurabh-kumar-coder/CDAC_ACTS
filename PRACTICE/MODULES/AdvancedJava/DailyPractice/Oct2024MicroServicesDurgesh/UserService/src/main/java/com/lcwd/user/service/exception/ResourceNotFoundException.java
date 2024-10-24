package com.lcwd.user.service.exception;

public class ResourceNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6625628741685478834L;

	public ResourceNotFoundException() {
		super("resource not found exception");
		// TODO Auto-generated constructor stub
	}
	public ResourceNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
}
