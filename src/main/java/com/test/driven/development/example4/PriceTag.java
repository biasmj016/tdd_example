package com.test.driven.development.example4;

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

    public boolean equals(Object object){
        PriceTag priceTag = (PriceTag) object;
        return amount == priceTag.amount && item().equals(priceTag.item());

    }
}
