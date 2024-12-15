package com.saurabh.dbcommands;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Map;

public class DbCommands {

	public static void createUserDefinedTable(Map<String, String> dbProp) {
		// TODO Auto-generated method stub
		String createTableQuery = "CREATE TABLE IF NOT EXISTS " + dbProp.get("TABLENAME")
				+ " (userid int, username varchar(20))";
		try (Connection connection = DriverManager.getConnection(dbProp.get("URL"), dbProp.get("USERNAME"),
				dbProp.get("PASSWORD"));
				PreparedStatement psCreateTable = connection.prepareStatement(createTableQuery);) {
			psCreateTable.execute();
			System.out.println("table created");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
