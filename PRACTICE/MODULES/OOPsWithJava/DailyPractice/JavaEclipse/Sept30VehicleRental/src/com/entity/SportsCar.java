package com.entity;

import com.abstractentity.Car;

public class SportsCar extends Car {
	@Override
	public void rent(double rentPerDay) {
		// TODO Auto-generated method stub
		setRentPerDay(rentPerDay);
		System.out.println(getRentPerDay());
	}

	@Override
	public void returnVehicle() {
		// TODO Auto-generated method stub
		System.out.println("Vehicle not returned");
	}
}
