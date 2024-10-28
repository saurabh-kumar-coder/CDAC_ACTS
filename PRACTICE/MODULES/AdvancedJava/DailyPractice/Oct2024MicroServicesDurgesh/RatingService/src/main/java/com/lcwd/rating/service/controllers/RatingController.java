package com.lcwd.rating.service.controllers;

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

import com.lcwd.rating.service.entity.Rating;
import com.lcwd.rating.service.impl.RatingServiceImpl;

@RestController
@RequestMapping("/ratings")
public class RatingController {

	@Autowired
	private RatingServiceImpl ratingServiceImpl;
	
//	create rating
	@PostMapping
	public ResponseEntity<Rating> create(@RequestBody Rating rating){
		return ResponseEntity.status(HttpStatus.CREATED).body(ratingServiceImpl.create(rating));
	}
	
//	get all ratings
	@GetMapping
	public ResponseEntity<List<Rating>> getRatings(){
		return ResponseEntity.ok(ratingServiceImpl.getRatings());
	}
	
//	get rating by user id
	@GetMapping("/users/{userId}")
	public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable String userId){
		return ResponseEntity.ok(ratingServiceImpl.getRatingByUserId(userId));
	}
	
//	get rating by hotel id
	@GetMapping("/hotels/{hotelId}")
	public ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable String hotelId){
		return ResponseEntity.ok(ratingServiceImpl.getRatingByHotelId(hotelId));
	}
	
}
