package com.fitness.pojos;

import java.time.LocalDate;

import com.fitness.activityEnum.ActivityEnum;

public class Activity {
	private static Integer idGenerator = 100;
	private Integer activityId;
	private ActivityEnum activityName;
	private Integer activityDuration;
	private Double caloriesBurnt;
	private LocalDate date;
	public Activity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Activity(Integer activityId, ActivityEnum activityName, Integer activityDuration, Double caloriesBurnt,
			LocalDate date) {
		super();
		this.activityId = activityId;
		this.activityName = activityName;
		this.activityDuration = activityDuration;
		this.caloriesBurnt = caloriesBurnt;
		this.date = date;
	}

	public Activity(ActivityEnum activityName, Integer activityDuration, Double caloriesBurnt,
			LocalDate date) {
		super();
		this.activityId = idGenerator++;
		this.activityName = activityName;
		this.activityDuration = activityDuration;
		this.caloriesBurnt = caloriesBurnt;
		this.date = date;
	}

	public Integer getActivityId() {
		return activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public ActivityEnum getActivityName() {
		return activityName;
	}

	public void setActivityName(ActivityEnum activityName) {
		this.activityName = activityName;
	}

	public Integer getActivityDuration() {
		return activityDuration;
	}

	public void setActivityDuration(Integer activityDuration) {
		this.activityDuration = activityDuration;
	}

	public Double getCaloriesBurnt() {
		return caloriesBurnt;
	}

	public void setCaloriesBurnt(Double caloriesBurnt) {
		this.caloriesBurnt = caloriesBurnt;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Activity [activityId=" + activityId + ", activityName=" + activityName + ", activityDuration="
				+ activityDuration + ", caloriesBurnt=" + caloriesBurnt + ", date=" + date + "]";
	}
	
}
