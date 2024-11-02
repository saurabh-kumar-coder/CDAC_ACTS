package com.selection;

public class SelectionSort {

    public static void usingSelectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i+1; j < array.length; j++) {
                if(array[j] < array[min]){
                    min = j;
                }
            }
            if(min != i){
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }
}

/*
parse 1:
    {7,9,2,5,4,3,1,8}
    find min : 1
    {1,9,2,5,4,3,7,8}
parse 2:
    {1,9,2,5,4,3,7,8}
    find next min : 2
    {1,2,9,5,4,3,7,8}
parse 3 :
    {1,2,9,5,4,3,7,8}
    find next min : 3
    {1,2,3,4,5,9,7,8}
parse 4 :
    {1,2,3,4,5,9,7,8}
    find next min : 4
    {1,2,3,4,5,9,7,8}
parse 5 :
    {1,2,3,4,5,9,7,8}
    find next min : 5
    {1,2,3,4,5,9,7,8}
parse 6:
    {1,2,3,4,5,9,7,8}
    find next min : 7
    {1,2,3,4,5,7,9,8}
parse 7 :
    {1,2,3,4,5,7,9,8}
    find next min : 8
    {1,2,3,4,5,7,8,9}
parse 8 :
    {1,2,3,4,5,7,8,9}
    find next min : 9
    {1,2,3,4,5,7,8,9}
 */