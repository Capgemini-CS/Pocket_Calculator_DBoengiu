package com.capgemini.calculator.validation.scanner;

import com.capgemini.calculator.validation.ValidationInterface;

import java.util.List;
import java.util.Objects;

public class ScannerValidation implements ValidationInterface {

    public static void checkIfNull(String operator) {
        if (Objects.isNull(operator)){
            System.exit(0);
        }
    }

    public static void checkIfAllowedOperator(String operator, List<String> allowedOperands) {
        if (!allowedOperands.contains(operator)) {
            System.out.println("You should enter an allowed operator");
            System.exit(0);
        }
    }

}
