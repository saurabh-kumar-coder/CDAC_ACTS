package com.fitness.utility;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import com.fitness.activityEnum.ActivityEnum;
import com.fitness.exceptions.CaloriesCannotBeNegative;
import com.fitness.exceptions.DateCannotBeAfterThanTodays;
import com.fitness.exceptions.DurationCannotBeNegative;
import com.fitness.pojos.Activity;

public class ActivityUtility {
	public static void showMenu() {
		// TODO Auto-generated method stub
		System.out.println("******* MENU *******");
		System.out.println("1. ADD AN ACTIVITY");
		System.out.println("2. REMOVE AN ACTIVITY");
		System.out.println("3. DISPLAY ALL ACTIVITYS");
		System.out.println("4. FILTER ACTIVITIES BY DATE");
		System.out.println("5. SAVE ACTIVITY DATA INTO FILE");
		System.out.println("6. EXIT");
	}
	
	public static void saveActivityDataToFile(List<Activity> activityList, Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("enter file name");
		String fileName = sc.nextLine();
		try(FileWriter fw = new FileWriter(fileName);
				BufferedWriter bw = new BufferedWriter(fw);){
			
		for(Activity activity : activityList) {
			try {
				bw.write(activity.getActivityId() + " " + activity.getActivityName() + " " + activity.getActivityDuration() + " " + activity.getCaloriesBurnt() + " " + activity.getDate() + "\n");
				System.out.println(activity.getActivityId() + " " + activity.getActivityName() + " " + activity.getActivityDuration() + " " + activity.getCaloriesBurnt() + " " + activity.getDate() + "\n");
			} catch (IOException ex) {
				System.out.println(ex.getMessage());
			}
		}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	
	public static void displayAllActivitySortedByDate(List<Activity> activityList) {
		// TODO Auto-generated method stub
		activityList.stream()
			.sorted((o1, o2) -> o1.getDate().compareTo(o2.getDate()))
			.forEach(System.out::println);
	}
	
	public static void filterActivityOnSpecifiedDate(List<Activity> activityList, Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Date of the Activity");
		String d = sc.nextLine();
		LocalDate date = LocalDate.parse(d);
		activityList.stream()
			.filter(t -> t.getDate().equals(date))
			.forEach(System.out::println);
	}

	public static void removeAnActivity(List<Activity> activityList, Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("enter an activity to remove");
		Integer activityId = sc.nextInt();
		ListIterator<Activity> myItr = activityList.listIterator();
		while(myItr.hasNext()) {
			Activity curr = myItr.next();
			if(curr.getActivityId() == activityId) {
				myItr.remove();
				System.out.println("item removed from the list");
			} else {
				System.out.println("Activity Id not found Exception");
			}
		} 
		displayAllActivities(activityList);
	}

	public static void displayAllActivities(List<Activity> activityList) {
		// TODO Auto-generated method stub
		activityList.forEach(System.out::println);
	}

	public static void addAnActivity(List<Activity> activityList, Scanner sc) throws DateCannotBeAfterThanTodays, DurationCannotBeNegative, CaloriesCannotBeNegative {
		// TODO Auto-generated method stub
		boolean flag = false;
		System.out.println("Name of Activities : ");
		System.out.println("ZUMBA");
		System.out.println("WEIGHTS");
		System.out.println("RUNNING");
		System.out.println("PULLUPS");
		System.out.println("CYCLING");
		System.out.println("SQUARTS");
		System.out.println("Enter your activity name : ");
		String activityName = sc.nextLine();
		ActivityEnum aName = ActivityEnum.valueOf(activityName);
		System.out.println("Enter Activity Duration");
		Integer activityDuration = sc.nextInt();
		if(activityDuration < 0) {
			flag = true;
			throw new DurationCannotBeNegative("Duration cannot be less than 0");
		}
		
		System.out.println("Enter Calories Burnt");
		Double caloriesBurnt = sc.nextDouble();
		if(caloriesBurnt < 0) {
			flag = true;
			throw new CaloriesCannotBeNegative("Calories Burnt cannot be less than Zero");
		}
		sc.nextLine();
		System.out.println("Enter Activity Date");
		String activityDate = sc.nextLine();
		LocalDate date = LocalDate.parse(activityDate);
		if(date.isAfter(LocalDate.now())) {
			flag = true;
			throw new DateCannotBeAfterThanTodays("Entered Date is not a proper Date");
		}
		if(flag == false) {
			Activity activity = new Activity(aName, activityDuration, caloriesBurnt, date);
			activityList.add(activity);
			System.out.println("Activity added is : ");
			System.out.println(activity);
		} else {
			System.out.println("Re-enter details");
		}
	}
}
