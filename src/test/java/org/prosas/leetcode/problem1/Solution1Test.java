package org.prosas.leetcode.problem1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Solution1Test {

    private Solution1 solution = new Solution1();

    @Test
    void testTwoSumExample1() {
        // setup
        int[] nums = {2,7,11,15};
        int target = 9;

        // action
        int[] result = solution.twoSum(nums, target);

        // verification
        verifyResult(result, 0, 1);
    }

    @Test
    void testTwoSumExample2() {
        // setup
        int[] nums = {3,2,4};
        int target = 6;

        // action
        int[] result = solution.twoSum(nums, target);

        // verification
        verifyResult(result, 1, 2);
    }

    @Test
    void testTwoSumExample3() {
        // setup
        int[] nums = {3,3};
        int target = 6;

        // action
        int[] result = solution.twoSum(nums, target);

        // verification
        verifyResult(result, 0, 1);
    }

    private void verifyResult(int[] result, int index1, int index2) {
        assertEquals(result.length,2);
        assertTrue(Arrays.stream(result).anyMatch(x -> x == index1));
        assertTrue(Arrays.stream(result).anyMatch(x -> x == index2));
    }
}