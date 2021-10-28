package com.example.exercise2;

import static org.junit.Assert.assertEquals;

import com.example.exercise2.Divide.DivideByTwo;
import com.example.exercise2.Divide.IDivideByTwo;

import org.junit.Test;

public class DivideByTwoTests {
    
    @Test
    public void givenTwoGetOne() {
        //Given: I am a user
        //When: I have the number 2
        IDivideByTwo IDBT = new DivideByTwo();
        int result = IDBT.getResult(2);
        //Then: I get the number 1
        assertEquals(1, result);
    }

    @Test
    public void givenFourGetTwo() {
        //Given: I am a user
        //When: I have the number 4
        IDivideByTwo IDBT = new DivideByTwo();
        int result = IDBT.getResult(4);
        //Then: I get the number 2
        assertEquals(2, result);
    }

    @Test
    public void givenSixGetThree() {
        //Given: I am a user
        //When: I have the number 6
        IDivideByTwo IDBT = new DivideByTwo();
        int result = IDBT.getResult(6);
        //Then: I get the number 3
        assertEquals(3, result);
    }
}
