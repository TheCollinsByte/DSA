package com.thecollinsbyte.dsa;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class MatrixTest {
    @Test
    public void testInsertAtBeginning() {
        Integer[][] data = {{1, 2}, {3, 4}};
        Matrix<Integer> matrix = new Matrix<>(2, 2, data);
        matrix.insertAtBeginning(new Integer[]{7, 8});

        Integer[][] expected = {{7, 8}, {1, 2}, {3, 4}};
        assertArrayEquals(expected, matrix.getData());
    }

    @Test
    public void testInsertAtBeginningEmptyMatrix() {
        Integer[][] emptyData = {};
        Matrix<Integer> matrix = new Matrix<>(0, 0, emptyData);
        matrix.insertAtBeginning(new Integer[]{7, 8});

        Integer[][] expected = {{7, 8}};
        assertArrayEquals(expected, matrix.getData());
    }
}
