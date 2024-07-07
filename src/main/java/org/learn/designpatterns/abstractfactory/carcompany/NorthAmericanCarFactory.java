package org.learn.designpatterns.abstractfactory.carcompany;

public class NorthAmericanCarFactory implements CarFactory{

    Car car;
    CarSpecification carSpecification;

    public NorthAmericanCarFactory(Car car){
        this.car = car;
        carSpecification = new NorthAmericanSpecification();
    }

    @Override
    public void assembleCar() {
        this.car.assemble();
    }

    @Override
    public CarSpecification carSpecification() {
        carSpecification.display();
        return this.carSpecification;
    }
}
