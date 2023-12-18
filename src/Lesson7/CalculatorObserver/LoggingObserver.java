package Lesson7.CalculatorObserver;

public class LoggingObserver implements CalculatorObserver{
    @Override
    public void onCalculationComplete(double result) {
        System.out.println("Result: " + result);
    }
}
