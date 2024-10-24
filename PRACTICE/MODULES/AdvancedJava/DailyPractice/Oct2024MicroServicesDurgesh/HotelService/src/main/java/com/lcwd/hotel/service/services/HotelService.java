package com.lcwd.hotel.service.services;

import java.util.List;

import com.lcwd.hotel.service.entity.Hotel;

public interface HotelService {

//	save a particular Hotel
	Hotel create(Hotel hotel);
	
//	get the List of Hotels
	List<Hotel> getAllHotel();
	
//	get a particular Hotel
	Hotel getHotel(String hotelId);
}
