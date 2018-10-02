package com.pluralsight.calcengine;

public class Adder extends CalculatorBase {
    public Adder() {
    }

    public Adder(double leftValue, double rightValue) {
        super(leftValue, rightValue);
    }

    @Override
    void calculate() {
        setResult(getLeftValue() + getRightValue());
    }
}
