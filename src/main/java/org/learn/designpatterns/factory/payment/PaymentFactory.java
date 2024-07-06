package org.learn.designpatterns.factory.payment;

public class PaymentFactory {

    public static Payment createPayment(String type){
        switch (type){
            case "Credit Card":
                return new CreditCardPayment();
            case "PayPal":
                return new PayPalPayment();
            case "Bank Transfer":
                return new BankTransferPayment();
            default:
                throw new IllegalArgumentException("Unknown payment type.");
        }
    }
}
