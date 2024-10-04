package com.thecollinsbyte.dsa;

public class StringManipulator{

    private String value;

    public StringManipulator(String value) {
        this.value = value;
    }

    public int length() {
        return value.length();
    }

    public char charAt(int index) {
        return value.charAt(index);
    }

    public StringManipulator substring(int start, int end) {
        String substringValue = value.substring(start, end);
        return new StringManipulator(substringValue);
    }

    @Override
    public String toString() {
        return value;
    }
}
