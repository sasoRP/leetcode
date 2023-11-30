package org.prosas.leetcode.problem289;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem Description: https://leetcode.com/problems/game-of-life
 * According to Wikipedia's article: "The Game of Life, also known simply as Life, is a cellular automaton
 * devised by the British mathematician John Horton Conway in 1970."
 *
 * The board is made up of an m x n grid of cells, where each cell has an initial state:
 * live (represented by a 1) or dead (represented by a 0).
 * Each cell interacts with its eight neighbors (horizontal, vertical, diagonal) using the
 * following four rules (taken from the above Wikipedia article):
 *
 * 1. Any live cell with fewer than two live neighbors dies as if caused by under-population
 * 2. Any live cell with two or three live neighbors lives on to the next generation.
 * 3. Any live cell with more than three live neighbors dies, as if by over-population.
 * 4. Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
 *
 * The next state is created by applying the above rules simultaneously to every cell in the current state,
 * where births and deaths occur simultaneously. Given the current state of the m x n grid board, return the next state.
 */
public class Solution289 {

    private static int[][] board;
    private static int rows;
    private static int cols;

    public void gameOfLife(int[][] board) {
        int[][] result = getNextState(board);

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = result[i][j];
            }
        }

    }

    public int[][] getNextState(int[][] board) {
        Solution289.board = board;
        rows = board.length;

        if (rows > 0) {
            cols = board[0].length;
        }

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = calculateNextStatus(i, j);
            }
        }

        return result;
    }

    private int calculateNextStatus(int x, int y) {
        int cellStatus = board[x][y];
        int liveNeighbours = calculateNeighbours(x, y);

        switch (cellStatus) {
            case 0:
                if (liveNeighbours == 3) {
                    cellStatus = 1;
                }
                break;
            case 1:
                if (liveNeighbours < 2 || liveNeighbours > 3) {
                    cellStatus = 0;
                }
                break;
        }

        return cellStatus;
    }

    private static int calculateNeighbours(int x, int y) {
        int total = 0;

        for (int i = x-1; i <= x+1; i++) {
            for (int j = y-1; j <= y+1; j++) {
                if ((i != x || j != y) && i >= 0 && i < rows && j >= 0 && j < cols) {
                    total += board[i][j];
                }
            }
        }

        return total;
    }
}
