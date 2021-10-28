package com.example.exercise2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.exercise2.CharToNum.ICharToNum;
import com.example.exercise2.CharToNum.UppercaseCharToNum;

import org.junit.Test;

public class UppercaseCharToNumTests {
    
    @Test
    public void givenAGetTwentySeven() {
        //Given: I am a user
        //When: I have the letter "A"
        ICharToNum ICTN = new UppercaseCharToNum();
        int result = ICTN.getResult("A");
        //Then: I will get back the number 27
        assertEquals(27, result);
    }

    @Test
    public void givenZGetFiftyTwo() {
        //Given: I am a user
        //When: I have the letter "Z"
        ICharToNum ICTN = new UppercaseCharToNum();
        int result = ICTN.getResult("Z");
        //Then: I will get back the number 52
        assertEquals(52, result);
    }
}
