package com.example.exercise2;

public class CharToNum implements ICharToNum {
    public int getResult(String s) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        // if (s.equalsIgnoreCase("a")) {
        //     return 1;
        // }
        // if (s.equalsIgnoreCase("b")) {
        //     return 2;
        // }
        // if (s.equalsIgnoreCase("z")) {
        //     return 26;
        // }
        if (alphabet.contains(s.toLowerCase())) {
            return alphabet.indexOf(s.toLowerCase()) + 1;
        } else {
            return -1;
        }
    }
}
