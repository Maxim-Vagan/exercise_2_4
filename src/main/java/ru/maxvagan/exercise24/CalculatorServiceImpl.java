package ru.maxvagan.exercise24;

import org.springframework.stereotype.Service;
@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String getMain() {
        return "<h1>Some HTML code version 4 for displaying Status</h1>" +
                "<td><tr><h3>For Plus arithmetic call plus?num1=...&num2=...</h3></tr>" +
                "<tr><h3>For Minus arithmetic call minus?num1=...&num2=...</h3></tr>" +
                "<tr><h3>For Multiply arithmetic call multiply?num1=...&num2=...</h3></tr>" +
                "<tr><h3>For Divide arithmetic call divide?num1=...&num2=...</h3></tr></td>";
    }
    private boolean checkParamsValidation(String num1, String num2) {
        boolean check = num1.isEmpty() || num2.isEmpty();
        int checkNumber = 0;
        try {
            checkNumber = Integer.valueOf(num1);
            checkNumber = Integer.valueOf(num2);
        } catch (NumberFormatException e) {
            check = true;
        }
        return check;
    }
    @Override
    public String postPlusArithmetic(String num1, String num2) {
        if (!checkParamsValidation(num1, num2))
            return "<b><i>Sum of two numbers: " + (Integer.valueOf(num1) + Integer.valueOf(num2)) + "</i></b>";
        else return "<b><i>Both arguments must be defined as numbers</i></b>";
    }
    @Override
    public String postMinusArithmetic(String num1, String num2) {
        if (!checkParamsValidation(num1, num2))
            return "<b><i>Minus of two numbers: " + (Integer.valueOf(num1) - Integer.valueOf(num2)) + "</i></b>";
        else return "<b><i>Both arguments must be defined as numbers</i></b>";
    }
    @Override
    public String postMultiplyArithmetic(String num1, String num2) {
        if (!checkParamsValidation(num1, num2))
            return "<b><i>Multiply of two numbers: " + (Integer.valueOf(num1) * Integer.valueOf(num2)) + "</i></b>";
        else return "<b><i>Both arguments must be defined as numbers</i></b>";
    }
    @Override
    public String postDivideArithmetic(String num1, String num2) {
        if (!checkParamsValidation(num1, num2) && Integer.valueOf(num2)!=0)
            return "<b><i>Division of two numbers: " + (Integer.valueOf(num1) / Integer.valueOf(num2)) + "</i></b>";
        else if (Integer.valueOf(num2) == 0)
            return "<b><i>Second arguments must not be defined as 0 (Division by Zero Exception)</i></b>";
        else
            return "<b><i>Both arguments must be defined as numbers</i></b>";
    }
}
