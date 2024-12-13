package com.saurabh.dbcommands;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;

public class DbCommands {

	public void showUserData(Map<String, String> properties) {
		// TODO Auto-generated method stub
		try (Connection connection = DriverManager.getConnection(properties.get("dburl"), properties.get("dbusername"),
				properties.get("dbpassword"));
				PreparedStatement psQuery = connection.prepareStatement("SELECT * FROM USER");
				ResultSet result = psQuery.executeQuery();) {
			while (result.next()) {
				System.out.print(result.getString(1));
				System.out.print(result.getString(2));
				System.out.print(result.getString(3));
				System.out.print(result.getString(4));
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void insertUserData(Map<String, String> properties) {
		// TODO Auto-generated method stub
		try (Connection connection = DriverManager.getConnection(properties.get("dburl"), properties.get("dbusername"),
				properties.get("dbpassword"));
				PreparedStatement psInsertUserData = connection
						.prepareStatement("INSERT INTO user (userName, password, name, email) values (?, ?, ?, ?)");

		) {
			psInsertUserData.setString(1, "SaurabhK");
			psInsertUserData.setString(2, "Saurabh@123");
			psInsertUserData.setString(3, "Saurabh");
			psInsertUserData.setString(4, "Saurabh@saurabh.com");
			int result = psInsertUserData.executeUpdate();
			System.out.println("result : " + result);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void updateUserData(Map<String, String> properties) {
		// TODO Auto-generated method stub
		try (Connection connection = DriverManager.getConnection(properties.get("dburl"), properties.get("dbusername"),
				properties.get("dbpassword"));
				PreparedStatement psUpdateNameByUsername = connection
						.prepareStatement("UPDATE user SET name = ? where userName = ?")) {
			psUpdateNameByUsername.setString(1, "Saurabh Kumar");
			psUpdateNameByUsername.setString(2, "SaurabhK");
			int result = psUpdateNameByUsername.executeUpdate();
			System.out.println("result : " + result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteUserData(Map<String, String> properties) {
		// TODO Auto-generated method stub
		try (Connection connection = DriverManager.getConnection(properties.get("dburl"), properties.get("dbusername"),
				properties.get("dbpassword"));
				PreparedStatement psDeleteByUserId = connection.prepareStatement("DELETE FROM user WHERE userid = ?")) {
			psDeleteByUserId.setString(1, "1");
			int result = psDeleteByUserId.executeUpdate();
			System.out.println("result : " + result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void getUserByUsernameAndPassword(Map<String, String> properties) {
		// TODO Auto-generated method stub
		try (Connection connection = DriverManager.getConnection(properties.get("dburl"), properties.get("dbusername"),
				properties.get("dbpassword"));
				PreparedStatement psGetUserByUsernameAndPassword = connection
						.prepareStatement("SELECT * FROM user WHERE userName = ? AND password = ?");) {
			psGetUserByUsernameAndPassword.setString(1, "SaurabhK");
			psGetUserByUsernameAndPassword.setString(2, "Saurabh@123");
			try (ResultSet result = psGetUserByUsernameAndPassword.executeQuery()) {
				if (result.next()) {
//					System.out.print("FOUND USER : " + result.getString("userName"));
					System.out.print(result.getString(1) + " ");
					System.out.print(result.getString(2) + " ");
					System.out.print(result.getString(3) + " ");
					System.out.print(result.getString(4) + " ");
					System.out.print(result.getString(5));
				} else {
					System.out.println("No user found");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
