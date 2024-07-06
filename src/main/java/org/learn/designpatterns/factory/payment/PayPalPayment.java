package org.learn.designpatterns.factory.payment;

public class PayPalPayment implements Payment{

    @Override
    public void processPayment(Double amount) {
        System.out.println("Process PayPal payment of amount - " + amount);
    }
}
