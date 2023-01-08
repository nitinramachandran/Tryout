package com.nix.tryout.generics;

public class UseTwo<T, X> {
	
	T one;
	X two;
	
	UseTwo(T one, X two) {
		
		this.one = one;
		this.two = two;
	}
	
	T getT() {
		return one;
	}
	
	X getX() {
		return two;
	}
	
	public static void main(String...strings) {
		UseTwo<String, Integer> useTwo = new UseTwo<String, Integer>("Nitin", 2);
		
		String theT = useTwo.getT();
		Integer theX = useTwo.getX();
		
		System.out.println("T : "+theT + " | X : "+theX);
		
	}

}
