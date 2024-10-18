package com.leetcode;

public class MovingZeros {
	public static void main(String[] args) {
//		int[] nums = {0,1,0,2,12};
		int[] nums = {0, 0, 0};
		moveZeroes(nums);
		for(Integer a : nums) {
			System.out.println(a);
		}
	}
	public static void moveZeroes(int[] nums) {
        int len = nums.length - 1;
        if(len == 0) {
            return;
        }
        if(len == 1 && nums[0] == 0) {
        	int temp = nums[0];
        	nums[0] = nums[1];
        	nums[1] = temp;
        }
        int j = 1;
        for(int i = 0; i < len-1;) {
            if(len == i && j == len) {
                return;
            }
            if(nums[i] != 0 && nums[j] != 0) {
                i++;
                j++;
            }
            if(nums[i] == 0 && nums[j] == 0) {
                j++;
            }
            if(nums[i] == 0 && nums[j] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j = i+1;
            }
        }
    }
}
