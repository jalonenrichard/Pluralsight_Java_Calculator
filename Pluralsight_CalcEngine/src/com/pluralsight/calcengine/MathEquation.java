package com.pluralsight.calcengine;

class MathEquation {
    private double firstOperand;
    private double secondOperand;
    private char opCode;
    private double result;

    MathEquation(char opCode) {
        this.opCode = opCode;
    }

    MathEquation(double leftVal, double rightVal, char opCode) {
        this(opCode);
        this.firstOperand = leftVal;
        this.secondOperand = rightVal;
    }

    void execute() {
        switch (opCode) {
            case 'a':
                result = firstOperand + secondOperand;
                break;
            case 's':
                result = firstOperand - secondOperand;
                break;
            case 'd':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    System.out.println("Cannot divide by 0");
                    result = 0;
                    break;
                }
            case 'm':
                result = firstOperand * secondOperand;
                break;
            default:
                System.out.println("Invalid operand");
                result = 0;
                break;
        }
    }

    void execute(double leftVal, double rightVal) {
        this.firstOperand = leftVal;
        this.secondOperand = rightVal;
        execute();
    }

    double getResult() {
        return this.result;
    }
}
