package com.test.driven.development.example4;

public class Fruit extends PriceTag {

    public Fruit(int amount) {
        this.amount = amount;
    }

    @Override
    String item() {
        return "apple";
    }
}
