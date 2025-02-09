package StrategyPattern;

public class UPI implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("Paying via UPI");
    }
}
