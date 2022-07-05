package com.test.driven.development.example7;

import com.test.driven.development.example7.Bank;
import com.test.driven.development.example7.Expression;
import com.test.driven.development.example7.Money;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TestReduceSum {

    @Test
    public void testSimpleAddition() {
        Expression sum = new Sum(Money.dollar(3), Money.dollar(4));
        Bank bank = new Bank();
        Money result = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(7), result);
    }
}