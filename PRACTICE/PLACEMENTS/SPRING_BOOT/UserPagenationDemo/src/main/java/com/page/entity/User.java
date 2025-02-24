package com.page.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userid")
	Long userId;
	
	@Column(name = "username")
	String username;
	
	@Column(name = "city")
	String city;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public User(Long userId, String username, String city) {
		super();
		this.userId = userId;
		this.username = username;
		this.city = city;
	}

	public User(String username, String city) {
		super();
		this.username = username;
		this.city = city;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
