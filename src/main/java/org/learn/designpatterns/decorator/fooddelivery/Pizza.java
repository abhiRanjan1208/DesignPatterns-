package org.learn.designpatterns.decorator.fooddelivery;

public class Pizza implements FoodItem{

    @Override
    public String getDescription() {
        return "Pizza";
    }

    @Override
    public Double getCost() {
        return 10.0;
    }
}
