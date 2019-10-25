package com.qjfcc.demo001.lru;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author 秦江峰
 * @AddTime 2019/10/25 10:45
 */
public class LRUCache {
    private int count = 0;
    private int current = 0;
    private Map<Integer, CacheNode> cache = new HashMap<>();

    public LRUCache(int capacity) {
        this.count = capacity;
    }

    public int get(int key) {
        CacheNode v = Optional.ofNullable(cache.get(key)).orElse(null);
        if (v != null) {
            return v.getV();
        }
        return -1;
    }

    public void put(int key, int value) {
        cache.put(key, new CacheNode(key, value));
        this.current++;
        if (this.current > this.count) {
            //删除
        }
    }
}
