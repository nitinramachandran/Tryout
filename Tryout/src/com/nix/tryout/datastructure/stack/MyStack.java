package com.nix.tryout.datastructure.stack;

import java.util.LinkedList;
import java.util.List;

public class MyStack<E> {

	private List<E> linkedList;
	private final int MAX_SIZE = 5;

	public MyStack() {
		linkedList = new LinkedList<E>();
	}
	
	public int size() {
		return linkedList.size();
	}
	
	public void push(E e) {
		if(linkedList.size() < MAX_SIZE) {
			linkedList.add(e);
		}
	}
	
	public E pop() {

		if(linkedList.size() > 0) {
			return linkedList.remove(linkedList.size() - 1);
		}
		else {
			return null;
		}
	}
	
	public String toString() {
		return linkedList.toString();
	}
}
