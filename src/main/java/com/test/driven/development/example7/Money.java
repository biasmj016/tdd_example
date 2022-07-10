package com.test.driven.development.example7;

public class Money implements Expression {
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
        return new Sum(this, added);
    }

    public boolean equals(Object object){
        Money money = (Money) object;
        return amount == money.amount;

    }

    public Money reduce(String to){
        return this;
    }
}