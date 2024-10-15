package com.fitness.activityEnum;

public enum ActivityEnum {
	ZUMBA("ZUMBA"),
	WEIGHTS("WEIGHTS"),
	RUNNING("RUNNING"),
	PULLUPS("PULLUPS"),
	CYCLING("CYCLING"),
	SQUARTS("SQUARTS");
	String activity;

	private ActivityEnum(String activity) {
		this.activity = activity;
	}
	public String getActivityName() {
		return this.activity;
	}
}
