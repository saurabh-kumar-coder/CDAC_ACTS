package com.entity;

import com.abstractentity.Bike;

public class MotorCycle extends Bike {
	@Override
	public void rent(double rentPerHour) {
		// TODO Auto-generated method stub
		setRentPerHour(rentPerHour);
		System.out.println(getRentPerHour());
	}

	@Override
	public void returnVehicle() {
		// TODO Auto-generated method stub
		System.out.println("Vehicle not returned");
	}
}
