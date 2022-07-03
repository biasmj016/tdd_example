package com.test.driven.development.example6;

public class Money implements Expression{
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static Money dollar(int amount){
        return new Money(amount, "USD");
    }

    public Expression plus(Money added){
        return new Money(amount + added.amount, currency);
    }
}
