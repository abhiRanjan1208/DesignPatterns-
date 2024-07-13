package org.learn.designpatterns.strategy.ecommerce;

/**
 You are developing an e-commerce application that calculates shipping costs for
 different shipping methods. The application should be flexible enough to support
 various shipping strategies such as standard shipping, express shipping, and
 international shipping.

 The system should easily accommodate new shipping methods without modifying the
 existing code.

 The shipping calculation method should be interchangeable at runtime based on
 user selection or business rules.
 */

public class Runner {

    public static void main(String[] args){

        Double packageWeight = 10.0;

        CostCalculatorContext costCalculatorContext = new CostCalculatorContext(new StandardShipping());
        System.out.println("Standard shipping cost : " + costCalculatorContext.getShippingCost(packageWeight));

        costCalculatorContext.setShippingStrategy(new ExpressShipping());
        System.out.println("Express shipping cost : " + costCalculatorContext.getShippingCost(packageWeight));

        costCalculatorContext.setShippingStrategy(new InternationalShipping());
        System.out.println("international Shipping cost : " + costCalculatorContext.getShippingCost(packageWeight));
    }
}
