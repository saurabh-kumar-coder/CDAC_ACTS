package com.leetcode;

import java.util.Arrays;

public class MissingNumber {
	public static void main(String[] args) {
		int[] arr = {5,1,2,3,4};
//		int[] arr = {3, 0, 1};
		int num = missingNumber(arr);
		System.out.println(num);
	}
	public static int missingNumber(int[] nums) {
		int sum = 0;
		Arrays.sort(nums);
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		int lastVal = nums[nums.length - 1];
		int sumOfNElements = lastVal * (lastVal+1) / 2;
//		find first
		if(sum == sumOfNElements && nums[0] != 0) {
			return 0;
		}
//		find last
		if(nums[0] == 0 && sumOfNElements == sum) {
			return nums[nums.length - 1] + 1;
		}
//		find middle
		return sumOfNElements - sum;
    }
}
