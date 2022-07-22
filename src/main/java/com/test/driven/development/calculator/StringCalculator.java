package com.test.driven.development.calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StringCalculator {

    private List<String> expressionList = new ArrayList<>();

    public StringCalculator() {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        new StringCalculator(new CalculatorUtil(expression).split());
    }
    public StringCalculator(String[] expressions) {
        this.expressionList = Arrays.asList(expressions);
    }

    public int execute() {
        return 0;
    }
}
