package com.qjfcc.test;

import com.qjf.leetcode.LRUCache;
import com.qjf.leetcode.LRUCacheV2;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author 秦江峰
 * @AddTime 2020/4/9 12:47
 */
public class LRUCacheTest {

    @Test
    public void testCase1() {
        LRUCacheV2 lruCache = new LRUCacheV2(2);
        lruCache.put(1, 1);
        lruCache.put(2, 2);
        Assert.assertEquals(1, lruCache.get(1));
        lruCache.put(3, 3);
        Assert.assertEquals(-1,lruCache.get(2));
        lruCache.put(4, 4);
        Assert.assertEquals(-1,lruCache.get(1));
        Assert.assertEquals(3,lruCache.get(3));
        Assert.assertEquals(4,lruCache.get(4));
    }


    @Test
    public void testCase2() {
        LRUCache lruCache2 = new LRUCache(1);
        lruCache2.put(2,1);
        Assert.assertEquals(1,lruCache2.get(2));
        lruCache2.put(3,2);
        Assert.assertEquals(-1,lruCache2.get(2));
        Assert.assertEquals(2,lruCache2.get(3));
    }

    @Test
    public void testCase3() {
        LRUCache lruCache2 = new LRUCache(2);
        lruCache2.put(2,1);
        lruCache2.put(2,2);
        Assert.assertEquals(2,lruCache2.get(2));
        lruCache2.put(1,1);
        lruCache2.put(4,1);
        Assert.assertEquals(-1,lruCache2.get(2));
    }
}
