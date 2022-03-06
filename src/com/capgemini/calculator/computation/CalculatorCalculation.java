package com.capgemini.calculator.computation;

public class CalculatorCalculation implements Calculation{
    @Override
    public double doCalculation(int firstNumber, int secondNumber, String operator) {
        double result = 0;
        switch (operator) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                if (secondNumber == 0) {
                    throw new ArithmeticException();
                }
                result = (double) (firstNumber) / secondNumber;
                break;
        }
        return result;
    }
}
