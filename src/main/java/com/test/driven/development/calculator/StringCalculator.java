package com.test.driven.development.calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringCalculator {

    private List<String> operationList = new ArrayList<>();
    private List<Integer> operandList = new ArrayList<>();

    public StringCalculator() {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
    }

    public List<String> separateOperation(String[] expressions){
        return Arrays.asList(expressions)
                .stream()
                .collect(Collectors.toList());
    }

    public int execute() {
        return 0;
    }
}
