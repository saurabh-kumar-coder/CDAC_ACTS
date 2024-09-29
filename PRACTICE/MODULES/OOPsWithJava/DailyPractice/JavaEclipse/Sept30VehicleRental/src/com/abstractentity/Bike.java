package com.abstractentity;

import com.interfaceentity.Vehicle;

public abstract class Bike implements Vehicle{
	private double rentPerHour;
	
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Bike(double rentPerHour) {
		super();
		this.rentPerHour = rentPerHour;
	}

	public double getRentPerHour() {
		return rentPerHour;
	}

	public void setRentPerHour(double rentPerHour) {
		this.rentPerHour = rentPerHour;
	}

	@Override
	public String toString() {
		return "Bike [rentPerHour=" + rentPerHour + "]";
	}

	@Override
	public abstract void rent(double rentHour);

	@Override
	public abstract void returnVehicle();
}
