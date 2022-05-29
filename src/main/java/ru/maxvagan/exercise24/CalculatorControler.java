package ru.maxvagan.exercise24;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorControler {
    private final CalculatorService RespServ;

    public CalculatorControler(CalculatorService respServ) {
        this.RespServ = respServ;
    }

    @GetMapping
    public String index() {
        return RespServ.getMain();
    }
    @GetMapping(path = "/plus")
    public String postPlusArithmetic(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
        return RespServ.postPlusArithmetic(num1, num2);
    }
    @GetMapping(path = "/minus")
    public String postMinusArithmetic(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
        return RespServ.postMinusArithmetic(num1, num2);
    }
    @GetMapping(path = "/multiply")
    public String postMultiplyArithmetic(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
        return RespServ.postMultiplyArithmetic(num1, num2);
    }
    @GetMapping(path = "/divide")
    public String postDivideArithmetic(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
        return RespServ.postDivideArithmetic(num1, num2);
    }
}
