package com.tester.ques02;

import com.question.ques02.CheckPrime;

//2.	Write a program to check prime number?
public class CheckPrimeTester {
	public static void main(String[] args) {
		int number = 41;
		boolean isPrime = CheckPrime.checkPrime(number);
		System.out.println(number + " is prime : " + isPrime);
	}
}
