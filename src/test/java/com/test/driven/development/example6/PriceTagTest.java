package com.test.driven.development.example6;

import com.test.driven.development.example6.PriceTag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PriceTagTest {

    @Test
    public void testEquality() {
        PriceTag fruit = PriceTag.fruit(2_000);
        Expression sum = fruit.plus(fruit);
        Price price = new Price();
        PriceTag reduced = price.reduce(sum, "apple");
        assertEquals(PriceTag.fruit(4_000), reduced);
    }
}