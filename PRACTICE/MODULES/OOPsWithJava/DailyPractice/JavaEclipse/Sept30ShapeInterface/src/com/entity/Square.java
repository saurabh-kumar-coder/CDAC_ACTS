package com.entity;

import com.abstractentity.Rectangle;

public class Square extends Rectangle {
//	private double area;
//	private double peri;
	
	public Square() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Square(double length, double breath) {
		super(length, breath);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString(); // + "Square [area=" + area + ", peri=" + peri + "]";
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return getLength() * getBreath();
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return getLength() * getBreath();
	}
}
