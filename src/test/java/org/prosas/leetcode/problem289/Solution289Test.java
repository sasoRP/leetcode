package org.prosas.leetcode.problem289;

import org.junit.jupiter.api.Test;
import org.prosas.leetcode.problem228.Solution228;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution289Test {

    private Solution289 solution = new Solution289();

    @Test
    void testGameOfLifeExample1() {
        // setup
        int[][] board = {{0,1,0}, {0,0,1}, {1,1,1}, {0,0,0}};

        // action
        int[][] actual = solution.getNextState(board);

        // verification
        int[][] expected = {{0,0,0}, {1,0,1}, {0,1,1}, {0,1,0}};
        assertArrayEquals(expected, actual);
    }

    @Test
    void testGameOfLifeExample2() {
        // setup
        int[][] board = {{1,1}, {1,0}};

        // action
        int[][] actual = solution.getNextState(board);

        // verification
        int[][] expected = {{1,1}, {1,1}};
        assertArrayEquals(expected, actual);
    }
}