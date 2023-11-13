package org.prosas.leetcode.problem4;

/**
 * Problem Description: https://leetcode.com/problems/median-of-two-sorted-arrays/
 */
public class Solution4 {
    public double findMedianSortedArrays(int[] array1, int[] array2) {
        int totalLength = array1.length + array2.length;
        int sortedArray[] = new int[totalLength];

        int i = 0;
        int j = 0;

        for (int k = 0; k < totalLength; k++) {

            if (i >= array1.length) {
                sortedArray[k] = array2[j];
                j++;
                continue;
            }

            if (j >= array2.length) {
                sortedArray[k] = array1[i];
                i++;
                continue;
            }

            int value1 = array1[i];
            int value2 = array2[j];

            if (value1 <= value2) {
                sortedArray[k] = value1;
                i++;
            } else {
                sortedArray[k] = value2;
                j++;
            }
        }

        return calculateMedian(sortedArray);
    }

    private double calculateMedian(int[] sortedArray) {
        System.out.println("sortedArray.length: " + sortedArray.length);

        double median;
        boolean isOddDimension = (sortedArray.length % 2) != 0;
        int middleIndex = (int) Math.floor((double)sortedArray.length / 2);

        if (isOddDimension) {
            median = sortedArray[middleIndex];
        } else {
            median = ((double)sortedArray[middleIndex - 1] + sortedArray[middleIndex]) / 2;
        }

        return median;
    }
}
