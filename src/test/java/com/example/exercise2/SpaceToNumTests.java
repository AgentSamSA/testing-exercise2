package com.example.exercise2;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import com.example.exercise2.CharToNum.ICharToNum;
import com.example.exercise2.CharToNum.SpaceToNum;

import org.junit.Test;

public class SpaceToNumTests {
    
    @Test
    public void givenSpaceGetRandomNumberBetween27And51(){
        //Given: I am a user
        //When: I enter the char " "
        ICharToNum ICTN = new SpaceToNum();
        int result = ICTN.getResult(" ");
        //Then: I get back a random integer from 27 to 51
        Integer[] values = {27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51};
        boolean check = Arrays.asList(values).contains(result);
        assertEquals(true, check);
    }
}
