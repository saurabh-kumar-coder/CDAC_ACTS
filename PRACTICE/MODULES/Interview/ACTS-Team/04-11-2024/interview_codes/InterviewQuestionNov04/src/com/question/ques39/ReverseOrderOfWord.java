package com.question.ques39;

public class ReverseOrderOfWord {

	public static String reverseOrderOfWord(String str) {
		// TODO Auto-generated method stub
		String s[] = str.split(" ");
		for(int i = 0, j = s.length - 1; i < j; i++, j--) {
			String temp = s[i];
			s[i] = s[j];
			s[j] = temp;
		}
		return String.join(" ", s);
	}

}
