package org.learn.designpatterns.strategy.ecommerce;

public class InternationalShipping implements ShippingStrategy {
    @Override
    public Double calculateShippingCost(Double packageWeight) {
        return 20.0 + 0.5 * packageWeight;
    }
}
