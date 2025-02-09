package StrategyPattern;

public class CreditCard implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("Paying via credit card");
    }
}
