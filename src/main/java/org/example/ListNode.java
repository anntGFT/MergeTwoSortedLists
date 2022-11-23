package org.example;

import java.util.LinkedList;

public class ListNode {

    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public int getVal() {
        return val;
    }

    public ListNode getNext() {
        return next;
    }

    public static LinkedList<Object> print(ListNode head) {

        LinkedList<Object> list = new LinkedList<>();
        if (head == null) return list;
        ListNode node = head;
        while (node != null) {
            list.add(node.val);
            node = node.next;
        }
        return list;
    }
}
