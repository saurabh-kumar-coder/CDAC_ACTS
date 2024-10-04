package com.basics.array.methods;
import java.util.Arrays;
public class MyArray {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6};
		int[][] b = {{1,2},{3,4},{5,6}};
//		to print 1 D array.
		System.out.println(a);
		System.out.println(Arrays.toString(a));
//		to print 2 D array.
		System.out.println(b);
		System.out.println(Arrays.deepToString(b));
		try {
			int[] c = new int[-2];			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
