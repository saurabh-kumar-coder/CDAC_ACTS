package com.hotelservice.services;

import java.util.List;

import com.hotelservice.entity.Hotel;

public interface HotelService {
	//create hotel
	Hotel create(Hotel hotel);
	
	//get hotel
	Hotel get(String id);
	
	//get all hotels
	List<Hotel> getAll();
}
