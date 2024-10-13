package com.lcwd.rating.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lcwd.rating.entity.Rating;

@Service
public interface RatingService {

	//create rating
	Rating createRating(Rating rating);
	
	//get all ratings
	List<Rating> getAllRatings();
	
	//get all by userId
	List<Rating> getAllByUserId(String id);
	
	//get all by hotel
	List<Rating> getAllByHotelId(String hotelId);
}
