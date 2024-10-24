package com.lcwd.hotel.service.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lcwd.hotel.service.entity.Hotel;
import com.lcwd.hotel.service.services.HotelService;

@RestController
@RequestMapping("/hotels")
public class HotelController {
	
	@Autowired
	private HotelService hotelService;
	
	@PostMapping
	public ResponseEntity<Hotel> create(@RequestBody Hotel hotel) {
		Hotel hotel1 = hotelService.create(hotel);
		return ResponseEntity.status(HttpStatus.CREATED).body(hotel1);
	}
	
	@GetMapping("/{hotelId}")
	public ResponseEntity<Hotel> getHotel(@PathVariable String hotelId) {
		Hotel hotel = hotelService.getHotel(hotelId);
		return ResponseEntity.ok(hotel);
	}
	
	@GetMapping
	public ResponseEntity<List<Hotel>> getAllHotel() {
		List<Hotel> hotels = hotelService.getAllHotel();
		return ResponseEntity.ok(hotels);
	}
	
}
