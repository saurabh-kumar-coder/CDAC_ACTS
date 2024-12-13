package com.saurabh.tester;

import java.util.Map;

import com.saurabh.dbcommands.DbCommands;
import com.saurabh.dbproperties.DbPropertiesData;

public class Tester {
	public static void main(String[] args) {
		DbPropertiesData dbcommand = new DbPropertiesData();
		Map<String, String> properties = dbcommand.getProperties();
		
		DbCommands dbQuery = new DbCommands();
//		dbQuery.showUserData(properties);
		
//		dbQuery.insertUserData(properties);
		
//		dbQuery.updateUserData(properties);
		
//		dbQuery.showUserData(properties);
		
//		dbQuery.deleteUserData(properties);
		
//		dbQuery.showUserData(properties);
		
		dbQuery.getUserByUsernameAndPassword(properties);
		
//		dbQuery.showUserData(properties);
	}
}
