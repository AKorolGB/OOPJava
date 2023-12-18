package Lesson7.LoggingOperationDecorator;

import Lesson7.Operation.*;

public class LoggingOperationDecorator implements Operation {
    private Operation operation;

    public LoggingOperationDecorator(Operation operation) {
        this.operation = operation;
    }

    private String getOperationSymbol() {
        if (operation instanceof Addition) {
            return "+";
        } else if (operation instanceof Multiplication) {
            return "*";
        } else if (operation instanceof Division) {
            return "/";
        } else if (operation instanceof Subtraction) {
            return "-";
        } else {
            return "?";
        }
    }
    @Override
    public double performOperation(double operand1, double operand2) {
        double result = operation.performOperation(operand1, operand2);
        System.out.println(String.format("%s %s %s = %s",
                operand1, getOperationSymbol(), operand2, result));
        return result;
    }
}
