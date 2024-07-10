package org.learn.designpatterns.flyweight.shoppingapp;

/**
 You are developing an online shopping system where users can browse and purchase products.
 The system maintains a product catalog with various attributes such as product name, category,
 price, and description. Many products share common attributes, such as category and manufacturer,
 which can be stored and managed efficiently to reduce memory usage.

 */


public class Runner {

    public static void main(String[] args){

        ProductFlyweightFactory productFlyweightFactory = new ProductFlyweightFactory();
        ProductFlyweight productFlyweight = productFlyweightFactory.getProductFlyweight("Clothing", "t-shirt", "Comfortable and stylish clothing");
        ProductContext productContext = new ProductContext("Nike t-shirt", 10.0);
        ProductContext productContext1 = new ProductContext("Puma t-shirt", 11.0);
        productFlyweight.displayProductDetails(productContext);
        productFlyweight.displayProductDetails(productContext1);

    }
}
