package com.qjf.leetcode;

import com.qjf.leetcode.Model.ListNode;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author 秦江峰
 * @AddTime 2020/4/9 15:38
 */
public class Question41 {
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        Map<Integer, ListNode> maps = new HashMap<>();
        ListNode fast = head.next;
        while (head != null && fast != null) {
            if ((fast.next != null && fast.next.next == head) || fast.next == head || fast == head) {
                return true;
            }
            fast = fast.next != null && fast.next.next != null ? fast.next.next.next : null;
            head = head.next;
        }
        return false;
    }

    public static void main(String[] args) {
        //[3,2,0,-4]

        ListNode l1 = new ListNode(3, 3);
        l1.next = new ListNode(2, 2);
        l1.next.next = new ListNode(0, 0);
        l1.next.next.next = new ListNode(-4, -4);
        l1.next.next.next.next = l1.next;

        Question41 question41 = new Question41();
        question41.hasCycle(l1);

    }

}
