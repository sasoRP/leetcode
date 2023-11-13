package org.prosas.leetcode.problem27;

/**
 * Problem Description: https://leetcode.com/problems/remove-element/
 *
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
 * The order of the elements may be changed.
 * Then return the number of elements in nums which are not equal to val.
 *
 * Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
 * Change the array nums such that the first k elements of nums contain the elements which are not equal to val.
 * The remaining elements of nums are not important as well as the size of nums.
 * Return k.
 */
public class Solution27 {
    public int removeElement(int[] nums, int val) {
        int totalRemovals = 0;
        int lastIndex = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            if (i > lastIndex) {
                break;
            }

            boolean shouldRemove = nums[i] == val;

            if (shouldRemove) {
                while (nums[lastIndex] == val && lastIndex >= 0) {
                    totalRemovals++;

                    if (lastIndex > 0) {
                        lastIndex--;
                    } else {
                        break;
                    }
                }

                if (i <= lastIndex) {
                    // swap
                    int memoryValue = nums[lastIndex];

                    nums[lastIndex] = val;
                    nums[i] = memoryValue;
                }
            }
        }

        return nums.length - totalRemovals;
    }
}
