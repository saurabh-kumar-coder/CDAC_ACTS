package com.abstractentity;

import com.interfaceentity.Shape;

//* Create abstract classes Circle and Rectangle implementing the Shape interface.
public abstract class Rectangle implements Shape {
	private double length;
	private double breath;
	
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Rectangle(double length, double breath) {
		super();
		this.length = length;
		this.breath = breath;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreath() {
		return breath;
	}

	public void setBreath(double breath) {
		this.breath = breath;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breath=" + breath + "]";
	}

	@Override
	public abstract double calculateArea();
	@Override
	public abstract double calculatePerimeter();
}