package com.example.exercise2;

public class Flow implements IFlow {
    private ICharToNum _ICTN;
    private IMultiplyByTwo _IMBT;
    private INumToChar _INTC;

    public Flow(ICharToNum ICTN, IMultiplyByTwo IMBT, INumToChar INTC) {
        _ICTN = ICTN;
        _IMBT = IMBT;
        _INTC = INTC;
    }

    public String getResult(String s) {
        String numbers = "0123456789";
        int num = _ICTN.getResult(s);

        if (num != -1) {
            if (s.equals(" ")) {
                return _INTC.getResult(num);
            } else if (numbers.contains(s)) {
                return String.valueOf(num);
            } else {
                int doubledNum = _IMBT.getResult(num);
                return _INTC.getResult(doubledNum);
            }
        } else {
            return s;
        }
    }
}
