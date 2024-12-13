package com.saurabh.tester;

import java.util.Map;
import java.util.Scanner;

import com.saurabh.dbcommands.DbCommands;
import com.saurabh.dbproperties.DbPropertiesData;

public class Tester {
	public static void main(String[] args) {
		DbPropertiesData dbcommand = new DbPropertiesData();
		Map<String, String> properties = dbcommand.getProperties();

		try (Scanner sc = new Scanner(System.in)) {

			char ch = 0;
			do {
				showMenu();
				System.out.println("ENTER YOUR CHOICE : ");
				int choice = sc.nextInt();
				switch (choice) {
				case 1: {
					DbCommands dbQuery = new DbCommands();
					dbQuery.showUserData(properties);
				}
					break;
				case 2: {
					DbCommands dbQuery = new DbCommands();
					dbQuery.insertUserData(properties, sc);
				}
					break;
				case 3: {
					DbCommands dbQuery = new DbCommands();
					dbQuery.updateUserNameUsingUsername(properties, sc);
				}
					break;
				case 4: {
					DbCommands dbQuery = new DbCommands();
					dbQuery.deleteUserData(properties, sc);
				}
					break;
				case 5: {
					DbCommands dbQuery = new DbCommands();
					dbQuery.getUserByUsernameAndPassword(properties, sc);
				}
					break;
				default: {
					System.out.println("YOU ENTERED A WRONG CHOICE");
				}
				}
				System.out.println("DO YOU WISH TO CONTINUE (PRESS 'y' OR 'Y')");
				ch = sc.next().charAt(0);
			} while (ch == 'y' || ch == 'Y');
		} catch (Exception e) {
		}

	}

	private static void showMenu() {
		// TODO Auto-generated method stub
		System.out.println("****** MENU ******");
		System.out.println("1. SHOW LIST OF USERS DETAILS FROM DATABASE");
		System.out.println("2. INSERT DATA INTO DATABASE");
		System.out.println("3. UPDATE NAME USING USERNAME");
		System.out.println("4. DELETE USER USING USERID");
		System.out.println("5. FIND USER USING USERNAME AND PASSWORD");
	}
}
