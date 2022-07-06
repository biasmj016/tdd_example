package com.test.driven.development.example7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestReduceSum {

    @Test
    public void testSimpleAddition() {
        Bank bank = new Bank();
        Money result = bank.reduce(Money.dollar(7), "USD");
        assertEquals(Money.dollar(7), result);
    }
}