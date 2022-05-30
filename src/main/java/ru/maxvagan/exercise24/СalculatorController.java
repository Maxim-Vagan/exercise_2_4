package ru.maxvagan.exercise24;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculator")
public class СalculatorController {
    private final СalculatorService RespServ;

    public СalculatorController(СalculatorService respServ) {
        this.RespServ = respServ;
    }

    @GetMapping
    public String index() {
        return RespServ.getMain();
    }
    @GetMapping(path = "/plus")
    public String postPlusArithmetic(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        //TODO: check if param Num1 and Num2 is Null or non-digital values
        // return "<b><i>Both arguments must be defined as numbers</i></b>";
        return "<b><i>Sum of two numbers: " + RespServ.postPlusArithmetic(num1, num2) + "</i></b>";
    }
    @GetMapping(path = "/minus")
    public String postMinusArithmetic(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        //TODO: check if param Num1 and Num2 is Null or non-digital values
        // return "<b><i>Both arguments must be defined as numbers</i></b>";
        return "<b><i>Minus of two numbers: " + RespServ.postMinusArithmetic(num1, num2) + "</i></b>";
    }
    @GetMapping(path = "/multiply")
    public String postMultiplyArithmetic(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        //TODO: check if param Num1 and Num2 is Null or non-digital values
        // return "<b><i>Both arguments must be defined as numbers</i></b>";
        return "<b><i>Multiply of two numbers: " + RespServ.postMultiplyArithmetic(num1, num2) + "</i></b>";
    }
    @GetMapping(path = "/divide")
    public String postDivideArithmetic(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        //TODO: check if param Num1 and Num2 is Null or non-digital values
        // return "<b><i>Both arguments must be defined as numbers</i></b>";
        if (num2 != 0)
            return "<b><i>Division of two numbers: " + RespServ.postDivideArithmetic(num1, num2) + "</i></b>";
        else return "<b><i>Second arguments must not be defined as 0 (Division by Zero Exception)</i></b>";
    }
}
