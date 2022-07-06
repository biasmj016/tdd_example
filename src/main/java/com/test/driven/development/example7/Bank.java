package com.test.driven.development.example7;

public class Bank {
    public Money reduce(Expression source, String to){
        return source.reduce(to);
    }
}
