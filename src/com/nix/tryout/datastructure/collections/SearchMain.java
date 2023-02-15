package com.nix.tryout.datastructure.collections;

import java.util.Random;

public class SearchMain {

	public static void main(String[] args) {
		
		Search search1 = new SmartSearch();
		
		Search search2 = new LinearSearch();

		Integer largest1 = null;
		Integer largest2 = null;
		
		long startTime1 = 0;
		long endTime1 = 0;
		
		long startTime2 = 0;
		long endTime2 = 0;
		
		Random randomNum = new Random();
		
		int max = 1000000;
		int min = 1;
		
		
		System.out.println("TEST - ONE \n\n");
		startTime1 = System.currentTimeMillis();
		
		for(int i = 0; i < 100000; ++ i) {
			Integer val =  min + randomNum.nextInt(max);
 			search1.addElement(val);
		}

		largest1 = search1.getLargest();
		endTime1 = System.currentTimeMillis();
		
		System.out.println("Largest : " + largest1);
		
		System.out.println("Time taken : " + (endTime1 - startTime1));
		
		System.out.println(" \n\n  TEST - TWO \n\n");

		startTime2 = System.currentTimeMillis();
		
		for(int i = 0; i < 100000; ++ i) {
			Integer val =  min + randomNum.nextInt(max);
			search2.addElement(val);
		}

		largest2 = search2.getLargest();
		endTime2 = System.currentTimeMillis();
		
		System.out.println("Largest : " + largest2);
		
		System.out.println("Time taken : " + (endTime2 - startTime2));
	}

}
