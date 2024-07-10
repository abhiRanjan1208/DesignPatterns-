package org.learn.designpatterns.builder.restaurant;

import java.util.List;

public class Meal {

    private List<String> mainCourse;
    private List<String> sideDishes;
    private List<String> drinks;
    private List<String> desserts;

    public Meal(List<String> mainCourse,
                List<String> sideDishes,
                List<String> drinks,
                List<String> desserts) {
        this.mainCourse = mainCourse;
        this.sideDishes = sideDishes;
        this.drinks = drinks;
        this.desserts = desserts;
    }

    public List<String> getMainCourse() {
        return mainCourse;
    }

    public List<String> getSideDishes() {
        return sideDishes;
    }

    public List<String> getDrinks() {
        return drinks;
    }

    public List<String> getDesserts() {
        return desserts;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "mainCourse=" + mainCourse +
                ", sideDishes=" + sideDishes +
                ", drinks=" + drinks +
                ", desserts=" + desserts +
                '}';
    }
}
