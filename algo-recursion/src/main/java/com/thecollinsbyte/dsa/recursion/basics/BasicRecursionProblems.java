package com.thecollinsbyte.dsa.recursion.basics;

import java.util.ArrayList;
import java.util.List;

public class BasicRecursionProblems {


    public List<Integer> getNumbersUpToN(int number) {
        List<Integer> result = new ArrayList<>();
        if(number > 0) {
            result.addAll(getNumbersUpToN(number - 1));
            result.add(number);
        }
        return result;
    }

    public List<Integer> getNumbersDownToOne(int number) {
        List<Integer> result = new ArrayList<>();
        if(number > 0) {
            result.add(number);
            result.addAll(getNumbersDownToOne(number - 1));
        }
        return result;
    }

    public float findMean(int values[], int length) {
        if (length == 1)
            return (float) values[length - 1];
        else
            return ((float) (findMean(values, length - 1) * (length - 1) + values[length - 1]) / length );
    }
}
