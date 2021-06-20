package com.check.integer;

public class Fibanocci {

	public static void main(String[] args) {

	}
	
	public static void fibo(int num) {
		int n1=0,n2=1,n3;
		if(num>0) {
			n3 = n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(n3);
			fibo(num-1);
		}
	}

}
