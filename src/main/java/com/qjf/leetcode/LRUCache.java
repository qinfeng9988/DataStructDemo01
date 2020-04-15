package com.qjf.leetcode;

import com.qjf.leetcode.Model.ListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * leetcode question 146
 *
 * @author 秦江峰
 * @AddTime 2020/4/8 12:09
 */
public class LRUCache {

    int count = 0;
    int capacity = 0;
    ListNode head;
    ListNode tail;
    Map<Integer, ListNode> maps;

    ListNode initListNode = new ListNode(0, 0);

    /**
     * 1、初始化容量，检查容量参数
     * 2、初始化maps
     * 3、初始化tail 和 head 指向一个空节点
     *
     * @param capacity
     */
    public LRUCache(int capacity) {
        if (capacity < 1) {
            throw new IllegalArgumentException();
        }
        maps = new HashMap<>(capacity);
        head = tail = initListNode;
        head.next = tail;
        tail.prev = head;
        this.capacity = capacity;
    }

    /**
     * 1、判断当前key是否存在，不存在直接返回 -1,存在，则操作进入第二步操作
     * 2、如果存在则 将该节点移动到 链表的 head，原来的head 下移至第二个节点
     *
     * @param key
     * @return
     */
    public int get(int key) {
        ListNode listNode = maps.get(key);
        if (listNode != null) {
            moveToHead(listNode);
            return listNode.val;
        }
        return -1;
    }

    /**
     * 1、判断节点是否在maps 中存在，如果存在则将修改该节点的值，并将该节点移动至链表头部
     * 2、如果不存在该节点，判断当前容量是否已经达到上限
     * 2.1 如果达到上限，则移除 tail 的节点
     * 3、创建新节点 插入在链表的头部
     *
     * @param key
     * @param value
     */
    public void put(int key, int value) {
        ListNode o = maps.get(key);
//        if (o != null) { hashmap 中允许存null值，如果用o!=null来判断，会有问题
        if (maps.containsKey(key)) {

            o.val = value;
            maps.put(key, o);
            moveToHead(o);
            return;
        }
        if ((count + 1) > capacity) {
            removeLast();
        } else count++;
        insertToHead(key, value);
    }

    /**
     * 容量超限时调用，删除tail 的节点
     */
    private void removeLast() {
        ListNode listNode = tail.prev;
        listNode.prev.next = tail;
        tail.prev = listNode.prev;
        maps.remove(listNode.key);
    }

    /**
     * 在链表头部插入节点
     *
     * @param key
     * @param value
     */
    private void insertToHead(int key, int value) {
        ListNode newHead = new ListNode(key, value);
        newHead.next = head.next;
        head.next.prev = newHead;
        head.next = newHead;
        newHead.prev = head;
        maps.put(key, newHead);
    }

    /**
     * 移动节点至头部
     *
     * @param l
     */
    private void moveToHead(ListNode l) {
        if (l.equally(head.next)) {
            return;
        }
        l.prev.next = l.next;
        l.next.prev = l.prev;

        l.next = this.head.next;
        this.head.next.prev = l;
        this.head.next = l;
    }

}
