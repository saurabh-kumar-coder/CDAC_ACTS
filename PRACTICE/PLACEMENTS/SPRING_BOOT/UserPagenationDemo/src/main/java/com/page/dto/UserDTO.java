package com.page.dto;

public class UserDTO {
	Long userId;
	String username;
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
	public UserDTO(Long userId, String username, String city) {
		super();
		this.userId = userId;
		this.username = username;
		this.city = city;
	}
	public UserDTO(String username, String city) {
		super();
		this.username = username;
		this.city = city;
	}
	
}
