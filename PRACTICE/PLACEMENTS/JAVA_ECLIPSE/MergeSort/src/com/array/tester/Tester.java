package com.array.tester;

import com.array.sort.MergeSort;

public class Tester {
	public static void main(String[] args) {
		int[] array = { 4, 2, 1, 5, 6, 0, 9, 8 };
		int start = 0;
		int end = array.length - 1;
		MergeSort.sort(array, start, end);
		print(array);
	}

	private static void print(int[] array) {
		// TODO Auto-generated method stub
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
