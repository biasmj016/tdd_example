package com.test.driven.development.example6;

public class Money {
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Money plus(Money added){
        return new Money(amount + added.amount, currency);
    }
}
