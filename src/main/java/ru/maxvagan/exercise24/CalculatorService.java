package ru.maxvagan.exercise24;

public interface CalculatorService {
    String getMain();

    String postPlusArithmetic(String num1, String num2);
    String postMinusArithmetic(String num1, String num2);
    String postMultiplyArithmetic(String num1, String num2);
    String postDivideArithmetic(String num1, String num2);
}
