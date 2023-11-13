package org.prosas.leetcode.problem3;

/**
 * Problem Description: https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class Solution3 {
    public int lengthOfLongestSubstring(String input) {
        int result = 0;

        // for every character in the string
        for (int i = 0; i < input.length(); i++) {
            StringBuilder candidate = new StringBuilder();

            // find the longest string starting on that character
            for (int j = i; j < input.length(); j++) {

                char currentChar = input.charAt(j);

                if (candidate.indexOf(String.valueOf(currentChar)) == -1) {
                    candidate.append(input.charAt(j));
                } else {
                    break;
                }
            }

            if (candidate.length() > result) {
                result = candidate.length();
            }
        }

        return result;
    }
}
