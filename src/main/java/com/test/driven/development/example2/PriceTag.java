package com.test.driven.development.example2;

import java.util.HashMap;
import java.util.Map;

public class PriceTag {

    protected Map<String, Integer> list = new HashMap<>();

    public Integer getItemPrice(String item) {
        isValid(item);
        return this.list.get(item);
    }

    public Boolean isValidParam(String item){
        return item.isEmpty();
    }
    public Boolean isValidItem(String item){
        return !this.list.containsKey(item);
    }
    public void isValid(String item){
        if (isValidParam(item)) {
            throw new IllegalArgumentException("상품명을 입력해주세요.");
        } else if (isValidItem(item)) {
            throw new IllegalArgumentException("상품 리스트에 없는 항목입니다.");
        }
    }

}
