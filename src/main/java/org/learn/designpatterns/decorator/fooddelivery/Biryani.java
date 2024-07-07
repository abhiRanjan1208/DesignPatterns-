package org.learn.designpatterns.decorator.fooddelivery;

public class Biryani implements FoodItem{

    @Override
    public String getDescription() {
        return "Biryani";
    }

    @Override
    public Double getCost() {
        return 8.0;
    }
}
