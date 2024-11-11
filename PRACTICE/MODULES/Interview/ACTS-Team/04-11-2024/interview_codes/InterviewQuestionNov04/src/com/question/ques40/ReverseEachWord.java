package com.question.ques40;

public class ReverseEachWord {

	public static String reverseEachWord(String str) {
		// TODO Auto-generated method stub
		String S[] = str.split(" ");
		String nStr = "";
		for(String s : S) {
			char c[] = s.toCharArray();
			for(int i = 0, j = s.length() - 1; i < j; i++, j--) {
				char ch = c[i];
				c[i] = c[j];
				c[j] = ch;
			}
			nStr += new String(c) + " ";
		}
		return nStr;
	}

}
