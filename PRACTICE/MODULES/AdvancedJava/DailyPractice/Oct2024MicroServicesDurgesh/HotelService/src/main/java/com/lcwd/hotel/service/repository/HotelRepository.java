package com.lcwd.hotel.service.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.lcwd.hotel.service.entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String> {
	
}
