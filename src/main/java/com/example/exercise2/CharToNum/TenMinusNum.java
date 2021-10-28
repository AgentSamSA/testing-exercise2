package com.example.exercise2.CharToNum;

public class TenMinusNum implements ICharToNum {
    public int getResult(String s) {
        return (10 - Integer.parseInt(s)) % 10;
    }
}
