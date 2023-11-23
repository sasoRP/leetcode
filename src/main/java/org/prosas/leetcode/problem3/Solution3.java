package org.prosas.leetcode.problem3;

import java.util.HashSet;
import java.util.Set;

/**
 * Problem Description: https://leetcode.com/problems/longest-substring-without-repeating-characters/
 *
 * Given a string s, find the length of the longest substring without repeating characters.
 */
public class Solution3 {
    public int lengthOfLongestSubstringInneficient(String input) {
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

    public int lengthOfLongestSubstring(String input) {
        int result = 0;

        for (int i = 0; i < input.length(); i++) {
            result = Math.max(result, getLongestSubString(input, i));
        }

        return result;
    }

    private int getLongestSubString(String input, int startIndex) {
        int result = 0;
        Set<Character> processedChars = new HashSet();

        int currentIndex = startIndex;
        Character currentChar = input.charAt(currentIndex);

        while (!processedChars.contains(currentChar)) {
            processedChars.add(currentChar);
            result++;
            currentIndex++;

            if (currentIndex > input.length() - 1) {
                break;
            }

            currentChar = input.charAt(currentIndex);
        }

        return result;
    }
}
