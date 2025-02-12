package com.lc.duplicateZeros;

public class DuplicateZeros {
	public static void duplicateZeros(int[] arr) {

		for(int i = 0; i < arr.length - 2; i++) {
			if(arr[i] == 0 && arr[i+1] == 0) {
				arr[i+1] = -1;
			}
		}
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == 0 && arr[i + 1] == 0) {
				continue;
			} else if (arr[i] == 0 || arr[i] == -1) {
				for (int j = arr.length - 2; j > i; j--) {
					arr[j + 1] = arr[j];
				}
				arr[i + 1] = 0;
				i++;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == -1) {
				arr[i] = 0;
			}
		}
	}

	public static void main(String[] args) {
//		int[] arr = { 1, 0, 2, 3, 0, 4, 5, 0 };
//		int[] arr = { 0, 0, 0, 0, 0, 0, 0 };

		int[] arr = { 0, 4, 1, 0, 0, 8, 0, 0, 3 };
		duplicateZeros(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
//[0,0,4,1,0,0,0,0,8]