package org.learn.designpatterns.builder.restaurant;

/**

 You are developing a meal ordering system for a restaurant. The
 restaurant offers a variety of meals, each consisting of several
 components such as a main course, side dish, drink, and dessert.

 Each of these components can have multiple options. For example,
 the main course could be a burger, pizza, or salad; the side
 dish could be fries, a salad, or vegetables; the drink could be
 soda, juice, or water; and the dessert could be ice cream,
 cake, or fruit.

 Creating a meal order with all the specific components and
 their options is complex and error-prone.

 */


public class Runner {

    public static void main(String[] args){

        ConcreteMealBuilder concreteMealBuilder = new ConcreteMealBuilder();
        Meal myMeal =  concreteMealBuilder.addMainCourse("Burger")
                .addMainCourse("Pizza")
                .addDrinks("Water")
                .addDessert("Fruits")
                .addSideDish("Salad").build();
        System.out.println(myMeal.toString());
    }
}
