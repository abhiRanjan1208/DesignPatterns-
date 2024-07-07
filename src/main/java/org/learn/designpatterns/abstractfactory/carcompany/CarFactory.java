package org.learn.designpatterns.abstractfactory.carcompany;

/*

abstract factory interface - defines a set of rules for creating families
of related objects (Car and Specification) without specifying their concrete classes.

 */
public interface CarFactory {

    void assembleCar();
    CarSpecification carSpecification();

}
