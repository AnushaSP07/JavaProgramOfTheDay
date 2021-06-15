package com.check.integer;

public class PalindromInteger {

	public static void main(String[] args) {

	}

	public static String checkPaliNum(int num) {
		int r ,sum =0,temp;
		temp = num;
			while(num>0) {
				r = num%10;
				sum = (sum*10)+r;
				num = num/10;
			}
			if(temp==sum) {
				return "Yes";
			}else {
				return "No";
			}
		}
}
