package com.test.driven.development.example1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDrivenDevelopmentEx1 {

    private ItemPrice is;

    @BeforeEach
    void setUp() {
        is = new ItemPrice();
    }

    @Test
    public void 상품가격측정테스트() {
        String item="apple";
        int expectedAmount=2000;

        int amount = is.getItem(item);
        assertEquals(expectedAmount, amount);
    }

    @Test
    public void 상품가격측정예외테스트_빈값() {
        String item="";
        assertThatThrownBy(()-> is.getItem(item)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void 상품가격측정예외테스트_항목에없는값() {
        String item="peach";
        assertThatThrownBy(()-> is.getItem(item)).isInstanceOf(IllegalArgumentException.class);
    }
}
