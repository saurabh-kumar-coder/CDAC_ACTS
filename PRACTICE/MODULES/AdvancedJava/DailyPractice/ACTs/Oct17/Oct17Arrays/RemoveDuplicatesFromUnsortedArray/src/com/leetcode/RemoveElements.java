package com.leetcode;


public class RemoveElements {
	public static void main(String[] args) {
		int[] arr = {3, 2, 2, 3};
//		int[] arr = {0,0,1,1,1,2,2,3,3,4};
		int newVal = removeElements(arr, 3);
		for (int i = 0; i < newVal; i++) {
			System.out.println(arr[i]);
		}
	}
	public static int removeElements(int[] nums, int val) {
		int idx = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] != val) {
				nums[idx] = nums[i];
				idx++;
			} 
		}
		return idx;
	}
}
