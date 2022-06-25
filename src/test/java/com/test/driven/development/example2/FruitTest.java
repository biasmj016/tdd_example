package com.test.driven.development.example2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class FruitTest {
    @Test
    void fruit생성자테스트() {
        assertNotNull(new Fruit());
    }
}