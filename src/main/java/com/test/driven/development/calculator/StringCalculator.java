package com.test.driven.development.calculator;

public class StringCalculator {

    private String[] expressions;

    public StringCalculator(String expressions) {
        this.expressions = new CalculatorUtil(expressions).split();
    }

    public int execute() {
        Integer base = new Integer(expressions[0]);
        for (int i = 1; i < expressions.length; i+=2) {
            base = OperandEnum.operation(expressions[i], base, new Integer(expressions[i+1]));
        }
        return base;
    }
}
