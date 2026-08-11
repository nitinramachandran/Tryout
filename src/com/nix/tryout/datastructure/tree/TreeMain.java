package com.nix.tryout.datastructure.tree;

public class TreeMain {

	public static void main(String[] args) {
		Node tree = new Node(18);

//		int[] arrayElts = {2, 3, 5, 7, 9, 15, 25, 26, 27, 29, 33, 50, 71, 90};
		int[] arrayElts = {52, 13, 25, 47, 29, 115, 250, 261, 27, 29, 133, 150, 271, 901};

		for(int val :arrayElts) {
			tree.insert(val);
		}

		System.out.println();
		tree.printInOrder();

		System.out.println("Is element 47 present : " + tree.contains(47));

	}

}
