package com.test.driven.development.example4;

public class Vegetable extends PriceTag {

    public Vegetable(int amount) {
        this.amount = amount;
    }

    @Override
    String item() {
        return "carrot";
    }
}
