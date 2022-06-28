package com.test.driven.development.example4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PriceTagTest {

    @Test
    public void testitem() {
        assertEquals("apple", PriceTag.fruit(2000).item());
        assertEquals("carrot", PriceTag.vegetable(3000).item());
    }
}