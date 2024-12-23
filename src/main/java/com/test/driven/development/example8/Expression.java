package com.test.driven.development.example8;

public interface Expression {
    Money reduce(Bank bank, String to);
    Expression plus(Expression addend);
    Expression times(int multiplier);
    boolean is();
}
