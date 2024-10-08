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

    public StringManipulator concatenate(StringManipulator string) {
        String concatenatedValue = this.value + string.value;
        return new StringManipulator(concatenatedValue);
    }

    public boolean equals(StringManipulator string) {
        return this.value.equals(string.value);
    }

    public int compareTo(StringManipulator string) {
        return this.value.compareTo(string.value);
    }

    public int indexOf(String substring) {
        return this.value.indexOf(substring);
    }

    public StringManipulator replace(String oldChar, String newChar) {
        String modifiedValue = this.value.replace(oldChar, newChar);
        return new StringManipulator(modifiedValue);
    }

    @Override
    public String toString() {
        return value;
    }
}
