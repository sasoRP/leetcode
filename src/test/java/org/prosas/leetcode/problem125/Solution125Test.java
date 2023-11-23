package org.prosas.leetcode.problem125;

import org.junit.jupiter.api.Test;
import org.prosas.leetcode.problem88.Solution88;

import static org.junit.jupiter.api.Assertions.*;

class Solution125Test {

    private Solution125 solution = new Solution125();

    @Test
    void testisPalindromeExample1() {
        // action
        boolean result = solution.isPalindrome("A man, a plan, a canal: Panama");

        // verification
        assertEquals(true, result);
    }

    @Test
    void testisPalindromeExample2() {
        // action
        boolean result = solution.isPalindrome("race a car");

        // verification
        assertEquals(false, result);
    }

    @Test
    void testisPalindromeExample3() {
        // action
        boolean result = solution.isPalindrome(" ");

        // verification
        assertEquals(true, result);
    }

    @Test
    void testisPalindromeExample4() {
        // action
        boolean result = solution.isPalindrome("a");

        // verification
        assertEquals(true, result);
    }
}