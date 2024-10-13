package com.ratingservice.ratingservicesimpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ratingservice.entity.Rating;
import com.ratingservice.exception.ResourceNotFoundException;
import com.ratingservice.repository.RatingRepository;
import com.ratingservice.services.RatingService;

@Service
public class RatingServiceImplement implements RatingService {

	@Autowired
	RatingRepository ratingRepository;
	
	@Override
	public Rating create(Rating rating) {
		// TODO Auto-generated method stub
		rating.setRatingId(UUID.randomUUID().toString());
		Rating newRating = rating;
		return ratingRepository.save(newRating);
	}

	@Override
	public List<Rating> getAll() {
		// TODO Auto-generated method stub
		List<Rating> ratingList = ratingRepository.findAll();
		return ratingList;
	}

	@Override
	public Rating get(String id) {
		// TODO Auto-generated method stub
		Rating newRating = ratingRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Rating doesn't exist with id : " + id));
		return newRating;
	}

}
