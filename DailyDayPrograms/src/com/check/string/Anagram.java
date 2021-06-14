package com.check.string;

import java.util.Arrays;

public class Anagram {
	
	static void checkAnagram(String s1, String s2) {
		String copyOfS1 = s1.replaceAll("\\s", "");
		String copyOfS2 = s2.replaceAll("\\s", "");
		
		boolean status = true;
		if(copyOfS1.length()!= copyOfS2.length()) {
			status = false;
		}else {
			char[] c1 = copyOfS1.toLowerCase().toCharArray();
			char[] c2 = copyOfS2.toLowerCase().toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			status = Arrays.equals(c1, c2);
		}
		
		if(status) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not");
		}
	}

	public static void main(String[] args) {

	}

}
