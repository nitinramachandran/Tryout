package com.nix.tryout.problems;

public class Overriding {

	String str = null;
	
	public void add(char c) {
		if(str == null) {
			str = Character.toString(c); 
		}
		else {
			str += Character.toString(c);	
		}
		
	}
	
	public String get() {
		return str;
	}
}