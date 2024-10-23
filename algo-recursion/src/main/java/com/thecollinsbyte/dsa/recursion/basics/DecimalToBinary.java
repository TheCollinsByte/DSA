package com.thecollinsbyte.dsa.recursion.basics;

public class DecimalToBinary {
    public String findBinary(int decimal, String result) {
        if(decimal == 0) {
            return result;
        }

        result = decimal % 2 + result;
        return findBinary(decimal / 2, result);
    }
}
