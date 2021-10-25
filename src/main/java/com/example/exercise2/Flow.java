package com.example.exercise2;

public class Flow implements IFlow {
    private ICharToNum _ICTN;
    private IMultiplyByTwo _IMBT;
    private INumToChar _INTC;

    Flow(ICharToNum ICTN, IMultiplyByTwo IMBT, INumToChar INTC) {
        _ICTN = ICTN;
        _IMBT = IMBT;
        _INTC = INTC;
    }

    public String getResult(String s) {
        int num = _ICTN.getResult(s);
        if (num != -1) {
            int doubledNum = _IMBT.getResult(num);
            return _INTC.getResult(doubledNum);
        } else {
            return s;
        }
    }
}
