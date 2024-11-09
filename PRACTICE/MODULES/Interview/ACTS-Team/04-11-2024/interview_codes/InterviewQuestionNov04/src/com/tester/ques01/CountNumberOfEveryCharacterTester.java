package com.tester.ques01;

import java.util.Map;

import com.question.ques01.CountNumberOfEveryCharacter;

//1.	Write a program for counting the number of every character of a given text file.
public class CountNumberOfEveryCharacterTester {
	public static void main(String[] args) {
		String str = "Based on the provided search results, here’s a comprehensive answer on how to convert a Map to a list in Java";
		Map<Character, Integer> counterMap = CountNumberOfEveryCharacter.countChar(str.toLowerCase());
		System.out.println(counterMap);
	}
}
