package pro.sky.java.course2.calculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.java.course2.calculator.service.TestingConstants.*;

class CalculatorImplParamTest {

    private final CalculatorImpl out = new CalculatorImpl();

    public static Stream<Arguments> parametersForTesting() {
        return Stream.of(
                Arguments.of(add1, add2),
                Arguments.of(sub1, sub2),
                Arguments.of(mul1, mul4),
                Arguments.of(div1, div2)
        );
    }

    @ParameterizedTest
    @MethodSource ("parametersForTesting")
    void additionIsCorrect(int a, int b) {
        int result = out.additionResult(a, b);
        assertEquals(a+b, result);
    }

    @ParameterizedTest
    @MethodSource ("parametersForTesting")
    void subtractionIsCorrect(int a, int b) {
        int result = out.subtractionResult(a, b);
        assertEquals(a-b, result);
    }

    @ParameterizedTest
    @MethodSource ("parametersForTesting")
    void multiplicationIsCorrect(int a, int b) {
        int result = out.multiplicationResult(a, b);
        assertEquals(a*b, result);
    }

    @ParameterizedTest
    @MethodSource ("parametersForTesting")
    void divisionIsCorrect(int a, int b) {
        double result = out.divisionResult(a, b);
        assertEquals(1.0*(a/b), result);
    }
}