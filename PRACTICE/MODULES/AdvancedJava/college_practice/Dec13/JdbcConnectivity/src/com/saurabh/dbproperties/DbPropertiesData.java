package com.saurabh.dbproperties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class DbPropertiesData {
	public Map<String, String> getProperties() {
		Properties properties = new Properties();
		try {
			HashMap<String, String> dbProps = new HashMap<>();
			properties.load(new FileInputStream("connectivity.properties"));
			String dburl = properties.getProperty("connectivity.url");
			String dbusername = properties.getProperty("connectivity.username");
			String dbpassword = properties.getProperty("connectivity.password");
			System.out.println(dburl);
			dbProps.put("dburl", dburl);
			dbProps.put("dbusername", dbusername);
			dbProps.put("dbpassword", dbpassword);
			return dbProps;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
