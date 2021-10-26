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
        String result = "";
        String numbers = "0123456789";

        for (int i = 0; i < s.length(); i++) {
            String character = String.valueOf(s.charAt(i));
            int num = _ICTN.getResult(character);

            if (num != -1) {
                if (character.equals(" ")) {
                    result += _INTC.getResult(num);
                } else if (numbers.contains(character)) {
                    result += num;
                } else {
                    int doubledNum = _IMBT.getResult(num);
                    result += _INTC.getResult(doubledNum);
                }
            } else {
                result += character;
            }
        }
        return result;
    }
}
