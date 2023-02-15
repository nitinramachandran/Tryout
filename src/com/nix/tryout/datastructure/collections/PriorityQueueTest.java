package com.nix.tryout.datastructure.collections;

import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {

		AddressComparator addrComp = new AddressComparator();
		PriorityQueue<Address> q = new PriorityQueue<Address>(addrComp);

		CollectionPacker packer = new CollectionPacker();
		
		PriorityQueue qq = new PriorityQueue();
		
		qq.add("dishes");
		qq.add("laundry");
		qq.add("bills");
		qq.offer("bills");
		System.out.println(qq);
		System.out.print(qq.size() + " " + qq.poll());
		System.out.print(" " + qq.peek() + " " + qq.poll());
		System.out.print(" " + qq.poll() + " " + qq.poll());
	}
}