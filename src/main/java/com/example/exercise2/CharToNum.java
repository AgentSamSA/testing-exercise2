package com.example.exercise2;

public class CharToNum implements ICharToNum {
    public int getResult(String s) {
        if (s.toLowerCase() == "a") {
            return 1;
        }
        return 0;
    }
}
