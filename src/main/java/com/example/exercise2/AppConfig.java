package com.example.exercise2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    
    @Bean(name = "iCharToNum")
    public ICharToNum createCharToNum() {
        return new CharToNum();
    }

    @Bean(name = "iMultiplyByTwo")
    public IMultiplyByTwo createMultiplyByTwo() {
        return new MultiplyByTwo();
    }

    @Bean(name = "iNumToChar")
    public INumToChar createNumToChar() {
        return new NumToChar();
    }

    @Bean(name = "iDivideByTwo")
    public IDivideByTwo createDivideByTwo() {
        return new DivideByTwo();
    }

    @Bean(name = "iFlow")
    public IFlow createFlow() {
        return new Flow(createCharToNum(), createMultiplyByTwo(), createNumToChar());
    }

    @Bean(name = "iFlowLooper")
    public IFlowLooper createFlowLooper() {
        return new FlowLooper(createFlow());
    }

    @Bean(name = "iDecryptFlow")
    public IDecryptFlow createDecryptFlow() {
        return new DecryptFlow(createCharToNum(), createDivideByTwo(), createNumToChar());
    }

    @Bean(name = "iDecryptFlowLooper")
    public IDecryptFlowLooper creatDecryptFlowLooper() {
        return new DecryptFlowLooper(createDecryptFlow());
    }
}