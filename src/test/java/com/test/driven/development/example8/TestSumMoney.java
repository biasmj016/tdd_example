package com.test.driven.development.example8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TestSumMoney {

    @Test
    public void testSumPlusMoney() {
        Expression fiveBucks = Money.dollar(5);
        Expression tenFrancs = Money.franc(10);

        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);

        Expression sum = new Sum(fiveBucks, tenFrancs).plus(fiveBucks);

        Money result = bank.reduce(sum, "USD");

        assertEquals(Money.dollar(15), result);

    }

    @Test
    public void testSumTimes() {
        Expression fiveBucks = Money.dollar(5);
        Expression tenFrancs = Money.franc(10);

        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);

        Expression sum = new Sum(fiveBucks, tenFrancs).times(2);

        Money result = bank.reduce(sum, "USD");

        assertEquals(Money.dollar(20), result);

    }
    @Test
    public void testPlusSameCurrencyReturnsMoney() {
        Expression sum = Money.dollar(5).plus(Money.dollar(1));
        assertTrue(sum.is());
    }
}