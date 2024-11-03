package com.quick;

import com.partitioning.Partitioning;

public class QuickSort {

	public static void usingQuickSort(int[] array, int lb, int ub) {
		// TODO Auto-generated method stub
		if(lb < ub) {
			int loc = Partitioning.partitioning(array, lb, ub);
			usingQuickSort(array, lb, loc - 1);
			usingQuickSort(array, loc + 1, ub);
		}
	}
}
