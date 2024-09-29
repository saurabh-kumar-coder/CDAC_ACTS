package com.entity;

import com.abstractentity.Circle;

public class RegularCircle extends Circle {
//	private double area;
//	private double peri;
	
	public RegularCircle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RegularCircle(double radii) {
		super(radii);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString(); // + "RegularCircle [area=" + area + ", peri=" + peri + "]";
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return 3.14 * getRadii() * getRadii();
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return 2 * 3.14 * getRadii();
	}
}
