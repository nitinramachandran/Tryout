package com.nix.tryout.datastructure.stack;

public class MyStackMain {

	public static void main(String[] args) {
		
		MyStack<String> stak = new MyStack<String>();
		
		System.out.println(stak);
		
		stak.push("Nitin");
		stak.push("Could");
		stak.push("work");
		stak.push("Harder");
		
		System.out.println(stak);
		stak.pop();
		
		System.out.println(stak);
		stak.pop();
		
		System.out.println(stak);
		stak.push("Should");
		
		System.out.println(stak);
		stak.push("work");
		System.out.println(stak);
		stak.push("Hardestestest.!!!!");
		System.out.println(stak);

	}

}
