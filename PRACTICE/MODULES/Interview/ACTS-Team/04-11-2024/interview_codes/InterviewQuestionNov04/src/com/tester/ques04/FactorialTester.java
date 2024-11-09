package com.tester.ques04;

import com.question.ques04.Factorial;
//4.	Write a program to print factorial of given number without using recursion?
public class FactorialTester {
	public static void main(String[] args) {
		int num = 5;
		int factorial = Factorial.printFactorial(num);
		System.out.println("Factorial of " + num + " is : " + factorial);
	}
}
