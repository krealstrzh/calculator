package pro.sky.java.course2.calculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.java.course2.calculator.exceptions.DivisionByZeroException;

import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.java.course2.calculator.service.TestingConstants.*;

class CalculatorImplTest {

    private final CalculatorImpl out = new CalculatorImpl();

    @Test
    void additionIsCorrect() {
        int actual1 = out.additionResult(add1, add2);
        int actual2 = out.additionResult(add3, add4);

        int expected1 = add1 + add2;
        int expected2 = add3 + add4;

        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }

    @Test
    void subtractionIsCorrect() {
        int actual1 = out.subtractionResult(sub1, sub2);
        int actual2 = out.subtractionResult(sub3, sub4);

        int expected1 = sub1 - sub2;
        int expected2 = sub3 - sub4;

        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }

    @Test
    void multiplicationIsCorrect() {
        int actual1 = out.multiplicationResult(mul1, mul2);
        int actual2 = out.multiplicationResult(mul3, mul4);

        int expected1 = mul1 * mul2;
        int expected2 = mul3 * mul4;

        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }

    @Test
    void divisionIsCorrect() {
        double actual = out.divisionResult(div1, div2);

        double expected = 1.0 * (div1 / div2);

        assertEquals(expected, actual);
    }

    @Test
    void cannotDivideByZero() {
        assertThrows(DivisionByZeroException.class,
                () -> out.divisionResult(div3, div4));
    }
}