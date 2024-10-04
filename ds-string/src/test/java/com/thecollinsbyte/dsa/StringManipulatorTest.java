package com.thecollinsbyte.dsa;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
