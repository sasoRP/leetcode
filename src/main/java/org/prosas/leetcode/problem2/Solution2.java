package org.prosas.leetcode.problem2;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.math.BigInteger;

/**
 * Problem Description: https://leetcode.com/problems/add-two-numbers/
 *
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
public class Solution2 {
    public ListNode addTwoNumbers(ListNode listNode1, ListNode listNode2) {

        BigInteger num1 = getNumber(listNode1);
        BigInteger num2 = getNumber(listNode2);

        BigInteger total = num1.add(num2);
        String reversedTotal = new StringBuilder(String.valueOf(total)).reverse().toString();

        ListNode result = getList(reversedTotal);

        return result;
    }

    private BigInteger getNumber(ListNode listNode) {
        StringBuilder numberBuilder = new StringBuilder();

        do {
            numberBuilder.append(listNode.val);
            listNode = listNode.next;
        } while (listNode != null);

        return new BigInteger(numberBuilder.reverse().toString());
    }

    private ListNode getList(String number) {
        ListNode result = new ListNode();

        char[] numberArray = number.toCharArray();
        ListNode currentNode = result;

        for (int i = 0; i < numberArray.length; i++) {
            currentNode.val = Integer.parseInt(String.valueOf(numberArray[i]));

            if (i == numberArray.length - 1) {
                currentNode.next = null;
            } else {
                currentNode.next = new ListNode();
            }

            currentNode = currentNode.next;
        }

        return result;
    }
}
