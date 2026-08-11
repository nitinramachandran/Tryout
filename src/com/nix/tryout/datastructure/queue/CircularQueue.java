package com.nix.tryout.datastructure.queue;

public class CircularQueue {

	int front = -1;
	int rear = -1;

	int[] queue;

	public CircularQueue(int size) {
		this.queue = new int[size];
	}

	public void enqueue(int data) {

		if(front == -1 && rear == -1) { // Queue is empty
			front = rear = 0;
			queue[rear] = data;
			System.out.println("Elt added : " + queue[rear]);

		} else if((rear + 1) % queue.length == front){
			System.out.println("Queue is full");
		} else {
			rear = (rear + 1) % queue.length;
			queue[rear] = data;
			System.out.println("Elt added : " + queue[rear]);
		}

	}

	public int dequeue() {

		int data = -1;
		if(front == -1 && rear == -1) {
			System.out.println("Queue is empty. Can't dequeue!!");
		} else if (front == rear) { // Only one element in the queue
			data = queue[front];
			front = rear = -1;
		} else {
			data = queue[front];
			front = (front + 1) % queue.length;
		}

		return data;
	}

	public void printQueue() {
		if(front == -1 && rear == -1) {
			System.out.println("Queue is Empty.!!");
		} else {
			int i = front;
			while(i != rear) {

				System.out.println("Elt : " + queue[i]);

				if(next(i) == rear) {
					System.out.println("Elt : " + queue[rear]);
				}

				i = next(i);
			}
		}
	}

	private int next(int incr) {
		return (incr + 1) % queue.length;
	}
}
