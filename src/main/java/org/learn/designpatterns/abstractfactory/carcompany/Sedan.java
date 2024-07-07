package org.learn.designpatterns.abstractfactory.carcompany;

public class Sedan implements Car{

    @Override
    public void assemble() {
        System.out.println("Assembling sedan car.");
    }
}
