package com.collindigm.dsa;

public class SumOfNumber {

    public int findSumByFormula(int number) {
        return number * (number + 1) / 2;
    }

    public int findSumByLoop(int number) {
        int sum = 0;
        for (int i = 0; i < number; i++) {
            sum = sum + number;
        }
        return sum;
    }
}
