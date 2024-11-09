package com.tester.ques14;

import com.data.sample.IntegerList;
import com.question.ques14.CountEvenNumber;

//14.	Given a list and find even numbers in that list using lambda function
public class CountEvenNumberTester {
	public static void main(String[] args) {
		long value = CountEvenNumber
				.countEvenNumber(IntegerList.getIntegerList());
		System.out.println(value);
	}
}
