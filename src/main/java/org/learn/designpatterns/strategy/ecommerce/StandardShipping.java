package org.learn.designpatterns.strategy.ecommerce;

public class StandardShipping implements ShippingStrategy {

    @Override
    public Double calculateShippingCost(Double packageWeight) {
        return 5.0 + 1.0 * packageWeight;
    }
}
