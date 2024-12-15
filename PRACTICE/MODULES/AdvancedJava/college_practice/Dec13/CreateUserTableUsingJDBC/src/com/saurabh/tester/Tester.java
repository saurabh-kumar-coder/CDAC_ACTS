package com.saurabh.tester;

import java.util.Map;

import com.saurabh.dbcommands.DbCommands;
import com.saurabh.dbproperties.DbProperties;

public class Tester {
	public static void main(String[] args) {
		Map<String, String> dbProp = DbProperties.getDatabaseProperties();
		
		DbCommands.createUserDefinedTable(dbProp);
	}
}
