package com.pluralsight.calcengine;

abstract class CalculatorBase {
    public double getLeftValue() {
        return leftValue;
    }

    public void setLeftValue(double leftValue) {
        this.leftValue = leftValue;
    }

    public double getRightValue() {
        return rightValue;
    }

    public void setRightValue(double rightValue) {
        this.rightValue = rightValue;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    private double leftValue;
    private double rightValue;
    private double result;

    CalculatorBase() {
    }

    CalculatorBase(double leftValue, double rightValue) {
        this.leftValue = leftValue;
        this.rightValue = rightValue;
    }

    abstract void calculate();
}
