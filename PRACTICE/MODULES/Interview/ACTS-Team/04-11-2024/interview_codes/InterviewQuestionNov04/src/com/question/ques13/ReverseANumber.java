package com.question.ques13;

public class ReverseANumber {

	public static int reverseANumber(int num) {
		// TODO Auto-generated method stub
		int i = calLength(num);
		int newNum = 0;
		while(num > 0) {
			int res = num % 10;
			num /= 10;
			newNum += res * Math.pow(10, i--);
		}
		return newNum;
	}

	private static int calLength(int num) {
		// TODO Auto-generated method stub
		int i = 0;
		while(num > 0) {
			i++;
			num /= 10;
		}
		return i - 1;
	}

}
