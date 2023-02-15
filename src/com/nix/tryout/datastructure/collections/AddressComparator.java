package com.nix.tryout.datastructure.collections;

import java.util.Comparator;

public class AddressComparator implements Comparator<Address>{

	@Override
	public int compare(Address addr1, Address addr2) {
		return addr1.getCountry().compareTo(addr2.getCountry());
	}
}