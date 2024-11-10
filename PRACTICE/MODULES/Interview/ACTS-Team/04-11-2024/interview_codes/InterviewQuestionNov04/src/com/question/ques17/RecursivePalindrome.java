package com.question.ques17;

//17.	Write a program to check if it is a palindrome number or not using a recursive method.
public class RecursivePalindrome {

	public static boolean recursivePalindrome(int num) {
		// TODO Auto-generated method stub
		if (num < 0) {
			return false;
		}
		int digits = countDigits(num);
//		System.out.println("digits : " + digits);
		return isPalindromeHelper(num, num, 0, digits);
	}

	public static int countDigits(int num) {
		int ctr = 0;
		while (num > 0) {
			ctr++;
			num /= 10;
		}
		return ctr - 1;
	}

	private static boolean isPalindromeHelper(int number, int original, int start, int end) {
		// TODO Auto-generated method stub
		if(number == 0) {
			return true;
		}
		
		int endNumber = number % 10;
		int startNumber = (int) (original / Math.pow(10, end));
		original = (int) (original % Math.pow(10, end));
		if(endNumber != startNumber)
			return false;
		return isPalindromeHelper(number / 10, (int)original, start, --end);

	}

}