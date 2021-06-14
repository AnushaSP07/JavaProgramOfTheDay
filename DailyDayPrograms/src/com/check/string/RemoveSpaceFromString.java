package com.check.string;

import java.util.Scanner;

public class RemoveSpaceFromString {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String inputString = sc.nextLine();
		String noSpace = inputString.replaceAll("\\s+" ,"");
		System.out.println(""+noSpace);
		
	}

}
