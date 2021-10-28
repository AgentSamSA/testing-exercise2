package com.example.exercise2;

import static org.junit.Assert.assertEquals;

import com.example.exercise2.CharToNum.CharToNum;
import com.example.exercise2.CharToNum.ICharToNum;

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
        int result = ICTN.getResult("z");
        //Then: I get back the integer 26
        assertEquals(26, result);
    }

    @Test
    public void givenUppercaseAGetOne() {
        //Given: I am a user
        //When: I enter the letter "A"
        ICharToNum ICTN = new CharToNum();
        int result = ICTN.getResult("A");
        //Then: I get back the integer 1;
        assertEquals(1, result);
    }
    
    @Test
    public void givenUppercaseZGetTwentySix(){
        //Given: I am a user
        //When: I enter the letter "Z"
        ICharToNum ICTN = new CharToNum();
        int result = ICTN.getResult("Z");
        //Then: I get back the integer 26
        assertEquals(26, result);
    }
}
