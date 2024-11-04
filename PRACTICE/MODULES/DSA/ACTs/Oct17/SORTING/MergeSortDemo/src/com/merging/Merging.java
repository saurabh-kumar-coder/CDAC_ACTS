package com.merging;

public class Merging {

	public static void merge(int[] array, int lb, int mid, int ub) {
		// TODO Auto-generated method stub
//		set size for new array by lb + ub + 1
		int size = lb + ub + 1;
//		create a new array
		int [] nArray = new int[size];
//		set left by lb;
		int left = lb;
//		set right by mid + 1
		int right = mid + 1;
//		set i as a counter by 0
		int i = 0;
//		iterate until left or right reach end
		while(left <= mid && right <= ub && i < lb + ub) {
//			left <= right
			if(array[left] <= array[right]) {
//				insert left data into new array
				nArray[i] = array[left];
//				increment left
				left++;
//				increment i
				i++;
			} else {
//				insert right data into new array
				nArray[i] = array[right];
//				increment right
				right++;
//				increment i
				i++;
			}
		}
//		if left is still left, add it into the new array
		while(left <= mid && i < size) {
			nArray[i] = array[left];
			left++;
			i++;
		}
//		if right is still left, add it into the new array
		while(right <= ub && i < size) {
			nArray[i] = array[right];
			right++;
			i++;
		}
//		now add the data into the original array
		for(int j = lb; j <= ub; j++) {
			array[j] = nArray[j - lb];
		}
		
	}

}
