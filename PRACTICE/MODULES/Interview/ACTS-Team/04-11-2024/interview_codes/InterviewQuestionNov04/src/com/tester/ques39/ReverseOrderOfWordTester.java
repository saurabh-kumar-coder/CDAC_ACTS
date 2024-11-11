package com.tester.ques39;

import com.question.ques39.ReverseOrderOfWord;

public class ReverseOrderOfWordTester {
	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog";
		System.out.println("Without reverse : " + str);
		str = ReverseOrderOfWord.reverseOrderOfWord(str);
		System.out.println("With reverse : " + str);
	}
}
