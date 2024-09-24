package com.thecollinsbyte.dsa;

import com.thecollinsbyte.dsa.Array;

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
    public void traversal() {
        Integer[] intArray = {1, 2, 3, 4};
        Assertions.assertDoesNotThrow(() -> intArrayOps.traversal(intArray));

        String[] strArray = {"Apple", "Mango", "Juice"};
        Assertions.assertDoesNotThrow(() -> strArrayOps.traversal(strArray));
    }

    @Test
    public void insertion() {
    }

    @Test
    public void deletion() {
    }

    @Test
    public void searching() {
    }
}
