package org.prosas.leetcode.problem228;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution228Test {

    private Solution228 solution = new Solution228();

    @Test
    void testSummaryRangesExample1() {
        // setup
        int[] nums = {0,1,2,4,5,7};

        // action
        List<String> actual = solution.summaryRanges(nums);

        // verification
        List<String> expected = Arrays.asList("0->2", "4->5", "7");
        assertEquals(expected, actual);
    }

    @Test
    void testSummaryRangesExample2() {
        // setup
        int[] nums = {0,2,3,4,6,8,9};

        // action
        List<String> actual = solution.summaryRanges(nums);

        // verification
        List<String> expected = Arrays.asList("0","2->4","6","8->9");
        assertEquals(expected, actual);
    }

    @Test
    void testSummaryRangesExample3() {
        // setup
        int[] nums = {-1};

        // action
        List<String> actual = solution.summaryRanges(nums);

        // verification
        List<String> expected = Arrays.asList("-1");
        assertEquals(expected, actual);
    }

    @Test
    void testSummaryRangesExample4() {
        // setup
        int[] nums = {-5,-4,-1,0,1,8,9};

        // action
        List<String> actual = solution.summaryRanges(nums);

        // verification
        List<String> expected = Arrays.asList("-5->-4","-1->1","8->9");
        assertEquals(expected, actual);
    }

    @Test
    void testSummaryRangesExample5() {
        // setup
        int[] nums = {};

        // action
        List<String> actual = solution.summaryRanges(nums);

        // verification
        List<String> expected = Arrays.asList();
        assertEquals(expected, actual);
    }
}