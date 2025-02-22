package com.ques;


import java.util.*;
import java.io.*;

public class Main1 {
    public static ArrayList<Integer> processArray(ArrayList<Integer> array) {
        /* 
         * Do not make any changes outside this method.
         *
         * Modify this method to process `array` as indicated
         * in the question. At the end, return the new size of the
         * array. 
         *
         * Do not print anything in this method
         *
         * Submit this entire program (not just this function)
         * as your answer
         */
//    	System.out.println(array);
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	for(int i = 0; i < array.size(); i++) {
    		if(array.get(i) % 10 == 4 && array.get(i) < 53) {
    			list.add(-9);
    		} else if(array.get(i) % 10 == 4) {
    			list.add(-7);
    		} else if(array.get(i) < 53) {
    			list.add(-1);
    		} else {
    			list.add(array.get(i));
    		}
    	}
//    	array = list;
        return list;
    }

    public static void main (String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine()) {
            String line = in.nextLine().trim();
            Scanner lineScanner = new Scanner(line);
            if (lineScanner.hasNextInt()) {
                int num = lineScanner.nextInt();
                if (lineScanner.hasNext()) {
                    // If line is not exactly one integer, ignore it
                    continue;
                }
                if (num == -1) 
                    break;
                arrayList.add(new Integer(num));
            }
            lineScanner.close();
        }
        ArrayList<Integer> processArray = processArray(arrayList);
        for(int i=0; i<processArray.size(); i++)
            System.out.println(processArray.get(i));
        in.close();
    }
}
