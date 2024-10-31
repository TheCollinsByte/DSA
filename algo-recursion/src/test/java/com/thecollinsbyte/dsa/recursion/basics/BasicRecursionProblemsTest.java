package com.thecollinsbyte.dsa.recursion.basics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BasicRecursionProblemsTest {

    BasicRecursionProblems recursion;

    @BeforeEach
    public void setUp() {
        recursion = new BasicRecursionProblems();
    }

    @Test
    public void testGetNumbersUpToN() {
        List<Integer> result = recursion.getNumbersUpToN(5);
        assertEquals(5, result.size());
        assertEquals(List.of(1, 2, 3, 4, 5), result);
    }

    @Test
    public void testGetNumbersDownToOne() {
        List<Integer> result = recursion.getNumbersDownToOne(5);
        assertEquals(5, result.size());
        assertEquals(List.of(5, 4, 3, 2, 1), result);
    }

    @Test
    public void testFindMean() {
        int[] values = new int[]{1, 2, 3, 4, 5};
        float result = recursion.findMean(values, values.length);

        assertEquals(3, result);
    }
}
