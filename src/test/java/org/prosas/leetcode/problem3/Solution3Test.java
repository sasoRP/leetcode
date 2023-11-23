package org.prosas.leetcode.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution3Test {

    private Solution3 solution = new Solution3();

    @Test
    void testLengthOfLongestSubstringExample1() {
        // action
        int result = solution.lengthOfLongestSubstring("abcabcbb");

        // verification
        assertEquals(3, result);
    }

    @Test
    void testLengthOfLongestSubstringExample2() {
        // action
        int result = solution.lengthOfLongestSubstring("bbbbb");

        // verification
        assertEquals(1, result);
    }

    @Test
    void testLengthOfLongestSubstringExample3() {
        // action
        int result = solution.lengthOfLongestSubstring("pwwkew");

        // verification
        assertEquals(3, result);
    }

    @Test
    void testLengthOfLongestSubstringExample4() {
        // action
        int result = solution.lengthOfLongestSubstring("au");

        // verification
        assertEquals(2, result);
    }
}