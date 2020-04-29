package xyz.abc.test;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 秦江峰
 * @AddTime 2020/3/30 15:07
 */
public class NodeMain {

    static int r = 0;

    public static void main(String[] args) {
        Node nodeLeft1 = new Node(5, new Node(6, null, null), new Node(4, null, null));
        Node node = new Node(10, null, null);
        Node node1 = new Node(8, null, null);
        Node nodeFirst = new Node(9, node, node1);

        Node node2 = new Node(7, nodeFirst, nodeLeft1);
        cal(node2, 1);
        System.out.println(r);

        Pair<Integer, Integer> pair = cal2(node2);
        System.out.println("寄数：" + pair.getKey() + "偶数：" + pair.getValue());


    }

    static void cal(Node node, int level) {
        if (node == null) {
            return;
        }
        level++;
        if (level % 2 == 0) {
            r += node.val;
        }
        cal(node.getPrev(), level);
        cal(node.getNext(), level);
//        return level % 2 == 0 ? node.val + cal(node.getPrev(), level) + cal(node.getNext(), level) : 0;
    }


    static Pair<Integer, Integer> cal2(Node node) {

        int right = 0 ,left = 0 ,level = 1;

        List<Node> list = new ArrayList<>() , list1 = new ArrayList<>();
        list.add(node);

        while (!list.isEmpty()) {
            for (Node node2 : list) {
                if (level % 2 == 0) {
                    left += node2.val;
                }else if (level % 2 == 1) {
                    right += node2.val;
                }
                if (node2.getPrev() != null) {
                    list1.add(node2.getPrev());
                }
                if (node2.getNext() != null) {
                    list1.add(node2.getNext());
                }
            }
            list = new ArrayList<>(list1);
            list1.clear();
            level++;
        }
        return new Pair<>(left, right);
    }

    static class Node {
        private int val;
        private Node next;
        private Node prev;

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

        Node getNext() {
            return this.next;
        }

        Node getPrev() {
            return prev;
        }


    }
}
