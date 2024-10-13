package com.mapping.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address {
	@Id
	private int addressId;
	private String city;
	private String country;
	private String street;
	
	@ManyToOne
	@JoinColumn(name="student_id")
	private Student student;
	
	
}
