package com.saurabh.questions;

public class Palindrome {
	public static void main(String[] args) {
		String str = "NAMAN";
		boolean check = checkPlaindrome(str);
		if(check == false) {
			System.out.println("plaindrome");
		} else {
			System.out.println("Not a Plaindrome");
		}
	}

	private static boolean checkPlaindrome(String str) {
		// TODO Auto-generated method stub
		boolean ter = false;
		int len = str.length() - 1;
		for (int i = 0, j = len; i < len; i++, j--) {
			if(str.charAt(i) != str.charAt(j)) {
				ter = true;
			}
		}
		return ter;
	}
}
