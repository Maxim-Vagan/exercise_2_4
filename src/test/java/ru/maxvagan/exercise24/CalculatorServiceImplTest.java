package ru.maxvagan.exercise24;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.maxvagan.exercise24.exceptions.ZeroNum2Exception;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {

    private int set1Num1;
    private int set1Num2;
    private int set2Num1;
    private int set2Num2;
    private СalculatorServiceImpl TestCalculator;

    @BeforeEach
    void setUp() {
        set1Num1 = 2;
        set1Num2 = 1;
        set2Num1 = 5;
        set2Num2 = 0;
        TestCalculator = new СalculatorServiceImpl();
    }

    @Test
    void postPlusArithmeticSet1() {
        assertEquals(set1Num1 + set1Num2, TestCalculator.postPlusArithmetic(set1Num1, set1Num2));
    }
    @Test
    void postPlusArithmeticSet2() {
        assertEquals(set1Num2 + set2Num2, TestCalculator.postPlusArithmetic(set2Num1, set2Num2));
    }

    @Test
    void postMinusArithmeticSet1() {
        assertEquals(set1Num1 - set1Num2, TestCalculator.postMinusArithmetic(set1Num1, set1Num2));
    }

    @Test
    void postMinusArithmeticSet2() {
        assertEquals(set2Num2 - set2Num1, TestCalculator.postMinusArithmetic(set1Num1, set1Num2));
    }

    @Test
    void postMultiplyArithmeticSet1() {
        assertEquals(set1Num1 * set1Num2, TestCalculator.postMultiplyArithmetic(set1Num1, set1Num2));
    }

    @Test
    void postMultiplyArithmeticSet2() {
        assertEquals(set2Num2 * set2Num1, TestCalculator.postMultiplyArithmetic(set1Num1, set1Num2));
    }

    @Test
    void postDivideArithmeticSet1() {
        assertEquals(set1Num1 / set1Num2, TestCalculator.postDivideArithmetic(set1Num1, set1Num2));
    }

    @Test
    void postDivideArithmeticSet2() {
        assertEquals(set2Num1 / set1Num2, TestCalculator.postDivideArithmetic(set1Num1, set1Num2));
    }

    @Test
    void postDivideArithmeticThrowException() {
        assertThrows(ZeroNum2Exception.class, () -> TestCalculator.postDivideArithmetic(set2Num1, set2Num2));
    }
}