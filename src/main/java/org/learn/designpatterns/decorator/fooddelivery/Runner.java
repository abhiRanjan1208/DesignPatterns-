package org.learn.designpatterns.decorator.fooddelivery;

/**

 You are working for a software company that develops an online food delivery application.
 The application allows users to order various food items from different
 restaurants. Each food item can have additional features such as extra cheese,
 extra sauce, gluten-free option, and different sizes (small, medium, large).
 The combination of these features can vary widely depending on the user's preferences.

 */

public class Runner {

    public static void main(String[] args){
        //order large size gluten-free biryani
        Biryani biryani = new Biryani();
        SizeDecorator sizeDecorator = new SizeDecorator(biryani, "Large");
        GlutenFreeDecorator glutenFreeDecorator = new GlutenFreeDecorator(sizeDecorator);
        System.out.println("Description - " + glutenFreeDecorator.getDescription() + "\n"
                            + "Cost - " + glutenFreeDecorator.getCost());

    }
}
