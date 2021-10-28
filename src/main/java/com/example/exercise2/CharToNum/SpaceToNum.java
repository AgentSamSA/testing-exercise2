package com.example.exercise2.CharToNum;

import java.util.Random;

public class SpaceToNum implements ICharToNum {
    public int getResult(String s) {
        Random rand = new Random();
        return 26 + rand.nextInt(13) * 2 + 1;
    }
}
