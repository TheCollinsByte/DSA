package com.thecollinsbyte.dsa;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayTest {

    Array<Integer> intArrayOps = new Array<>();
    Array<String> strArrayOps = new Array<>();

    @Test
    public void declaration() {

        int intArrary[];
        char characterArray[];
        float floatArray[];
    }

    @Test
    public void initialization() {

        int intArrary[] = {1, 2, 3, 4, 5, 6, 7 , 8, 9, 10};
        char characterArray[] = {'A', 'B', 'C'};
        float floatArray[] = {3.4f, 1.2f, 3.8f};
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
