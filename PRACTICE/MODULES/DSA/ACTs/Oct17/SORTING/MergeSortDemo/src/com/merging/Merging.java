package com.merging;

public class Merging {

	public static void merge(int[] array, int lb, int mid, int ub) {
		// TODO Auto-generated method stub
		int size = lb + ub + 1;
		int [] nArray = new int[size];
		int left = lb;
		int right = mid + 1;
		int i = 0;
		while(left <= mid && right <= ub && i < lb + ub) {
			if(array[left] <= array[right]) {
				nArray[i] = array[left];
				left++;
				i++;
			} else {
				nArray[i] = array[right];
				right++;
				i++;
			}
		}
		while(left <= mid && i < size) {
			nArray[i] = array[left];
			left++;
			i++;
		}
		while(right <= ub && i < size) {
			nArray[i] = array[right];
			right++;
			i++;
		}
		for(int j = lb; j <= ub; j++) {
			array[j] = nArray[j - lb];
		}
		
	}

}
