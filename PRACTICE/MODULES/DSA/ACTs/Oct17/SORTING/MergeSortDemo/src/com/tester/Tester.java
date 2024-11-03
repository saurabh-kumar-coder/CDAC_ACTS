package com.tester;

import com.merge.Merge;

public class Tester {
	public static void main(String[] args) {
//		int [] array = {5,2,7,3,1,0,6};
		int [] array = {5,1,1,3,1,0,6};
		int lb = 0;
		int ub = array.length - 1;
		Merge.mergeSort(array, lb, ub);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
