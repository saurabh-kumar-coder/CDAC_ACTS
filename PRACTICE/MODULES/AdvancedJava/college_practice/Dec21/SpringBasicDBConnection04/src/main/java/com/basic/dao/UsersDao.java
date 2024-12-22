package com.basic.dao;

import java.util.Iterator;

import com.basic.pojos.Users;

public interface UsersDao {
	Users registerUser(String username, String password, int mobile, String firstName, String lastName, String email);
	String changePassword(String username, String password);
	Iterator<Users> findAllUsers();
	Users findUsersByUserName();
}
