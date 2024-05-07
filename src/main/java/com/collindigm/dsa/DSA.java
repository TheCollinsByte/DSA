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

        int[] even = arrayUtil.removeEven(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        arrayUtil.printArray(even); // 1, 3, 5, 7, 9
    }
}
