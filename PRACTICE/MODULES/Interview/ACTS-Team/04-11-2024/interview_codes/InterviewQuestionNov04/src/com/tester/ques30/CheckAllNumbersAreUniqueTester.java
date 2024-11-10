package com.tester.ques30;

import com.question.ques30.CheckAllNumbersAreUnique;

public class CheckAllNumbersAreUniqueTester {
	public static void main(String[] args) {
		int[] arr = {12, 23, 56, 59};
		boolean isUnique = CheckAllNumbersAreUnique.checkAllNumbersAreUnique(arr);
		System.out.println("element are unique : " + isUnique);
	}
}
