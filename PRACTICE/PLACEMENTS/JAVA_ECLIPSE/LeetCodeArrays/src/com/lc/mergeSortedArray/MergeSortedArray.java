package com.lc.mergeSortedArray;

public class MergeSortedArray {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = 0, j = 0;
		if(nums1.length == 1) {
			m--;
		}
		if (nums2.length == 0) {
			i++;
		} else {
			while (m + n + 1 >= i + j) {
				if (nums1[i] == 0 && nums2[j] != 0) {
					nums1[i] = nums2[j];
					i++; j++;
				} else if (nums1[i] < nums2[j]) {
					i++;
				} else {
					int temp = nums1[i];
					nums1[i] = nums2[j];
					nums2[j] = temp;
					i++;
				}
			}
		}
		for (int k : nums1) {
			System.out.println(k + " ");
		}
	}
	public static void main(String[] args) {
//		int nums1[] = { 1 , 0 };
//		int m = 1;
//		int nums2[] = { 2 };
//		int n = 1;
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
//		int[] nums1 = { 0, 0, 0 };
		int[] nums2 = { 2, 5, 6 };
		int m = 3;
		int n = 3;
//		int nums1[] = { 1 };
//		int m = 1;
//		int nums2[] = {};
//		int n = 0;
		merge(nums1, m, nums2, n);
	}
}
