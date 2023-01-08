package com.nix.tryout.tests;

/**
 * For given two numbers A and B such that 2 <= A <= B,
 * Find most number of sqrt operations for a given number such that square root of result is a whole number and it is again square rooted until either the 
 * number is less than two or has decimals. 
 * example if A = 6000 and B = 7000, sqrt of 6061 = 81, sqrt of 81 = 9 and sqrt of 9 = 3. Hence, answer is 3
 * 
 * @author nitinramachandran
 *
 */
public class TestTwo {
	private volatile int count = 0;
	public static volatile String str = ""; 
	public int solution(int A, int B) {
		
		// Loop for finding the difference between the values
	//	int diff = getSeriesDifference(A, B);

        for(int i = B; i > A ; --i) {
        	int tempCount = getSqrtCount(Double.valueOf(i));
        	
        	if(tempCount > count) {
        		count = tempCount; 
        	}
        }

        return count;
    }

	// Recursively finds the count of total number of sqrts for the given value
	private int getSqrtCount(Double value) {

	    final Double sqrt = Math.sqrt(value);

	    if((sqrt > 2) && (sqrt % 1 == 0)) {
	        return getSqrtCount(sqrt) + 1;
	    }
	    return 0;
	}

	public static void main(String[] args) {
		
		TestTwo tst2 = new TestTwo();
		long t1 = System.currentTimeMillis();
		System.out.println("Highest no is : "+tst2.solution(6000, 7000));
		long t2 = System.currentTimeMillis();
		
		System.out.println("Time Taken : " +(t2 - t1));
		
//		for (double i = 6000; i < 7000; ++i) {
//			System.out.println(i + " : " + Math.sqrt(i));
//		}
	}
}