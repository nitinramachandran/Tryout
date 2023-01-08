package com.nix.tryout.algorithms.devideandconquer;

public class SearchBiggestWithoutRecursion {
	
	public static boolean exists(int[] ints, int k) {
		boolean exists = true;
		
		int start = 0;
		int end = ints.length - 1;
		int mid = 0;
		if(ints.length > 0) {
			while(exists) {
				
				mid = (start + end) / 2;
				if(ints[mid] == k) {
					// Success
					break;
				}
				else if(start >= end) {
					exists = false;
				}
				else if(ints[mid] > k) {
					end = mid - 1;
					
				}
				else if(ints[mid] < k) {
					start = mid + 1;
				}
			}
		}
		return exists;
	}

	public static void main(String[] args) {
		int[] arr1 = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
		
		System.out.println(SearchBiggestWithoutRecursion.exists(arr1, -1));

	}

}
