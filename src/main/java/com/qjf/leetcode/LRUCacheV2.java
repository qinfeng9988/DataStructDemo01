package com.qjf.leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author 秦江峰
 * @AddTime 2020/4/9 14:16
 */
public class LRUCacheV2 extends LinkedHashMap<Integer,Integer> {

    private int capacity;
    public LRUCacheV2(int capacity) {
        super(capacity,0.75f,true);
        this.capacity = capacity;
    }

    public int get(int key){
        return super.getOrDefault(key,-1);
    }

    public void put(int key,int val){
        super.put(key,val);
    }

    protected boolean removeEldestEntry(Map.Entry<Integer,Integer> eldest){
        return size() > capacity ;
    }
}
