package com.merge;

import com.merging.Merging;

public class Merge {

	public static void mergeSort(int[] array, int lb, int ub) {
		// TODO Auto-generated method stub
//		check if lb >= ub then return;
		if (lb >= ub) {
			return;
		}
//		otherwise,
//		calculate mid
		int mid = (lb + ub) / 2;
//		make recursive call to mergeSort with lb to mid
		mergeSort(array, lb, mid);
//		make recursive call to mergeSort with mid + 1 to ub
		mergeSort(array, mid + 1, ub);
//		give the current values to the merge() method
		Merging.merge(array, lb, mid, ub);
	}

}
