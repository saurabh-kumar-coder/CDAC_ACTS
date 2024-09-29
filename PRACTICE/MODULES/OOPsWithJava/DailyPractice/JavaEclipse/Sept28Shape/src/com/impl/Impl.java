package com.impl;

import java.util.Scanner;

import com.entity.Circle;
import com.entity.Rectangle;
import com.entity.Shape;

//Create circle object and have Shape reference to it.
//Call the draw method of circle with specific circle reference after down casting from Shape reference
public class Impl {
	public static void showMenu() {
		System.out.println("\n******MENU******\n" + "1. find perimeter of circle\n" + "2. find Area of circle\n"
				+ "3. find perimeter of Rectangle\n" + "4. find area of Rectangle\n" + "5. Draw a Circle\n"
				+ "6. Exit");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = 0;
		do {
			showMenu();
			int choice = 0;
			System.out.println("Enter Your choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("find perimeter of circle");
				Shape s = new Circle(2);
				System.out.println(s.calculatePerimeter());
			}
				break;
			case 2: {
				System.out.println("find Area of circle");
				Shape s = new Circle(2);
				System.out.println(s.calculateArea());
			}
				break;
			case 3: {
				System.out.println("find perimeter of Rectangle");
				Shape s = new Rectangle(2, 3);
				System.out.println(s.calculatePerimeter());
			}
				break;
			case 4: {
				System.out.println("find area of Rectangle");
				Shape s = new Rectangle(2, 3);
				System.out.println(s.calculateArea());
			}
				break;
			case 5: {
				System.out.println("Draw a Circle");
				Shape s = new Circle();
				Circle c = (Circle) s;
				c.draw();
			}
				break;
			case 6: {
				System.out.println("Exit");
				System.exit(1);
			}
				break;
			default: {
				System.out.println("Wrong choice...");
			}
			}

			System.out.println("do you want to continue : (Press y/Y)");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');
		sc.close();
	}
}
