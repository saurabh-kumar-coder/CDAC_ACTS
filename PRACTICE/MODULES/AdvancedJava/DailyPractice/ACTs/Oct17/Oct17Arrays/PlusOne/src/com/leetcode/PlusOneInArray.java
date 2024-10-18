package com.leetcode;

public class PlusOneInArray {
	public static void main(String[] args) {
		int[] arr = {1,9,9};
//		int[] arr = {9,9};
		arr = plusOne(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static int[] plusOne(int[] digits) {
        int len = digits.length - 1;
        int carry = 0;
        for(int i = len; i >= 0; i--) {
        	int sum = digits[len] + 1;
        	carry = sum / 10;
        	int rem = sum % 10;
        	digits[len] = rem;
        	if(carry == 1 && len == 0) {
        		digits = changeSize(digits);
        		break;
        	}
        	if(carry == 1) {
        		len--;
        		continue;
        	}
        	break;
        }
        return digits;
    }
	private static int[] changeSize(int[] digits) {
		int[] newDigits = new int[digits.length + 1];
		for(int i = 0; i < digits.length; i++) {
			newDigits[i+1] = digits[i];
		}
		int sum = newDigits[1] + 1;
		newDigits[1] = sum / 10;
		newDigits[0] = sum % 10;
		return newDigits;
	}
}
