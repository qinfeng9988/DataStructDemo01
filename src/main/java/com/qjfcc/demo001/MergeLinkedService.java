package com.qjfcc.demo001;

/**
 * @author 秦江峰
 * @AddTime 2019/11/29 17:20
 */
public class MergeLinkedService {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode listNode = new ListNode(-1);
        ListNode listNode2 = listNode;
        while (l1 != null) {
            int current;
            if (l1.val <= l2.val) {
                current = l1.val;
                l1 = l1.next;
            } else {
                current = l2.val;
                l2 = l2.next;
            }
            listNode2.next = new ListNode(current);
            if (l2 == null) {
                listNode2.next.next = l1;
                return listNode.next;
            }
            listNode2 = listNode2.next;

        }
        if (l2 != null) {
            listNode2.next = l2;
            return listNode.next;
        }
        return listNode.next;
    }


    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        int current;
        ListNode listNode = new ListNode(-1);
        if (l1.val <= l2.val) {
            current = l1.val;
            listNode.next = mergeTwoLists2(l1.next,l2);
        } else {
            current = l2.val;
            listNode.next = mergeTwoLists2(l1,l2.next);
        }
        listNode.val = current;
        return listNode;
    }


}
