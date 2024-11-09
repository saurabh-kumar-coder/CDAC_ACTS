package com.question.ques05;

public class FibonacciSeries {

	public static int fibonacciSeries(int num) {
		// TODO Auto-generated method stub
		if(num == 1 || num == 0) {
			return 1;
		}
		return fibonacciSeries(num - 1) + fibonacciSeries(num - 2);
	}

}
