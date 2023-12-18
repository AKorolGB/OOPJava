package Lesson7;

import Lesson7.Calculator.ObservableCalculator;
import Lesson7.CalculatorObserver.LoggingObserver;
import Lesson7.LoggingOperationDecorator.LoggingOperationDecorator;
import Lesson7.Operation.Operation;
import Lesson7.OperationFactory.*;

public class Main {
    public static void main(String[] args) {
        ObservableCalculator calculator = new ObservableCalculator();
        calculator.addObserver(new LoggingObserver());

        OperationFactory additionFactory = new AdditionFactory();
        OperationFactory multiplicationFactory = new MultiplicationFactory();
        OperationFactory divisionFactory = new DivisionFactory();
        OperationFactory subtractionFactory = new SubtractionFactory();

        Operation additionWithLogging = new LoggingOperationDecorator(additionFactory.createOperation());
        Operation multiplicationWithLogging = new LoggingOperationDecorator(multiplicationFactory.createOperation());
        Operation divisionWithLogging = new LoggingOperationDecorator(divisionFactory.createOperation());
        Operation subtractionWithLogging = new LoggingOperationDecorator(subtractionFactory.createOperation());

        double result1 = calculator.calculate(additionWithLogging, 5, 3);
        double result2 = calculator.calculate(multiplicationWithLogging, 4, 2);
        double result4 = calculator.calculate(subtractionWithLogging, 10, 4);
        double result3 = calculator.calculate(divisionWithLogging, 8, 0);
    }
}
