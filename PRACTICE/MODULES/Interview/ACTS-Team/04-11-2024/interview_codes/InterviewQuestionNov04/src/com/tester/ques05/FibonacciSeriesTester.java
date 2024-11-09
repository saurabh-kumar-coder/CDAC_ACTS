package com.tester.ques05;

import com.question.ques05.FibonacciSeries;

public class FibonacciSeriesTester {
	public static void main(String[] args) {
		int num = 7;
		for(int i = 0; i < num; i++)
			System.out.println(FibonacciSeries.fibonacciSeries(i));
	}
}
