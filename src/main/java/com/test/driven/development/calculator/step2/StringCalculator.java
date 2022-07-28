package com.test.driven.development.calculator.step2;

public class StringCalculator {

    private Expressions expressions;

    private Orders orders;

    public StringCalculator(String expression) {
        String[] expressions = new CalculatorUtil(expression).split();
        this.expressions = new Expressions(expressions);
        this.orders = new Orders(expressions);
    }

}
