package com.nix.tryout.collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTrials {

	public static void main(String[] args) {

		CollectionPacker packer =  new CollectionPacker();
		List<Address> addrLinks = new LinkedList<Address>();
		
		addrLinks = (LinkedList<Address>)packer.getAddresses(addrLinks);
		
		System.out.println("Linked List : " + addrLinks);
		
		AddressComparator addrComp = new AddressComparator();
		
		Collections.sort(addrLinks, addrComp);
		
		System.out.println("Linked List After sorting : " + addrLinks);
	}

}
