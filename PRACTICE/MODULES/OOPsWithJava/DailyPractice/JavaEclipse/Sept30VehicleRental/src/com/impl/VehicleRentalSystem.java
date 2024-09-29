package com.impl;

import com.abstractentity.Bike;
import com.abstractentity.Car;
import com.entity.MotorCycle;
import com.entity.Scooter;
import com.entity.Sedan;
import com.entity.SportsCar;

public class VehicleRentalSystem {
	public static void main(String[] args) {
		Car car = new Sedan();
		car.rent(300);
		car.returnVehicle();
		car = new SportsCar();
		car.rent(600);
		car.returnVehicle();
		Bike bike = new Scooter();
		bike.rent(50);
		bike.returnVehicle();
		bike = new MotorCycle();
		bike.rent(400);
		bike.returnVehicle();
	}
}
