package com.nix.tryout.datastructure.stack;

public class ArrayStack {

	int top = -1;
	int[] stack;

	public ArrayStack(int size) {
		stack = new int[size];
	}

	public void push(int data) {

		if(top == stack.length - 1) {
			System.out.println("Stack Overflow. Couldn't push the element : " + data + "!!!");
		}
		else if(top == -1) { // Empty stack
			top += 1;
			stack[top] = data;
			System.out.println("Item pushed : " + data);
		} else {
			top += 1;
			stack[top] = data;
			System.out.println("Item pushed : " + data);
		}
	}

	public int pop() {
		if(top == -1) {
			System.out.println("Stack Empty. Cannot pop.!!");
			return -1;
		} else {
			int item = stack[top];
			--top;
			System.out.println("Item popped : " + item);
			return item;
		}
	}

	public void traverse() {

		if(top == -1) {
			System.out.println("Stack is empty!!!");
		} else {
			System.out.println("Elements :");
			System.out.println("----");
			for(int i=0; i <= top; ++i) {

				System.out.println("|" + stack[i] + "|");
				System.out.println("----");
			}
		}

	}

}
