package com.exception;

public class InvalidSalaryException extends Exception {
	public InvalidSalaryException(String message) {
		super(message);
		System.out.println("Invalid Salary exception called");
		// TODO Auto-generasted constructor stub
	}
}
