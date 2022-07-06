package ru.maxvagan.exercise24;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplParamTest {
    private СalculatorServiceImpl TestCalculator;

    @BeforeEach
    void setUp() {
        TestCalculator = new СalculatorServiceImpl();
    }

    private static Stream<Arguments> getParamsForTests() {
        return Stream.of(Arguments.of(2, 1, 2, 1),
                Arguments.of(1, 0, 5, 0),
                Arguments.of(2, 1, 2, null),
                Arguments.of(5, 0, null, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("getParamsForTests")
    void postPlusArithmetic(int actualNum1, int actualNum2, int expectedNum1, int expectedNum2) {
        assertEquals(expectedNum1 + expectedNum2, TestCalculator.postPlusArithmetic(actualNum1, actualNum2));
    }

    @ParameterizedTest
    @MethodSource("getParamsForTests")
    void postMinusArithmetic(int actualNum1, int actualNum2, int expectedNum1, int expectedNum2) {
        assertEquals(expectedNum1 - expectedNum2, TestCalculator.postMinusArithmetic(actualNum1, actualNum2));
    }

    @ParameterizedTest
    @MethodSource("getParamsForTests")
    void postMultiplyArithmetic(int actualNum1, int actualNum2, int expectedNum1, int expectedNum2) {
        assertEquals(expectedNum1 * expectedNum2, TestCalculator.postMultiplyArithmetic(actualNum1, actualNum2));
    }

    @ParameterizedTest
    @MethodSource("getParamsForTests")
    void postDivideArithmetic(int actualNum1, int actualNum2, int expectedNum1, int expectedNum2) {
        assertEquals(expectedNum1 / expectedNum2, TestCalculator.postDivideArithmetic(actualNum1, actualNum2));
    }
}