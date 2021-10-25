package com.example.exercise2;

import org.junit.Test;

public class OutputTests {
    @Test
    public void givenAGetB() {
        
    }
}

// Given: I need to encrypt a message
// when: the message is encrypted
// then: each letter is shifted down the alphabet by double the number of that letter in the alphabet(abc would become bdf).
// and: if the letter would be shifted past the last letter in the alphabet, then it loops around again starting at the beginning
// and: if the letter does not get looped around again it should be lower case
// and: if the letter does get looped it should be upper case

// no upper bound on size
// all letters should be treated as lower case
// non chars left as is
// any string is acceptable