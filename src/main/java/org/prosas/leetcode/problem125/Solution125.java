package org.prosas.leetcode.problem125;

/**
 * Problem Description: https://leetcode.com/problems/valid-palindrome
 *
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all
 * non-alphanumeric characters, it reads the same forward and backward.
 * Alphanumeric characters include letters and numbers.
 *
 * Given a string s, return true if it is a palindrome, or false otherwise.
 */
public class Solution125 {
    public boolean isPalindromeInefficient(String input) {
        String candidate = input.toLowerCase()
                            .codePoints()
                            .filter(c -> Character.isLetterOrDigit(c))
                            .collect(StringBuilder::new,
                                StringBuilder::appendCodePoint,
                                StringBuilder::append)
                            .toString();

        String reverse = new StringBuilder(candidate).reverse().toString();

        return candidate.equals(reverse);
    }

    public boolean isPalindrome(String input) {
        int startIndex = 0;
        int endIndex = input.length() - 1;

        while (startIndex < endIndex) {
            char left = Character.toLowerCase(input.charAt(startIndex));

            if (!Character.isLetterOrDigit(left)) {
                startIndex++;
                continue;
            }

            char right = Character.toLowerCase(input.charAt(endIndex));

            if (!Character.isLetterOrDigit(right)) {
                endIndex--;
                continue;
            }

            if (left != right) {
                return false;
            } else {
                startIndex++;
                endIndex--;
            }
        }

        return true;
    }
}