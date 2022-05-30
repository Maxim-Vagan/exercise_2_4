package ru.maxvagan.exercise24;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calculatorControler {
    private final calculatorService RespServ;

    public calculatorControler(calculatorService respServ) {
        this.RespServ = respServ;
    }

    @GetMapping(path = "/calculator")
    public String index() {
        return RespServ.getMain();
    }
    @GetMapping(path = "/calculator/plus")
    public String postPlusArithmetic(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        //TODO: check if param Num1 and Num2 is Null or non-digital values
        // return "<b><i>Both arguments must be defined as numbers</i></b>";
        return "<b><i>Sum of two numbers: " + RespServ.postPlusArithmetic(num1, num2) + "</i></b>";
    }
    @GetMapping(path = "/calculator/minus")
    public String postMinusArithmetic(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        //TODO: check if param Num1 and Num2 is Null or non-digital values
        // return "<b><i>Both arguments must be defined as numbers</i></b>";
        return "<b><i>Minus of two numbers: " + RespServ.postMinusArithmetic(num1, num2) + "</i></b>";
    }
    @GetMapping(path = "/calculator/multiply")
    public String postMultiplyArithmetic(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        //TODO: check if param Num1 and Num2 is Null or non-digital values
        // return "<b><i>Both arguments must be defined as numbers</i></b>";
        return "<b><i>Multiply of two numbers: " + RespServ.postMultiplyArithmetic(num1, num2) + "</i></b>";
    }
    @GetMapping(path = "/calculator/divide")
    public String postDivideArithmetic(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        //TODO: check if param Num1 and Num2 is Null or non-digital values
        // return "<b><i>Both arguments must be defined as numbers</i></b>";
        if (num2 != 0)
            return "<b><i>Division of two numbers: " + RespServ.postDivideArithmetic(num1, num2) + "</i></b>";
        else return "<b><i>Second arguments must not be defined as 0 (Division by Zero Exception)</i></b>";
    }
}
