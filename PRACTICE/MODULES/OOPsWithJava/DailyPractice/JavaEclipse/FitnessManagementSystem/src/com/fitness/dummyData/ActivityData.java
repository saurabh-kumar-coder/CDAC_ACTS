package com.fitness.dummyData;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.fitness.activityEnum.ActivityEnum;
import com.fitness.pojos.Activity;

public class ActivityData {
	public static List<Activity> getActivityList(){
		List<Activity> activityList = new ArrayList<Activity>();
		
		activityList.add(new Activity(100000, ActivityEnum.valueOf("RUNNING"), 30, 30.0, LocalDate.parse("2014-04-13")));
		
		return activityList;
	}
}
