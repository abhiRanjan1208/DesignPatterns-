package org.learn.designpatterns.strategy.ecommerce;

public interface ShippingStrategy {

    Double calculateShippingCost(Double packageWeight);
}
