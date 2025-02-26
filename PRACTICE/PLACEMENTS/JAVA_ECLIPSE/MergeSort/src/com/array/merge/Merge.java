package com.array.merge;

public class Merge {

	public static void merge(int[] array, int start, int mid, int end) {
		// TODO Auto-generated method stub
		int a1 = mid - start + 1;
		int a2 = end - mid;

		int[] L = new int[a1];
		int[] R = new int[a2];

		for (int i = 0; i < a1; i++) {
			L[i] = array[start + i];
		}
		for (int j = 0; j < a2; j++) {
			R[j] = array[mid + 1 + j];
		}
		
		int i = 0, j = 0, k = start;
		
		while(i < a1 && j < a2) {
			if(L[i] <= R[j]) {
				array[k] = L[i];
				i++;
			} else {
				array[k] = R[j];
				j++;
			}
			k++;
		}
		
		while(i < a1) {
			array[k] = L[i];
			i++;
			k++;
		}
		while(j < a2) {
			array[k] = R[j];
			j++;
			k++;
		}
		
	}

}
