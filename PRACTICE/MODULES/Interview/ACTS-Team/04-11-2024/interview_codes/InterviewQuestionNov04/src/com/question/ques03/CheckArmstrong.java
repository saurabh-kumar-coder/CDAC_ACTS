package com.question.ques03;

public class CheckArmstrong {
//	example:
//	1^3 + 5^3 + 3^3 = 153
//	3^3 + 7^7 + 0^3 = 370
	public static boolean checkArmstrong(int num) {
		// TODO Auto-generated method stub
		int dummy = num;
		int checker = 0;
		while (dummy > 0) {
			int res = dummy % 10;
//			System.out.println("res is : " + res);
			dummy = dummy / 10;
//			System.out.println("dummy is : " + dummy);
			checker += res * res * res;
//			System.out.println("checker is : " + checker);
		}
		if (checker == num) {
			return true;
		} else {
			return false;
		}
	}

}
