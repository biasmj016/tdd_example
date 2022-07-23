package com.test.driven.development.calculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class StringCalculatorTest {

    @ParameterizedTest
    @CsvSource(value = {
            "10 * 1 - 1 + 5,14",
            "20 * 2 - 2 + 5,43",
            "30 * 3 - 3 + 5,92",
            "40 * 4 - 4 + 5,161"
    })
    void 계산기_결과값_확인(String expression, int expected) {
        Assertions.assertThatCode(() ->{
            StringCalculator stringCalculator = new StringCalculator(expression);
            Assertions.assertThat(stringCalculator.execute()).isEqualTo(expected);
        }).doesNotThrowAnyException();
    }
}
