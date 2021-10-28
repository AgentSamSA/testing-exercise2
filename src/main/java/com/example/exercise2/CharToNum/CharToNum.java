package com.example.exercise2.CharToNum;

public class CharToNum implements ICharToNum {
    public int getResult(String s) {
        return s.toLowerCase().charAt(0) - 'a' + 1;
    }
}
