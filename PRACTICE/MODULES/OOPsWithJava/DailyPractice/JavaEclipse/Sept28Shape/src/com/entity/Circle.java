package com.entity;

public class Circle extends Shape {
	double radii;

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
	public double calculateArea() {
		// TODO Auto-generated method stub
		System.out.println("area of circle : ");
		double area = 3.14 * getRadii() * getRadii();
		return area;
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		System.out.println("peri of circle : ");
		double peri = 2 * 3.14 * getRadii();
		return peri;
	}

	public void draw() {
		System.out.println("not need to draw real Circle");
	}

	@Override
	public String toString() {
		return "Circle [radii=" + radii + "]";
	}
}
