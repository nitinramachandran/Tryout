package com.nix.tryout.algorithms.devideandconquer;

import java.util.Arrays;

/**
 * Find a integer from an array of integer using Divide and conquer for a sorted
 * array
 *
 * @author nitinramachandran
 *
 */
public class DivideAndConquer {

	static int ctr = 1;

	public boolean isEltPresent(int[] array, int elt) {

		if (array.length == 0) {
			return false;
		}

		System.out.println("Iteration : " + ctr);
		++ctr;

		// Print the array
		for (int v : array) {
			System.out.print(v + " ");
		}
		System.out.println("\nLength : " + array.length);

		int mid = 0;
		if (array.length % 2 == 0) {
			mid = array.length / 2 - 1;
		} else {
			mid = array.length / 2;
		}

		System.out.println("Mid : " + array[mid]);

		if (array[0] == elt || array[array.length - 1] == elt || array[mid] == elt) {
			// Element found!
			return true;
		} else if (elt > array[mid]) {

			int to = array.length - 1;

			int tempArr[] = Arrays.copyOfRange(array, mid, to);

			System.out.println("\n");

			return isEltPresent(tempArr, elt);
		} else if (elt < array[mid]) {

			int from = 0;
			return isEltPresent(Arrays.copyOfRange(array, from, mid), elt);
		} else {
			System.out.println("Element " + elt + "Not found!");
			return false;
		}
	}

	public static void main(String[] args) {

		// Sorted array
		int[] arrayElts = { 2, 3, 5, 7, 9, 15, 25, 25, 25, 25, 25, 25, 25, 25, 26, 27, 29, 33, 50, 71, 90, 90, 90, 91,
				91, 91, 91, 91, 91, 91, 91, 91, 91, 91, 91, 91, 91, 91, 91, 91, 102, 102, 102, 102, 102, 102, 102, 102,
				103, 104, 105, 107, 108, 108, 109, 109, 121, 121, 121, 121, 121, 121, 121, 1002};
		DivideAndConquer dac = new DivideAndConquer();

		System.out.print("Is Element present : " + dac.isEltPresent(arrayElts, 72));
	}

}
