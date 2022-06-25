package com.test.driven.development.example2;

import java.util.HashMap;
import java.util.Map;

public class Fruit extends PriceTag {

    public Fruit() {
        this.list = setUpFruitPrice();
    }

    public Map<String, Integer> setUpFruitPrice() {
        Map<String, Integer> itemMap = new HashMap<>();
        itemMap.put("apple", 2000);
        itemMap.put("banana", 5000);
        itemMap.put("orange", 3000);
        return itemMap;
    }

}
