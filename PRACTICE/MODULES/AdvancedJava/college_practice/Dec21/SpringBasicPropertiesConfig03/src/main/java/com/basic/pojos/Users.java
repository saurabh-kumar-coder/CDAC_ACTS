package com.basic.pojos;

import org.springframework.stereotype.Component;

@Component("objUser")
public class Users {
	private String username;
	private String password;
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Users [username=" + username + ", password=" + password + "]";
	}
	
}
