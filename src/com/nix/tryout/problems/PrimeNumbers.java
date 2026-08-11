package com.nix.tryout.problems;

/**
 *
 * @author nitinramachandran
 * Find all the prime numbers below the given number
 *
 */
public class PrimeNumbers {

	public static void main(String[] args) {

		System.out.println(PrimeNumbers.getPrime(23));
	}

	private static String getPrime(int num) {
		String nums = new String();
		boolean isPrime = false;

		for(int i =  2; i <= num; ++i) {
			for(int j = 2; j <= i/2+1; ++j) {
				if(i % j == 0 && i != j) {
					isPrime = false;
					break;
				} else if(j == i/2+1 && !isPrime){
					isPrime = true;
				}
			}
			if(isPrime && i != num) {
				nums += i + ",";
			}
			else if(isPrime) {
				nums += i;
			}
		}
		return nums;
	}
}
