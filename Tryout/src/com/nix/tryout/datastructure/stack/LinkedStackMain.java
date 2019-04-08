package com.nix.tryout.datastructure.stack;

public class LinkedStackMain {

	public static void main(String[] args) {
		
		Stack <Integer> stack = new LinkedStack<Integer>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		
		System.out.println("| Size: " + stack.size());
		
		for(Integer i : stack) {
			System.out.println(i);
		}
	}
}