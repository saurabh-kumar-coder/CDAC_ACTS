package com.impl;

import com.entity.RegularCircle;
import com.entity.Square;
import com.interfaceentity.Shape;

public class ShapeTester {
	public static void main(String[] args) {
//		shape ref to regular circle object
		Shape shapeRc = new RegularCircle(3.0);
		System.out.println("Area of Regular Circle is : " + shapeRc.calculateArea());
		System.out.println("Peri of Regular Circle is : " + shapeRc.calculatePerimeter());
		System.out.println(shapeRc.toString());
		
//		Shape ref to square Object
		Shape shapeSq = new Square(3, 3);
		System.out.println("Area of square is : " + shapeSq.calculateArea());
		System.out.println("Peri of square is : " + shapeSq.calculatePerimeter());
		System.out.println(shapeSq.toString());
	}
}
