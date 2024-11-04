package com.partitioning;

public class Partitioning {

	public static int partitioning(int[] array, int lb, int ub) {
		// TODO Auto-generated method stub
//		set pivot to lb
		int pivot = array[lb];
//		set left = lb + 1
		int left = lb + 1;
//		set right as ub
		int right = ub;
//		iterate till left <= right
		while (left <= right) {
//			move left until array[left] <= pivot
			while (array[left] <= pivot) { // Compare with pivot value
				left++;
			}
//			move right until array[right] > pivot
			while (array[right] > pivot) { // Compare with pivot value
				right--;
			}
//			if left and right have moved and left < right swap(array[left], array[right])
			if (left < right) {
//				swap(array[left], array[right])
				int temp = array[left];
				array[left] = array[right];
				array[right] = temp;
			}
		}
//		swap(array[lb], array[right])
		int temp = array[lb];
		array[lb] = array[right];
		array[right] = temp;
//		return right index
		return right;
	}
}
