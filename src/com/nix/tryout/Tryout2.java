package com.nix.tryout;

import java.util.LinkedList;

public class Tryout2 {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();

		ll.add(10);
		ll.add(12);
		ll.add(14);

		ll.add(1, 21);
		System.out.println(ll);
	}

}
