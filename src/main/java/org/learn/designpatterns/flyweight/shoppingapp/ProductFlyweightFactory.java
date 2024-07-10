package org.learn.designpatterns.flyweight.shoppingapp;

import java.util.HashMap;
import java.util.Map;

public class ProductFlyweightFactory {

    Map<String, ProductFlyweight> productFlyweightMap = new HashMap<>();

    public ProductFlyweight getProductFlyweight(String type, String category, String description){
        String key = type + category + description;
        if(!productFlyweightMap.containsKey(key)){
            productFlyweightMap.put(key, new ProductFlyweightConcrete(type, category,  description));
        }
        return productFlyweightMap.get(key);
    }
}
