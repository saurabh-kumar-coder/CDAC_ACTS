package com.basic.string_manipulation;

public class StringManipulation {
	public static void main(String[] args) {
		String str = "hello world";
		System.out.println(manipulateString(str));
	}

	private static String manipulateString(String str) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer(str);
		for(int i = 0; i < sb.length(); i++) {
			if(i == 0) {
				sb.replace(i, i + 1, sb.substring(i, i+1).toUpperCase());
			}
			if (sb.substring(i, i + 1).equals(" ")) {
				sb.replace(i + 1, i + 2, sb.substring(i+1, i+2).toUpperCase());
			}
		}
		return sb.toString();
	}
}
