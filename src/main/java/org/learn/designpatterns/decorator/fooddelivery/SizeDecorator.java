package org.learn.designpatterns.decorator.fooddelivery;

public class SizeDecorator extends FoodItemDecorator{

    String size;

    public SizeDecorator(FoodItem foodItem, String size) {
        super(foodItem);
        this.size = size;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", " + this.size;
    }

    @Override
    public Double getCost() {
        switch (this.size){
            case "Large":
                return super.getCost() + 2.0;
            case "Medium":
                return super.getCost() + 1.0;
            default:
                return super.getCost();

        }
    }
}
