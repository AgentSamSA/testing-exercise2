package com.example.exercise2;

import static org.junit.Assert.assertEquals;

import com.example.exercise2.CharToNum.ICharToNum;
import com.example.exercise2.CharToNum.TenMinusNum;

import org.junit.Test;

public class TenMinusNumTests {
    
    @Test
    public void givenOneGetNine() {
        //Given: I am a user
        //When: I have the number 1
        ICharToNum ICTN = new TenMinusNum();
        int result = ICTN.getResult("1");
        //Then: I get back the number 9
        assertEquals(9, result);
    }

    @Test
    public void givenTwoGetEight() {
        //Given: I am a user
        //When: I have the number 2
        ICharToNum ICTN = new TenMinusNum();
        int result = ICTN.getResult("2");
        //Then: I get back the number 8
        assertEquals(8, result);
    }

    @Test
    public void givenZeroGetZero() {
        //Given: I am a user
        //When: I have the number 0
        ICharToNum ICTN = new TenMinusNum();
        int result = ICTN.getResult("0");
        //Then: I get back the number 0
        assertEquals(0, result);
    }
}
