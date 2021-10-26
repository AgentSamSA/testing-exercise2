package com.example.exercise2;

public class DivideByTwo implements IDivideByTwo {
    public int getResult(int num) {
        if (num % 2 == 0) {
            return num / 2;
        }
        return -1;
    }
}
