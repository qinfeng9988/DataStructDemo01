package com.qjf.leetcode;

import com.qjf.leetcode.Model.ListNode;
import javafx.util.Pair;

import java.util.Arrays;

/**
 * @author 秦江峰
 * https://leetcode-cn.com/problems/reverse-nodes-in-k-group/solution/tu-jie-kge-yi-zu-fan-zhuan-lian-biao-by-user7208t/
 * 分段反转链表（K 个一组翻转链表）
 * @AddTime 2020/4/14 17:17
 */
public class Question25 {

    public static int aMethod(int i)throws Exception
    {
        try{
            return i / 10;
        }
        catch (Exception ex)
        {
            throw new Exception("exception in a Method");
        } finally{
            System.out.printf("finally");
        }
    }


    public static void main(String[] args) {

        ListNode listNode5 = new ListNode(5, 5);
        ListNode listNode4 = new ListNode(4, 4);
        ListNode listNode3 = new ListNode(3, 3);
        ListNode listNode2 = new ListNode(2, 2);
        ListNode listNode1 = new ListNode(1, 1);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        ListNode listNode = reverseKGroup2(listNode1, 2);
        while (listNode!=null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

        int[] ii = new int[3];
        ii[0] = 1;
        ii[1] = 3;
        ii[2] = 5;

        int[] ii2 = new int[3];
        ii2[0] = 2;
        ii2[1] = 4;
        ii2[2] = 6;
        merge(ii,ii2);
    }

    public static int[] merge(int[] a, int[] b) {
        int[] aa,bb;
        int length = a.length + b.length;
        if(a.length == 0){
            return b;
        }
        if(b.length == 0){
            return a;
        }
        int[] newArray = new int[length];
        int r;
        if(a[0]<b[0]){
            r  = a[0];
            if(a.length>1) {
                aa = Arrays.copyOfRange(a, 1, a.length - 1);
            }else {
                aa = new int[0];
            }
            bb = b;
        }else{
            r  = b[0];
            if(a.length>1) {
                bb = Arrays.copyOfRange(b, 1, b.length - 1);
            }else {
                bb = new int[0];
            }
            aa = a;
        }
        newArray[0] = r;
        int[] a2 = merge(aa,bb);
        for(int i =1;i<length-1;i++){
            newArray[i] = a2[i-1];
        }
        return newArray;
    }
    /**
     * 方法二 符合要求，时间复杂度O(n * k),空间复杂度 O（1）
     * @param head
     * @param k
     * @return
     */
    static ListNode reverseKGroup2(ListNode head, int k) {
        ListNode tHead ,result = tHead = head,tTail = null,next;
        int i = 1, j = 0;

        while (head != null) {
            next = head.next;
            if (k == i) {
                Pair<ListNode, ListNode> pairs =  order2(tHead, k);
                tHead = next;
                if (j == 0) {
                    result = pairs.getKey();
                    tTail = pairs.getValue();
                }else {
                    tTail.next = pairs.getKey();
                    tTail = pairs.getValue();
                }
                i = 1;
                j++;
            } else i++;
            head = next;

        }
        return result;
    }

    static Pair<ListNode, ListNode> order2(ListNode head, int k) {
        ListNode tHead = head, tTail = head.next, tNode = null, tail = head;
        for (int i = 1; i < k; i++) {
            tNode = tTail.next;
            tTail.next = tHead;
            if (i == 1) {
                tHead.next = tNode;
            } else {
                tail.next = tNode;
            }
            tHead = tTail;
            tTail = tNode;
        }
        return new Pair(tHead, tail);
    }

    /**
     * 方法一 空间复杂度 不符合O(1)的要求
     * @param head
     * @param k
     * @return
     */
    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode tHead = head;
        ListNode result = head;
        ListNode tTail = null;
        int i = 1, j = 0;

        while (head != null) {
            ListNode next = head.next;
            if (k == i) {

                ListNode[] l = order(tHead, k);
                l[0].next = next;
                tHead = next;
                if (j == 0) {
                    tTail = l[0];
                    result = l[k - 1];
                } else {
                    tTail.next = l[k - 1];
                    tTail = l[0];
                }
                i = 1;
                j++;
            } else i++;
            head = next;

        }
//        if (i < k) {
//            return result;
//        }
        return result;
    }
    static ListNode[] order(ListNode head, int k) {
        ListNode[] listNodes = new ListNode[k];
        int i;
        for (i = 0; i < k; i++) {
            listNodes[i] = head;
            if (head.next != null) {
                head = head.next;
            } else {
                break;
            }
        }
        if (i + 1 < k) {
            return listNodes;
        }
        for (i = listNodes.length - 1; i > 0; i--) {
            listNodes[i].next = listNodes[i - 1];
        }
        return listNodes;
    }


}
