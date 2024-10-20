package com.leetcode;

public class LongestConsecutive {
	public static void main(String[] args) {
//		int[] nums = {1,3,5,4,7};
		int[] nums = {1,3,5,4,2,3,4,5};
		findLengthOfLCIS(nums);
	}
	public static int findLengthOfLCIS(int[] nums) {
        int pctr = 0;
        int ctr = 1;
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i+1]) {
                ctr = 1;
            }
            if(nums[i] < nums[i+1]) {
                ctr++;
            } else {
                ctr = 1;
            }
            pctr = Math.max(ctr, pctr);
        }
        System.out.println(pctr);
        return pctr;
    }
}
