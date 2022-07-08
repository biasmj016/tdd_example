package com.test.driven.development.example8;

public class Bank {
    public Money reduce(Expression source, String to){
        return source.reduce(this, to);
    }
    public int rate(String from, String to){
        return (from.equals("CHF") && to.equals("USD")) ? 2 : 1;
    }
}
