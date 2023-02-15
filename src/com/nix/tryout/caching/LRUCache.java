package com.nix.tryout.caching;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Least Recently Used cached makes sure there are no more than 5 elements in the memory.
 *
 */
public class LRUCache {

    private final Map<String, String> cacheMap;
    private List<String> keyList;
    private final int SIZE = 5;

    public LRUCache() {
        cacheMap = new HashMap<String, String>();
        keyList = new ArrayList();
    }

    /**
     * Returns the least recently used value
     * @return
     */
    public String getLeastRecentlyUsed() {
        if (keyList.size() == 0) {
            return null;
        }
        return cacheMap.get(keyList.get(keyList.size()-1));
    }

    /**
     * Returns the most recently used value
     * @return
     */
    public String getMosRecentlyUsed() {
        if (keyList.size() == 0) {
            return null;
        }
        return cacheMap.get(keyList.get(0));
    }

    /**
     * Picks an item from the cache based on the search key
     * @param key
     * @return
     */
    public String getFromCache(String key) {
        int lruIndex = keyList.indexOf(key);
        String lruKey = keyList.get(lruIndex);
        keyList.remove(lruIndex);
        keyList.add(0, lruKey);
        return cacheMap.get(key);
    }

    /**
     * Adds a key value pair into the cache such that the size is not greater than 5
     * @param key String
     * @param value String
     */
    public void putIntoCache(String key, String value) {
        if (keyList.size() == SIZE) {
            cacheMap.remove(keyList.remove(keyList.size()-1));
        }
        keyList.add(0, key);
        cacheMap.put(key, value);
    }

    /**
     * Prints the contents of the cache
     */
    protected void traverseCache() {
        for (Map.Entry<String,String> entry : cacheMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        System.out.println(keyList);
    }
}