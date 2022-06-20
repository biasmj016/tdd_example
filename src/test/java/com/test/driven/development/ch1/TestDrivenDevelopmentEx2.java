package com.test.driven.development.ch1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestDrivenDevelopmentEx2 {

    private static final String COMPARE_ITEM = "apple";

    @Test
    public void 상품생성자테스트() {
        assertNotNull(new ItemPrice(COMPARE_ITEM));
    }

    @Test
    public void 상품가격비교테스트() {
        ItemPrice is = new ItemPrice();
        assertEquals(new ItemPrice(COMPARE_ITEM).getAmount(), is.getItem(COMPARE_ITEM));
    }
}
