package com.tester.ques19;

import com.question.ques19.SumOfDigitsUsingRecursion;

//19.	Write a program to find a sum of digits of a number using recursion.
public class SumOfDigitsUsingRecursionTester {
	public static void main(String[] args) {
		int num = 1222;
		int sumIs = SumOfDigitsUsingRecursion.sumOfDigitsUsingRecursion(num, 0);
		System.out.println("Sum of digits of " + num + " is : " + sumIs);
	}
}
