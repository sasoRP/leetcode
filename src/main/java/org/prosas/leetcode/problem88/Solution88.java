package org.prosas.leetcode.problem88;

/**
 * Problem Description: https://leetcode.com/problems/merge-sorted-array
 *
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 *
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 *
 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
 * To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored.
 * nums2 has a length of n.
 */
public class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int currentIndexNums1 = m - 1;
        int currentIndexNums2 = n - 1;

        for (int i = nums1.length - 1; i >= 0; i--) {
            if (currentIndexNums1 < 0) {
                nums1[i] = nums2[currentIndexNums2];
                currentIndexNums2--;

                continue;
            }

            if (currentIndexNums2 < 0) {
                nums1[i] = nums1[currentIndexNums1];
                currentIndexNums1--;

                continue;
            }

            if (nums1[currentIndexNums1] >= nums2[currentIndexNums2]) {
                nums1[i] = nums1[currentIndexNums1];
                currentIndexNums1--;
            } else {
                nums1[i] = nums2[currentIndexNums2];
                currentIndexNums2--;
            }
        }
    }
}
