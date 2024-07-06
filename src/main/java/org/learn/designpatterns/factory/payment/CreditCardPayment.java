package org.learn.designpatterns.factory.payment;

public class CreditCardPayment implements Payment{

    @Override
    public void processPayment(Double amount) {
        System.out.println("Process credit card payment of amount - " + amount);
    }
}
