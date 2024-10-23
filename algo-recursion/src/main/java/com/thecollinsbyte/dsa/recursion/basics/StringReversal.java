package com.thecollinsbyte.dsa.recursion.basics;

public class StringReversal {

    /**
     * Reverse a string using recursion
     * @param str The String to reverse
     * @return The reversed String
     */
    public String reverse(String str) {
        if(str == null ) return null;

        // Base case: empty string or single character
        if(str.equals("") || str.length() <= 1) {
            return str;
        }

        return reverse(str.substring(1)) + str.charAt(0);
    }
}
