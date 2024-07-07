package org.learn.designpatterns.decorator.fooddelivery;

public abstract class FoodItemDecorator implements FoodItem {

    FoodItem foodItem;

    public FoodItemDecorator(FoodItem foodItem){
        this.foodItem = foodItem;
    }

    @Override
    public String getDescription() {
        return foodItem.getDescription();
    }

    @Override
    public Double getCost() {
        return foodItem.getCost();
    }
}
