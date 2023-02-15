package com.nix.tryout.caching;

public class CachingMain {
    public static void main(String[] args) {
        LRUCache cache = new LRUCache();
        cache.putIntoCache("Tennis", "Tennis Ball");
        cache.putIntoCache("Cricket", "Stitch Ball");
        cache.putIntoCache("Rugby", "Rugby Ball");
        cache.putIntoCache("Archery", "Bow Arrow");
        cache.putIntoCache("Ping pong", "Table tennis ball");

        System.out.println("Reading value : " + cache.getFromCache("Cricket"));
        System.out.println("Reading value : " + cache.getFromCache("Tennis"));
        cache.putIntoCache("Javelin Throw", "Javelin");

        cache.traverseCache();
    }
}
