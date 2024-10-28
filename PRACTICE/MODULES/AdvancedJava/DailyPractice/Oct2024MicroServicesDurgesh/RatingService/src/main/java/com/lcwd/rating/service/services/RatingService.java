package com.lcwd.rating.service.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lcwd.rating.service.entity.Rating;

@Service
public interface RatingService {
//	create
	Rating create(Rating rating);
	
//	get all rating
	List<Rating> getRatings();

//	get all by user id
	List<Rating> getRatingByUserId(String userId);
	
//	get all by hotel id
	List<Rating> getRatingByHotelId(String hotelId);
}
