package com.question.ques01;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfEveryCharacter {

	public static Map<Character, Integer> countChar(String str) {
		// TODO Auto-generated method stub
		Map<Character, Integer> map = new HashMap<>();
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if((ch >= 97 && ch <= 122)) {
				if(!map.containsKey(ch)) {
					map.putIfAbsent(ch, 1);
				} else {
					int val = map.get(ch);
					map.put(ch, val + 1);
				}
			} else {
				continue;
			}
		}
		return map;
	}

}
