package com.lcwd.rating.controller;

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

import com.lcwd.rating.entity.Rating;
import com.lcwd.rating.ratingserviceimpl.RatingServiceImpl;

@RestController
@RequestMapping("/ratings")
public class RatingController {

	@Autowired
	RatingServiceImpl ratingServiceImpl;
	
	//create rating
	@PostMapping
	public ResponseEntity<Rating> create(@RequestBody Rating rating){
		return ResponseEntity.status(HttpStatus.CREATED).body(ratingServiceImpl.createRating(rating));
	}
	
	//get all rating
	@GetMapping
	public ResponseEntity<List<Rating>> getAllRating(){
		return ResponseEntity.status(HttpStatus.FOUND).body(ratingServiceImpl.getAllRatings());
	}

	//get all rating by userid
	@GetMapping("/userid/{userid}")
	public ResponseEntity<List<Rating>> getByUserId(@PathVariable("userid") String userId){
		return ResponseEntity.status(HttpStatus.FOUND).body(ratingServiceImpl.getAllByUserId(userId));
	}
	//get all rating by hotelid
	@GetMapping("hotelid/{hotelid}")
	public ResponseEntity<List<Rating>> getByHotelId(@PathVariable("hotelid") String hotelId){
		return ResponseEntity.status(HttpStatus.FOUND).body(ratingServiceImpl.getAllByHotelId(hotelId));
	}
}
