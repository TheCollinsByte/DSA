package com.thecollinsbyte.dsa;

public class Array<T> {

    public int[] declaration() {

        int intArrary[];
        char characterArray[];
        float floatArray[];

        return new int[]{1, 2, 3, 4};
    }

    public int[] initialization() {

        int intArrary[] = {1, 2, 3, 4, 5, 6, 7 , 8, 9, 10};
        char characterArray[] = {'A', 'B', 'C'};
        float floatArray[] = {3.4f, 1.2f, 3.8f};

        return new int[]{23, 32, 32};
    }

    public void traversal(T[] array) {
        System.err.println("Traversing the array: ");
        for (T element : array) {
            System.err.println(element + " ");
        }
        System.out.println();
    }

    public int[] insertion() {

        return new int[]{23, 19, 38};
    }

    public int[] deletion() {

        return new int[]{23, 19, 38};
    }

    public int[] searching() {

        return new int[]{23, 19, 38};
    }
}
