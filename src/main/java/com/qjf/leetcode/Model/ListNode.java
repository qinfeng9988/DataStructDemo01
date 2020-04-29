package com.qjf.leetcode.Model;

import com.qjf.leetcode.LRUCache;

/**
 * @author 秦江峰
 * @AddTime 2020/4/7 19:09
 */
public class ListNode {
    public int val;
    public int key;
    public ListNode next;
    public ListNode prev;

    public ListNode(int k, int v) {
        val = v;
        key = k;
    }

    public boolean equally(ListNode l) {
        return l != null && l.val == this.val && l.key == this.key;
    }
}
