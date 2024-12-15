package com.saurabh.dbproperties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class DbProperties {
	public static Map<String, String> getDatabaseProperties(){
		Map<String, String> dbProperties = new HashMap<>();
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream("db_info.properties"));
			final String URL = properties.getProperty("db.url");
			final String USERNAME = properties.getProperty("db.username");
			final String PASSWORD = properties.getProperty("db.password");
			final String TABLENAME = properties.getProperty("db.tableName");
			dbProperties.put("URL", URL);
			dbProperties.put("USERNAME", USERNAME);
			dbProperties.put("PASSWORD", PASSWORD);
			dbProperties.put("TABLENAME", TABLENAME);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dbProperties;
	}
}
