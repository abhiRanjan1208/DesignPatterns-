package org.learn.designpatterns.state.vendingmachine;

public class SoldState implements State{

    @Override
    public State insertCoin() {
        System.out.println("Please wait, dispensing item");
        return this;
    }

    @Override
    public State ejectCoin() {
        System.out.println("Already dispensed, cannot eject coin");
        return this;
    }

    @Override
    public State pressButton() {
        System.out.println("Already dispensing, cannot press button again");
        return this;
    }

    @Override
    public State dispense() {
        System.out.println("Item Dispensed.");
        return new NoCoinState();
    }
}
