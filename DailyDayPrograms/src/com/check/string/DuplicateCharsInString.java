package com.check.string;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharsInString {
	
	static void duplicateCharCount(String charCount) {
		HashMap<Character,Integer> charCountMap = new HashMap<>();
			char[] strArray = charCount.toCharArray();
			
			for(char c : strArray) {
				if(charCountMap.containsKey(c)) {
					charCountMap.put(c, charCountMap.get(c)+1);
				}else {
					charCountMap.put(c,1);
				}
			}
			
			Set<Character> charInString = charCountMap.keySet();
			
			for(Character ch : charInString) {
				if(charCountMap.get(ch)>1) {
					System.out.println(ch +":"+charCountMap.get(ch));
				}
			}
	}

	public static void main(String[] args) {
		duplicateCharCount("anushaAbhishekGeetha");
	}

}
