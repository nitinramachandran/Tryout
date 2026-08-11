package com.nix.tryout.datastructure.stack;

public class ArrayStackMain {

	public static void main(String[] args) {
		ArrayStack stack = new ArrayStack(6);

		stack.pop();
		stack.push(99);
		stack.push(88);
		stack.push(77);
		stack.push(66);
		stack.push(55);
		stack.push(44);
		stack.push(22);

		stack.traverse();

		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();

		stack.traverse();

		stack.push(20);

		stack.traverse();
	}

}
