package com.concept.day;

public class ReverseString {

	public static void main(String[] args) {
		String s = "data ele";
		revString(s);
	}
	
	public static void revString(String s) {
		char[] c = s.toCharArray();
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(c[i]);
		}
	}

}
