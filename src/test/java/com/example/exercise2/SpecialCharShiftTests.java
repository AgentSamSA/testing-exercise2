package com.example.exercise2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.exercise2.SpecialCharacterShift.ISpecialCharacterShift;
import com.example.exercise2.SpecialCharacterShift.SpecialCharacterShift;

import org.junit.Test;

public class SpecialCharShiftTests {
    
    @Test
    public void givenExclamationPointGetAtSymbol() {
        //Given: I am a user
        //When: I have the special character "!"
        ISpecialCharacterShift ISCS = new SpecialCharacterShift();
        String result = ISCS.getResult("!");
        //Then: I will get the special character "@"
        assertEquals("@", result);
    }

    @Test
    public void givenAtSymbolGetPoundSign() {
        //Given: I am a user
        //When: I have the special character "@"
        ISpecialCharacterShift ISCS = new SpecialCharacterShift();
        String result = ISCS.getResult("@");
        //Then: I will get the special character "#"
        assertEquals("#", result);
    }

    @Test
    public void givenUnderscoreReturnPlusSign() {
        //Given: I am a user
        //When: I have the special character "_"
        ISpecialCharacterShift ISCS = new SpecialCharacterShift();
        String result = ISCS.getResult("_");
        //Then: I will get the special character "+"
        assertEquals("+", result);
    }

    @Test
    public void givenEqualsSignReturnBacktick() {
        //Given: I am a user
        //When: I have the special character "="
        ISpecialCharacterShift ISCS = new SpecialCharacterShift();
        String result = ISCS.getResult("=");
        //Then: I will get the special character "`"
        assertEquals("`", result);
    }
}
