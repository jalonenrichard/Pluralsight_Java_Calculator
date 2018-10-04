package com.pluralsight.myapp;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        MathEquation[] mathEquations = {
                new MathEquation(95, 10, 'a'),
                new MathEquation(41, 34, 's'),
                new MathEquation(4, 3, 'd'),
                new MathEquation(23, 7, 'm')
        };

        for (MathEquation equation : mathEquations) {
            equation.execute();
            System.out.println(equation.getResult());
        }

        double leftSide = 55;
        double rightSide = 5;

        MathEquation equationOverload = new MathEquation('d');
        equationOverload.execute(leftSide, rightSide);
        System.out.println(equationOverload.getResult());

        System.out.println();

        System.out.println("Class inheritance way:");
        ArrayList<CalculatorBase> calculatorBases = new ArrayList<>();
        calculatorBases.add(new Adder(30, 50));
        calculatorBases.add(new Subtracter(93, 34));
        calculatorBases.add(new Divider(30, 2));
        calculatorBases.add(new Multiplier(4, 5));

        for (CalculatorBase calculatorBase : calculatorBases) {
            calculatorBase.calculate();
            System.out.println(calculatorBase.getResult());
        }

        System.out.println();

        System.out.println("Enum way");

        String[] statements = {
                "add 3",
                "multiply x 5",
                "dosomething 5 19",
                "add 55 12",
                "subtract 23.2 10",
                "multiply 5 18",
                "divide 24 6"
        };

        CalculateHelper helper = new CalculateHelper();
        for (String statement : statements) {
            try {
                helper.process(statement);
                System.out.println(helper);
            } catch (InvalidStatementException e) {
                System.out.println(e.getMessage());
                if (e.getCause() != null) {
                    System.out.println("Original exception " + e.getCause().getMessage());
                }
            }
        }

    }

}