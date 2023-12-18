package Lesson7.Calculator;

import Lesson7.CalculatorObserver.CalculatorObserver;
import Lesson7.Operation.Operation;

import java.util.ArrayList;
import java.util.List;

public class ObservableCalculator {
    private List<CalculatorObserver> observers = new ArrayList<>();

    public void addObserver(CalculatorObserver observer) {
        observers.add(observer);
    }

    public double calculate(Operation operation, double operand1, double operand2) {
        double result = operation.performOperation(operand1, operand2);
        notifyObservers(result);
        return result;
    }

    private void notifyObservers(double result) {
        for (CalculatorObserver observer : observers) {
            observer.onCalculationComplete(result);
        }
    }
}
