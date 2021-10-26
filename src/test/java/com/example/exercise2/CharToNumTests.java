package com.example.exercise2;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class CharToNumTests {
    
    @Test
    public void givenAGetOne(){
        //Given: I am a user
        //When: I enter the letter "a"
        ICharToNum ICTN = new CharToNum();
        int result = ICTN.getResult("a");
        //Then: I get back the integer 1
        assertEquals(1, result);
    }

    @Test
    public void givenBGetTwo(){
        //Given: I am a user
        //When: I enter the letter "b"
        ICharToNum ICTN = new CharToNum();
        int result = ICTN.getResult("b");
        //Then: I get back the integer 2
        assertEquals(2, result);
    }

    @Test
    public void givenZGetTwentySix(){
        //Given: I am a user
        //When: I enter the letter "z"
        ICharToNum ICTN = new CharToNum();
        int result = ICTN.getResult("Z");
        //Then: I get back the integer 26
        assertEquals(26, result);
    }
    
    @Test
    public void givenPeriodGetNegativeOne(){
        //Given: I am a user
        //When: I enter the char "."
        ICharToNum ICTN = new CharToNum();
        int result = ICTN.getResult(".");
        //Then: I get back the integer -1
        assertEquals(-1, result);
    }

    @Test
    public void givenSpaceGetRandomNumberBetween27And51(){
        //Given: I am a user
        //When: I enter the char " "
        ICharToNum ICTN = new CharToNum();
        int result = ICTN.getResult(" ");
        //Then: I get back a random integer from 27 to 51
        Integer[] values = {27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51};
        boolean check = Arrays.asList(values).contains(result);
        assertEquals(true, check);
    }

    @Test
    public void givenOneGetNine() {
        //Given: I am a user
        //When: I enter the number 1
        ICharToNum ICTN = new CharToNum();
        int result = ICTN.getResult("1");
        //ThenL I get back the number 9
        assertEquals(9, result);
    }
}
