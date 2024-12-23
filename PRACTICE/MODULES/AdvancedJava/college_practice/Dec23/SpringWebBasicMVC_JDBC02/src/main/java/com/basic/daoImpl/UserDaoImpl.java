package com.basic.daoImpl;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.basic.beans.Users;
import com.basic.dao.UserDao;
import com.basic.rowmapper.UsersRowMapper;

import jakarta.annotation.PostConstruct;

@Component
public class UserDaoImpl implements UserDao {

	@Autowired
	Environment env;

	@Autowired
	JdbcTemplate jdbcTemplate;

	String sqlregisteruser;
	String sqlchangepassword;
	String sqlallusers;
	String sqluserdetails;
	
	@PostConstruct
	public void Initialize() {
		sqlregisteruser = env.getProperty("sql.registeruser");
		sqlchangepassword = env.getProperty("sql.changepassword");
		sqlallusers = env.getProperty("sql.allusers");
		sqluserdetails = env.getProperty("sql.userdetails");
	}

	@Override
	public boolean registerUser(String username, String password, int mobile, String firstName, String lastName,
			String email) {
		// TODO Auto-generated method stub
		jdbcTemplate.update(sqlregisteruser, username, password, mobile, firstName, lastName, email);
		return true;	
	}

	@Override
	public boolean changePassword(String username, String password) {
		// TODO Auto-generated method stub
		jdbcTemplate.update(sqlchangepassword, username, password);
		return true;
	}

	@Override
	public Users getUserDetails(String username) {
		// TODO Auto-generated method stub
		System.out.println(username);
		return (Users) jdbcTemplate.query(sqluserdetails, new UsersRowMapper(), username);
	}

	@Override
	public Iterator<Users> allUsers() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(sqlallusers, new UsersRowMapper()).iterator();
	}

}
