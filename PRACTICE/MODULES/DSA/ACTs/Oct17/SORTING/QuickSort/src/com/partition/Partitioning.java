package com.partition;

public class Partitioning {

    public static int partitioning(int[] array, int lb, int ub) {
        // TODO Auto-generated method stub
        int pivot = array[lb];
        int left = lb + 1;
        int right = ub;
        while (left <= right) {
            while (left <= ub && array[left] <= pivot) { // Compare with pivot value
                left++;
            }
            while (right >= lb && array[right] > pivot) { // Compare with pivot value
                right--;
            }
            if (left < right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
        }
        int temp = array[lb];
        array[lb] = array[right];
        array[right] = temp;
        return right;
    }

//    private static void swap(int[] array, int i, int i1) {
//        int temp = array[i];
//        array[i] = array[i1];
//        array[i1] = temp;
//    }
}
