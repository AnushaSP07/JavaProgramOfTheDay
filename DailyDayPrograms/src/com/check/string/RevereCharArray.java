package com.check.string;

public class RevereCharArray {

	public static void reverseCharArray(char[] s) {
		int left = 0, right = s.length-1;
		while(left>right) {
			char temp = s[left];
			s[left++] = s[right];
			s[right--] = temp;
		}
	}
	public static void main(String[] args) {
		char[] st = {'h','e','l','l','o'};
		reverseCharArray(st);
		
	}

}
