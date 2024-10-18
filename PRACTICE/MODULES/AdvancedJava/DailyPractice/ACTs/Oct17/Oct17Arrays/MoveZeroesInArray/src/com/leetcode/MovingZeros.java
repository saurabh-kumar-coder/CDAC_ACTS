package com.leetcode;

public class MovingZeros {
	public static void main(String[] args) {
		int[] nums = {0,1,0,2,12};
//		int[] nums = {0,0,0};
//		int[] nums = {0,1,0};
//		int[] nums = {1, 0, 1};
		moveZeroes(nums);
		for(Integer a : nums) {
			System.out.println(a);
		}
	}
	public static void moveZeroes(int[] nums) {
        int j = 0, t;
        for(int i = 0; i < nums.length; i++) {
        	if(nums[i] != 0) {
        		t = nums[i];
        		nums[i] = nums[j];
        		nums[j] = t;
        		j++;
        	}
        }
    }
}
