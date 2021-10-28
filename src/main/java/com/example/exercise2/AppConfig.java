package com.example.exercise2;

import com.example.exercise2.CharToNum.CharToNum;
import com.example.exercise2.CharToNum.ICharToNum;
import com.example.exercise2.CharToNum.SpaceToNum;
import com.example.exercise2.CharToNum.SpecialCharToNum;
import com.example.exercise2.CharToNum.TenMinusNum;
import com.example.exercise2.CharToNum.UppercaseCharToNum;
import com.example.exercise2.Divide.DivideByTwo;
import com.example.exercise2.Divide.IDivideByTwo;
import com.example.exercise2.Flow.DecryptFlow;
import com.example.exercise2.Flow.DecryptFlowLooper;
import com.example.exercise2.Flow.Flow;
import com.example.exercise2.Flow.FlowLooper;
import com.example.exercise2.Flow.IDecryptFlow;
import com.example.exercise2.Flow.IDecryptFlowLooper;
import com.example.exercise2.Flow.IFlow;
import com.example.exercise2.Flow.IFlowLooper;
import com.example.exercise2.Multiply.IMultiplyByTwo;
import com.example.exercise2.Multiply.MultiplyByTwo;
import com.example.exercise2.NumToChar.INumToChar;
import com.example.exercise2.NumToChar.NumToChar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    
    @Bean(name = "iCharToNum")
    public ICharToNum createCharToNum() {
        return new CharToNum();
    }

    @Bean(name = "iSpaceToNum")
    public ICharToNum createSpaceToNum() {
        return new SpaceToNum();
    }

    @Bean(name = "iTenMinusNum")
    public ICharToNum createTenMinusNum() {
        return new TenMinusNum();
    }

    @Bean(name = "iSpecialCharToNum")
    public ICharToNum createSpecialCharToNum() {
        return new SpecialCharToNum();
    }

    @Bean(name = "iMultiplyByTwo")
    public IMultiplyByTwo createMultiplyByTwo() {
        return new MultiplyByTwo();
    }

    @Bean(name = "iNumToChar")
    public INumToChar createNumToChar() {
        return new NumToChar();
    }

    @Bean(name = "iUppercaseCharToNum")
    public ICharToNum createUppercaseCharToNum() {
        return new UppercaseCharToNum();
    }

    @Bean(name = "iDivideByTwo")
    public IDivideByTwo createDivideByTwo() {
        return new DivideByTwo();
    }

    @Bean(name = "iFlow")
    public IFlow createFlow() {
        return new Flow(createCharToNum(), createSpaceToNum(), createTenMinusNum(), createSpecialCharToNum(), createMultiplyByTwo(), createNumToChar());
    }

    @Bean(name = "iFlowLooper")
    public IFlowLooper createFlowLooper() {
        return new FlowLooper(createFlow());
    }

    @Bean(name = "iDecryptFlow")
    public IDecryptFlow createDecryptFlow() {
        return new DecryptFlow(createCharToNum(), createUppercaseCharToNum(), createTenMinusNum(), createSpecialCharToNum(), createDivideByTwo(), createNumToChar());
    }

    @Bean(name = "iDecryptFlowLooper")
    public IDecryptFlowLooper creatDecryptFlowLooper() {
        return new DecryptFlowLooper(createDecryptFlow());
    }
}