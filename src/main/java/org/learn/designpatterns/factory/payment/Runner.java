package org.learn.designpatterns.factory.payment;

import java.util.Scanner;

/**

 You are working for a software company that develops e-commerce platforms. One of the critical features
 of the platform is the ability to handle various types of payment methods. The payment methods supported
 include Credit Card, PayPal, and Bank Transfer. In the future, there might be a need to add more payment
 methods such as Apple Pay, Google Wallet, etc.

 */

public class Runner {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter payment method - ");
        String paymentMethod = scanner.nextLine();
        System.out.println("Enter amount to process - ");
        Double amount = scanner.nextDouble();
        Payment payment = PaymentFactory.createPayment(paymentMethod);
        payment.processPayment(amount);
    }
}
