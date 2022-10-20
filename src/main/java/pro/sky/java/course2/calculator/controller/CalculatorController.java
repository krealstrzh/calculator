package pro.sky.java.course2.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.calculator.service.CalculatorInterface;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorInterface calculatorInterface;

    public CalculatorController(CalculatorInterface calculatorInterface) {
        this.calculatorInterface = calculatorInterface;
    }

    @GetMapping
    public String greetingToCalc() {
        return "Добро пожаловать в калькулятор!";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " + " + num2 + " = " + calculatorInterface.additionResult(num1, num2);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " - " + num2 + " = " + calculatorInterface.subtractionResult(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " * " + num2 + " = " + calculatorInterface.multiplicationResult(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam int num1, @RequestParam int num2) {
        if (num2 != 0) {
            return num1 + " / " + num2 + " = " + calculatorInterface.divisionResult(num1, num2);
        } else {
            return "Деление на ноль невозможно!";
        }
    }
}
