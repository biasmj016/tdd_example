package com.test.driven.development.example8;

public class Sum implements Expression {
    protected Expression augend;
    protected Expression addend;

    public Sum(Expression augend, Expression added) {
        this.augend = augend;
        this.addend = added;
    }

    public Money reduce(Bank bank, String to) {
        int amount = augend.reduce(bank, to).amount + addend.reduce(bank, to).amount;
        return new Money(amount, to);
    }

    public Expression plus(Expression addend) {
        return null;
    }
}
