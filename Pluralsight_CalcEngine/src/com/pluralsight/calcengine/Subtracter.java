package com.pluralsight.calcengine;

public class Subtracter extends CalculatorBase {
    public Subtracter() {
    }

    public Subtracter(double leftValue, double rightValue) {
        super(leftValue, rightValue);
    }

    @Override
    void calculate() {
        setResult(getLeftValue() - getRightValue());
    }
}
