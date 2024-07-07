package org.learn.designpatterns.abstractfactory.carcompany;

public class Suv implements Car {

    @Override
    public void assemble() {
        System.out.println("Assembling SUV car.");
    }
}
