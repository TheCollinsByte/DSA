package com.thecollinsbyte.dsa;

import java.util.Arrays;

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

    public T[] insertion(T[] array, T element, int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Invalid Index");
        }

        T[] newArray = Arrays.copyOf(array, array.length + 1);

        for (int i = newArray.length - 1; i > index; i--) {
            newArray[i] = newArray[i - 1];
        }
        newArray[index] = element;

        System.out.println("After Insertion: " + Arrays.toString(newArray));
        return newArray;
    }

    public int[] deletion() {

        return new int[]{23, 19, 38};
    }

    public int[] searching() {

        return new int[]{23, 19, 38};
    }
}
