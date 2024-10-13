package com.mapping.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {
	

	@Id
	private int studentId;
	private String studentName;
	private String studentClass;
	
	@OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
	private Laptop laptop;
	
	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
	List<Address> addressList = new ArrayList<>();

}
