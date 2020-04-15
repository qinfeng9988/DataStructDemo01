package com.qjf.leetcode;

import com.qjfcc.demo001.ListNode;

import java.util.List;

/**
 * @author 秦江峰
 * @AddTime 2020/4/7 19:07
 */
public class Question2 {

    public static void main(String[] args) {
        int b  = 11 / 10;
        System.out.print(b);

        ListNode listNode = new ListNode(3);
        ListNode listNode2 = new ListNode(4);
        ListNode listNode3 = new ListNode(2);
        listNode3.next = listNode2;
        listNode2.next = listNode;


        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(6);
        ListNode listNode6 = new ListNode(5);
        listNode6.next = listNode5;
        listNode5.next = listNode4;

//        addTwoNumbers(listNode3, listNode6);

        ListNode node = new ListNode(9);
        node.next = new ListNode(9);
        addTwoNumbers(node, node.next);

    }

    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 != null && l2 == null) {
            return l1;
        }
        if (l2 != null && l1 == null) {
            return l2;
        }
        ListNode l3 = l1;
        int b = 0;
        while (l3 != null) {
            l3.val += b;
            l3.val += l2 == null ? 0 : l2.val;
            if (l3.val >= 10) {
                l3.val -= 10;
                b = 1;
            } else b = 0;

            if (l2 != null || b > 0) {
                l2 = l2 != null ? l2.next : null;
                if (l3.next == null && (l2 != null || b > 0)) {
                    l3.next = new ListNode(0);
                }
            } else {
                break;
            }
            l3 = l3.next;
        }
        return l1;
    }

    static int defaultInt(ListNode node, int defaultVal) {
        if (node != null) {
            return node.val;
        }
        return defaultVal;
    }
}
