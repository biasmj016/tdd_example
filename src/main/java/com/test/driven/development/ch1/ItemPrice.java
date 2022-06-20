package com.test.driven.development.ch1;

import java.util.HashMap;
import java.util.Map;

public class ItemPrice {

    private int amount;

    public ItemPrice(String compareItem) {
        this.amount = getItem(compareItem);
    }

    public ItemPrice() {
    }

    public int getAmount() {
        return amount;
    }

    public int getItem(String item) {
        Map<String, Integer> itemMap = setUpItemPrice();

        if (isValidParam(item)) {
            throw new IllegalArgumentException("상품명을 입력해주세요.");
        } else if (!itemMap.containsKey(item)) {
            throw new IllegalArgumentException("상품 리스트에 없는 항목입니다.");
        }

        return itemMap.get(item);
    }

    private Map<String, Integer> setUpItemPrice() {
        Map<String, Integer> itemMap = new HashMap<>();
        itemMap.put("apple", 2000);
        itemMap.put("banana", 5000);
        itemMap.put("orange", 3000);
        return itemMap;
    }

    private Boolean isValidParam(String item){
        return item.isEmpty();
    }

}
