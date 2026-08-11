package com.nix.tryout.datastructure.queue;

public class Queue {
	int start = -1;
	int end = -1;

	int[] queue = new int[10];

	// Initializing the queue length
	public Queue(int size) {
		queue = new int[size];
	}

	public void enqueue(int data) {

		if(end == queue.length - 1) {
			System.out.println("Queue is full!!");
		} else if(start == -1) {
			++start;
		}
		++end;
		queue[end] = data;
	}

	public int dequeue() {
		if(start == -1) {
			System.out.println("Queue is empty. Cannot Dequeue.!!");
			return -1;
		}

		int item = queue[start];
		if(start == end) { // Implies there is only one element in the queue
			System.out.println("Queue has only single element.");

			// resetting the start and end pointers since the queue is empty
			start = end = -1;
		} else {
			++start;
		}

		return item;
	}

	public void traverse() {

		for(int i = start; i <= end; ++i) {
			System.out.println("Element : " + queue[i]);
		}
	}

}
