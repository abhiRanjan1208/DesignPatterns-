package org.learn.designpatterns.builder.restaurant;

public interface MealBuilder {

    MealBuilder addMainCourse(String mainCourse);
    MealBuilder addSideDish(String sideDish);
    MealBuilder addDrinks(String drink);
    MealBuilder addDessert(String dessert);

    Meal build();
}
