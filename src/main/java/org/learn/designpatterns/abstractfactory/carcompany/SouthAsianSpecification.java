package org.learn.designpatterns.abstractfactory.carcompany;

public class SouthAsianSpecification implements CarSpecification{

    @Override
    public void display() {
        System.out.println("South asia specification.");
    }
}
