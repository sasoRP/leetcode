package org.prosas.leetcode.problem288;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.prosas.leetcode.problem125.Solution125;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution288Test {

    private Solution288 solution = new Solution288();

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
}