package com.nix.tryout.datastructure.queue;

import java.util.LinkedList;
import java.util.List;

public class BlockingQueue {
	
	private int size;
	
	public BlockingQueue(int size) {
		this.size = size;
	}
		
	List<String> linkedList = new LinkedList<String>();
	
	public int size() {
		return linkedList.size();
	}
	
	public synchronized void enQueue(String value) throws InterruptedException {
		
		if(linkedList.size() < size) {
			this.notifyAll();
			linkedList.add(value);
		} else {
			this.wait();
		}
	}
	
	public String deQueue() {
		if(linkedList.size() > 0) {
			return linkedList.remove(0);
		}
		return null;
	}
	
	public static void main(String...strings) throws InterruptedException {
		BlockingQueue queue = new BlockingQueue(4);
		
		queue.enQueue("OO");
		queue.enQueue("BB");
		queue.enQueue("CC");
		queue.enQueue("DD");
		System.out.println(queue.deQueue());
		System.out.println(queue);
	//	queue.enQueue("EE");
	}
}