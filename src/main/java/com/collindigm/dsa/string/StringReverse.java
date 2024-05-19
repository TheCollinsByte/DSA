package com.collindigm.dsa.string;

import java.util.Stack;

public class StringReverse {
    public String reverse(String str) {
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();

        for(char c : chars) {
            stack.push(c);
        }

        for(int i = 0; i < str.length(); i++) {
            chars[i] = stack.pop();
        }

        return new String(chars);
    }
}
