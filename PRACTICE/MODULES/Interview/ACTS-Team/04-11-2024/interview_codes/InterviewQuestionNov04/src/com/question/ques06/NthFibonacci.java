package com.question.ques06;

public class NthFibonacci {

	public static int findFibonnaci(int num) {
		// TODO Auto-generated method stub
		if(num == 1 || num == 0) {
			return 1;
		}
		return findFibonnaci(num - 1) + findFibonnaci(num - 2);
	}
}
