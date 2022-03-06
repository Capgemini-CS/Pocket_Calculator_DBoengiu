package com.capgemini.calculator.computation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorCalculationTest {

    CalculatorCalculation calculation = new CalculatorCalculation();

    @Test
    void doCalculationsShould() {
        assertAll(
                () -> assertEquals(3, calculation.doCalculation(1, 2, "+")),
                () -> assertEquals(-1, calculation.doCalculation(1, 2, "-")),
                () -> assertEquals(2, calculation.doCalculation(1, 2, "*")),
                () -> assertEquals(0.5, calculation.doCalculation(1, 2, "/")),
                () -> assertThrows(ArithmeticException.class, () -> calculation.doCalculation(1, 0, "/"))

        );
    }

    @Test
    void doCalculationAddition() {
        double result = calculation.doCalculation(1, 2, "+");
        assertEquals(3, result);
    }

    @Test
    void doCalculationSubtraction() {
        double result = calculation.doCalculation(1, 2, "-");
        assertEquals(-1, result);
    }

    @Test
    void doCalculationMultiplication() {
        double result = calculation.doCalculation(1, 2, "*");
        assertEquals(2, result);
    }


    @Test
    void doCalculationDivision() {
        double result = calculation.doCalculation(1, 2, "/");
        assertEquals(0.5, result);
    }

    @Test
    void doCalculationDivisionThrowsError() {
        assertThrows(ArithmeticException.class, () -> calculation.doCalculation(1, 0, "/"));
    }
}