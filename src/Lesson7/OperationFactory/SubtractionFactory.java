package Lesson7.OperationFactory;

import Lesson7.Operation.Operation;
import Lesson7.Operation.Subtraction;

public class SubtractionFactory implements OperationFactory{
    @Override
    public Operation createOperation() {
        return new Subtraction();
    }
}
