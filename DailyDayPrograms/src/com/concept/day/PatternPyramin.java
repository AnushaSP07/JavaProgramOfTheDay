package com.concept.day;

import java.util.Scanner;

public class PatternPyramin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of rows required");
		int numOfRows = sc.nextInt();
		int rowCount = 1;
		
			for(int i=numOfRows;i>0;i--) {
				for(int j=1;j<=i;j++) {
					System.out.print(" ");
				}
				for(int j=1;j<=rowCount;j++) {
					System.out.print(rowCount+" ");
				}
				System.out.println();
			}
			rowCount++;
			sc.close();
	}

}
