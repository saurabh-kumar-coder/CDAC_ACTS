package com.lcwd.hotel.service.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//	this method will always run when resource not found exception will come.

@RestControllerAdvice
public class GlobalExceptionHandler {
	public ResponseEntity<Map<String, Object>> notFoundHandler(ResourceNotFoundException ex){
		Map map = new HashMap();
		map.put("Message", ex.getMessage());
		map.put("Status", false);
		map.put("Status", HttpStatus.NOT_FOUND);
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
	}
}
