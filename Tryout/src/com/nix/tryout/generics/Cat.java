package com.nix.tryout.generics;

public class Cat extends Animal{
	
	private String value;

	public Cat() {
		this.value = "This is a Cat";
	}
	
	public String toString() {
		return this.value;
	}
}
