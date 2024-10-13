package com.ratingservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ratingservice.entity.Rating;
import com.ratingservice.ratingservicesimpl.RatingServiceImplement;

@RestController
@RequestMapping("/ratings")
public class RatingController {

	@Autowired
	RatingServiceImplement ratingServiceImplement;
	
	@PostMapping
	public ResponseEntity<Rating> createRating(@RequestBody Rating rating) {
		return ResponseEntity.status(HttpStatus.CREATED).body(ratingServiceImplement.create(rating));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Rating> getRating(@PathVariable String id) {
		return ResponseEntity.status(HttpStatus.FOUND).body(ratingServiceImplement.get(id));
	}
	
	@GetMapping
	public ResponseEntity<List<Rating>> getRatingList() {
		return ResponseEntity.status(HttpStatus.OK).body(ratingServiceImplement.getAll());
	}
	
}
