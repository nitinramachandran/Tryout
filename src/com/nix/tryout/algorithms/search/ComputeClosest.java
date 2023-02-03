package com.nix.tryout.algorithms.search;

public class ComputeClosest {

    /**
     * Returns the number which is closest to 0.
     * If there are two values equidistant to zero, return the positive one
     * Example:
     * for a given array {21, -13, 26, 45, -89} return -13
     * for a given array {13, 23, -45, -13, -36} return 13
     * @parameter: int[]
     * @return int
     */
    public static int computeClosestToZero(int[] ts) {
        int smallestDiff = 0;

        if (ts.length == 0) {
            // Empty array
            return smallestDiff;
        }

        for (int i = 0; i < ts.length; ++i) {
            int diff = ts[i];
            if (smallestDiff == 0) {
                // First iteration
                smallestDiff = diff;
                continue;
            }
            if (Math.abs(diff) < Math.abs(smallestDiff)) {
                smallestDiff = diff;
            } else if (Math.abs(diff) == Math.abs(smallestDiff)) {
                if (diff > 0) {
                    smallestDiff = diff;
                }
            }
        }
        return smallestDiff;
    }

    /* Ignore and do not change the code below */
    public static void main(String... args) {
        int i = ComputeClosest.computeClosestToZero(new int[]{-4, 5, 7, -24, 1, 456, 4, -123, -1});
        System.out.println(i);
    }
    /* Ignore and do not change the code above */

}
