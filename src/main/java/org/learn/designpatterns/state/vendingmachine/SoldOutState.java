package org.learn.designpatterns.state.vendingmachine;

public class SoldOutState implements State{


    @Override
    public State insertCoin() {
        System.out.println("No items available");
        return this;
    }

    @Override
    public State ejectCoin() {
        System.out.println("No coin inserted");
        return this;
    }

    @Override
    public State pressButton() {
        System.out.println("No items available");
        return this;
    }

    @Override
    public State dispense() {
        System.out.println("No items available");
        return this;
    }
}
