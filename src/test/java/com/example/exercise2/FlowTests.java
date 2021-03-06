package com.example.exercise2;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import com.example.exercise2.CharToNum.CharToNum;
import com.example.exercise2.CharToNum.SpaceToNum;
import com.example.exercise2.CharToNum.SpecialCharToNum;
import com.example.exercise2.CharToNum.TenMinusNum;
import com.example.exercise2.Divide.DivideByTwo;
import com.example.exercise2.Flow.Flow;
import com.example.exercise2.Flow.FlowLooper;
import com.example.exercise2.Flow.IFlow;
import com.example.exercise2.Flow.IFlowLooper;
import com.example.exercise2.Multiply.MultiplyByTwo;
import com.example.exercise2.NumToChar.NumToChar;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class FlowTests {
    @InjectMocks

    @Mock
    CharToNum mockCharToNum = mock(CharToNum.class);

    @Mock
    SpaceToNum mockSpaceToNum = mock(SpaceToNum.class);

    @Mock
    TenMinusNum mockTenMinusNum = mock(TenMinusNum.class);
    
    @Mock
    SpecialCharToNum mockSpecialCharToNum = mock(SpecialCharToNum.class);

    @Mock
    MultiplyByTwo mockMultiplyByTwo = mock(MultiplyByTwo.class);

    @Mock
    NumToChar mockNumToChar = mock(NumToChar.class);

    @Mock
    DivideByTwo mockDivideByTwo = mock(DivideByTwo.class);

    @Mock
    Flow mockFlow = mock(Flow.class);

    @Test
    public void givenLowercaseACallCharToNumOnce() {
        //Given: I am a user
        given(mockCharToNum.getResult("a")).willReturn(1);
        given(mockMultiplyByTwo.getResult(1)).willReturn(2);
        given(mockNumToChar.getResult(2)).willReturn("b");
        //When I enter the lowercase string "a"
        IFlow IF = new Flow(mockCharToNum, mockSpaceToNum, mockTenMinusNum, mockSpecialCharToNum, mockMultiplyByTwo, mockNumToChar);
        IF.getResult("a");
        //Then: CharToNum will be called one time
        verify(mockCharToNum, times(1)).getResult("a");
    }

    @Test
    public void givenLowercaseACallMultiplyByTwoOnce() {
        //Given: I am a user
        given(mockCharToNum.getResult("a")).willReturn(1);
        given(mockMultiplyByTwo.getResult(1)).willReturn(2);
        given(mockNumToChar.getResult(2)).willReturn("b");
        //When I enter the lowercase string "a"
        IFlow IF = new Flow(mockCharToNum, mockSpaceToNum, mockTenMinusNum, mockSpecialCharToNum, mockMultiplyByTwo, mockNumToChar);
        IF.getResult("a");
        //Then: MultiplyByTwo will be called one time
        verify(mockMultiplyByTwo, times(1)).getResult(1);
    }

    @Test
    public void givenLowercaseACallNumToStringOnce() {
        //Given: I am a user
        given(mockCharToNum.getResult("a")).willReturn(1);
        given(mockMultiplyByTwo.getResult(1)).willReturn(2);
        given(mockNumToChar.getResult(2)).willReturn("b");
        //When I enter the lowercase string "a"
        IFlow IF = new Flow(mockCharToNum, mockSpaceToNum, mockTenMinusNum, mockSpecialCharToNum, mockMultiplyByTwo, mockNumToChar);
        IF.getResult("a");
        //Then: NumToChar will be called one time
        verify(mockNumToChar, times(1)).getResult(2);
    }

    @Test
    public void givenLowercaseZCallCharToNumOnce() {
        //Given: I am a user
        given(mockCharToNum.getResult("z")).willReturn(26);
        given(mockMultiplyByTwo.getResult(26)).willReturn(52);
        given(mockNumToChar.getResult(52)).willReturn("Z");
        //When I enter the lowercase string "z"
        IFlow IF = new Flow(mockCharToNum, mockSpaceToNum, mockTenMinusNum, mockSpecialCharToNum, mockMultiplyByTwo, mockNumToChar);
        IF.getResult("z");
        //Then: CharToNum will be called one time
        verify(mockCharToNum, times(1)).getResult("z");
    }

    @Test
    public void givenLowercaseZCallMultiplyByTwoOnce() {
        //Given: I am a user
        given(mockCharToNum.getResult("z")).willReturn(26);
        given(mockMultiplyByTwo.getResult(26)).willReturn(52);
        given(mockNumToChar.getResult(52)).willReturn("Z");
        //When I enter the lowercase string "z"
        IFlow IF = new Flow(mockCharToNum, mockSpaceToNum, mockTenMinusNum, mockSpecialCharToNum, mockMultiplyByTwo, mockNumToChar);
        IF.getResult("z");
        //Then: MultiplyByTwo will be called one time
        verify(mockMultiplyByTwo, times(1)).getResult(26);
    }

    @Test
    public void givenLowercaseZCallNumToStringOnce() {
        //Given: I am a user
        given(mockCharToNum.getResult("z")).willReturn(26);
        given(mockMultiplyByTwo.getResult(26)).willReturn(52);
        given(mockNumToChar.getResult(52)).willReturn("Z");
        //When I enter the lowercase string "z"
        IFlow IF = new Flow(mockCharToNum, mockSpaceToNum, mockTenMinusNum, mockSpecialCharToNum, mockMultiplyByTwo, mockNumToChar);
        IF.getResult("z");
        //Then: NumToChar will be called one time
        verify(mockNumToChar, times(1)).getResult(52);
    }

    @Test
    public void givenUppercaseACallCharToNumOnce() {
        //Given: I am a user
        given(mockCharToNum.getResult("A")).willReturn(1);
        given(mockMultiplyByTwo.getResult(1)).willReturn(2);
        given(mockNumToChar.getResult(2)).willReturn("b");
        //When I enter the uppercase string "A"
        IFlow IF = new Flow(mockCharToNum, mockSpaceToNum, mockTenMinusNum, mockSpecialCharToNum, mockMultiplyByTwo, mockNumToChar);
        IF.getResult("A");
        //Then: CharToNum will be called one time
        verify(mockCharToNum, times(1)).getResult("A");
    }

    @Test
    public void givenUppercaseACallMultiplyByTwoOnce() {
        //Given: I am a user
        given(mockCharToNum.getResult("A")).willReturn(1);
        given(mockMultiplyByTwo.getResult(1)).willReturn(2);
        given(mockNumToChar.getResult(2)).willReturn("b");
        //When I enter the uppercase string "A"
        IFlow IF = new Flow(mockCharToNum, mockSpaceToNum, mockTenMinusNum, mockSpecialCharToNum, mockMultiplyByTwo, mockNumToChar);
        IF.getResult("A");
        //Then: MultiplyByTwo will be called one time
        verify(mockMultiplyByTwo, times(1)).getResult(1);
    }

    @Test
    public void givenUppercaseACallNumToStringOnce() {
        //Given: I am a user
        given(mockCharToNum.getResult("A")).willReturn(1);
        given(mockMultiplyByTwo.getResult(1)).willReturn(2);
        given(mockNumToChar.getResult(2)).willReturn("b");
        //When I enter the uppercase string "A"
        IFlow IF = new Flow(mockCharToNum, mockSpaceToNum, mockTenMinusNum, mockSpecialCharToNum, mockMultiplyByTwo, mockNumToChar);
        IF.getResult("A");
        //Then: NumToChar will be called one time
        verify(mockNumToChar, times(1)).getResult(2);
    }

    @Test
    public void givenUppercaseZCallCharToNumOnce() {
        //Given: I am a user
        given(mockCharToNum.getResult("Z")).willReturn(26);
        given(mockMultiplyByTwo.getResult(26)).willReturn(52);
        given(mockNumToChar.getResult(52)).willReturn("Z");
        //When I enter the uppercase string "Z"
        IFlow IF = new Flow(mockCharToNum, mockSpaceToNum, mockTenMinusNum, mockSpecialCharToNum, mockMultiplyByTwo, mockNumToChar);
        IF.getResult("Z");
        //Then: CharToNum will be called one time
        verify(mockCharToNum, times(1)).getResult("Z");
    }

    @Test
    public void givenUppercaseZCallMultiplyByTwoOnce() {
        //Given: I am a user
        given(mockCharToNum.getResult("Z")).willReturn(26);
        given(mockMultiplyByTwo.getResult(26)).willReturn(52);
        given(mockNumToChar.getResult(52)).willReturn("Z");
        //When I enter the uppercase string "Z"
        IFlow IF = new Flow(mockCharToNum, mockSpaceToNum, mockTenMinusNum, mockSpecialCharToNum, mockMultiplyByTwo, mockNumToChar);
        IF.getResult("Z");
        //Then: MultiplyByTwo will be called one time
        verify(mockMultiplyByTwo, times(1)).getResult(26);
    }

    @Test
    public void givenUppercaseZCallNumToStringOnce() {
        //Given: I am a user
        given(mockCharToNum.getResult("Z")).willReturn(26);
        given(mockMultiplyByTwo.getResult(26)).willReturn(52);
        given(mockNumToChar.getResult(52)).willReturn("Z");
        //When I enter the uppercase string "Z"
        IFlow IF = new Flow(mockCharToNum, mockSpaceToNum, mockTenMinusNum, mockSpecialCharToNum, mockMultiplyByTwo, mockNumToChar);
        IF.getResult("Z");
        //Then: NumToChar will be called one time
        verify(mockNumToChar, times(1)).getResult(52);
    }

    @Test
    public void givenExclamationPointCallSpecialCharToNumOnce() {
        //Given I am a user
        given(mockSpecialCharToNum.getResult("!")).willReturn(-1);
        given(mockMultiplyByTwo.getResult(-1)).willReturn(-2);
        given(mockNumToChar.getResult(-2)).willReturn("");
        //When I enter the string "!"
        IFlow IF = new Flow(mockCharToNum, mockSpaceToNum, mockTenMinusNum, mockSpecialCharToNum, mockMultiplyByTwo, mockNumToChar);
        IF.getResult("!");
        //Then: SpecialCharToNum will be called one time
        verify(mockSpecialCharToNum, times(1)).getResult("!");
    }

    @Test
    public void givenExclamationPointCallMultiplyByTwoZeroTimes() {
        //Given I am a user
        given(mockSpecialCharToNum.getResult("!")).willReturn(-1);
        given(mockMultiplyByTwo.getResult(-1)).willReturn(-2);
        given(mockNumToChar.getResult(-2)).willReturn("");
        //When I enter the string "!"
        IFlow IF = new Flow(mockCharToNum, mockSpaceToNum, mockTenMinusNum, mockSpecialCharToNum, mockMultiplyByTwo, mockNumToChar);
        IF.getResult("!");
        //Then: MultiplyByTwo will be called zero times
        verify(mockMultiplyByTwo, times(0)).getResult(-1);
    }

    @Test
    public void givenExclamationPointCallNumToCharZeroTimes() {
        //Given I am a user
        given(mockSpecialCharToNum.getResult("!")).willReturn(-1);
        given(mockMultiplyByTwo.getResult(-1)).willReturn(-2);
        given(mockNumToChar.getResult(-2)).willReturn("");
        //When I enter the string "!"
        IFlow IF = new Flow(mockCharToNum, mockSpaceToNum, mockTenMinusNum, mockSpecialCharToNum, mockMultiplyByTwo, mockNumToChar);
        IF.getResult("!");
        //Then: NumToChar will be called zero times
        verify(mockNumToChar, times(0)).getResult(-2);
    }

    @Test
    public void givenABCToEncryptCallFlowThreeTimes() {
        //Given: I am a user
        given(mockFlow.getResult("a")).willReturn("b");
        given(mockFlow.getResult("b")).willReturn("d");
        given(mockFlow.getResult("c")).willReturn("f");
        //When: I enter the string "abc" to be encrypted
        IFlowLooper IFL = new FlowLooper(mockFlow);
        IFL.getResult("abc");
        //Then: Flow will be called 3 times total
        verify(mockFlow, times(1)).getResult("a");
        verify(mockFlow, times(1)).getResult("b");
        verify(mockFlow, times(1)).getResult("c");
    }
}
