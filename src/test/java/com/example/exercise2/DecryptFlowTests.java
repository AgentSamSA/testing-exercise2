package com.example.exercise2;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import com.example.exercise2.CharToNum.CharToNum;
import com.example.exercise2.CharToNum.SpaceToNum;
import com.example.exercise2.CharToNum.SpecialCharToNum;
import com.example.exercise2.CharToNum.TenMinusNum;
import com.example.exercise2.CharToNum.UppercaseCharToNum;
import com.example.exercise2.Divide.DivideByTwo;
import com.example.exercise2.Flow.DecryptFlow;
import com.example.exercise2.Flow.IDecryptFlow;
import com.example.exercise2.NumToChar.NumToChar;

import org.junit.Test;
import org.mockito.Mock;

public class DecryptFlowTests {
    
    @Mock
    CharToNum mockCharToNum = mock(CharToNum.class);

    @Mock
    SpaceToNum mockSpaceToNum = mock(SpaceToNum.class);

    @Mock
    TenMinusNum mockTenMinusNum = mock(TenMinusNum.class);
    
    @Mock
    SpecialCharToNum mockSpecialCharToNum = mock(SpecialCharToNum.class);

    @Mock
    UppercaseCharToNum mockUppercaseCharToNum = mock(UppercaseCharToNum.class);

    @Mock
    DivideByTwo mockDivideByTwo = mock(DivideByTwo.class);

    @Mock
    NumToChar mockNumToChar = mock(NumToChar.class);

    @Mock
    DecryptFlow mockDecryptFlow = mock(DecryptFlow.class);
    
    @Test
    public void givenBCallCharToNumOnce() {
        //Given: I am a user
        given(mockCharToNum.getResult("b")).willReturn(2);
        given(mockDivideByTwo.getResult(2)).willReturn(1);
        given(mockNumToChar.getResult(1)).willReturn("a");
        //When: I have the letter "b"
        IDecryptFlow IDF = new DecryptFlow(mockCharToNum, mockUppercaseCharToNum, mockTenMinusNum, mockSpecialCharToNum, mockDivideByTwo, mockNumToChar);
        IDF.getResult("b");
        //Then: CharToNum will be called one time
        verify(mockCharToNum, times(1)).getResult("b");
    }

    @Test
    public void givenBCallDivideByTwoOnce() {
        //Given: I am a user
        given(mockCharToNum.getResult("b")).willReturn(2);
        given(mockDivideByTwo.getResult(2)).willReturn(1);
        given(mockNumToChar.getResult(1)).willReturn("a");
        //When: I have the letter "b"
        IDecryptFlow IDF = new DecryptFlow(mockCharToNum, mockUppercaseCharToNum, mockTenMinusNum, mockSpecialCharToNum, mockDivideByTwo, mockNumToChar);
        IDF.getResult("b");
        //Then: DivideByTwo will be called one time
        verify(mockDivideByTwo, times(1)).getResult(2);
    }

    @Test
    public void givenBCallNumToCharOnce() {
        //Given: I am a user
        given(mockCharToNum.getResult("b")).willReturn(2);
        given(mockDivideByTwo.getResult(2)).willReturn(1);
        given(mockNumToChar.getResult(1)).willReturn("a");
        //When: I have the letter "b"
        IDecryptFlow IDF = new DecryptFlow(mockCharToNum, mockUppercaseCharToNum, mockTenMinusNum, mockSpecialCharToNum, mockDivideByTwo, mockNumToChar);
        IDF.getResult("b");
        //Then: NumToChar will be called one time
        verify(mockNumToChar, times(1)).getResult(1);
    }

    @Test
    public void givenUppercaseACallUppercaseCharToNumOnce() {
        //Given: I am a user
        given(mockUppercaseCharToNum.getResult("A")).willReturn(27);
        given(mockDivideByTwo.getResult(27)).willReturn(-1);
        given(mockNumToChar.getResult(-1)).willReturn("");
        //When: I have the letter "A"
        IDecryptFlow IDF = new DecryptFlow(mockCharToNum, mockUppercaseCharToNum, mockTenMinusNum, mockSpecialCharToNum, mockDivideByTwo, mockNumToChar);
        IDF.getResult("A");
        //Then: UppercaseCharToNum will be called one time
        verify(mockUppercaseCharToNum, times(1)).getResult("A");
    }

    @Test
    public void givenUppercaseACallDivideByTwoOnce() {
        //Given: I am a user
        given(mockUppercaseCharToNum.getResult("A")).willReturn(27);
        given(mockDivideByTwo.getResult(27)).willReturn(-1);
        given(mockNumToChar.getResult(-1)).willReturn("");
        //When: I have the letter "A"
        IDecryptFlow IDF = new DecryptFlow(mockCharToNum, mockUppercaseCharToNum, mockTenMinusNum, mockSpecialCharToNum, mockDivideByTwo, mockNumToChar);
        IDF.getResult("A");
        //Then: DivideByTwo will be called one time
        verify(mockDivideByTwo, times(1)).getResult(27);
    }

    @Test
    public void givenUppercaseACallNumToCharZeroTimes() {
        //Given: I am a user
        given(mockUppercaseCharToNum.getResult("A")).willReturn(27);
        given(mockDivideByTwo.getResult(27)).willReturn(-1);
        given(mockNumToChar.getResult(-1)).willReturn("");
        //When: I have the letter "A"
        IDecryptFlow IDF = new DecryptFlow(mockCharToNum, mockUppercaseCharToNum, mockTenMinusNum, mockSpecialCharToNum, mockDivideByTwo, mockNumToChar);
        IDF.getResult("A");
        //Then: NumToChar will be called one time
        verify(mockNumToChar, times(0)).getResult(-1);
    }
    
    // @Test
    // public void givenBDFToDecryptCallDecryptFlowThreeTimes() {
    //     //Given: I am a user
    //     given(mockDecryptFlow.getResult("b")).willReturn("a");
    //     given(mockDecryptFlow.getResult("d")).willReturn("b");
    //     given(mockDecryptFlow.getResult("f")).willReturn("c");
    //     //When: I enter the string "abc" to be encrypted
    //     IDecryptFlowLooper IDFL = new DecryptFlowLooper(mockDecryptFlow);
    //     IDFL.getResult("bdf");
    //     //Then: DecryptFlow will be called 3 times total
    //     verify(mockDecryptFlow, times(1)).getResult("b");
    //     verify(mockDecryptFlow, times(1)).getResult("d");
    //     verify(mockDecryptFlow, times(1)).getResult("f");
    // }
}
