package com.mapping.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Laptop {

	@Id
	private int laptopId;
	private String brand;
	private String modelNumber;
	
	@OneToOne
	@JoinColumn(name="student_id")
	private Student student;
	
}
