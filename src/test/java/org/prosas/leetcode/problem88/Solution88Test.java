package org.prosas.leetcode.problem88;

import org.junit.jupiter.api.Test;
import org.prosas.leetcode.problem1.Solution1;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution88Test {

    private Solution88 solution = new Solution88();

    @Test
    void testMergeExample1() {
        // setup
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;

        // action
        solution.merge(nums1, m, nums2, n);

        // verification
        assertArrayEquals(nums1, new int[] {1,2,2,3,5,6});
    }

    @Test
    void testMergeExample2() {
        // setup
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;

        // action
        solution.merge(nums1, m, nums2, n);

        // verification
        assertArrayEquals(nums1, new int[] {1});
    }

    @Test
    void testMergeExample3() {
        // setup
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;

        // action
        solution.merge(nums1, m, nums2, n);

        // verification
        assertArrayEquals(nums1, new int[] {1});
    }
}