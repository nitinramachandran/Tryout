package com.nix.tryout.threads;

import java.util.concurrent.TimeUnit;

public class StopThread{
	
	// Without volatile, this program will execute forever
	private static volatile boolean stopRequested;
	
	public static void main(String... arg) throws InterruptedException{
		
		Thread backgroundThread = new Thread(new Runnable() {
			public void run() {
				int i = 0;
				while(!stopRequested) {
					i++;
				}
			}
		});
		backgroundThread.start();
		
		TimeUnit.SECONDS.sleep(1);
		stopRequested = true;
	}
}