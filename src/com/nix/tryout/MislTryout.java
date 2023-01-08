package com.nix.tryout;

import java.util.LinkedHashMap;
import java.util.Map;

public class MislTryout {
	
	public static void main(String[] args) {
		
//		int I = 0;
//		label:
//			if(I > 2) {
//				System.out.println("I is " + I);
//				I++;
//			}
//		
//		int value = 0;
//		Integer [][] ints = {{1,2,3}, {null}, {7,8,9}};
//		System.out.println(value =+ ints [1][1].intValue() );
		
		Map<Integer, String> mymap = new LinkedHashMap<>();
		
		mymap.put(1, "One");
		mymap.put(2, "Two");
		mymap.put(3, "Three");
		mymap.put(7, "Seven");
		
		System.out.println(mymap);
		
		mymap.put(3, "four");
		System.out.println(mymap);
	}
	


}

final class Q{
	
}