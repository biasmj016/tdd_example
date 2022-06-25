package com.test.driven.development.example2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VegetableTest {
    @Test
    void Vegetable생성자테스트() {
        assertNotNull(new Vegetable());
    }
}