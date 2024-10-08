package com.thecollinsbyte.dsa;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.ArrayList;

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

    @Test
    public void testInsertAtEnd() {
        Integer[][] data = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        Matrix<Integer> matrix = new Matrix<>(3, 3, data);
        matrix.insertAtEnd(new Integer[]{4, 4, 4});

        Integer[][] expected = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}, {4, 4, 4}};
        assertArrayEquals(expected, matrix.getData());
    }

    @Test
    public void testInsertAtEndEmptyMatrix() {
        Integer[][] data = {};
        Matrix<Integer> matrix = new Matrix<>(0, 0, data);
        matrix.insertAtEnd(new Integer[]{10, 20, 30});
        matrix.insertAtEnd(new Integer[]{40, 50, 60});

        Integer[][] expected = {{10, 20, 30}, {40, 50, 60}};
        assertArrayEquals(expected, matrix.getData());
    }

    @Test
    public void testInsertAtPosition() {
        Integer[][] data = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        Matrix<Integer> matrix = new Matrix<>(3, 3, data);
        matrix.insertAtPosition(1, new Integer[]{4, 4, 4});

        Integer[][] expected = {{4, 4, 4}, {1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        assertArrayEquals(expected, matrix.getData());
    }

    @Test
    public void testInsertAtPositionEmptyMatrix() {
        Integer[][] data = {};
        Matrix<Integer> matrix = new Matrix<>(0, 0, data);
        matrix.insertAtPosition(1, new Integer[]{10, 20, 30});

        Integer[][] expected = {{10, 20, 30}};
        assertArrayEquals(expected, matrix.getData());
    }

    @Test
    public void testTraverseRowWise() {
        Integer[][] data = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90},
        };
        Matrix<Integer> matrix = new Matrix<>(3, 3, data);
        List<Integer> result = new ArrayList<>();
        matrix.traverseRowWise((row, col, element) -> result.add(element));
        assertEquals(List.of(10, 20, 30, 40, 50, 60, 70, 80, 90), result);
    }

    @Test
    public void testTraverseColumnWise() {
        Integer[][] data = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90},
        };
        Matrix<Integer> matrix = new Matrix<>(3, 3, data);
        List<Integer> result = new ArrayList<>();
        matrix.traverseColumnWise((row, col, element) -> result.add(element));
        assertEquals(List.of(10, 40, 70, 20, 50, 80, 30, 60, 90), result);
    }
}
