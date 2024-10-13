package com.userservice.entity;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Rating {
	
	private String userId;
	
	private String name;
	
	private String email;
	
	private String about;
	
	private List<Rating> ratings = new ArrayList<>();
}
