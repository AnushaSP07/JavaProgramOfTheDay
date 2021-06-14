package com.check.string;

public class RevereseString {
	
	public static char withoutReverserMthd() {
		String str = "user word";
		char ch = 0;
		char[] charStr = str.toCharArray();
			for(int i=str.length()-1;i>=0;i--) {
				System.out.print(charStr[i]);
				ch = charStr[i];
			}
		return ch;
	}
	
	public static String recusrsiveMethod(String str) {
		if((null==str) || str.length()<=1) {
			return str;
		}
		return recusrsiveMethod(str.substring(1)+str.charAt(0));
	}
	
	public static void main(String[] args) {
		String str = "user word";
		StringBuffer sb = new StringBuffer(str);
		System.out.println("StringBuffer "+sb.reverse());
		RevereseString.withoutReverserMthd();
	}
}
