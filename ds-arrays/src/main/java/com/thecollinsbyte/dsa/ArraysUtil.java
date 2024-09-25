package com.thecollinsbyte.dsa;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysUtil<T> {

    public T[] declaration(Class<T> clazz, int size) {

        @SuppressWarnings("unchecked")
        T[] array = (T[]) Array.newInstance(clazz, size);

        return array;
    }

    public <T> T[] initialization(T... elements) {

        return elements;
    }

    public void traversal(T[] array) {
        System.out.println("Traversing the array: ");
        for (T element : array) {
            System.out.println(element + " ");
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

    public T[] deletion(T[] array, int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Invalid Index");
        }

        T[] newArray = Arrays.copyOf(array, array.length - 1);
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != index) {
                newArray[j++] = array[i];
            }
        }

        System.out.println("After Deletion: " + Arrays.toString(newArray));
        return newArray;
    }

    public <T> int searching(T[] array, T key) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                System.out.println("Element: " + key + " found at index: " + i);
                return i;
            }
        }

        System.out.println("Element: " + key + " not found.");
        return -1;
    }
}
