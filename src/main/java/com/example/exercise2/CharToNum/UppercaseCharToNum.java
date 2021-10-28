package com.example.exercise2.CharToNum;

public class UppercaseCharToNum implements ICharToNum {
    public int getResult(String s) {
        return s.toUpperCase().charAt(0) - 'A' + 27;
    }
}
