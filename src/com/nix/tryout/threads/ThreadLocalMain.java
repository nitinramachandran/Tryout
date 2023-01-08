package com.nix.tryout.threads;

public class ThreadLocalMain {

    public static void main(String... args) {
        ThreadLocalRunner tRunner1 = new ThreadLocalRunner(new ThreadStudent(1, "NixRam"));
        ThreadLocalRunner tRunner2 = new ThreadLocalRunner(new ThreadStudent(2, "Rits"));
        ThreadLocalRunner tRunner3 = new ThreadLocalRunner(new ThreadStudent(3, "Sidd"));

        new Thread(tRunner1).start();
        new Thread(tRunner2).start();
        new Thread(tRunner3).start();
    }
}