package com.nix.tryout.tests;

/**
 * Practice Test
 * Find the biggest Binary Gap, ie, the highest no. of zeros between a pair of ones
 * 
 * Example:-
 * 1001     - 2
 * 100001   - 4
 * 10000    - 0
 * 11111    - 0
 * 1111     - 0
 * 0000     - 0
 * 10011    - 2
 * 1001001  - 2
 * 10010001 - 3 
 * 
 * @author nitinramachandran
 *
 */
public class BinaryGapFinder {

	public int getLongestBinaryGap(int N) {

		int counter = 0;
		int tempCounter = 0;
		boolean oneFlag = false;
		while (N > 0) {

			int rem = N % 2;
			
			if (rem == 1 && counter == 0) {
				oneFlag = true;
			} else if (rem == 0 && oneFlag) {
				++counter;
			} else if (rem == 1 && counter > 0) {
				// End of a binary gap
				// Update the biggest binary gap
				if (tempCounter < counter) {
					tempCounter = counter;
				}

				// Reset counter
				counter = 0;
			}
			N = N / 2;
		}
		return tempCounter;
	}

	public static void main(String[] args) {

		BinaryGapFinder gapFinder = new BinaryGapFinder();
		System.out.println("Longest binary gap for the given number is : " + gapFinder.getLongestBinaryGap(1041));

	}

}
