package com.nix.tryout.datastructure.stack;

public interface Stack<Item> extends Iterable<Item> {
	
	Item pop();
	
	void push(Item item);
	
	boolean isEmpty();
	
	int size();
}
