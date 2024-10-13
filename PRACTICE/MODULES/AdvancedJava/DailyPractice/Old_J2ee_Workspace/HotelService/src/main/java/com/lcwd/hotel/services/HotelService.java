package com.lcwd.hotel.services;

import java.util.List;

import com.lcwd.hotel.entity.Hotel;

public interface HotelService {
	
	//create hotel
	Hotel create(Hotel hotel);
	
	//get all hotel
	List<Hotel> getAllHotels();
	
	//get single hotel
	Hotel getHotel(String id);
}
