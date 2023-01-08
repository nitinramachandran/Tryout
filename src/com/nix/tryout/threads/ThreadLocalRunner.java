package com.nix.tryout.threads;

public class ThreadLocalRunner implements Runnable{

    private ThreadStudent tStudent;
    private static ThreadLocal<ThreadStudent> tLocal
            = new ThreadLocal<>();

    public ThreadLocalRunner(ThreadStudent tStudent) {
        this.tStudent = tStudent;
    }

    @Override
    public void run() {
        tLocal.set(this.tStudent);
        System.out.println("Student : " + tLocal.get());
        tLocal.remove();
        System.out.println("This will be null : " + tLocal.get());
    }
}
