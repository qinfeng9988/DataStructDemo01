package com.qjfcc.design;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 秦江峰
 * @AddTime 2020/3/18 18:01
 */
public class RemoveRepetitive {


    public static void main(String[] args){
        ListNode listNode = new ListNode(1);
        listNode.next  =  new ListNode(1);

        listNode.next.next = new ListNode(1);

        deleteDuplicates(listNode);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode r = head;
        while (head!=null){
            if(head.next==null){
                break;
            }else if( head.next.val == head.val){
                head.next = head.next.next;
            }else {
                head = head.next;
            }

        }
        return r;
    }

      public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
