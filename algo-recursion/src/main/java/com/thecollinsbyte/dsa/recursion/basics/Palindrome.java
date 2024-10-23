package com.thecollinsbyte.dsa.recursion.basics;

public class Palindrome {

    /**
     * Check if a String is a palindrome using recursion
     * @param str The String to check
     * @return True if the String is a palindrome
     */
    public boolean isPalindrome(String input) {
        // Base cases:
        if(input.length() == 0 || input.length() == 1) {
            return true;
        }

        if(input.charAt(0) == input.charAt(input.length() - 1)) {
            return isPalindrome(input.substring(1, input.length() - 1));
        }

        return false;
    }
}
