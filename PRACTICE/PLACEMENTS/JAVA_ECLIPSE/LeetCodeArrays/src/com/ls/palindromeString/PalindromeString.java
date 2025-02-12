package com.ls.palindromeString;

public class PalindromeString {
	public static void main(String[] args) {
		String s = "NAMAN";
		boolean isPlaindrome = checkPalindrome(s);
		System.out.println(isPlaindrome);
	}

	private static boolean checkPalindrome(String s) {
		// TODO Auto-generated method stub
		for(int i = 0, j = s.length() - 1; i < j; i++, j--) {
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
		}
		return true;
	}
}
