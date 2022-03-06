package com.capgemini.calculator;

import com.capgemini.calculator.computation.CalculatorCalculation;
import com.capgemini.calculator.input.file.FileCalculatorKeyboard;
import com.capgemini.calculator.screen.CalculatorScreen;

public class FileCalculator {
    public static void main(String[] args) {
        FileCalculatorKeyboard keyboard = new FileCalculatorKeyboard();
        int firstNumber = keyboard.getFirstNumber();
        int secondNumber = keyboard.getSecondNumber();
        String operator = keyboard.getOperator();

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
