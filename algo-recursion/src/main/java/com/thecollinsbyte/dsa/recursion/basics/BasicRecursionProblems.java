package com.thecollinsbyte.dsa.recursion.basics;

import java.util.ArrayList;
import java.util.List;

public class BasicRecursionProblems {

    private List<Integer> result = new ArrayList<>();

    public List<Integer> getNumbersUpToN(int number) {
        if(number > 0) {
            getNumbersUpToN(number - 1);
            result.add(number);
        }
        return result;
    }
}
