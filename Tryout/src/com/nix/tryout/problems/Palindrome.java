package com.nix.tryout.problems;

public class Palindrome {
    public static boolean isPalindrome(String word) {
    	
    	int len = word.length();
        char[] charArr = word.toLowerCase().toCharArray();
        boolean val = true;
        
        for(int i = len-1, j = 0; i >= len/2 &&  j <= len/2; --i, ++j ) {
        	
        	if(j <= len || !(i == j)) {
        		if(!(charArr[i] == charArr[j])) {
        			val = false;
        			break;
        		}
        		else {
        			continue;
        		}
        	}
        }
        	return val;
    }
    
    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("NoooooAooooon"));
    }
}

