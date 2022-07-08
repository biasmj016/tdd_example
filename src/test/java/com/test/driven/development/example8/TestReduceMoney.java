package com.test.driven.development.example8;

import com.test.driven.development.example7.Bank;
import com.test.driven.development.example7.Money;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestReduceMoney {

    @Test
    public void TestReduceMoneyDifferentCurrency() {
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        Money result = bank.reduce(Money.franc(2), "USD");
        assertEquals(Money.dollar(2), result);
    }
}