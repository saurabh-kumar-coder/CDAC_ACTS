package com.page.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GenericExceptionHandler {

	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<?> handleUserNotFoundException(UserNotFoundException ex) {
		ErrorResponse userNotFound = new ErrorResponse(LocalDateTime.now(), ex.getMessage(), "handled user not found");
		return new ResponseEntity<>(userNotFound, HttpStatus.NOT_FOUND);
	}
	
}
