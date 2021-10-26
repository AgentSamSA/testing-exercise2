package com.example.exercise2;

import java.util.Random;

public class CharToNum implements ICharToNum {
    public int getResult(String s) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";

        if (alphabet.contains(s.toLowerCase())) {
            return alphabet.indexOf(s.toLowerCase()) + 1;
        } else if (s.equals(" ")) {
            Random r = new Random();
            int rand = r.nextInt(52 - 27) + 27;
            
            if (rand % 2 == 0) {
                rand--;
            }
            return rand;
        } else if (numbers.contains(s)) {
            return (10 - numbers.indexOf(s)) % 10;
        }
        return -1;
    }
}
