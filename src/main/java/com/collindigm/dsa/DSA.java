package com.collindigm.dsa;

import com.collindigm.dsa.array.ArrayUtil;

public class DSA {
    public static void main(String[] args){
        double now = System.currentTimeMillis();

        SumOfNumber sumOfNumber = new SumOfNumber();
        System.out.println(sumOfNumber.findSumByFormula(9999));

        System.out.println("Time taken - " + (System.currentTimeMillis() - now) + " milliseconds");

        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.arrayDemo();

        int[] values = new int[]{-20, 1, 0, 2, 3, 0, 4, 6, 7, 8, 9, 10, 11};

        int[] odd = arrayUtil.removeEven(values);
        arrayUtil.printArray(odd); // 1, 3, 5, 7, 9

        arrayUtil.reverseArray(values, 0, values.length - 1);
        arrayUtil.printArray(values); // 10, 9, 8, 7, 6, 5, 4, 3, 2, 1

        int minimumValue = arrayUtil.findMinimum(values);
        System.out.println("Minimum Value: " + minimumValue);

        int secondMaximumValue = arrayUtil.findSecondMaximumValue(values);
        System.out.println("Second Maximum Value: " + secondMaximumValue);

        arrayUtil.moveZeros(values, values.length);
        arrayUtil.printArray(values); //

        System.out.println("The Size of original array - " + values.length);
        values = arrayUtil.resize(values, values.length * 2);
        System.out.println("The Size of original array after resize - " + values.length);

        int missingNumber = arrayUtil.findMissingNumber(new int[]{1, 2, 4, 5, 6, 7, 8});
        System.out.println("Missing number in array: " + missingNumber);

        if (arrayUtil.isPalindrome("madam")) {
            System.out.println("The string is palindrome !!!");
        } else {
            System.out.println("The string is not palindrome !!!");
        }
    }
}
