package com.tester;

import com.quick.QuickSort;

public class Tester {
    public static void main(String[] args) {
        int[] array = {4,5,3,2,7,1,9,0};
        int lb = 0;
        int ub = array.length - 1;
        QuickSort.usingQuickSort(array, lb, ub);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
