package com.leetcode2;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleLine {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		int n = 6;
		for(int i = 0; i <= n; i++) {
			int val = calcNCR(n, i);
			l.add(val);
		}
		System.out.println(l);			
	}

	private static int calcNCR(int n, int r) {
		// TODO Auto-generated method stub
		int sum = 1;
		for(int i = 1; i <= r; i++) {
			sum = sum * (n - r + i) / i;
		}
		return sum;
	}
}
