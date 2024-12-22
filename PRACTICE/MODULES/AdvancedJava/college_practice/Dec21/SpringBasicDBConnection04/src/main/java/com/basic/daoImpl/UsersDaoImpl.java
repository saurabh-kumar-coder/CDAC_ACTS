package com.basic.daoImpl;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.basic.dao.UserRowMapper;
import com.basic.dao.UsersDao;
import com.basic.pojos.Users;

import jakarta.annotation.PostConstruct;

@Component
public class UsersDaoImpl implements UsersDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	Environment env;
	
	String registeruser;
	String changepassword;
	String allusers;
	String userdetails;
	
	@PostConstruct
	public void initialize() {
		registeruser = env.getProperty("sql.registeruser");
		changepassword = env.getProperty("sql.changepassword");
		allusers = env.getProperty("sql.allusers");
		userdetails = env.getProperty("sql.userdetails");
	}
	
	@Override
	public Users registerUser(String userName, String password, int mobile, String firstName, String lastName, String email) {
		// TODO Auto-generated method stub
		jdbcTemplate.update(registeruser, userName, password, mobile, firstName, lastName, email);
		return new Users(userName, password, mobile, firstName, lastName, email);
	}

	@Override
	public String changePassword(String username, String password) {
		// TODO Auto-generated method stub
		jdbcTemplate.update(changepassword, password, username);
		return "updated";
	}

	@Override
	public Iterator<Users> findAllUsers() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(allusers, new UserRowMapper()).iterator();
	}

	@Override
	public Users findUsersByUserName() {
		// TODO Auto-generated method stub
		return null;
	}

}
