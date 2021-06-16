package com.check.inheritence;

class A{
	public void m1() {
		System.out.println("m1 A");
	}
}
class B extends A{
	public void m1() {
		System.out.println("m1 B");
	}
	public void m2() {
		System.out.println("m2 B");
	}
}
public class Test {

	public static void main(String[] args) {
		A a1 = new A();
		B b = new B();
		A a = new B();
		a.m1();
	//	a.m2();

	}
}
