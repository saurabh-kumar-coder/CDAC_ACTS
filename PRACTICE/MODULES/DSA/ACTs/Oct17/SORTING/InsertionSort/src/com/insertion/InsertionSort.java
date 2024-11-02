package com.insertion;

public class InsertionSort {
    public static void usingInsertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while(j>=0 && array[j]>temp){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
        for (int i = 1; i < array.length; i++)
            System.out.println(array[i]);
    }
}
/*
given array is divided into 2 parts
    1. sorted sub-array
    2. unsorted sub-array

    take one variable from one unsorted and insert that variable in a appropriate place into sorted sub-array

    consider first element to be sorted, and other elements to be unsorted till last index of array.

iterate from 1 to arr.length
step 1 : take a temp variable and initialize it to the starting index of unsorted sub-array
    temp = arr[i]
step 2 : add temp variable into the sorted sub-array, in its appropriate place.

step 3 : shift the value 1 index forward.

step 4 : now compare each sorted sub-array element from end with temp variable to find appropriate place for it.
 */