package com.nix.tryout.threads;

import java.util.concurrent.TimeUnit;

public class StopThreadSync {

	
	private static boolean stopRequested;
	
	private static synchronized void requestStop() {
		stopRequested = true;
	}
	
	private static synchronized boolean stopRequested() {
		return stopRequested;
	}
	
	public static void main(String... arg) throws InterruptedException{
		
		Thread backgroundThread = new Thread(new Runnable() {
			public void run() {
				int i = 0;
				while(!stopRequested()) {
					i++;
				}
			}
		});
		backgroundThread.start();
		
		TimeUnit.SECONDS.sleep(1);
		requestStop();
		
	}

}
