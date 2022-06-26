package com.test.driven.development.example3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class PriceTagTest {
    private static final String VEGETABLE_CARROT = "carrot";
    private static final String FRUIT_APPLE = "apple";

    @Test
    void 과일의가격비교() {
        PriceTag priceTag = PriceTag.fruit();
        assertEquals(priceTag.getItemPrice(FRUIT_APPLE), 2000);
    }

    @Test
    void 야채의가격비교_예외테스트() {
        PriceTag priceTag = PriceTag.vegetable();
        assertNotEquals(priceTag.getItemPrice(VEGETABLE_CARROT), 2000);
    }
}