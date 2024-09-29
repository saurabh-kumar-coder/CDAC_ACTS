package com.entity;

public class Rectangle extends Shape {
	private int length;
	private int breadth;

	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		System.out.println("area of rectangle is : ");
		double area = getLength() * getBreadth();
		return area;
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		System.out.println("calc perimeter of rectangle");
		double peri = 2 * (getLength() + getBreadth());
		return peri;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
	}
}
