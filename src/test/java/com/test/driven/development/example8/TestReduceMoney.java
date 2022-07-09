package com.test.driven.development.example8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestReduceMoney {

    @Test
    public void testIdentifyRate() {
        assertEquals(1, new Bank().rate("USD", "USD"));
    }
}