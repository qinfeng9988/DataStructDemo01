package com.qjf.leetcode;

/**
 * @author 秦江峰
 * @AddTime 2020/4/8 12:29
 */
public class LeetCodeMain {

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1, 1);
        System.out.println("null");
        lruCache.put(2, 2);
        System.out.println("null");
        System.out.println("1==" + lruCache.get(1));
        lruCache.put(3, 3);
        System.out.println("null");
        System.out.println("-1==" + lruCache.get(2));
        lruCache.put(4, 4);
        System.out.println("null");

        System.out.println("-1 ==" + lruCache.get(1));
        System.out.println("3==" + lruCache.get(3));
        System.out.println("4==" + lruCache.get(4));




        LRUCache lruCache2 = new LRUCache(1);
        lruCache2.put(2,1);
        System.out.println("null");
        System.out.println("1[key=2] ==" + lruCache2.get(2));
        lruCache2.put(3,2);
        System.out.println("null");
        System.out.println("-1[key=2] ==" + lruCache2.get(2));
        System.out.println("2[key=3] ==" + lruCache2.get(3));
    }
}
