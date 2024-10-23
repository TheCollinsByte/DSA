package com.thecollinsbyte.dsa.recursion.basics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DecimalToBinaryTest {

    DecimalToBinary dtb;

    @BeforeEach
    public void setUp() {
        dtb = new DecimalToBinary();
    }

    @Test
    public void testDecimalToBinary() {
        String result = dtb.findBinary(233, "");
        assertEquals("11101001", result);
    }

}
