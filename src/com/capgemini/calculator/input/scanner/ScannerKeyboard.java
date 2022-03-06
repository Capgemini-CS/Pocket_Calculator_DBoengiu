package com.capgemini.calculator.input.scanner;

import com.capgemini.calculator.input.Keyboard;
import com.capgemini.calculator.validation.ValidationInterface;
import com.capgemini.calculator.validation.scanner.ScannerValidation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerKeyboard implements Keyboard {

    Scanner scanner = new Scanner(System.in);

    @Override
    public String getOperator() {
        System.out.println("Please introduce one of these operators: +, -, *, /");
        String operator = scanner.nextLine();

        ScannerValidation.checkIfNull(operator);

        List<String> allowedOperands = new ArrayList<>(List.of("+", "-", "*", "/"));

        ScannerValidation.checkIfAllowedOperator(operator, allowedOperands);


        return operator;
    }


    @Override
    public int getFirstNumber() {
        System.out.println("Please introduce a number");
        String firstInput = scanner.nextLine();

        ScannerValidation.checkIfNull(firstInput);

        if (ValidationInterface.isNotNumeric(firstInput)) {
            System.out.println("You should introduce a number");
            System.exit(0);
        }

        return Integer.parseInt(firstInput);
    }

    @Override
    public int getSecondNumber() {
        System.out.println("Please introduce a number");
        String secondInput = scanner.nextLine();

        ScannerValidation.checkIfNull(secondInput);

        if (ValidationInterface.isNotNumeric(secondInput)) {
            System.out.println("You should introduce a number");
            System.exit(0);
        }

        return Integer.parseInt(secondInput);
    }


}
