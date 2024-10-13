package com.hotelservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "HOTEL_TABLE")
public class Hotel {

	@Id
	@Column(name = "HOTEL_ID")
	private String hotelId;
	
	private String name;
	
	private String location;
	
	private String about;
}
