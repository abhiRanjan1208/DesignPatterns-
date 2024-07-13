package org.learn.designpatterns.strategy.ecommerce;

public class CostCalculatorContext {

    private ShippingStrategy shippingStrategy;

    public CostCalculatorContext(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public void setShippingStrategy(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public Double getShippingCost(Double packageWeight){
        return this.shippingStrategy.calculateShippingCost(packageWeight);
    }
}
