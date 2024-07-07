package org.learn.designpatterns.abstractfactory.carcompany;

public class NorthAmericanSpecification implements CarSpecification{

    @Override
    public void display() {
        System.out.println("North America specification.");
    }
}
