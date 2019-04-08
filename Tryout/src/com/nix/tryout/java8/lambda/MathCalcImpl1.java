package com.nix.tryout.java8.lambda;

public class MathCalcImpl1 {
	
	public static void add(MathCalc mcalc) {
		
		System.out.println(mcalc.calculate("Addition"));
	}

	public static void main(String[] args) {
		
		add(a -> a.substring(0, (a.length() - 1)));
	}

}
