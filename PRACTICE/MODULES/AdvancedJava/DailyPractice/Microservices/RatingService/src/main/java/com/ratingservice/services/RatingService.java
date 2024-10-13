package com.ratingservice.services;

import java.util.List;

import com.ratingservice.entity.Rating;

public interface RatingService {

	//create rating
	Rating create(Rating rating);
	
	//get all rating
	List<Rating> getAll();
	
	//get single rating
	Rating get(String id);
	
}
