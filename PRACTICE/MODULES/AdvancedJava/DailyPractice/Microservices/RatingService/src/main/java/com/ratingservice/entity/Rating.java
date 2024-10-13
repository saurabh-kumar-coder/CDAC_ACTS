package com.ratingservice.entity;

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
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "RATING_TABLE")
public class Rating {
	
	@Id
	@Column(name = "ratingId")
	private String ratingId;
	
	private String userId;
	
	private String hotelId;
	
	private int rating;
	
	private String feedback;
}
