package com.capgemini.calculator.input.hard_coded;

import com.capgemini.calculator.input.Keyboard;

public class HardCodedCalculatorKeyboard implements Keyboard {
    @Override
    public String getOperator() {
        return "+";
    }

    @Override
    public int getFirstNumber() {
        return 2;
    }

    @Override
    public int getSecondNumber() {
        return 4;
    }
}
