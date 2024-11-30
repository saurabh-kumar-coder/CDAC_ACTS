package com.tester;

import java.util.Scanner;

import com.impl.StackImpl;

public class Tester {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of stack");
		int capacity = sc.nextInt();
		StackImpl stack = new StackImpl(capacity);
		char ch = 0;
		do {
			showMenu();
			System.out.println("enter you choice");
			int choice = sc.nextInt();
			switch (choice) {
				case 1: {
					System.out.println("enter element to be pushed");
					int element = sc.nextInt();
					stack.push(element);
				}
					break;
				case 2: {
					int element = stack.pop();
					if(element != -1)
						System.out.println("Pop element is : " + element);
				}
					break;
				case 3: {
					int topElement = stack.top();
					System.out.println("TOP element is : " + topElement);
				}
					break;
				case 4: {
					System.out.println("reverse stack is : ");
					stack.reverse();
				}
					break;
				default: {
					System.out.println("entered a wrong choice");
				}
			}
			System.out.println("Do you wish to continue (press y)");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');
		sc.close();
	}
	

	private static void showMenu() {
		// TODO Auto-generated method stub
		System.out.println("OPERATION YOU CAN PERFORM : ");
		System.out.println("1. push");
		System.out.println("2. pop");
		System.out.println("3. top");
		System.out.println("4. reverse");
	}
	
	/*
	public static void main(String[] args) {
		StackImpl stack = new StackImpl(5);
		stack.isEmpty();
		stack.push(5);
		System.out.println("top value" + stack.top());
		stack.push(6);
		System.out.println("top value" + stack.top());
		stack.push(1);
		System.out.println("top value" + stack.top());
		stack.push(3);
		System.out.println("top value" + stack.top());
		stack.push(9);
		System.out.println("top value" + stack.top());
		stack.push(2);
		System.out.println("top value" + stack.top());
		stack.push(2);
		System.out.println("top value" + stack.top());
		System.out.println("stack status : " + stack.isEmpty());
		
		int popedValue = stack.pop();
		System.out.println("poped value is :" + popedValue);
		System.out.println("top value" + stack.top());
		stack.push(2);
		System.out.println("top value : " + stack.top());
		stack.reverse();
		System.out.println("top value : " + stack.top());
		popedValue = stack.pop();
		System.out.println("poped value is :" + popedValue);
		System.out.println("top value : " + stack.top());
	}
	*/
}

 