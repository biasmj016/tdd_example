package com.test.driven.development.calculator.step1;

import java.util.Scanner;

public class StringCalculator {

    private String[] expressions;

    public StringCalculator() {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();

        this.expressions = new CalculatorUtil(expression).split();
    }

    public StringCalculator(String expression) {
        this.expressions = new CalculatorUtil(expression).split();
    }

    public String[] getExpressions() {
        return expressions;
    }

    public int execute() {
        Integer base = new Integer(expressions[0]);
        for (int i = 1; i < expressions.length; i+=2) {
            base = OperandEnum.operation(expressions[i], base, new Integer(expressions[i+1]));
        }
        return base;
    }
}
