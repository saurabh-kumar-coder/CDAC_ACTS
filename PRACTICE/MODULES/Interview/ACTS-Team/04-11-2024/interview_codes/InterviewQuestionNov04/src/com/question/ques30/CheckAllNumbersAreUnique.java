package com.question.ques30;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class CheckAllNumbersAreUnique {

	public static boolean checkAllNumbersAreUnique(int[] arr) {
		// TODO Auto-generated method stub
		Set<Integer> set = Arrays.stream(arr)
				.boxed()
				.collect(Collectors.toSet());
		if(set.size() == arr.length) {
			return true;
		}
		return false;
	}

}
