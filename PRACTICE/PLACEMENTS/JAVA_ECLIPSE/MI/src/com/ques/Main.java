package com.ques;
/* 
 * Save this in a file called Main.java and compile it. To test it 
 * create the file `input.txt` in the workspace / Working Directory
 * (For Eclipse/VisualStudio, by default this is the top level project folder)
 */

/* Do not add a package declaration */
import java.util.*;
import java.io.*;

/* You may add any imports here, if you wish, but only from the 
   standard library */

// Do not change the name of this class
public class Main {

	// You can add new methods here.

	public static String process(String str) {
		/*
		 * Modify this method to process `str` as indicated in the question. At the end,
		 * return the appropriate value.
		 *
		 * Please create appropriate inner classes as necessary, and use appropriate
		 * data structures.
		 *
		 * Do not print anything in this method.
		 *
		 * Submit this entire program (not just this method) as your answer
		 */

		String xVowels = "abeiout";
		String newStr = "T";
		for (int i = 0; i < str.length()-1; i++) {
			String prev = str.substring(i, i+1);
			String curr = str.substring(i+1, i + 2);
			if (xVowels.contains(prev) && xVowels.contains(curr)) {
				newStr += "X";
			} else {
				newStr += curr;
			}
		}
		String real = "";
		for (int i = 1; i < newStr.length(); i++) {
			if(newStr.charAt(i) == 'X') {
				real += newStr.substring(i, i+1);
				i++;
			} else {
				real += newStr.substring(i-1, i);
			}
		}
		return real;
	}

	// Do not change anything in the `main` method
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			String retVal = process("Testing is a boring job");
			System.out.println(retVal);
		} catch (Exception e) {
			System.out.println("IO error in input.txt or output.txt");
		}
	}
}
