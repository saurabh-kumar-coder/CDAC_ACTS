package com.ls.removeDuplicateFromString;

public class RemoveDuplicateFromString {
	public static String removeConsecutiveDuplicates(String s) {
		// Write your code here
		String s1= "";
		s1 += s.charAt(0);
		for(int i = 1; i < s.length(); i++) {
			if(s.charAt(i) != s.charAt(i-1)) {
				s1 += s.charAt(i);
			}
		}
		return s1;
	}
	public static void main(String[] args) {
		String removeConsecutiveDuplicates = removeConsecutiveDuplicates("aabb");
		System.out.println(removeConsecutiveDuplicates);
	}
}
