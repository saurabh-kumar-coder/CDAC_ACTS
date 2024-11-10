package com.tester.ques20;

import com.question.ques20.AddTwoNumberWithoutAdditionOperator;

public class AddTwoNumberWithoutAdditionOperatorTester {
	public static void main(String[] args) {
		int num1 = 12347;
		int num2 = 24;
//		int num1 = 505;
//		int num2 = 505;
		
		int sum = AddTwoNumberWithoutAdditionOperator.addTwoNumberWithoutAdditionOperator(num1, num2, 0, 0);
		System.out.println("Sum of 2 number is : " + sum);
	}
}
