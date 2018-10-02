package com.pluralsight.calcengine;

public class Divider extends CalculatorBase {
    public Divider() {
    }

    public Divider(double leftValue, double rightValue) {
        super(leftValue, rightValue);
    }

    @Override
    void calculate() {
        setResult(getLeftValue() / getRightValue());
    }
}
