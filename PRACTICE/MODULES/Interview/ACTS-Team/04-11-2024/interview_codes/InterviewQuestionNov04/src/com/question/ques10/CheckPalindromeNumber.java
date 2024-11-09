package com.question.ques10;

public class CheckPalindromeNumber {

	public static boolean checkPalindromeNumber(int num) {
		// TODO Auto-generated method stub
		int dummy = num;
		int i = calLength(num);
		int checker = 0;
		while (dummy > 0) {
			int res = dummy % 10;
//			System.out.println("res : " + res);
			dummy /= 10;
//			System.out.println("dummy : " + dummy);
			checker += res * Math.pow(10, i--);
//			System.out.println("checker : " + checker);
		}
		if (checker == num) {
			return true;
		} else {
			return false;
		}
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
