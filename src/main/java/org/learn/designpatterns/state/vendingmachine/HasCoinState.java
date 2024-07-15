package org.learn.designpatterns.state.vendingmachine;

public class HasCoinState implements State{

    @Override
    public State insertCoin() {
        System.out.println("Coin already inserted");
        return this;
    }

    @Override
    public State ejectCoin() {
        System.out.println("Coin ejected");
        return new NoCoinState();
    }

    @Override
    public State pressButton() {
        System.out.println("Button pressed");
        return new SoldState();
    }

    @Override
    public State dispense() {
        System.out.println("Press button to dispense");
        return this;
    }
}
