package org.learn.designpatterns.abstractfactory.carcompany;

/**

 Imagine you’re managing a global car manufacturing company. You want to design a system to
 create cars with specific configurations for different regions, such as North America and Europe.
 Each region may have unique requirements and regulations, and you want to ensure that cars produced
 for each region meet those standards.

 */

public class Runner {

    public static void main(String[] args){

        System.out.println("Assemble Sedan with North American Specification");
        NorthAmericanCarFactory northAmericanCarFactory = new NorthAmericanCarFactory(new Sedan());
        northAmericanCarFactory.assembleCar();
        northAmericanCarFactory.carSpecification();
        System.out.println("Assemble SUV with South Asian Specification");
        SouthAsianCarFactory southAsianCarFactory = new SouthAsianCarFactory(new Suv());
        southAsianCarFactory.assembleCar();
        southAsianCarFactory.carSpecification();
    }
}
