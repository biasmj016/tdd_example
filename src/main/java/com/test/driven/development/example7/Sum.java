package com.test.driven.development.example7;

public class Sum implements Expression{
    protected Money augend;
    protected Money addend;

    public Sum(Money augend, Money added) {
        this.augend = augend;
        this.addend = added;
    }

    public Money reduce(String to) {
        int amount = augend.amount + addend.amount;
        return new Money(amount, to);
    }
}
