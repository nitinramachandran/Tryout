package com.nix.tryout.characters;

public class CharTryout {

	public static void main(String[] args) {
		
		char c = 'a';
		
		int i = 91;
		
		
		
		for(i = 0; i < 200; ++i) {
			c = (char) i;
		System.out.println(i + " - " + c);
		}
	}
}
