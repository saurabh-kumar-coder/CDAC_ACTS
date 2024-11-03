package com.merge;

import com.merging.Merging;

public class Merge {

	public static void mergeSort(int[] array, int lb, int ub) {
		// TODO Auto-generated method stub
		if (lb >= ub) {
			return;
		}

		int mid = (lb + ub) / 2;
		mergeSort(array, lb, mid);
		mergeSort(array, mid + 1, ub);
		Merging.merge(array, lb, mid, ub);
	}

}
