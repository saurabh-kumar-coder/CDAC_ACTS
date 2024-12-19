package com.annotations.pojos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class Users {
	@Id
	@Column(name="userId")
	int userId;
	@Column(name="userName")
	String userName;
	@Column(name="password")
	String password;
	@Column(name="mobile")
	int mobile;
	@Column(name="email")
	String email;
	@Column(name="firstName")
	String firstName;
	@Column(name="lastName")
	String lastName;
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(int userId, String userName, String password, int mobile, String email, String firstName,
			String lastName) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.mobile = mobile;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userName=" + userName + ", password=" + password + ", mobile=" + mobile
				+ ", email=" + email + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	

}
