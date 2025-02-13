package com.lc.removeElements;

public class RemoveElements {
	static public int removeElement(int[] nums, int val) {
//		int ctr = 0;
//		int len = nums.length - 1;
//        for(int i = 0, j = len; i < j;) {
//            if(nums[i] != val) {
//            	ctr++;
//                i++;
//            } else {
//                if(nums[j] == val) {
//                    nums[j] = 0;
//                    j--;
//                } else {
//                    nums[i] = nums[j];
//                    nums[j] = 0;
//                    j--;
//                    i++;
//                }
//            }
//        }
////		for (int k : nums) {
////			System.out.print(k + " ");
////		}
//		return ctr;
		int ctr = 0;
        int len = nums.length - 1;
        for(int i = 0, j = len; i < j;) {
            if(nums[i] != val) {
                i++;
                ctr++;
            } else {
                if(nums[j] == val) {
                    nums[j] = 0;
                    j--;
                } else {
                    nums[i] = nums[j];
                    nums[j] = 0;
                    j--;
                    i++;
                }
            }
        }
        return ctr;
	}

	public static void main(String[] args) {
//		int[] arr = { 3, 2, 2, 3 };
		int [] arr = {0,1,2,2,3,0,4,2};
		int val = 2;
		System.out.println(removeElement(arr, val));
	}
}
