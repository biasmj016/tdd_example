package com.test.driven.development.example7;

public class Sum implements Expression{
    private Money augend;
    private Money addend;

    public Sum(Money augend, Money added) {
        this.augend = augend;
        this.addend = added;
    }
}
