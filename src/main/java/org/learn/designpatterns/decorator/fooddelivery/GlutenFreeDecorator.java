package org.learn.designpatterns.decorator.fooddelivery;

public class GlutenFreeDecorator extends FoodItemDecorator{


    public GlutenFreeDecorator(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Gluten Free";
    }

    @Override
    public Double getCost() {
        return super.getCost() + 2.0;
    }
}
