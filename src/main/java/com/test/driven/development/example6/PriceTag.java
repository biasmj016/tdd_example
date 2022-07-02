package com.test.driven.development.example6;

public class PriceTag implements Expression{
    protected int amount;
    protected String item;

    public PriceTag(int amount, String item) {
        this.amount = amount;
        this.item = item;
    }

    public static PriceTag fruit(int amount){
        return new PriceTag(amount, "apple");
    }

    public static PriceTag vegetable(int amount){
        return new PriceTag(amount, "carrot");
    }

    public Expression plus(PriceTag addItem){
        return new PriceTag(amount + addItem.amount, item);
    }
}
