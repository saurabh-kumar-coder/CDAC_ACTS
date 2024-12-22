package com.basic.pojos;

import org.springframework.stereotype.Component;

@Component
public class Users {
	private String userName;
	private String password;
	private int mobile;
	private String firstName;
	private String lastName;
	private String email;
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(String userName, String password, int mobile, String firstName, String lastName, String email) {
		super();
		this.userName = userName;
		this.password = password;
		this.mobile = mobile;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Users [userName=" + userName + ", password=" + password + ", mobile=" + mobile + ", firstName="
				+ firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}
	
}
