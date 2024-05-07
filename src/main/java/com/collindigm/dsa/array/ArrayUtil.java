package com.collindigm.dsa.array;

public class ArrayUtil {
    public void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int[] removeEven(int[] arr) {
        int oddCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddCount++;
            }
        }

        int[] result = new int[oddCount];
        int oddIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[oddIndex] = arr[i];
                oddIndex++;
            }
        }

        return result;
    }

    // [2, 3, 4, 5, 6, 7]
    // [7, 6, 5, 4, 3, 2]
    public void reverseArray(int[] numbers, int startIndex, int lastIndex) {
        while (startIndex < lastIndex) {
            int temp = numbers[startIndex];
            numbers[startIndex] = numbers[lastIndex];
            numbers[lastIndex] = temp;
            startIndex++;
            lastIndex--;
        }
    }


    public int findMinimum(int[] arr) {
        // edge
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid Input");
        }

        int minimumValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minimumValue) {
                minimumValue = arr[i];
            }
        }

        return minimumValue;
    }

    public int findSecondMaximumValue(int[] arr) {
        int secondMaximumValue = Integer.MIN_VALUE;
        int maximumValue = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maximumValue) {
                secondMaximumValue = maximumValue;
                maximumValue = arr[i];
            } else if (arr[i] > secondMaximumValue && arr[i] != maximumValue){
                secondMaximumValue = arr[i];
            }
        }

        return secondMaximumValue;
    }

    public void moveZeros(int[] arr, int lengthOfArray) {
        int j = 0;  // Focus on zeroth elements
        for(int i = 0; i < lengthOfArray; i++) {    // i will focus on non-zero elements
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0) {
                j++;
            }
        }
    }

    public int[] resize(int[] arr, int capacity) {
        int[] temp = new int[capacity];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }

    // Sum of N natural numbers: n(n + 1) / 2
    public int findMissingNumber(int[] arr) {
        int size = arr.length + 1;  // 1 is for the missing number
        int sum = size * (size + 1) / 2;
        for(int i = 0; i < arr.length; i++) {
            sum = sum - arr[i];
        }
        return sum;
    }

    public boolean isPalindrome(String word) {
        word = word.toLowerCase();
        char[] wordCharArray = word.toCharArray();

        int start = 0;
        int end = wordCharArray.length - 1;

        while (start < end) {
            if (wordCharArray[start] == wordCharArray[end]) {
                start++;
                end--;
                continue;
            }
            return false;
        }
        return true;
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
