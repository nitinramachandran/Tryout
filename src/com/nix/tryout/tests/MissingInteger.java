package com.nix.tryout.tests;

/**
 * Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
Copyright 2009–2019 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.

 * @author nitinramachandran
 *
 */
public class MissingInteger {
	
	public int getSmallestPossibleInteger(int[] A) {
		int val = 1;
		
		for(int i = 1; i < A.length; ++i) {
			
			for(int j = 0; j < A.length; ++j) {
				if(A[i] == val) {
					++val;
					break;
				}
			}
		}
		
		return val;
	}

	public static void main(String[] args) {
		MissingInteger mi = new MissingInteger();
		int[] arr = {1,2,3,4,5};
		System.out.println("Smallest possible value is : " + mi.getSmallestPossibleInteger(arr));
	}

}
