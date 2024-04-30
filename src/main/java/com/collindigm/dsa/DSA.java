package com.collindigm.dsa;

public class DSA {
    public static void main(String[] args){
        double now = System.currentTimeMillis();

        SumOfNumber sumOfNumber = new SumOfNumber();
        System.out.println(sumOfNumber.findSumByFormula(9999));

        System.out.println("Time taken - " + (System.currentTimeMillis() - now) + " milliseconds");
    }
}
