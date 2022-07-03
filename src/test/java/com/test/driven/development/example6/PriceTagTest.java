package com.test.driven.development.example6;

import com.test.driven.development.example6.PriceTag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PriceTagTest {

    @Test
    public void testSimpleAddition() {
       Money sum = Money.dollar(5).plus(Money.dollor(5));
       assertEquals(Money.dollar(10), sum);
    }
}