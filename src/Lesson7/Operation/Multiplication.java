package Lesson7.Operation;

public class Multiplication implements Operation {

    @Override
    public double performOperation(double operand1, double operand2) {
        return operand1 * operand2;
    }
}
