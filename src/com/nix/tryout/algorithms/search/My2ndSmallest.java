package com.nix.tryout.algorithms.search;

public class My2ndSmallest {

	public static void secondSmallest(int[] arr) {
		int size = arr.length;
		int smallest = 0, secSmallest = 0, temp = 0;

		if (size < 2) {
			System.out.println("Array doesn't have enough elements.!");
		} else {
			
			smallest = arr[0];
			secSmallest = arr[1];
			for (int i = 2; i < size; ++i) {

				if (secSmallest < smallest) {
					temp = secSmallest;
					secSmallest = smallest;
					smallest = temp;
				}
				
				if (arr[i] < smallest) {
					secSmallest = smallest;
					smallest = arr[i];
				}
				if(arr[i] > smallest && arr[i] < secSmallest) {
					secSmallest = arr[i];
				}
			}
		}
		System.out.println("Smallest : " + smallest + " | Sec Smallest : " + secSmallest);
	}
	public static void main(String[] args) {
		int[] arr = {1, 23, 5, 56, 90, 10};
		secondSmallest(arr);
	}
}