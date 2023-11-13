package org.prosas.leetcode.problem27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution27Test {

    private Solution27 solution = new Solution27();

    @Test
    void testRemoveElementExample1() {
        // setup
        int[] nums = {3,2,2,3};
        int val = 3;

        // action
        int result = solution.removeElement(nums, val);

        // verification
        assertEquals(2, result);
    }

    @Test
    void testRemoveElementExample2() {
        // setup
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        // action
        int result = solution.removeElement(nums, val);

        // verification
        assertEquals(5, result);
    }

    @Test
    void testRemoveElementExample3() {
        // setup
        int[] nums = {1};
        int val = 1;

        // action
        int result = solution.removeElement(nums, val);

        // verification
        assertEquals(0, result);
    }

    @Test
    void testRemoveElementExample4() {
        // setup
        int[] nums = {5,5,5,5,5,5};
        int val = 5;

        // action
        int result = solution.removeElement(nums, val);

        // verification
        assertEquals(0, result);
    }
}