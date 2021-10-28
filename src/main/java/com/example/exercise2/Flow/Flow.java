package com.example.exercise2.Flow;

import com.example.exercise2.CharToNum.ICharToNum;
import com.example.exercise2.Multiply.IMultiplyByTwo;
import com.example.exercise2.NumToChar.INumToChar;

public class Flow implements IFlow {
    private ICharToNum _CTN;
    private ICharToNum _STN;
    private ICharToNum _TMN;
    private ICharToNum _SCTN;
    private IMultiplyByTwo _MBT;
    private INumToChar _NTC;

    public Flow(ICharToNum CTN, ICharToNum STN, ICharToNum TMN, ICharToNum SCTN, IMultiplyByTwo MBT, INumToChar NTC) {
        _CTN = CTN;
        _STN = STN;
        _TMN = TMN;
        _SCTN = SCTN;
        _MBT = MBT;
        _NTC = NTC;
    }

    public String getResult(String s) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";

        if (alphabet.contains(s.toLowerCase())) {
            int num = _CTN.getResult(s);
            int doubledNum = _MBT.getResult(num);
            return _NTC.getResult(doubledNum);
        } else if (s.equals(" ")) {
            int spaceNum = _STN.getResult(s);
            return _NTC.getResult(spaceNum);
        } else if (numbers.contains(s)) {
            return String.valueOf(_TMN.getResult(s));
        } else {
            _SCTN.getResult(s);
            return s;
        }
    }
}