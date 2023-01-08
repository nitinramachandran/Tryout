package com.nix.tryout.algorithms.devideandconquer;

import java.util.Arrays;

public class BinarySearchUsingLibraries {
	
	public static boolean exists(int[] ints, int k) {
		int val = Arrays.binarySearch(ints, k);
		System.out.println(val);
		return (!(val < 0));
	}

	public static void main(String[] args) {
		
		int[] arr1 = new int[] {1, 2, 3, 5, 6, 7, 8};
		System.out.println(exists(arr1, 5));

	}

}
