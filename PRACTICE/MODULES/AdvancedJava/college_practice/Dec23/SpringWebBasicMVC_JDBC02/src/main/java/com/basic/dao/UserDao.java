package com.basic.dao;

import java.util.Iterator;

import com.basic.beans.Users;

public interface UserDao {
	public boolean registerUser(String username, String password, int mobile, String firstName, String lastName, String email);
	public boolean changePassword(String username, String password);
	public Users getUserDetails(String username);
	public Iterator<Users> allUsers();
}
