package org.learn.designpatterns.factory.payment;

public class BankTransferPayment implements Payment {

    @Override
    public void processPayment(Double amount) {
        System.out.println("Process bank transfer of amount - " + amount);
    }
}
