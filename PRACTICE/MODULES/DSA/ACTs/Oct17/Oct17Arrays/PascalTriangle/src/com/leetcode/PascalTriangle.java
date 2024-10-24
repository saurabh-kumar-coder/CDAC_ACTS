package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> list = new ArrayList<>();
		list = generate(25);
		System.out.println(list);
	}
	public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ll = new ArrayList<List<Integer>>();
        for(int i = 0; i < numRows; i++) {
            List<Integer> sl = new ArrayList<Integer>();
            for(int j = 0; j <= i; j++) {
//                int iCj = fact(i) / (fact(j) * fact(i - j));
            	int iCj = calcNCR(i, j);
                sl.add(iCj);
            }
            ll.add(sl);
        }
        return ll;
    }
    public static int fact(int num) {
        int fact = 1;
        for(int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
    
    public static int calcNCR(int n, int r) {
    	int sum = 1;

        // Calculate the value of n choose r using the
        // binomial coefficient formula
        for (int i = 1; i <= r; i++) {
            sum = sum * (n - r + i) / i;
        }
        return sum;
    }
}
