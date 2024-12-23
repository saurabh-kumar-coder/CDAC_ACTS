package com.basic.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.basic.beans.Users;

public class UsersRowMapper implements RowMapper<Users> {

	@Override
	public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Users objUser = new Users();
		objUser.setUserName(rs.getString("userName"));
		objUser.setPassword(rs.getString("password"));
		objUser.setMobile(rs.getInt("mobile"));
		objUser.setFirstName(rs.getString("firstName"));
		objUser.setLastName(rs.getString("lastName"));
		objUser.setEmail(rs.getString("email"));
		return objUser;
	}
	
}
