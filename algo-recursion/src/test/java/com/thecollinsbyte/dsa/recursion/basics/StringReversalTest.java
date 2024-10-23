package com.thecollinsbyte.dsa.recursion.basics;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class StringReversalTest {
    private final StringReversal reverser = new StringReversal();

    @Test
    public void testReverseWithNull() {
        assertNull(reverser.reverse(null));
    }

    @Test
    public void testReverseWithEmptyString() {
        assertEquals("", reverser.reverse(""));
    }

    @Test
    public void testReverseWithSingleCharacter() {
        assertEquals("a", reverser.reverse("a"));
    }

    @Test
    public void testReverseWithMultipleCharacters() {
        assertEquals("cba", reverser.reverse("abc"));
    }

    @Test
    public void testReverseWithPalindrome() {
        assertEquals("radar", reverser.reverse("radar"));
    }

    @Test
    public void testReverseWithSpaces() {
        assertEquals("dlroW olleH", reverser.reverse("Hello World"));
    }

    @Test
    public void testReverseWithSpecialCharacters() {
        assertEquals("!@#$%", reverser.reverse("%$#@!"));
    }

    @Test
    public void testReverseWithMixedCharacters() {
        assertEquals("!dlroW ,olleH", reverser.reverse("Hello, World!"));
    }
}
