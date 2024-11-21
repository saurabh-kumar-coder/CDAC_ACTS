package com.generic.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Employee implements BaseEntity{

	@Id
	private Long empId;
	
	private String name;
	
	private String position;
	
	private Double salary;
	
	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return empId;
	}
	
	@Override
	public void setId(Long empId) {
		this.empId = empId;
	}

}
