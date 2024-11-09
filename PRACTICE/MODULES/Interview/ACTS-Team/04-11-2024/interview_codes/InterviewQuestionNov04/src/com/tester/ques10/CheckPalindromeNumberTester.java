package com.tester.ques10;

import com.question.ques10.CheckPalindromeNumber;

public class CheckPalindromeNumberTester {
	public static void main(String[] args) {
		int num = 1551;
		boolean isPalindrome = CheckPalindromeNumber.checkPalindromeNumber(num);
		System.out.println(num + " is palindrome number : " + isPalindrome);
	}
}
