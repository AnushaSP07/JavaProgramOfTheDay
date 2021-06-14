package com.check.array;

import java.util.Arrays;

public class SeperateZeroFromArray {

	public static void moveZeros(int input[]) {
		int count = 0;
		
		for(int i=0;i<input.length;i++) {
			if(input[i]!=0) {
				input[count] = input[i];
				count++;
			}
		}
		while(count<input.length) {
			input[count]=0;
			count++;
		}
		System.out.println(Arrays.toString(input));
	}
	public static void main(String[] args) {
		
		moveZeros(new int[] {1,0,2,4,6,0,2,3,0,0,3,2});
	}

}
