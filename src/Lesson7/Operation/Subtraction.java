package Lesson7.Operation;

import Lesson7.Operation.Operation;

public class Subtraction implements Operation {

    @Override
    public double performOperation(double operand1, double operand2) {
        return operand1 - operand2;
    }
}
