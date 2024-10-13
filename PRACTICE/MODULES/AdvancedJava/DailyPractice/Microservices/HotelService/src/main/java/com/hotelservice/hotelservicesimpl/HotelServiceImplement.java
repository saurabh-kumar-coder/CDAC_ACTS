package com.hotelservice.hotelservicesimpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelservice.entity.Hotel;
import com.hotelservice.exception.ResourceNotFoundException;
import com.hotelservice.repository.HotelRepository;
import com.hotelservice.services.HotelService;

@Service
public class HotelServiceImplement implements HotelService {

	@Autowired
	HotelRepository hotelRepository;
	
	@Override
	public Hotel create(Hotel hotel) {
		// TODO Auto-generated method stub
		hotel.setHotelId(UUID.randomUUID().toString());
		Hotel newHotel = hotel;
		return hotelRepository.save(newHotel);
	}

	@Override
	public Hotel get(String id) {
		// TODO Auto-generated method stub
		Hotel newHotel = hotelRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Hotel doesn't exists with id : " + id));
		return newHotel;
	}

	@Override
	public List<Hotel> getAll() {
		// TODO Auto-generated method stub
		List<Hotel> newHotel = hotelRepository.findAll();
		return newHotel;
	}

}
