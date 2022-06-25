package com.test.driven.development.example2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class PriceTagTest {
    private PriceTag p;
    private static final String VALID_VALUE = "carrot";
    private static final String INVALID_INPUT = "invalidValue";
    private static final String BLANK_INPUT = "";

    @BeforeEach
    void setUp() {
        p = new Vegetable();
    }

    @Test
    void getItemPrice() {
        assertNotNull(p.getItemPrice(VALID_VALUE));
    }

    @Test
    void isValidParam() {
        assertTrue(p.isValidParam(BLANK_INPUT));
    }

    @Test
    void isValidItem() {
        assertFalse(p.isValidParam(INVALID_INPUT));
    }

    @Test
    void isValid() {
        assertThatThrownBy(()-> p.isValid(INVALID_INPUT))
                .isInstanceOf(IllegalArgumentException.class);
    }
}