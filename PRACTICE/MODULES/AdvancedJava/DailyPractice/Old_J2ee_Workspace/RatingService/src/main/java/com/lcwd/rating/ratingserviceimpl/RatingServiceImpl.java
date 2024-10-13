package com.lcwd.rating.ratingserviceimpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcwd.rating.entity.Rating;
import com.lcwd.rating.repository.RatingRepository;
import com.lcwd.rating.service.RatingService;

@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
	private RatingRepository ratingRepository;
	
	@Override
	public Rating createRating(Rating rating) {
		// TODO Auto-generated method stub
		rating.setRatingId(UUID.randomUUID().toString());
		return ratingRepository.save(rating);
	}

	@Override
	public List<Rating> getAllRatings() {
		// TODO Auto-generated method stub
		return ratingRepository.findAll();
	}

	@Override
	public List<Rating> getAllByUserId(String id) {
		// TODO Auto-generated method stub
		return ratingRepository.findByUserId(id);
	}

	@Override
	public List<Rating> getAllByHotelId(String hotelId) {
		// TODO Auto-generated method stub
		return ratingRepository.findByHotelId(hotelId);
	}

}
