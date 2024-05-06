package com.collindigm.dsa.array;

public class ArrayUtil {
    public void printArray(int[] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public void arrayDemo() {
        int[] myArray = new int[5];     // default values will be defined based on the data type
        myArray[0] = 5;
        myArray[1] = 1;
        myArray[2] = 8;
        myArray[3] = 2;
        myArray[4] = 10;
        printArray(myArray);
        System.out.println(myArray.length); // Length of an array
        System.out.println(myArray[myArray.length - 1]); // Access the last value in the Array
    }
}
