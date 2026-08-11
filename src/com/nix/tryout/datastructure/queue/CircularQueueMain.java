package com.nix.tryout.datastructure.queue;

public class CircularQueueMain {

	public static void main(String[] args) {

		CircularQueue cq = new CircularQueue(5);

		cq.enqueue(5);
		cq.enqueue(-2);
		cq.enqueue(4);
		cq.enqueue(1);
		cq.enqueue(8);
		System.out.println(" Dequeueing : " + cq.dequeue());
		cq.enqueue(11);

		cq.printQueue();

	}

}
