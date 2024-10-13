package com.ecommerce.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "REVIEWS")
public class Reviews {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long reviewId;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User userId; 
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Products productId;
	
	@Column(name = "rating")
	private Long rating; 
	
	@Column(name = "review_text")
	private String reviewText;
	
	@Column(name = "created_at")
	private Date createdAt;
}
