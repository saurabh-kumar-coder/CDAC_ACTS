package com.lcwd.hotel.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcwd.hotel.service.entity.Hotel;
import com.lcwd.hotel.service.exception.ResourceNotFoundException;
import com.lcwd.hotel.service.repository.HotelRepository;
import com.lcwd.hotel.service.services.HotelService;
@Service
public class HotelServiceImpl implements HotelService {
	
	@Autowired
	private HotelRepository hotelRepository;
	
	@Override
	public Hotel create(Hotel hotel) {
		// TODO Auto-generated method stub
		String hotelId = UUID.randomUUID().toString();
		hotel.setHotelId(hotelId);
		return hotelRepository.save(hotel);
	}

	@Override
	public List<Hotel> getAllHotel() {
		// TODO Auto-generated method stub
		return hotelRepository.findAll();
	}

	@Override
	public Hotel getHotel(String hotelId) {
		// TODO Auto-generated method stub
		return hotelRepository.findById(hotelId).orElseThrow(() -> new ResourceNotFoundException("Hotel not found with id : " + hotelId));
	}

}
