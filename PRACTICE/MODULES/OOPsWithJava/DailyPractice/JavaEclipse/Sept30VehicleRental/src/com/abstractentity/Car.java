package com.abstractentity;

import com.interfaceentity.Vehicle;

public abstract class Car implements Vehicle{
	private double rentPerDay;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Car(double rentPerDay) {
		super();
		this.rentPerDay = rentPerDay;
	}

	public double getRentPerDay() {
		return rentPerDay;
	}

	public void setRentPerDay(double rentPerDay) {
		this.rentPerDay = rentPerDay;
	}

	@Override
	public String toString() {
		return "Car [rentPerDay=" + rentPerDay + "]";
	}

	@Override
	public abstract void rent(double rentDay);

	@Override
	public abstract void returnVehicle();
}
