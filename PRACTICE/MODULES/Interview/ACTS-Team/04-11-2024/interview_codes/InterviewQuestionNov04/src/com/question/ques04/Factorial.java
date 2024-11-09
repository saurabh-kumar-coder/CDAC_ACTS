package com.question.ques04;

public class Factorial {

	public static int printFactorial(int num) {
		// TODO Auto-generated method stub
		int fact = 1;
		for(int i = 1; i <= num; i++) {
			fact *= i;
		}
		return fact;
	}
}
