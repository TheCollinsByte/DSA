package com.thecollinsbyte.dsa;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArraysUtilTest {

    ArraysUtil<Integer> intArrayOps = new ArraysUtil<>();
    ArraysUtil<String> strArrayOps = new ArraysUtil<>();

    @Test
    public void declaration() {
        Integer[] intArray = intArrayOps.declaration(Integer.class, 5);
        String[] strArray = strArrayOps.declaration(String.class, 10);

        Assertions.assertEquals(intArray.length, 5);
        Assertions.assertEquals(strArray.length, 10);
    }

    @Test
    public void initialization() {
        Integer[] intArray = intArrayOps.initialization(1, 2, 3, 4, 5);
        Integer[] expected = {1, 2, 3, 4, 5};

        Assertions.assertArrayEquals(expected, intArray);
    }

    @Test
    public void testTraversal() {
        Integer[] intArray = {1, 2, 3, 4};
        Assertions.assertDoesNotThrow(() -> intArrayOps.traversal(intArray));

        String[] strArray = {"Apple", "Mango", "Juice"};
        Assertions.assertDoesNotThrow(() -> strArrayOps.traversal(strArray));
    }

    @Test
    public void testInsertion() {
        Integer[] intArray = {1, 2, 3, 4};
        Integer[] expectedArray = {1, 50, 2, 3, 4};
        Integer[] resultArray = intArrayOps.insertion(intArray, 50, 1);

        Assertions.assertArrayEquals(expectedArray, resultArray);
    }

    @Test
    public void testDeletion() {
        Integer[] intArray = {1, 2, 3, 4};
        Integer[] expectedArray = {1, 3, 4};
        Integer[] resultArray = intArrayOps.deletion(intArray, 1);

        Assertions.assertArrayEquals(expectedArray, resultArray);
    }

    @Test
    public void testSearching() {
        Integer[] intArray = {1, 2, 3, 4};
        int result = intArrayOps.searching(intArray, 3);

        Assertions.assertEquals(2, result);
    }
}
