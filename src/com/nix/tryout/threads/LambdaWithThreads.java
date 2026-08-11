package com.nix.tryout.threads;

public class LambdaWithThreads {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("Currrent Thread is alive : " + Thread.currentThread().isAlive());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Sleep interrupted");
            }
            System.out.println("Currrent Thread is alive : " + Thread.currentThread().isDaemon());
        };
        new Thread(runnable).start();
    }
}
