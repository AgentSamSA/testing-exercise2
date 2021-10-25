package com.example.exercise2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MultiplyByTwoTests {
    
    @Test
    public void givenOneGetTwo() {
        //Given: I am a user
        //When: I enter the number 1
        IMultiplyByTwo IMBT = new MultiplyByTwo();
        int result = IMBT.getResult(1);
        //Then: I get back the number 2
        assertEquals(2, result);
    }

    @Test
    public void givenTwoGetFour() {
        //Given: I am a user
        //When: I enter the number 2
        IMultiplyByTwo IMBT = new MultiplyByTwo();
        int result = IMBT.getResult(2);
        //Then: I get back the number 4
        assertEquals(4, result);
    }

    @Test
    public void givenThreeGetSix() {
        //Given: I am a user
        //When: I enter the number 3
        IMultiplyByTwo IMBT = new MultiplyByTwo();
        int result = IMBT.getResult(3);
        //Then: I get back the number 6
        assertEquals(6, result);
    }

    @Test
    public void givenTwentySixGetFiftyTwo() {
        //Given: I am a user
        //When: I enter the number 26
        IMultiplyByTwo IMBT = new MultiplyByTwo();
        int result = IMBT.getResult(26);
        //Then: I get back the number 52
        assertEquals(52, result);
    }
}
