package com.nix.tryout.inheritance.overriding;

public class OverridingMain {

	public static void main(String...strings) {
		Parent p  = new Child();

		p.stat();
		p.foo();
	}
}

class Child extends Parent {
	
	public void foo() {
		System.out.println("Child Foo() ");
	}
	
	public static void stat() {
		System.out.println("Child stat() ");
	}
}

class Parent {
	public void foo() {
		System.out.println("Parent Foo() ");
	}
	
	public static void stat() {
		System.out.println("Parent stat() ");
	}
}