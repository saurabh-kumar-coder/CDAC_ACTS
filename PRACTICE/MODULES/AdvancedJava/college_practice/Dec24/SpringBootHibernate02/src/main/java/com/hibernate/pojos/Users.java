package com.hibernate.pojos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class Users {
	
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name="userid")
	int userid;
	
	String username;
	
	String password;
	
	int mobile;
	
	String firstname;
	
	String lastname;
	
	String email;

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(String userName, String password, int mobile, String firstName, String lastName, String email) {
		super();
		this.username = userName;
		this.password = password;
		this.mobile = mobile;
		this.firstname = firstName;
		this.lastname = lastName;
		this.email = email;
	}

	public String getUserName() {
		return username;
	}

	public void setUserName(String userName) {
		this.username = userName;
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
		return firstname;
	}

	public void setFirstName(String firstName) {
		this.firstname = firstName;
	}

	public String getLastName() {
		return lastname;
	}

	public void setLastName(String lastName) {
		this.lastname = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getUserId() {
		return userid;
	}

	public void setUserId(int userId) {
		this.userid = userId;
	}

	@Override
	public String toString() {
		return "Users [userid=" + userid + ", username=" + username + ", password=" + password + ", mobile=" + mobile
				+ ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + "]";
	}
	
	
	
	
}
