package com.fitness.impl;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.fitness.dummyData.ActivityData;
import com.fitness.exceptions.CaloriesCannotBeNegative;
import com.fitness.exceptions.DateCannotBeAfterThanTodays;
import com.fitness.exceptions.DurationCannotBeNegative;
import com.fitness.pojos.Activity;
import com.fitness.utility.ActivityUtility;

public class Implement {
	public static void main(String[] args) throws IOException {
		List<Activity> activityList = ActivityData.getActivityList();
		try(Scanner sc = new Scanner(System.in);
				){
			
			char ch = 0;
			do {
				ActivityUtility.showMenu();
				System.out.println("enter your choice");
				int choice = sc.nextInt();
				sc.nextLine();
				switch(choice) {
					case 1:{
						try {
							ActivityUtility.addAnActivity(activityList, sc);
							
						} catch (DateCannotBeAfterThanTodays e) {
							// TODO Auto-generated catch block
							System.out.println(e.getMessage());
						}catch (DurationCannotBeNegative e) {
							// TODO Auto-generated catch block
							System.out.println(e.getMessage());
						} catch (CaloriesCannotBeNegative e) {
							// TODO Auto-generated catch block
							System.out.println(e.getMessage());
						}
					}break;
					case 2:{
						ActivityUtility.removeAnActivity(activityList, sc);
					}break;
					case 3:{
						ActivityUtility.displayAllActivitySortedByDate(activityList);
					}break;
					case 4:{
						ActivityUtility.filterActivityOnSpecifiedDate(activityList, sc);
					}break;
					case 5:{
						ActivityUtility.saveActivityDataToFile(activityList, sc);
					}break;
					default:{
						System.exit(0);
						System.out.println("");
					}
				}
				System.out.println("Do you want to continue : Press y/Y");
				ch = sc.next().charAt(0);
			} while(ch == 'y'||ch=='Y');
		}
	}	
}
