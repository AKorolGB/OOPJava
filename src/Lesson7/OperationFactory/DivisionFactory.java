package Lesson7.OperationFactory;

import Lesson7.Operation.Division;
import Lesson7.Operation.Operation;

public class DivisionFactory implements OperationFactory{
    @Override
    public Operation createOperation() {
        return new Division();
    }
}
