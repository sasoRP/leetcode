package org.prosas.leetcode.problem2;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }

    @Override
    public boolean equals(Object obj) {
        ListNode node = (ListNode) obj;

        return node != null && this.val == node.val;
    }
}