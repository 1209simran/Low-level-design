package StrategyPattern;


// Allows selecting an algorithm dynamically at runtime.
// Use Case: Payment processing, dynamic sorting algorithms.
public class Main {
    public static void main(String[] args) {
        PaymentStrategy paymentStrategy = new CreditCard();
        paymentStrategy.pay();
    }
}