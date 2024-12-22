package com.basic.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.basic.pojos.Users;

public class UserRowMapper implements RowMapper<Users> {

	@Override
	public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Users user = new Users();
		user.setUserName(rs.getString("userName"));
		user.setPassword(rs.getString("password"));
		user.setMobile(rs.getInt("mobile"));
		user.setFirstName(rs.getString("firstName"));
		user.setLastName(rs.getString("lastName"));
		user.setEmail(rs.getString("email"));
		return user;
	}
	
}
