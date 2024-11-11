package com.tester.ques40;

import com.question.ques40.ReverseEachWord;

//40. How to reverse each word in a given string?
public class ReverseEachWordTester {
	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog";
		System.out.println("Before Reverse : " + str);
		str = ReverseEachWord.reverseEachWord(str);
		System.out.println("After  Reverse : " + str);
	}
}
