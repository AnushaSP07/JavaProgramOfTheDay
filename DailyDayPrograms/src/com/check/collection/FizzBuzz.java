package com.check.collection;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public static void main(String[] args) {
		fizzBuzz(5);
	}
	 public static List<String> fizzBuzz(int n) {
	        List<String> list = new ArrayList<>();
	        String s = null;
	        for(int i=1;i<=n;i++){
	            if(i%3==0 && i%5==0){
	                s = "FizzBuzz";
	                list.add(s);
	            }else if(i%3==0){
	                s = "Fizz";
	                list.add(s);
	            }else if(i%5==0){
	                s = "Buzz";
	                list.add(s);
	            }else{
	                s = String.valueOf(i);
	                list.add(s);
	            }
	        }
	        return list;
	    }
}
