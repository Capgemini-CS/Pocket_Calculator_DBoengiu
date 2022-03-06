package com.capgemini.calculator;

import com.capgemini.calculator.computation.CalculatorCalculation;
import com.capgemini.calculator.input.scanner.ScannerKeyboard;
import com.capgemini.calculator.screen.CalculatorScreen;

public class ScannerCalculator {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        String operator;

        ScannerKeyboard keyboard = new ScannerKeyboard();
        firstNumber = keyboard.getFirstNumber();
        secondNumber = keyboard.getSecondNumber();
        operator = keyboard.getOperator();

        CalculatorCalculation calculation = new CalculatorCalculation();
        double result = 0;
        try {
            result = calculation.doCalculation(firstNumber, secondNumber, operator);
        } catch (ArithmeticException e) {
            System.out.println("You have tried to divide by zero");
        }

        CalculatorScreen screen = new CalculatorScreen();
        screen.showResult(result);
    }
}
