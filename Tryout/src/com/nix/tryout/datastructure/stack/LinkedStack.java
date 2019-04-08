package com.nix.tryout.datastructure.stack;

import java.util.Iterator;

public class LinkedStack<Item> implements Stack<Item> {
	
	private Node head;
	private int size;

	class Node {
		Item item;
		Node next;
	}

	public LinkedStack() {
		head = null;
		size = 0;
	}

	@Override
	public Item pop() {
		Item item = head.item;
		head = head.next;
		size--;
		return item;
	}

	@Override
	public void push(Item item) {
		if(size > 0) {
			Node oldHead = head;
			head.item = item;
			head.next = oldHead;
		}
		else {
			head = new Node();
			head.item = item;
		}

		size++;
	}

	@Override
	public boolean isEmpty() {
		return (size == 0);
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public Iterator<Item> iterator() {
		return new LinkedStackIterator();
	}
	
	private class LinkedStackIterator implements Iterator<Item> {

		private int i = size;
		private Node first = head;

		@Override
		public boolean hasNext() {
			return (i > 0);
		}

		@Override
		public Item next() {
			Item item = first.item;
			first = first.next;
			
			i--;
			
			return item;
		}
	}
}