package com.test.driven.development.example5;

public class PriceTag {
    protected int amount;
    protected String item;

    public PriceTag(int amount, String item) {
        this.amount = amount;
        this.item = item;
    }

    public String item(){
        return item;
    }

    public static PriceTag fruit(int amount){
        return new PriceTag(amount, "apple");
    }

    public static PriceTag vegetable(int amount){
        return new PriceTag(amount, "carrot");
    }

    public boolean equals(Object object){
        PriceTag priceTag = (PriceTag) object;
        return amount == priceTag.amount && item().equals(priceTag.item());

    }
}
