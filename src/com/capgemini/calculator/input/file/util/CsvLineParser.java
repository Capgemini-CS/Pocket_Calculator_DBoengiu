package com.capgemini.calculator.input.file.util;

import com.capgemini.calculator.validation.ValidationInterface;
import com.capgemini.calculator.validation.file.FileValidation;

import java.util.ArrayList;
import java.util.List;

public class CsvLineParser {

    public static String getOperatorFromCsvLine(String line) {
        String[] fileAttributes = line.split(",");
        List<String> allowedOperands = new ArrayList<>(List.of("+", "-", "*", "/"));

        FileValidation.checkLength(fileAttributes);
        FileValidation.checkIfNull(fileAttributes);

        FileValidation.checkAllowedOperand(fileAttributes, allowedOperands);

        return fileAttributes[2];
    }


    public static int[] getNumbersFromCsvLine(String line) {
        int[] numbers;
        String[] fileAttributes = line.split(",");

        FileValidation.checkLength(fileAttributes);
        FileValidation.checkIfNull(fileAttributes);

        if (ValidationInterface.isNotNumeric(fileAttributes[0]) || ValidationInterface.isNotNumeric(fileAttributes[1])) {
            System.out.println("You should have introduced numbers");
            System.exit(0);

        }

        int firstNumber = Integer.parseInt(fileAttributes[0]);
        int secondNumber = Integer.parseInt(fileAttributes[1]);

        numbers = new int[]{firstNumber, secondNumber};

        return numbers;


    }


}
