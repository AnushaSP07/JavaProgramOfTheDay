package com.integer;

public class RevereseInteger {

	public static void main(String[] args) { 
		int num = 123;
		reverseInt(num);
	}
	
	public static int reverseInt(int x) {
		int result = 0;
			while(x!=0) {
				result = result * 10 + x % 10;
				x = x / 10;
			}
			System.out.println("res1 "+result);
			if(result>Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
				return 0;
			}else {
				return result;
			}
	}
}
