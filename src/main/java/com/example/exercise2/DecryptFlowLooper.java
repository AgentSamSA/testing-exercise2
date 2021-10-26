package com.example.exercise2;

public class DecryptFlowLooper implements IDecryptFlowLooper {
    private IDecryptFlow _IDF;

    DecryptFlowLooper(IDecryptFlow IDF) {
        _IDF = IDF;
    }

    public String getResult(String s) {
        String result = "";
        
        for (int i = 0; i < s.length(); i++) {
            result += _IDF.getResult(String.valueOf(s.charAt(i)));
        }
        return result;
    }
}
