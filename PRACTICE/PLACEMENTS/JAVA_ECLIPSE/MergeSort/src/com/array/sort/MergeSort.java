package com.array.sort;

import com.array.merge.Merge;

public class MergeSort {

	public static void sort(int[] array, int start, int end) {
		// TODO Auto-generated method stub
		if (start < end) {
			int mid = start + (end - start) / 2;

			sort(array, start, mid);
			sort(array, mid + 1, end);
			Merge.merge(array, start, mid, end);
		}
	}

}
