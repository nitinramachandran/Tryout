package com.nix.tryout.datastructure.queue;

public class QueueMain {

	public static void main(String[] args) {
		Queue q = new Queue(5);

		q.dequeue();
		q.enqueue(25);
		q.traverse();

	}

}
