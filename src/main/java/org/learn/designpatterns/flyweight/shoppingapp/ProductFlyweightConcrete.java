package org.learn.designpatterns.flyweight.shoppingapp;

public class ProductFlyweightConcrete implements ProductFlyweight{

    private final String type;
    private final String category;
    private final String description;

    public ProductFlyweightConcrete(String type, String category, String description) {
        this.type = type;
        this.category = category;
        this.description = description;
    }

    @Override
    public void displayProductDetails(ProductContext context) {
        System.out.println("Product: " + context.getName() + "\n" +
                "Price: " + context.getPrice() + "\n" +
                "Description: " + this.description + "\n" +
                "Type: " + this.type + "\n" +
                "Category: " + this.category + "\n");
    }
}
