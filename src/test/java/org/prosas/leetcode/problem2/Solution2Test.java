package org.prosas.leetcode.problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private Solution2 solution = new Solution2();

    @Test
    void testAddTwoNumbersExample1() {
        // setup
        ListNode list1 = createListNode(new int[] {2,4,3});
        ListNode list2 = createListNode(new int[] {5,6,4});

        // action
        ListNode result = solution.addTwoNumbers(list1, list2);

        // verification
        ListNode expectedResult = createListNode(new int[] {7,0,8});
        assertEquals(expectedResult, result);
    }

    @Test
    void testAddTwoNumbersExample2() {
        // setup
        ListNode list1 = createListNode(new int[] {0});
        ListNode list2 = createListNode(new int[] {0});

        // action
        ListNode result = solution.addTwoNumbers(list1, list2);

        // verification
        ListNode expectedResult = createListNode(new int[] {0});
        assertEquals(expectedResult, result);
    }

    @Test
    void testAddTwoNumbersExample3() {
        // setup
        ListNode list1 = createListNode(new int[] {9,9,9,9,9,9,9});
        ListNode list2 = createListNode(new int[] {9,9,9,9});

        // action
        ListNode result = solution.addTwoNumbers(list1, list2);

        // verification
        ListNode expectedResult = createListNode(new int[] {8,9,9,9,0,0,0,1});
        assertEquals(expectedResult, result);
    }

    private ListNode createListNode(int[] ints) {
        ListNode firstNode = new ListNode();
        ListNode currentNode = firstNode;

        for (int i = 0; i < ints.length; i++) {
            currentNode.val = ints[i];
            currentNode.next = new ListNode();

            if (i < ints.length - 1) {
                currentNode = currentNode.next;
            }
        }

        return firstNode;
    }
}