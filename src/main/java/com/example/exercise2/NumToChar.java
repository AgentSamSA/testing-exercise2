package com.example.exercise2;

public class NumToChar implements INumToChar {
    public String getResult(int num) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String result = "";
        if (num > 26) {
            num -= 26;
            result = String.valueOf(alphabet.charAt(num - 1)).toUpperCase();
        } else {
            result = String.valueOf(alphabet.charAt(num - 1));
        }
        return result;
    }
}
