package org.learn.designpatterns.builder.restaurant;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMealBuilder implements MealBuilder{


    private List<String> mainCourse;
    private List<String> sideDishes;
    private List<String> drinks;
    private List<String> desserts;

    public ConcreteMealBuilder() {
        this.mainCourse = new ArrayList<>();
        this.sideDishes = new ArrayList<>();
        this.drinks = new ArrayList<>();
        this.desserts = new ArrayList<>();
    }

    @Override
    public MealBuilder addMainCourse(String mainCourse) {
        this.mainCourse.add(mainCourse);
        return this;
    }

    @Override
    public MealBuilder addSideDish(String sideDish) {
        this.sideDishes.add(sideDish);
        return this;
    }

    @Override
    public MealBuilder addDrinks(String drink) {
        this.drinks.add(drink);
        return this;
    }

    @Override
    public MealBuilder addDessert(String dessert) {
        this.desserts.add(dessert);
        return this;
    }

    @Override
    public Meal build() {
        return new Meal(mainCourse,
                sideDishes,
                drinks,
                desserts);
    }
}
