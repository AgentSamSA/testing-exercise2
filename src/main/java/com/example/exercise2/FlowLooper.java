package com.example.exercise2;

public class FlowLooper implements IFlowLooper {
    private IFlow _IF;

    FlowLooper(IFlow IF) {
        _IF = IF;
    }

    public String getResult(String s) {
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            result += _IF.getResult(String.valueOf(s.charAt(i)));
        }
        return result;
    }
}
