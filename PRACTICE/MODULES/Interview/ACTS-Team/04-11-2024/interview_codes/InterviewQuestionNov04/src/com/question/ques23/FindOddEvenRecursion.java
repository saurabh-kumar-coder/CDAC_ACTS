package com.question.ques23;

public class FindOddEvenRecursion {

	public static String findOddEvenRecursion(int num) {
		// TODO Auto-generated method stub
		if(num == 0) {
			return "even";
		}
		if(num == 1) {
			return "odd";
		}
		return findOddEvenRecursion(num - 2);
	}

}
