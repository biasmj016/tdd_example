package com.test.driven.development.example5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PriceTagTest {

    @Test
    public void testEquality() {
        assertTrue(PriceTag.fruit(2_000).equals(PriceTag.fruit(2_000)));
        assertFalse(PriceTag.fruit(2_000).equals(PriceTag.vegetable(2_000)));
    }
}