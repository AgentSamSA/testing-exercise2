package com.example.exercise2;

import static org.junit.Assert.assertEquals;

import com.example.exercise2.CharToNum.ICharToNum;
import com.example.exercise2.CharToNum.SpecialCharToNum;

import org.junit.Test;

public class SpecialCharToNumTests {
    
    @Test
    public void givenPeriodGetNegativeOne() {
        //Given: I am a user
        //When: I enter the char "."
        ICharToNum ICTN = new SpecialCharToNum();
        int result = ICTN.getResult(".");
        //Then: I get back the integer -1
        assertEquals(-1, result);
    }

    @Test
    public void givenExclamationPointGetNegativeOne() {
        //Given: I am a user
        //When: I enter the char "!"
        ICharToNum ICTN = new SpecialCharToNum();
        int result = ICTN.getResult("!");
        //Then: I get back the integer -1
        assertEquals(-1, result);
    }
}
