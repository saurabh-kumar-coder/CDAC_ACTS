package com.mvc.pojos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "users")
public class Users {
	@Column(name = "userid")
	int userid;

	@Id
	@Column(name = "username")
	@Size(min = 3, max = 8, message = "min 3 and max 8 characters required")
	String username;

	@Column(name = "password")
	@NotEmpty(message="password should not be null")
	String password;

	@Column(name = "mobile")
	float mobile;

	@Column(name = "firstname")
	String firstname;

	@Column(name = "lastname")
	String lastname;

	@Column(name = "email")
	String email;

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(int userid, String username, String password, float mobile, String firstname, String lastname,
			String email) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.mobile = mobile;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
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

	public float getMobile() {
		return mobile;
	}

	public void setMobile(float mobile) {
		this.mobile = mobile;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Users [userid=" + userid + ", username=" + username + ", password=" + password + ", mobile=" + mobile
				+ ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + "]";
	}

}
