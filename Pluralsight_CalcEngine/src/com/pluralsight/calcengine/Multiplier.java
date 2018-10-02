package com.pluralsight.calcengine;

public class Multiplier extends CalculatorBase {
    public Multiplier() {
    }

    public Multiplier(double leftValue, double rightValue) {
        super(leftValue, rightValue);
    }

    @Override
    void calculate() {
        setResult(getLeftValue() * getRightValue());
    }
}
