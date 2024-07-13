package org.learn.designpatterns.strategy.ecommerce;

public class ExpressShipping implements ShippingStrategy {
    @Override
    public Double calculateShippingCost(Double packageWeight) {
        return 10.0 + 0.1 * packageWeight;
    }
}
