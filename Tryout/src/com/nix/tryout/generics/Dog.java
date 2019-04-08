package com.nix.tryout.generics;

public class Dog extends Animal{
	
	private String value;
	
	public Dog() {
		this.value = "This is a Dog";
	}

	public String toString() {
		return this.value;
	}
}
