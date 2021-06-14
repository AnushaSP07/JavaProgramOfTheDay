package com.check.string;

public class StringRotationOfAnother {

	public static void rotationOfAnotherString(String s1, String s2) {
		if(s1.length()>s2.length()) {
			System.out.println("Not rotated");
		}
		else {
			String s3 = s1+s1;
			if(s3.contains(s2)) {
				System.out.println("Rotated");
			}else {
				System.out.println("Not Roated");
			}
		}
	}
	public static void main(String[] args) {
		rotationOfAnotherString("HelloHi","Hello");
		
	}

}
