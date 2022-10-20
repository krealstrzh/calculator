package pro.sky.java.course2.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorImpl implements CalculatorInterface{

    public int additionResult(int num1, int num2) {
        return num1 + num2;
    }

    public int subtractionResult(int num1, int num2) {
        return num1 - num2;
    }

    public int multiplicationResult(int num1, int num2) {
        return num1 * num2;
    }

    public int divisionResult(int num1, int num2) {
        return num1 / num2;
    }
}
