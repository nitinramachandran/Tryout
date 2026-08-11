package com.nix.tryout.datastructure.tree;

public class Node {

	private Node left, right;
	int data;

	public Node(int data) {
		this.data = data;
	}


	public void insert(int value) {

		if(value > data) {
			if(right == null) {
				this.right = new Node(value);
			} else {
				right.insert(value);
			}
		} else {
			if(left == null) {
				this.left = new Node(value);
			} else {
				left.insert(value);
			}
		}
	}

	public boolean contains(int value) {

		if(data == value) {
			return true;
		} else if(data < value) { //
			if(right == null) {
				return false;
			} else {
				return right.contains(value);
			}
		} else {
			if(left == null) {
				return false;
			} else {
				return left.contains(value);
			}
		}
	}

	public Node delete(Node node, int val) {

		if(node == null) {
			return null;
		}

		if(val < node.data) {
			node.left = delete(node.left, val);
		} else if (val > node.data) {
			node.right = delete(node.right, val);
		} else {
			if(node.left == null || node.right == null) {
				Node temp = null;

				temp = node.left == null ? node.right : node.left;

				if(temp == null) {
					return null;
				}
				else return temp;
			} else {
				Node successor = getSuccessor(node);
				node.data = successor.data;


			}
		}



		return null;
	}

	private Node getSuccessor(Node node) {
		if(node == null) {
			return null;
		}

		Node temp = node.right;

		while(temp != null) {
			temp = temp.left;
		}
		return temp;
	}


	public void printInOrder() {
		if(left != null) {
			left.printInOrder();
		}

		System.out.println(data);

		if(right != null) {
			right.printInOrder();
		}
	}

}
