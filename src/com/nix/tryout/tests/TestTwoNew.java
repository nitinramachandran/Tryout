package com.nix.tryout.tests;

public class TestTwoNew {

	public int solution(int A, int B) {
        int count = 0;
		        
        for(int i = B; i > A ; --i) {

        	Double sqrt = Double.valueOf(i);
        	int tempCount = 0;
        	do {
        		sqrt = Math.sqrt(sqrt);
        		if((sqrt > 2) && (sqrt % 1 == 0)) {
        			++tempCount;
        		}
        		else {
        			break;
        		}
        	}while((sqrt > 2) && (sqrt % 1 == 0));
        	
        	if(tempCount > count) {
        		count = tempCount; 
        	}
        }
        
        return count;
    }

	public static void main(String[] args) {
		
		TestTwoNew t2 = new TestTwoNew();
		
	//	System.out.println(t2.solution(6000, 7000));
		
		for(int i = 7000; i > 6000 ; --i) {
			System.out.println(i + " : " +Math.sqrt(i));
		}
		
	}

}
