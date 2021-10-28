package com.example.exercise2.NumToChar;

public class NumToChar implements INumToChar {
    public String getResult(int num) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        if (num > 26) {
            num -= 26;
            return String.valueOf(alphabet.charAt(num - 1)).toUpperCase();
        } else {
            return String.valueOf(alphabet.charAt(num - 1));
        }
    }
}
