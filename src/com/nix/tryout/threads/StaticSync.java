package com.nix.tryout.threads;

/**
 * Shows how static Synchronization is done
 * @author nitinramachandran
 *
 */
public class StaticSync {

	public static void main(String[] args) {
		
		Counter c1 = new Counter();
		
		c1.increment();
		c1.decrement();
		
	}

}

//Class whose object will be shared
class Counter{
 public void increment(){
     // synchronized block with class reference
     synchronized(Counter.class){
       for(int i = 1; i <= 5 ; i++){
           System.out.println(Thread.currentThread().getName() + " i - " + i);
           try {
             Thread.sleep(50);
           } catch (InterruptedException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
           }
         } 
     }
 }
 
 public void decrement(){    
     synchronized(Counter.class){
      for(int i = 5; i > 0 ; i--){
          System.out.println(Thread.currentThread().getName() + " i - " + i);           
      }     
     }
 }
}