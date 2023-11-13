package org.prosas.leetcode.problem1;

import java.util.HashMap;

/**
 * Problem Description: https://leetcode.com/problems/two-sum/
 *
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 */
public class Solution1 {
    public int[] twoSumInefficient(int[] nums, int target) {
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];

            for (int j = 0; j < nums.length; j++) {
                if (j == i) {
                    continue;
                }

                int b = nums[j];

                if (target == (a + b)) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }

        return result;
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> memoryMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int currentValue = nums[i];
            int lookupValue = target - currentValue;

            if (memoryMap.containsKey(lookupValue)) {
                result[0] = i;
                result[1] = memoryMap.get(lookupValue);
                break;
            } else {
                memoryMap.put(currentValue, i);
            }
        }

        return result;
    }
}
