package com.example.exercise2.SpecialCharacterShift;

public class SpecialCharacterShift implements ISpecialCharacterShift {
    public String getResult(String s) {
        if (s.equals("!")) {
            return "@";
        } else if (s.equals("@")) {
            return "#";
        } else if (s.equals("_")) {
            return "+";
        } else {
            return "`";
        }
    }
}
