package pro.sky.java.course2.calculator.service;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.calculator.exceptions.DivisionByZeroException;

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

    public double divisionResult(int num1, int num2) {
        if (num2 == 0) {
            throw new DivisionByZeroException("Ooops, divided by zero");
        }
        return 1.0 * (num1 / num2);
    }
}
