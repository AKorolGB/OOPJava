package Lesson7.OperationFactory;

import Lesson7.Operation.Addition;
import Lesson7.Operation.Operation;

public class AdditionFactory implements OperationFactory{
    @Override
    public Operation createOperation() {
        return new Addition();
    }
}
