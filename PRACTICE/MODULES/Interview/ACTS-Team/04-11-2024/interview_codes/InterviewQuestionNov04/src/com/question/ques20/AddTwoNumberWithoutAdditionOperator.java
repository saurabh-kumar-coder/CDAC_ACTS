package com.question.ques20;

public class AddTwoNumberWithoutAdditionOperator {

	public static int addTwoNumberWithoutAdditionOperator(int num1, int num2, int sum, int ctr) {
		// TODO Auto-generated method stub
		if(num1 == 0 && num2 == 0) {
			return sum;
		}
		int carry = 0;
		if(num1 != 0 && num2 != 0) {
			int val1 = num1 % 10;
			int val2 = num2 % 10;
			int current = (val1 + val2) % 10;
			sum += (carry + current) * Math.pow(10, ctr);
			if(val1 + val2 >= 10) {
				carry = 1;
			}
			num1 = num1 / 10;
			num2 = num2 / 10;
			if(num1 > num2 && carry == 1) {
				num1 += carry;
			} else if(num1 < num2 && carry == 1) {
				num2 += carry;
			}
			return addTwoNumberWithoutAdditionOperator(num1, num2, sum, ++ctr);
		}
		if(num1 != 0 && num2 == 0) {
			sum += (carry + num1) * Math.pow(10, ctr);
			num1 /= 10;
		}
		if(num1 == 0 && num2 != 0) {
			sum += (carry + num2) * Math.pow(10, ctr);
			num2 /= 10;
		}
		return sum;
	}
}
