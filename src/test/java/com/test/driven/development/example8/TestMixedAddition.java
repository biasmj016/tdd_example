package com.test.driven.development.example8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestMixedAddition {

    @Test
    public void 환율계산테스트() {
        Money fiveBucks = Money.dollar(5);
        Money tenFrancs = Money.franc(5);
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        Money result = bank.reduce(fiveBucks.plus(tenFrancs), "USD");
        assertEquals(Money.dollar(10), result);

    }
}