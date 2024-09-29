package com.abstractentity;

import com.interfaceentity.Shape;

//  * Create abstract classes Circle and Rectangle implementing the Shape interface.
public abstract class Circle implements Shape {
	private double radii;
	
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Circle(double radii) {
		super();
		this.radii = radii;
	}

	public double getRadii() {
		return radii;
	}

	public void setRadii(double radii) {
		this.radii = radii;
	}

	@Override
	public String toString() {
		return "Circle [radii=" + radii + "]";
	}

	@Override
	public abstract double calculateArea();
	@Override
	public abstract double calculatePerimeter();
}