package com.example.exercise2;

public class DecryptFlow implements IDecryptFlow {
    private ICharToNum _ICTN;
    private IDivideByTwo _IDBT;
    private INumToChar _INTC;

    DecryptFlow(ICharToNum ICTN, IDivideByTwo IDBT, INumToChar INTC) {
        _ICTN = ICTN;
        _IDBT = IDBT;
        _INTC = INTC;
    }

    public String getResult(String s) {
        String numbers = "0123456789";
        String alphabetUppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int num = _ICTN.getResult(s);

        if (alphabetUppercase.contains(s)) {
            num = _ICTN.getResult(s) + 26;
        }

        if (num != -1) {
            if (num % 2 != 0) {
                return " ";
            } else if (numbers.contains(s)) {
                return String.valueOf(num);
            } else {
                int halvedNum = _IDBT.getResult(num);
                return _INTC.getResult(halvedNum);
            }
        } else {
            return s;
        }
    }
}
