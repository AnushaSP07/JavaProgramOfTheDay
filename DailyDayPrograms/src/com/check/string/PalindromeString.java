package com.check.string;

public class PalindromeString {

	public static void main(String[] args) {

	}
	
	public static String checkPalindrome(String s) {
		String reve = "";
		int length = s.length();
		for(int i = length-1;i>=0;i--) {
			reve = reve+s.charAt(i);
		}
		if(s.equals(reve)) {
			System.out.println("Palindrome");
			return "Palindrome";
		}else {
			System.out.println("Not palindrome");
			return "not";
		}
	}

}
