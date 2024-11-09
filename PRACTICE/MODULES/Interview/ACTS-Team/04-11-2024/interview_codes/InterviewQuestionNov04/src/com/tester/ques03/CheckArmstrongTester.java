package com.tester.ques03;

import com.question.ques03.CheckArmstrong;

//3.	Write a program to check Armstrong number?
public class CheckArmstrongTester {
	public static void main(String[] args) {
		int num = 370;
		boolean checkArmstrong = CheckArmstrong.checkArmstrong(num);
		System.out.println(num + " is Armstrong number : " + checkArmstrong);
	}
}
