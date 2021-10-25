package com.example.exercise2;

public class NumToChar implements INumToChar {
    public String getResult(int num) {
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        return String.valueOf(alphabet.charAt(num - 1));
    }
}
