package com.capgemini.calculator.input.file;

import com.capgemini.calculator.input.Keyboard;
import com.capgemini.calculator.input.file.util.FileScanner;

public class FileCalculatorKeyboard implements Keyboard {
    @Override
    public String getOperator() {
        return FileScanner.getRequestedOperator();
    }


    @Override
    public int getFirstNumber() {
        return FileScanner.getRequestedNumbers()[0];
    }

    @Override
    public int getSecondNumber() {
        return FileScanner.getRequestedNumbers()[1];
    }
}
