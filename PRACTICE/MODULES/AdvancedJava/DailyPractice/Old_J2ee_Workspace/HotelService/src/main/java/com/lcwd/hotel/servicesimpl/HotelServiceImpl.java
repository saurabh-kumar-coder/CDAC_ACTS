package com.lcwd.hotel.servicesimpl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcwd.hotel.entity.Hotel;
import com.lcwd.hotel.exception.ResourceNotFoundException;
import com.lcwd.hotel.repository.HotelRepository;
import com.lcwd.hotel.services.HotelService;

@Service 
public class HotelServiceImpl implements HotelService {

	@Autowired
	private HotelRepository hotelRepository;
	
	@Override
	public Hotel create(Hotel hotel) {
		// TODO Auto-generated method stub
		hotel.setId(UUID.randomUUID().toString());
		Hotel hotel1 = hotelRepository.save(hotel);
		return hotel1;
	}

	@Override
	public List<Hotel> getAllHotels() {
		// TODO Auto-generated method stub
		List<Hotel> hotels = hotelRepository.findAll();
		return hotels;
	}

	@Override
	public Hotel getHotel(String id) {
		// TODO Auto-generated method stub
		Hotel hotel = hotelRepository.findById(id).
				orElseThrow(() -> new ResourceNotFoundException("hotel not found with id : "+ id));
		return hotel;
	}

}
