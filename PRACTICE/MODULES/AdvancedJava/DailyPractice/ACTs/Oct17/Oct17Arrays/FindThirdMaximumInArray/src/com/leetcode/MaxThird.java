package com.leetcode;
import java.util.Arrays;
public class MaxThird {
	public static void main(String[] args) {
//		int[] arr = {3, 2, 1};
		int[] arr = {1, 1, 2};
		int val = thirdMax(arr);
		System.out.println(val);
	}
	public static int thirdMax(int[] nums) {
		int len = nums.length;
        Arrays.sort(nums);
        int idx = 0;
        for(int i = 1; i < len; i++) {
            if(nums[i] == nums[idx]) {
                continue;
            } else {
                nums[idx+1] = nums[i];
                idx++;
            }
        }
        if(idx <= 1) {
            return nums[len - 1];
        }
        return nums[idx-2];
    }
}
