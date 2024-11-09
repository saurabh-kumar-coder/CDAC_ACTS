package com.question.ques02;

public class CheckPrime {

	public static boolean checkPrime(int number) {
		// TODO Auto-generated method stub
		int ctr = 0;
		if(number <= 1) {
			return false;
		}
		if(number % 2 ==0) {
			return false;
		}
		for(int i = 3; i * i <= number; i+=2) {
			if(number % i == 0) {
				ctr++;
			}
		}
		if(ctr == 0) {
			return true;
		} else {
			return false;
		}
	}

}
