package com.basic.longest_non_repeating_substring;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LongestNonRepeatingSubstring {
	public static void main(String[] args) {
		int length = findLongestNonRepeatingSubstringUsingSet("abcabcabc");
		System.out.println(length);
		findLongestNonRepeatingSubstringUsingMap("abcabcabc");
	}

	private static void findLongestNonRepeatingSubstringUsingMap(String string) {
		// TODO Auto-generated method stub
		String longestString = null;
		int longestLength = 0;
		Map<Character, Integer> map = new LinkedHashMap<>();
		char[] arr = string.toCharArray();
		for(int i = 0; i < arr.length; i++) {
			char ch = arr[i];
			if(!map.containsKey(ch)) {
				map.put(ch, i);
			} else {
				i = map.get(ch);
				map.clear();
			}
			if(map.size() > longestLength) {
				longestLength = map.size();
				longestString = map.keySet().toString();
			}
		}
		System.out.println("length : " + longestLength);
		System.out.println("String : " + longestString);
	}

	private static int findLongestNonRepeatingSubstringUsingSet(String string) {
		// TODO Auto-generated method stub
		int max = 0;
		int i = 0; 
		int j = 0;
		Set<Character> set = new HashSet<>();
		while(j < string.length()) {
			if(!set.contains(string.charAt(j))) {
				set.add(string.charAt(j));
				max = set.size() > max ? set.size() : max;
				j++;
			} else {
				set.remove(string.charAt(i));
				i++;
			}
		}
		return max;
	}
	
	
}
