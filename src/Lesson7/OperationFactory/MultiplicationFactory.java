package Lesson7.OperationFactory;

import Lesson7.Operation.Multiplication;
import Lesson7.Operation.Operation;

public class MultiplicationFactory implements OperationFactory{
    @Override
    public Operation createOperation() {
        return new Multiplication();
    }
}
