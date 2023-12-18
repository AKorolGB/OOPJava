package Lesson7.Operation;

public class Division implements Operation {
    String a = "Деление на 0";
    @Override
    public double performOperation(double operand1, double operand2) {
        if (operand2 == 0) {
            throw new RuntimeException("Деление на 0");


        }
        return operand1 / operand2;
    }
}
