package com.pwc;
//
//public class Main {
//
//}
/* Save this in a file called Main.java to compile and test it */

import java.util.*;

public class Main {
    public static int processArray(ArrayList<Integer> array) {
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
    	ArrayList<Integer> nArray = new ArrayList<Integer>();
    	for(Integer num : array) {
    		if(num % 6 == 0 && num % 4 == 0) {
    			nArray.add(-3);
    		} else if(num % 4 == 0) {
    			nArray.add(-2);
    		} else if(num % 10 == 6) {
    			nArray.add(-5);
    		} else {
    			nArray.add(num);
    		}
    	}
    	array = nArray;
    	for (Integer integer : nArray) {
			System.out.println(integer);
		}
        return array.size();
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
        int new_length = processArray(arrayList);
//        for(int i=0; i<new_length; i++)
//            System.out.println(arrayList.get(i));
        in.close();
    }
}
