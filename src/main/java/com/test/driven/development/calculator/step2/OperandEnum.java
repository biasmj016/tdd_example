package com.test.driven.development.calculator.step2;

import java.util.EnumSet;
import java.util.function.BinaryOperator;

public enum OperandEnum {
    PLUS("+", false, (left, right) -> left + right),
    MINUS("-", false,(left, right) -> left - right),
    DIVIDE("/", true, (left, right) -> left / right),
    MULTIPLY("*", true, (left, right) -> left * right);

    private final String code;
    private final boolean priority;
    private final BinaryOperator<Integer> operation;

    OperandEnum(String code, boolean priority, BinaryOperator<Integer> operation) {
        this.code = code;
        this.priority = priority;
        this.operation = operation;
    }

    public boolean isPriority() {
        return priority;
    }

    public static OperandEnum find(String code){
        return EnumSet.allOf(OperandEnum.class)
                .stream()
                .filter(c -> c.code.equals(code))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("유효한 연산자가 아닙니다"));
    }

    public static int operation(String code, int left, int right){
        return find(code).operation.apply(left, right);
    }

}
