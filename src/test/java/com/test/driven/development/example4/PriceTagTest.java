package com.test.driven.development.example4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PriceTagTest {

    @Test
    public void testitem() {
        assertTrue(new PriceTag(2_000, "apple").equals(new Fruit(2_000, "apple")));
        assertTrue(new PriceTag(3_000, "carrot").equals(new Vegetable(3_000, "carrot")));
    }
}