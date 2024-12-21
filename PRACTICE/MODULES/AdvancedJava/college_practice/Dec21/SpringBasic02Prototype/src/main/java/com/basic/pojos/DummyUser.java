package com.basic.pojos;

import org.springframework.stereotype.Component;

@Component("dummyUser")
public class DummyUser {
	private String username;
	private String password;
	public DummyUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DummyUser(String username, String password) {
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
		return "DummyUser [username=" + username + ", password=" + password + "]";
	}
	
}
