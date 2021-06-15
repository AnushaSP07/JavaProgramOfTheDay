package com.check.collection;

import java.util.HashSet;

public class DuplicateValueCount {
	String name;
	int age;
	
	DuplicateValueCount(String name, int age){
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		DuplicateValueCount dp = new DuplicateValueCount("User",1);
		DuplicateValueCount dp1 = new DuplicateValueCount("User",1);
		HashSet<Object> set = new HashSet<>();
		set.add(dp);
		set.add(dp1);
		System.out.println(set.size());
	}

}
