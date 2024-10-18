package com.leetcode;


public class RemoveDuplicates {
	public static void main(String[] args) {
//		int[] arr = {1, 1, 2, 3};
		int[] arr = {0,0,1,1,1,2,2,3,3,4};
		int newVal = removeDuplicates(arr);
		for (int i = 0; i < newVal; i++) {
			System.out.println(arr[i]);
		}
	}
	public static int removeDuplicates(int[] nums) {
		int idx = 0;
		for (int i = 1; i < nums.length;) {
			if(nums[idx] == nums[i]) {
				i++;
				continue;
			} else {
				idx++;
				nums[idx] = nums[i];
				i++;
			}
		}
		return idx + 1;
	}
}
