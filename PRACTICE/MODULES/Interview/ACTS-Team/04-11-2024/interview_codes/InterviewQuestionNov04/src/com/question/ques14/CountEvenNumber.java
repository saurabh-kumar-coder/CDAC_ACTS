package com.question.ques14;

import java.util.List;

public class CountEvenNumber {

	public static long countEvenNumber(List<Integer> integerList) {
		// TODO Auto-generated method stub
		long count = integerList.stream()
			.filter(T -> T % 2 == 0)
			.count();
		return count;
	}

}
