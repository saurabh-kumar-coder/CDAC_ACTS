package com.tester;

import com.merge.Merge;

public class Tester {
	public static void main(String[] args) {
//		int [] array = {5,2,7,3,1,0,6};
		int [] array = {3,4,2,1,6};
		int lb = 0;
		int ub = array.length - 1;
//		call mergeSort() with array and lower bound and upper bound values.
		Merge.mergeSort(array, lb, ub);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
