package com.test.driven.development.example4;

public abstract class PriceTag {

    protected int amount;

    public static Fruit fruit(int amount) {
        return new Fruit(amount);
    }

    public static Vegetable vegetable(int amount) {
        return new Vegetable(amount);
    }

    abstract String item();
}
