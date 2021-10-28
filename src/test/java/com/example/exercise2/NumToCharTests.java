package com.example.exercise2;

import static org.junit.Assert.assertEquals;

import com.example.exercise2.NumToChar.INumToChar;
import com.example.exercise2.NumToChar.NumToChar;

import org.junit.Test;

public class NumToCharTests {
    
    @Test
    public void givenOneGetLowercaseA() {
        //Given: I am a user
        //When: I enter the number 1
        INumToChar INTC = new NumToChar();
        String result = INTC.getResult(1);
        //Then: I get a lowercase letter "a"
        assertEquals("a", result);
    }

    @Test
    public void givenTwoGetLowercaseB() {
        //Given: I am a user
        //When: I enter the number 2
        INumToChar INTC = new NumToChar();
        String result = INTC.getResult(2);
        //Then: I get a lowercase letter "b"
        assertEquals("b", result);
    }

    @Test
    public void givenTwentySixGetLowercaseZ() {
        //Given: I am a user
        //When: I enter the number 26
        INumToChar INTC = new NumToChar();
        String result = INTC.getResult(26);
        //Then: I get a lowercase letter "z"
        assertEquals("z", result);
    }

    @Test
    public void givenTwentySevenGetUppercaseA() {
        //Given: I am a user
        //When: I enter the number 27
        INumToChar INTC = new NumToChar();
        String result = INTC.getResult(27);
        //Then: I get a uppercase letter "A"
        assertEquals("A", result);
    }

    @Test
    public void givenFiftyTwoGetUppercaseZ() {
        //Given: I am a user
        //When: I enter the number 52
        INumToChar INTC = new NumToChar();
        String result = INTC.getResult(52);
        //Then: I get a uppercase letter "A"
        assertEquals("Z", result);
    }
}
