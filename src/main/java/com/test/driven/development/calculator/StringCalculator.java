package com.test.driven.development.calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StringCalculator {

    private List<Integer> operandList = new ArrayList<>();
    private List<String> operatorList = new ArrayList<>();

    public StringCalculator() {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        String[] expressions = new CalculatorUtil(expression).split();


    }
    public StringCalculator(Integer[] operands, String[] operators) {
        this.operandList = Arrays.asList(operands);
        this.operatorList = Arrays.asList(operators);
    }

    public int[] filterOperandList(String[] expressions){
        return Arrays.asList(expressions).stream().mapToInt(Integer::parseInt).toArray();
    }

    public int execute(String expression) {
        return 0;
    }
}
