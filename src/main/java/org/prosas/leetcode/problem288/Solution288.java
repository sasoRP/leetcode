package org.prosas.leetcode.problem288;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem Description: https://leetcode.com/problems/summary-ranges/
 *
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 */
public class Solution288 {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> result = new ArrayList<>();

        StringBuilder currentRange = new StringBuilder();
        Integer lastValue = null;

        for (int i = 0; i < nums.length; i++) {
            int currentValue = nums[i];

            if (!shouldAddToCurrentRange(currentValue, lastValue)) {
                result.add(buildRange(currentRange));
                currentRange = new StringBuilder();
            }

            currentRange.append(String.valueOf(currentValue));
            lastValue = currentValue;
        }

        if (!currentRange.isEmpty()) {
            result.add(buildRange(currentRange));
        }

        return  result;
    }

    private String buildRange(StringBuilder currentRange) {
        StringBuilder sb = new StringBuilder();

        sb.append(currentRange.charAt(0));

        if (currentRange.length() > 1) {
            sb.append("->");
            sb.append(currentRange.charAt(currentRange.length() - 1));
        }

        return sb.toString();
    }

    private boolean shouldAddToCurrentRange(int currentValue, Integer lastValue) {
        boolean result = false;

        if (lastValue == null) {
            result = true;
        }

        if (lastValue != null) {
            result = (currentValue - lastValue) == 1;
        }

        return result;
    }
}
