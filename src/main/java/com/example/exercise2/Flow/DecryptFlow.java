package com.example.exercise2.Flow;

import com.example.exercise2.CharToNum.ICharToNum;
import com.example.exercise2.Divide.IDivideByTwo;
import com.example.exercise2.NumToChar.INumToChar;

public class DecryptFlow implements IDecryptFlow {
    private ICharToNum _CTN;
    private ICharToNum _UCTN;
    private ICharToNum _TMN;
    private ICharToNum _SCTN;
    private IDivideByTwo _DBT;
    private INumToChar _NTC;

    public DecryptFlow(ICharToNum CTN, ICharToNum UCTN, ICharToNum TMN, ICharToNum SCTN, IDivideByTwo DBT, INumToChar NTC) {
        _CTN = CTN;
        _UCTN = UCTN;
        _TMN = TMN;
        _SCTN = SCTN;
        _DBT = DBT;
        _NTC = NTC;
    }

    public String getResult(String s) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String alphabetUppercase = alphabet.toUpperCase();
        String numbers = "0123456789";

        if (alphabetUppercase.contains(s)) {
            int num = _UCTN.getResult(s);
            int halvedNum = _DBT.getResult(num);
            if (halvedNum == -1) {
                return " ";
            } else {
                return _NTC.getResult(halvedNum);
            }
        } else if (alphabet.contains(s)) {
            int num = _CTN.getResult(s);
            int halvedNum = _DBT.getResult(num);
            return _NTC.getResult(halvedNum);
        } else if (numbers.contains(s)) {
            return String.valueOf(_TMN.getResult(s));
        } else {
            _SCTN.getResult(s);
            return s;
        }
    }
}
