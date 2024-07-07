package org.learn.designpatterns.abstractfactory.carcompany;

public class SouthAsianCarFactory implements CarFactory{

    Car car;
    CarSpecification carSpecification;

    public SouthAsianCarFactory(Car car){
        this.car = car;
        this.carSpecification = new SouthAsianSpecification();
    }

    @Override
    public void assembleCar() {
        this.car.assemble();
    }

    @Override
    public CarSpecification carSpecification() {
        carSpecification.display();
        return carSpecification;
    }
}
