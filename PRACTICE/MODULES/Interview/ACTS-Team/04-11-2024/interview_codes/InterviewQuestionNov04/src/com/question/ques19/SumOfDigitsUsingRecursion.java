package com.question.ques19;

public class SumOfDigitsUsingRecursion {

	public static int sumOfDigitsUsingRecursion(int num, int sum) {
		// TODO Auto-generated method stub
		if(num == 0) {
			return sum;
		}
		sum += num % 10;
		return sumOfDigitsUsingRecursion(num /10, sum);
	}

}
