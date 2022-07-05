package com.test.driven.development.example6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestSimpleAddition {

    @Test
    public void testSimpleAddition() {
        Money five = Money.dollar(5);
        Expression sum = five.plus(five);
        Bank bank = new Bank();
        Money reduced = bank.reduce(sum, "USD");

        assertTrue(Money.dollar(10).equals(reduced));
    }
}