package com.thecollinsbyte.dsa.recursion.basics;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PalindromeTest {

    Palindrome palindrome = new Palindrome();

    @Test
    public void testPalindrome() {
        assertTrue(palindrome.isPalindrome("racecar"));
    }

}
