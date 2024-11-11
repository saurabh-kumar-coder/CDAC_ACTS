package com.question.ques42;

public class AllPossibleSubstring {

	public static void allPossibleSubstring(String str, int start, int end) {
        // Base case: if start reaches the end of the string, return
        if (start == str.length()) {
            return;
        }

        // Generate all substrings starting at 'start' with increasing 'end'
        for (int i = start + 1; i <= str.length(); i++) {
            System.out.println(str.substring(start, i));
        }

        // Recur to the next starting index (move start forward)
        allPossibleSubstring(str, start + 1, start + 1);
    }

}
