package com.thecollinsbyte.dsa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringManipulatorTest {
    private StringManipulator str;

    @BeforeEach
    public void setUp() {
        str = new StringManipulator("InstaJob");
    }

    @Test
    public void testLength() {
        assertEquals(8, str.length());
    }

    @Test
    public void testCharAtIndex() {
        char c = str.charAt(5);
        assertEquals('J', c);
    }

    @Test
    public void testSubstring() {
        StringManipulator stringManipulator = str.substring(5, 8);
        assertEquals("Job", stringManipulator.toString());
    }

    @Test
    public void testStringConcatenation() {
        StringManipulator stringManipulator = str.concatenate(new StringManipulator(".io"));
        assertEquals("InstaJob.io", stringManipulator.toString());
    }

    @Test
    public void testEquals() {
        assertEquals(false, str.equals(new StringManipulator("InstaByte")));
        assertEquals(true, str.equals(new StringManipulator("InstaJob")));
    }

    @Test
    public void testCompareTo() {
        StringManipulator str1 = new StringManipulator("InstaByte");
        StringManipulator str2 = new StringManipulator("InstaJob");
        assertTrue(str1.compareTo(str2) < 0);
    }

    @Test
    public void testIndexOf() {
        assertEquals(0, str.indexOf("Insta"));
        assertEquals(5, str.indexOf("Job"));
    }

    @Test
    public void testReplace() {
        StringManipulator result = str.replace("InstaByte", "InstaJob");
        assertEquals("InstaJob", result.toString());
    }
}
