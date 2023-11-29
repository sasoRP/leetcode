package org.prosas.leetcode.problem228;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem Description: https://leetcode.com/problems/summary-ranges/
 *
 * You are given a sorted unique integer array nums.
 * A range [a,b] is the set of all integers from a to b (inclusive).
 * Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.
 * Each range [a,b] in the list should be output as:
 *
 * "a->b" if a != b
 * "a" if a == b
 */
public class Solution228 {

    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> result = new ArrayList<>();

        if (nums.length == 0) {
            return result;
        }

        int startValue = nums[0];
        int lastValue = nums[0];

        for (int i = 0; i < nums.length; i++) {
            int currentValue = nums[i];

            if (!shouldAddToCurrentRange(currentValue, lastValue)) {
                result.add(buildRange(startValue, lastValue));
                startValue = currentValue;
            }

            lastValue = currentValue;
        }

        if (startValue <= lastValue) {
            result.add(buildRange(startValue, lastValue));
        }

        return  result;
    }

    private String buildRange(int minValue, int maxValue) {
        StringBuilder sb = new StringBuilder();

        if (minValue < maxValue) {
            sb.append(String.format("%s->%s", minValue, maxValue));
        } else {
            sb.append(String.valueOf(minValue));
        }

        return sb.toString();
    }

    private boolean shouldAddToCurrentRange(int currentValue, int lastValue) {
        return currentValue == lastValue || (currentValue - lastValue) == 1;
    }
}
