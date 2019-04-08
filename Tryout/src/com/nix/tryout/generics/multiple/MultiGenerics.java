package com.nix.tryout.generics.multiple;

import com.nix.tryout.generics.Cat;
import com.nix.tryout.generics.Dog;
import com.nix.tryout.generics.LivingThing;

public class MultiGenerics<T, E extends LivingThing> {
	
	public void printObjValueForT(T e) {
		System.out.println("T : " + e);
	}
	
	public void printObjValueForE(E e) {
		System.out.println("E : " + e);
	}
	
	public static void main(String...strings) {
		
		MultiGenerics<Cat, Dog> m1 = new MultiGenerics<Cat, Dog>();
		
		m1.printObjValueForE(new Dog());
		
		m1.printObjValueForT(new Cat());
	}
}