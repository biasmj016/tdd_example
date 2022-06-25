package com.test.driven.development.example2;

import java.util.HashMap;
import java.util.Map;

public class Vegetable extends PriceTag {

    public Vegetable() {
        this.list = setUpVegetablePrice();
    }

    public Map<String, Integer> setUpVegetablePrice() {
        Map<String, Integer> itemMap = new HashMap<>();
        itemMap.put("onion", 2000);
        itemMap.put("potato", 5000);
        itemMap.put("carrot", 3000);
        return itemMap;
    }

}
