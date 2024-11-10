package com.tester.ques22;

import com.question.ques22.MultiplyByTwo;

//22.	Write a program to Multiply an Integer Number by 2 Without Using Multiplication Operator
public class MultiplyByTwoTester {
	public static void main(String[] args) {
		int num = 5;
		int value = MultiplyByTwo.multiplyByTwo(num);
		System.out.println(num + " Multiplied by 2 is : " + value);
	}
}
