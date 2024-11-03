package com.quick;

import com.partition.Partitioning;

public class QuickSort {
    public static void usingQuickSort(int[] array, int lb, int ub) {
        if(lb < ub) {
            int loc = Partitioning.partitioning(array, lb, ub);
            usingQuickSort(array, lb, loc - 1);
            usingQuickSort(array, loc + 1, ub);
        }
    }
}
