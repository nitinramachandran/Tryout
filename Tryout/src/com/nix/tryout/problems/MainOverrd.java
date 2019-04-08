package com.nix.tryout.problems;

public class MainOverrd {

	public static void main(String[] args) {
		Overriding o = new Overrided();
		o.add('1');
		o.add('a');
		o.add('0');
		o.add('1');
		
		System.out.println(o.get());

	}

}
