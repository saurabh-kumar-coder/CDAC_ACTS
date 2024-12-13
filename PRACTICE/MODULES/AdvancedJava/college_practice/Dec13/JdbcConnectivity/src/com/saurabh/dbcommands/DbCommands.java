package com.saurabh.dbcommands;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;
import java.util.Scanner;

public class DbCommands {

	public void showUserData(Map<String, String> properties) {
		// TODO Auto-generated method stub
		try (Connection connection = DriverManager.getConnection(properties.get("dburl"), properties.get("dbusername"),
				properties.get("dbpassword"));
				PreparedStatement psQuery = connection.prepareStatement("SELECT * FROM USER");
				ResultSet result = psQuery.executeQuery();) {
			System.out.print("User_Id" + " ");
			System.out.print("UserName" + " ");
			System.out.print("Password" + " ");
			System.out.print("Name" + " ");
			System.out.println("Email_id");
			while (result.next()) {
				System.out.print(result.getString(1) + " ");
				System.out.print(result.getString(2) + " ");
				System.out.print(result.getString(3) + " ");
				System.out.print(result.getString(4) + " ");
				System.out.println(result.getString(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void insertUserData(Map<String, String> properties, Scanner sc) {
		// TODO Auto-generated method stub
		try (Connection connection = DriverManager.getConnection(properties.get("dburl"), properties.get("dbusername"),
				properties.get("dbpassword"));
				PreparedStatement psInsertUserData = connection
						.prepareStatement("INSERT INTO user (userName, password, name, email) values (?, ?, ?, ?)");

		) {
			sc.nextLine();
			System.out.println("ENTER UserName");
			String userName = sc.nextLine();
			System.out.println("ENTER Password");
			String password = sc.nextLine();
			System.out.println("ENTER User Name");
			String name = sc.nextLine();
			System.out.println("ENTER EMAIL ID");
			String email = sc.nextLine();
			psInsertUserData.setString(1, userName);
			psInsertUserData.setString(2, password);
			psInsertUserData.setString(3, name);
			psInsertUserData.setString(4, email);
			int result = psInsertUserData.executeUpdate();
			System.out.println("result : " + result);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void updateUserNameUsingUsername(Map<String, String> properties, Scanner sc) {
		// TODO Auto-generated method stub
		try (Connection connection = DriverManager.getConnection(properties.get("dburl"), properties.get("dbusername"),
				properties.get("dbpassword"));
				PreparedStatement psUpdateNameByUsername = connection
						.prepareStatement("UPDATE user SET name = ? where userName = ?")
				) {
			sc.nextLine();
			System.out.println("ENTER Name : ");
			String name = sc.nextLine();
			System.out.println("ENTER USERNAME : ");
			String userName =sc.nextLine();
			psUpdateNameByUsername.setString(1, name);
			psUpdateNameByUsername.setString(2, userName);
			int result = psUpdateNameByUsername.executeUpdate();
			System.out.println("result : " + result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteUserData(Map<String, String> properties, Scanner sc) {
		// TODO Auto-generated method stub
		try (
				Connection connection = DriverManager.getConnection(properties.get("dburl"), properties.get("dbusername"),
				properties.get("dbpassword"));
				PreparedStatement psDeleteByUserId = connection.prepareStatement("DELETE FROM user WHERE userid = ?")
				) {
			System.out.println("ENTER ID : ");
			int id = sc.nextInt();
			psDeleteByUserId.setInt(1, id);
			int result = psDeleteByUserId.executeUpdate();
			System.out.println("result : " + result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void getUserByUsernameAndPassword(Map<String, String> properties, Scanner sc) {
		// TODO Auto-generated method stub
		try (Connection connection = DriverManager.getConnection(properties.get("dburl"), properties.get("dbusername"),
				properties.get("dbpassword"));
				PreparedStatement psGetUserByUsernameAndPassword = connection
						.prepareStatement("SELECT * FROM user WHERE userName = ? AND password = ?");
				) {
			sc.nextLine();
			System.out.println("ENTER USERNAME : ");
			String userName = sc.nextLine();
			System.out.println("ENTER PASSWORD : ");
			String password = sc.nextLine();
			psGetUserByUsernameAndPassword.setString(1, userName);
			psGetUserByUsernameAndPassword.setString(2, password);
			try (ResultSet result = psGetUserByUsernameAndPassword.executeQuery()) {
				if (result.next()) {
//					System.out.print("FOUND USER : " + result.getString("userName"));
					System.out.print(result.getString(1) + " ");
					System.out.print(result.getString(2) + " ");
					System.out.print(result.getString(3) + " ");
					System.out.print(result.getString(4) + " ");
					System.out.println(result.getString(5));
				} else {
					System.out.println("No user found");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
