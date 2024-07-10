package org.learn.designpatterns.flyweight.shoppingapp;

public class ProductContext {

    private final String name;
    private final Double price;

    public ProductContext(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}
