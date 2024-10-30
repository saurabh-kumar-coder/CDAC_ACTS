package com.lcwd.hotel.service.entity;

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
@Table(name="hotels")
public class Hotel {
	@Id
	private String hotelId;
	private String hotelName;
	private String location;
	private String about;
	
//	@Transient
//	private List<Rating> rating = new ArrayList<Rating>();
}
