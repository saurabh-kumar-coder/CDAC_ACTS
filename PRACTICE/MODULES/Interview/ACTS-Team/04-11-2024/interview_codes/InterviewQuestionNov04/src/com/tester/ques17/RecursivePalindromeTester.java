package com.tester.ques17;

import com.question.ques17.RecursivePalindrome;

//17.	Write a program to check if it is a palindrome number or not using a recursive method.
public class RecursivePalindromeTester {
	public static void main(String[] args) {
		int num = 1221;
		boolean isPalindrome = RecursivePalindrome
				.recursivePalindrome(num);
		System.out.println(num + " is Palindrome : " + isPalindrome);
	}
}
