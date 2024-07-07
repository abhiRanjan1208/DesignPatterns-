package org.learn.designpatterns.decorator.fooddelivery;

public class Burger implements FoodItem{

    @Override
    public String getDescription() {
        return "Burger";
    }

    @Override
    public Double getCost() {
        return 5.0;
    }
}
